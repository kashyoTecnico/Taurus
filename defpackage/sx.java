package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sx extends pl implements kn {
    public final Handler f;
    public final String g;
    public final boolean h;
    public final sx i;

    public sx(Handler handler, String str, boolean z) {
        this.f = handler;
        this.g = str;
        this.h = z;
        this.i = z ? this : new sx(handler, str, true);
    }

    @Override // defpackage.kn
    public final void c(long j, ad adVar) {
        rx rxVar = new rx(adVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f.postDelayed(rxVar, j)) {
            adVar.v(new qx(0, this, rxVar));
        } else {
            h(adVar.h, rxVar);
        }
    }

    @Override // defpackage.pl
    public final void d(ml mlVar, Runnable runnable) {
        if (this.f.post(runnable)) {
            return;
        }
        h(mlVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        return sxVar.f == this.f && sxVar.h == this.h;
    }

    @Override // defpackage.pl
    public final boolean f(ml mlVar) {
        return (this.h && c10.i(Looper.myLooper(), this.f.getLooper())) ? false : true;
    }

    public final void h(ml mlVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        r10 r10Var = (r10) mlVar.n(g2.E);
        if (r10Var != null) {
            r10Var.a(cancellationException);
        }
        fn fnVar = xo.a;
        bn.f.d(mlVar, runnable);
    }

    public final int hashCode() {
        return (this.h ? 1231 : 1237) ^ System.identityHashCode(this.f);
    }

    @Override // defpackage.pl
    public final String toString() {
        sx sxVar;
        String str;
        fn fnVar = xo.a;
        sx sxVar2 = r70.a;
        if (this == sxVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                sxVar = sxVar2.i;
            } catch (UnsupportedOperationException unused) {
                sxVar = null;
            }
            str = this == sxVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.g;
        if (string == null) {
            string = this.f.toString();
        }
        if (!this.h) {
            return string;
        }
        return string + ".immediate";
    }

    public sx(Handler handler) {
        this(handler, null, false);
    }
}
