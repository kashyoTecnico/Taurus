package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nb0 implements yc, n61 {
    public final ad d;
    public final /* synthetic */ ob0 e;

    public nb0(ob0 ob0Var, ad adVar) {
        this.e = ob0Var;
        this.d = adVar;
    }

    @Override // defpackage.yc
    public final void B(Object obj) {
        this.d.B(obj);
    }

    @Override // defpackage.n61
    public final void a(or0 or0Var, int i) {
        this.d.a(or0Var, i);
    }

    @Override // defpackage.lk
    public final ml f() {
        return this.d.h;
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        this.d.h(obj);
    }

    @Override // defpackage.yc
    public final cs l(Object obj, lw lwVar) {
        ob0 ob0Var = this.e;
        zc zcVar = new zc(ob0Var, this);
        cs csVarL = this.d.l((j41) obj, zcVar);
        if (csVarL != null) {
            ob0.g.set(ob0Var, null);
        }
        return csVarL;
    }

    @Override // defpackage.yc
    public final boolean m(Throwable th) {
        return this.d.m(th);
    }
}
