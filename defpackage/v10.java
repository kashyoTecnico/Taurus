package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v10 extends ad {
    public final y10 l;

    public v10(lk lkVar, bg bgVar) {
        super(1, lkVar);
        this.l = bgVar;
    }

    @Override // defpackage.ad
    public final Throwable r(y10 y10Var) {
        Throwable thC;
        y10 y10Var2 = this.l;
        y10Var2.getClass();
        Object obj = y10.d.get(y10Var2);
        return (!(obj instanceof x10) || (thC = ((x10) obj).c()) == null) ? obj instanceof eg ? ((eg) obj).a : y10Var.q() : thC;
    }

    @Override // defpackage.ad
    public final String z() {
        return "AwaitContinuation";
    }
}
