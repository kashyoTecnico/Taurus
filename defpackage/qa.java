package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qa {
    public final float a;

    public qa(float f) {
        this.a = f;
    }

    public final int a(int i, e30 e30Var) {
        float f = i / 2.0f;
        e30 e30Var2 = e30.d;
        float f2 = this.a;
        if (e30Var != e30Var2) {
            f2 *= -1;
        }
        return Math.round((1 + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qa) && Float.compare(this.a, ((qa) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
