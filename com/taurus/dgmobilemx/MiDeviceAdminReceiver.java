package com.taurus.dgmobilemx;

import android.app.admin.DeviceAdminReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import defpackage.c10;
import defpackage.px0;
import defpackage.xd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class MiDeviceAdminReceiver extends DeviceAdminReceiver {
    public static final int $stable = 0;
    private final String TAG = "TaurusDO_Receiver";
    private final String PALABRA_SECRETA = "ok";

    private final String generarHash(String str) throws NoSuchAlgorithmException {
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

    private final void guardarActivacion(Context context) {
        context.getSharedPreferences("seguridad_taurus", 0).edit().putBoolean("activado", true).apply();
    }

    private final String obtenerSerialLimpio() throws IOException {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop ro.serialno").getInputStream();
            c10.o(inputStream, "getInputStream(...)");
            String line = new BufferedReader(new InputStreamReader(inputStream, xd.a), 8192).readLine();
            if (line == null) {
                return "unknown";
            }
            String string = px0.z(line).toString();
            return string == null ? "unknown" : string;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public void onEnabled(Context context, Intent intent) {
        c10.p(context, "context");
        c10.p(intent, "intent");
        super.onEnabled(context, intent);
        Log.d(this.TAG, "¡ÉXITO! La aplicación ahora es Device Owner.");
        Object systemService = context.getSystemService("device_policy");
        c10.n(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        new ComponentName(context, (Class<?>) MiDeviceAdminReceiver.class);
        try {
            Settings.Global.putInt(context.getContentResolver(), "adb_enabled", 1);
            Log.d(this.TAG, "Políticas iniciales aplicadas.");
        } catch (Exception e) {
            Log.e(this.TAG, "Error en políticas iniciales: " + e.getMessage());
        }
    }

    @Override // android.app.admin.DeviceAdminReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c10.p(context, "context");
        c10.p(intent, "intent");
        if (c10.i(intent.getAction(), "com.taurus.ACTIVAR")) {
            String stringExtra = intent.getStringExtra("llave");
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (stringExtra.equals(generarHash(px0.z(obtenerSerialLimpio()).toString()))) {
                Log.d(this.TAG, "¡Activación recibida en el Receiver!");
                guardarActivacion(context);
                Intent intent2 = new Intent("com.taurus.ACTIVAR");
                intent2.putExtra("llave", stringExtra);
                context.sendBroadcast(intent2);
            }
        }
        super.onReceive(context, intent);
    }
}
