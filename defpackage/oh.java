package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oh implements ScrollCaptureCallback {
    public final gt0 a;
    public final q00 b;
    public final r1 c;
    public final p3 d;
    public final kk e;
    public final jy f;

    public oh(gt0 gt0Var, q00 q00Var, kk kkVar, r1 r1Var, p3 p3Var) {
        this.a = gt0Var;
        this.b = q00Var;
        this.c = r1Var;
        this.d = p3Var;
        this.e = new kk(kkVar.d.k(so.e));
        this.f = new jy(q00Var.d - q00Var.b, new nh(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.oh r11, android.view.ScrollCaptureSession r12, defpackage.q00 r13, defpackage.mk r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh.a(oh, android.view.ScrollCaptureSession, q00, mk):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        nm.z(this.e, tc0.e, new c(this, runnable, null, 9), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        rw0 rw0VarZ = nm.z(this.e, null, new y5(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        rw0VarZ.t(new h(11, cancellationSignal));
        cancellationSignal.setOnCancelListener(new ph(0, rw0VarZ));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(l81.Z(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((zg0) this.c.e).setValue(Boolean.TRUE);
        runnable.run();
    }
}
