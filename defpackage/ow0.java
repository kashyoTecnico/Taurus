package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ow0 implements jt {
    public final float a;
    public final float b;
    public final Object c;

    public ow0(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.e8
    public final e51 a(q31 q31Var) {
        Object obj = this.c;
        return new k51(this.a, this.b, obj == null ? null : (k8) q31Var.a.g(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ow0) {
            ow0 ow0Var = (ow0) obj;
            if (ow0Var.a == this.a && ow0Var.b == this.b && c10.i(ow0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + b8.b(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ ow0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
