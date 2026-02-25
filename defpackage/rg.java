package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class rg extends Activity implements f50, l20 {
    public final uu0 d = new uu0(0);
    public final h50 e = new h50(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        c10.p(keyEvent, "event");
        c10.o(getWindow().getDecorView(), "getDecorView(...)");
        int i = a61.a;
        return superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        c10.p(keyEvent, "event");
        c10.o(getWindow().getDecorView(), "getDecorView(...)");
        int i = a61.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @ao
    public <T extends ng> T getExtraData(Class<T> cls) {
        c10.p(cls, "extraDataClass");
        if (this.d.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = rm0.d;
        pm0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        c10.p(bundle, "outState");
        h50 h50Var = this.e;
        h50Var.d("setCurrentState");
        h50Var.f(z40.f);
        super.onSaveInstanceState(bundle);
    }

    @ao
    public void putExtraData(ng ngVar) {
        c10.p(ngVar, "extraData");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 1
            r0 = 0
            if (r3 == 0) goto L4f
            int r1 = r3.length
            if (r1 != 0) goto L8
            goto L4f
        L8:
            r3 = r3[r0]
            int r1 = r3.hashCode()
            switch(r1) {
                case -645125871: goto L3f;
                case 100470631: goto L2f;
                case 472614934: goto L26;
                case 1159329357: goto L1d;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L4f
        L12:
            java.lang.String r1 = "--autofill"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L4f
        L1b:
            r0 = r2
            goto L4f
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto L4f
        L26:
            java.lang.String r1 = "--list-dumpables"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L38
            goto L4f
        L2f:
            java.lang.String r1 = "--dump-dumpable"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L38
            goto L4f
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r3 < r1) goto L4f
            goto L1b
        L3f:
            java.lang.String r1 = "--translation"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L48
            goto L4f
        L48:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r3 < r1) goto L4f
            goto L1b
        L4f:
            r2 = r2 ^ r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // defpackage.l20
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        c10.p(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
