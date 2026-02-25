package com.taurus.dgmobilemx;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import defpackage.b10;
import defpackage.br;
import defpackage.c10;
import defpackage.c4;
import defpackage.d80;
import defpackage.dq0;
import defpackage.fr;
import defpackage.gr;
import defpackage.h70;
import defpackage.h9;
import defpackage.hl0;
import defpackage.l70;
import defpackage.mv0;
import defpackage.n2;
import defpackage.o;
import defpackage.p00;
import defpackage.px0;
import defpackage.q70;
import defpackage.qo0;
import defpackage.sg;
import defpackage.tg;
import defpackage.th;
import defpackage.uy0;
import defpackage.xd;
import defpackage.y;
import defpackage.zg;
import defpackage.zg0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class MainActivity extends sg {
    public DevicePolicyManager x;
    public ComponentName y;
    public final zg0 z = qo0.n(Boolean.FALSE);

    private final boolean checkInitialActivation(Context context) {
        return context.getSharedPreferences("seguridad_taurus", 0).getBoolean("activado", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureSelfEnabled() {
        getPackageManager().setComponentEnabledSetting(new ComponentName(getPackageName(), MainActivity.class.getName()), 1, 1);
        DevicePolicyManager devicePolicyManager = this.x;
        if (devicePolicyManager == null) {
            c10.Y("dpm");
            throw null;
        }
        ComponentName componentName = this.y;
        if (componentName == null) {
            c10.Y("adminComponent");
            throw null;
        }
        devicePolicyManager.addUserRestriction(componentName, "no_factory_reset");
        DevicePolicyManager devicePolicyManager2 = this.x;
        if (devicePolicyManager2 == null) {
            c10.Y("dpm");
            throw null;
        }
        ComponentName componentName2 = this.y;
        if (componentName2 == null) {
            c10.Y("adminComponent");
            throw null;
        }
        devicePolicyManager2.addUserRestriction(componentName2, "no_network_reset");
        DevicePolicyManager devicePolicyManager3 = this.x;
        if (devicePolicyManager3 == null) {
            c10.Y("dpm");
            throw null;
        }
        ComponentName componentName3 = this.y;
        if (componentName3 == null) {
            c10.Y("adminComponent");
            throw null;
        }
        devicePolicyManager3.addUserRestriction(componentName3, "disallow_config_private_dns");
        Toast.makeText(this, "🛡️ Restricciones: ON", 1).show();
    }

    private final void exponerIdParaADB(String str) throws IOException {
        try {
            Log.d("TAURUS_DEBUG", "ID_PARA_COPIAR:" + str);
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "taurus_id.txt");
            Charset charset = xd.a;
            c10.p(str, "text");
            c10.p(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                d80.J(fileOutputStream, str, charset);
                fileOutputStream.close();
                Settings.System.putString(getContentResolver(), "taurus_id", str);
            } finally {
            }
        } catch (Exception e) {
            Log.e("Taurus", "Error al exponer ID: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generarHash(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(xd.a);
        c10.o(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        c10.m(bArrDigest);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append(generarHash$lambda$0(b));
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }

    private static final CharSequence generarHash$lambda$0(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void guardarActivacion(Context context) {
        context.getSharedPreferences("seguridad_taurus", 0).edit().putBoolean("activado", true).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLauncherIcon() {
        getPackageManager().setComponentEnabledSetting(new ComponentName(getPackageName(), MainActivity.class.getName()), 2, 1);
        Toast.makeText(this, "Icono del lanzador oculto.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAuthorizedByAdb() {
        return ((Boolean) this.z.getValue()).booleanValue();
    }

    private final boolean isDeviceRooted() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/working/bin/su", "/system/xbin/daemonsu"};
        for (int i = 0; i < 9; i++) {
            try {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return Runtime.getRuntime().exec("which su").getInputStream().read() != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String obtenerDatosEquipo() throws IOException {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String strObtenerSerialLimpio = obtenerSerialLimpio();
        c10.m(str);
        String upperCase = str.toUpperCase(Locale.ROOT);
        c10.o(upperCase, "toUpperCase(...)");
        return "MARCA: " + upperCase + "\n MODELO: " + str2 + "\nVERSION DE ANDROID: " + str3 + "\nID: " + strObtenerSerialLimpio + "\nPIN de Seguridad: " + ((String) q70.a.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String obtenerSerialLimpio() throws IOException {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop ro.serialno").getInputStream();
            c10.o(inputStream, "getInputStream(...)");
            String line = new BufferedReader(new InputStreamReader(inputStream, xd.a), 8192).readLine();
            String serial = null;
            String string = line != null ? px0.z(line).toString() : null;
            if (string != null && !px0.t(string) && !string.equals("unknown")) {
                return string;
            }
            String string2 = Settings.Secure.getString(getContentResolver(), "android_id");
            try {
                serial = Build.getSerial();
            } catch (Exception unused) {
            }
            return serial == null ? string2 == null ? "ID_NO_ENCONTRADO" : string2 : serial;
        } catch (Exception unused2) {
            return "ERROR_SISTEMA";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeDeviceOwner(Context context, String str) {
        if (!c10.i(str, (String) q70.a.getValue())) {
            Toast.makeText(context, "PIN Incorrecto", 0).show();
            return;
        }
        DevicePolicyManager devicePolicyManager = this.x;
        if (devicePolicyManager == null) {
            c10.Y("dpm");
            throw null;
        }
        ComponentName componentName = this.y;
        if (componentName == null) {
            c10.Y("adminComponent");
            throw null;
        }
        devicePolicyManager.clearUserRestriction(componentName, "no_factory_reset");
        DevicePolicyManager devicePolicyManager2 = this.x;
        if (devicePolicyManager2 == null) {
            c10.Y("dpm");
            throw null;
        }
        ComponentName componentName2 = this.y;
        if (componentName2 == null) {
            c10.Y("adminComponent");
            throw null;
        }
        devicePolicyManager2.clearUserRestriction(componentName2, "no_network_reset");
        DevicePolicyManager devicePolicyManager3 = this.x;
        if (devicePolicyManager3 == null) {
            c10.Y("dpm");
            throw null;
        }
        ComponentName componentName3 = this.y;
        if (componentName3 == null) {
            c10.Y("adminComponent");
            throw null;
        }
        devicePolicyManager3.clearUserRestriction(componentName3, "disallow_config_private_dns");
        DevicePolicyManager devicePolicyManager4 = this.x;
        if (devicePolicyManager4 == null) {
            c10.Y("dpm");
            throw null;
        }
        devicePolicyManager4.clearDeviceOwnerApp(getPackageName());
        Toast.makeText(context, "Restricciones: OFF", 1).show();
        Toast.makeText(context, "El dispositivo está en modo de usuario normal.", 1).show();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAuthorizedByAdb(boolean z) {
        this.z.setValue(Boolean.valueOf(z));
    }

    private final void setNetPatchSuspended(boolean z) {
        DevicePolicyManager devicePolicyManager = this.x;
        if (devicePolicyManager == null) {
            c10.Y("dpm");
            throw null;
        }
        if (devicePolicyManager.isDeviceOwnerApp(getPackageName())) {
            try {
                String[] strArr = {"co.netpatch.firewall"};
                DevicePolicyManager devicePolicyManager2 = this.x;
                if (devicePolicyManager2 == null) {
                    c10.Y("dpm");
                    throw null;
                }
                ComponentName componentName = this.y;
                if (componentName == null) {
                    c10.Y("adminComponent");
                    throw null;
                }
                String[] packagesSuspended = devicePolicyManager2.setPackagesSuspended(componentName, strArr, z);
                c10.o(packagesSuspended, "setPackagesSuspended(...)");
                if (packagesSuspended.length != 0) {
                    Toast.makeText(this, "No se pudo cambiar el estado de NetPatch", 0).show();
                    return;
                }
                Toast.makeText(this, "NetPatch " + (z ? "BLOQUEADO" : "LIBERADO") + " correctamente", 0).show();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this, "Error al intentar suspender: " + e.getMessage(), 1).show();
            }
        }
    }

    private final boolean verificarFirmaOriginal() {
        try {
            SigningInfo signingInfo = getPackageManager().getPackageInfo(getPackageName(), 134217728).signingInfo;
            Signature[] apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            if (apkContentsSigners != null) {
                o oVarZ = c4.z(apkContentsSigners);
                while (oVarZ.hasNext()) {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(((Signature) oVarZ.next()).toByteArray());
                    c10.m(bArrDigest);
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "");
                    int i = 0;
                    for (byte b : bArrDigest) {
                        i++;
                        if (i > 1) {
                            sb.append((CharSequence) "");
                        }
                        sb.append(verificarFirmaOriginal$lambda$2(b));
                    }
                    sb.append((CharSequence) "");
                    String string = sb.toString();
                    c10.o(string, "toString(...)");
                    if (string.equalsIgnoreCase("TU_SHA256_AQUI")) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static final CharSequence verificarFirmaOriginal$lambda$2(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    @Override // defpackage.sg, defpackage.rg, android.app.Activity
    public void onCreate(Bundle bundle) throws IOException {
        super.onCreate(bundle);
        int i = 1;
        p00 p00Var = new p00(100000, 999999, 1);
        y yVar = hl0.d;
        try {
            String strValueOf = String.valueOf(b10.U(p00Var));
            zg0 zg0Var = q70.a;
            zg0Var.setValue(strValueOf);
            Log.d("Taurus", "El PIN dinámico para esta sesión es: " + ((String) zg0Var.getValue()));
            Object systemService = getSystemService("device_policy");
            c10.n(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
            this.x = (DevicePolicyManager) systemService;
            this.y = new ComponentName(this, (Class<?>) MiDeviceAdminReceiver.class);
            exponerIdParaADB(obtenerSerialLimpio());
            setAuthorizedByAdb(checkInitialActivation(this));
            registerReceiver(new h70(this), new IntentFilter("com.taurus.ACTIVAR"), 2);
            mv0 mv0Var = new mv0(i);
            uy0 uy0Var = new uy0(0, 0, mv0Var);
            int i2 = br.a;
            int i3 = br.b;
            mv0 mv0Var2 = new mv0(i);
            uy0 uy0Var2 = new uy0(i2, i3, mv0Var2);
            View decorView = getWindow().getDecorView();
            c10.o(decorView, "getDecorView(...)");
            Resources resources = decorView.getResources();
            c10.o(resources, "getResources(...)");
            boolean zBooleanValue = ((Boolean) mv0Var.g(resources)).booleanValue();
            Resources resources2 = decorView.getResources();
            c10.o(resources2, "getResources(...)");
            boolean zBooleanValue2 = ((Boolean) mv0Var2.g(resources2)).booleanValue();
            fr grVar = br.c;
            if (grVar == null) {
                grVar = Build.VERSION.SDK_INT >= 35 ? new gr() : new fr();
                br.c = grVar;
            }
            fr frVar = grVar;
            Window window = getWindow();
            c10.o(window, "getWindow(...)");
            frVar.a(uy0Var, uy0Var2, window, decorView, zBooleanValue, zBooleanValue2);
            Window window2 = getWindow();
            c10.o(window2, "getWindow(...)");
            frVar.b(window2);
            zg zgVar = new zg(-371255089, true, new l70(this, i));
            ViewGroup.LayoutParams layoutParams = tg.a;
            View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
            th thVar = childAt instanceof th ? (th) childAt : null;
            if (thVar != null) {
                thVar.setParentCompositionContext(null);
                thVar.setContent(zgVar);
                return;
            }
            th thVar2 = new th(this);
            thVar2.setParentCompositionContext(null);
            thVar2.setContent(zgVar);
            View decorView2 = getWindow().getDecorView();
            if (dq0.f(decorView2) == null) {
                dq0.l(decorView2, this);
            }
            if (h9.e(decorView2) == null) {
                decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
            }
            if (n2.d(decorView2) == null) {
                decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
            }
            setContentView(thVar2, tg.a);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
