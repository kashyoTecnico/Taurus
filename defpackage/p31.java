package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p31 implements wq {
    public final int a;
    public final int b;
    public final yq c;

    public p31(int i, int i2, yq yqVar) {
        this.a = i;
        this.b = i2;
        this.c = yqVar;
    }

    @Override // defpackage.e8
    public final e51 a(q31 q31Var) {
        return new fd0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p31)) {
            return false;
        }
        p31 p31Var = (p31) obj;
        return p31Var.a == this.a && p31Var.b == this.b && c10.i(p31Var.c, this.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.wq, defpackage.e8
    public final f51 a(q31 q31Var) {
        return new fd0(this.a, this.b, this.c);
    }
}
