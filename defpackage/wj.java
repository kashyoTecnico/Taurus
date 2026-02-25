package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wj implements xj0 {
    public final long a;

    public wj(long j) {
        this.a = j;
    }

    @Override // defpackage.xj0
    public final long a(q00 q00Var, long j, e30 e30Var, long j2) {
        int i = q00Var.a;
        long j3 = this.a;
        return c10.c(l81.m(i + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), e30Var == e30.d), l81.m(q00Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true));
    }
}
