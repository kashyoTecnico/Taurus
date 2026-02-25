package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ox implements xj0 {
    public final h2 a;
    public final id0 b;
    public long c = 0;

    public ox(h2 h2Var, id0 id0Var) {
        this.a = h2Var;
        this.b = id0Var;
    }

    @Override // defpackage.xj0
    public final long a(q00 q00Var, long j, e30 e30Var, long j2) {
        long jA = this.b.a();
        if (!nm.x(jA)) {
            jA = this.c;
        }
        this.c = jA;
        return m00.c(m00.c((q00Var.b & 4294967295L) | (q00Var.a << 32), c10.U(jA)), this.a.a(j2, 0L, e30Var));
    }
}
