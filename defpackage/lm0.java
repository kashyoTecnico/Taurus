package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lm0 extends m implements ql {
    public final /* synthetic */ li e;
    public final /* synthetic */ mm0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public lm0(li liVar, mm0 mm0Var) {
        g2 g2Var = g2.w;
        this.e = liVar;
        this.f = mm0Var;
        super(g2Var);
    }

    @Override // defpackage.ql
    public final void p(ml mlVar, Throwable th) throws Throwable {
        li liVar = this.e;
        mm0 mm0Var = this.f;
        d80.H(th, new ki(0, liVar, mm0Var));
        ql qlVar = (ql) mm0Var.d.n(g2.w);
        if (qlVar == null) {
            throw th;
        }
        qlVar.p(mlVar, th);
    }
}
