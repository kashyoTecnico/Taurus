package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h51 implements e51 {
    public final f51 a;
    public final long b;
    public final long c;

    public h51(f51 f51Var, long j) {
        this.a = f51Var;
        this.b = (f51Var.n() + f51Var.k()) * 1000000;
        this.c = j * 1000000;
    }

    @Override // defpackage.e51
    public final boolean a() {
        return true;
    }

    @Override // defpackage.e51
    public final long b(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = j + this.c;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.b;
        return j2 - ((j2 / j3) * j3);
    }

    public final k8 d(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        long j2 = this.c;
        long j3 = j + j2;
        long j4 = this.b;
        return j3 > j4 ? this.a.l(j4 - j2, k8Var, k8Var3, k8Var2) : k8Var2;
    }

    @Override // defpackage.e51
    public final k8 l(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return this.a.l(c(j), k8Var, k8Var2, d(j, k8Var, k8Var3, k8Var2));
    }

    @Override // defpackage.e51
    public final k8 o(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return this.a.o(c(j), k8Var, k8Var2, d(j, k8Var, k8Var3, k8Var2));
    }
}
