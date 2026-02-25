package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cb {
    public final float a;
    public final fw0 b;

    public cb(float f, fw0 fw0Var) {
        this.a = f;
        this.b = fw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return kp.a(this.a, cbVar.a) && this.b.equals(cbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) kp.b(this.a)) + ", brush=" + this.b + ')';
    }
}
