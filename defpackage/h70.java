package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.taurus.dgmobilemx.MainActivity;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h70 extends BroadcastReceiver {
    public final /* synthetic */ MainActivity a;

    public h70(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        c10.p(context, "context");
        c10.p(intent, "intent");
        String stringExtra = intent.getStringExtra("llave");
        if (stringExtra == null) {
            stringExtra = "";
        }
        MainActivity mainActivity = this.a;
        if (!stringExtra.equals(mainActivity.generarHash(px0.z(mainActivity.obtenerSerialLimpio()).toString() + q70.b))) {
            Toast.makeText(context, "CÓDIGO INCORRECTO", 1).show();
            mainActivity.finish();
            return;
        }
        DevicePolicyManager devicePolicyManager = mainActivity.x;
        if (devicePolicyManager == null) {
            c10.Y("dpm");
            throw null;
        }
        if (!devicePolicyManager.isDeviceOwnerApp(mainActivity.getPackageName())) {
            Toast.makeText(context, "Esta app no es Device Owner. Las restricciones no se aplicarán.", 1).show();
            return;
        }
        mainActivity.ensureSelfEnabled();
        mainActivity.hideLauncherIcon();
        mainActivity.guardarActivacion(context);
        mainActivity.setAuthorizedByAdb(true);
        Toast.makeText(context, "🤩Gracias por usar TaurusTool", 1).show();
    }
}
