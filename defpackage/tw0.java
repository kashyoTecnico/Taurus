package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tw0 implements e51 {
    public final e51 a;
    public final long b;

    public tw0(e51 e51Var, long j) {
        this.a = e51Var;
        this.b = j;
    }

    @Override // defpackage.e51
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.e51
    public final long b(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return this.a.b(k8Var, k8Var2, k8Var3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tw0)) {
            return false;
        }
        tw0 tw0Var = (tw0) obj;
        return tw0Var.b == this.b && c10.i(tw0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.e51
    public final k8 l(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        long j2 = this.b;
        return j < j2 ? k8Var3 : this.a.l(j - j2, k8Var, k8Var2, k8Var3);
    }

    @Override // defpackage.e51
    public final k8 o(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        long j2 = this.b;
        return j < j2 ? k8Var : this.a.o(j - j2, k8Var, k8Var2, k8Var3);
    }
}
