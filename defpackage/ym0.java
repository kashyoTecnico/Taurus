package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ym0 implements Serializable {
    public final Throwable d;

    public ym0(Throwable th) {
        c10.p(th, "exception");
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ym0) {
            return c10.i(this.d, ((ym0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.d + ')';
    }
}
