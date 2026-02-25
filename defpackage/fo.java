package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fo extends ex0 implements ww0 {
    public final gw e;
    public final uv0 f;
    public eo g = new eo(ov0.k().g());

    public fo(gw gwVar, g2 g2Var) {
        this.e = gwVar;
        this.f = g2Var;
    }

    @Override // defpackage.dx0
    public final fx0 a() {
        return this.g;
    }

    @Override // defpackage.dx0
    public final void c(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.g = (eo) fx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eo g(defpackage.eo r21, defpackage.gv0 r22, boolean r23, defpackage.gw r24) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.g(eo, gv0, boolean, gw):eo");
    }

    @Override // defpackage.ww0
    public final Object getValue() {
        iw iwVarE = ov0.k().e();
        if (iwVarE != null) {
            iwVarE.g(this);
        }
        gv0 gv0VarK = ov0.k();
        return g((eo) ov0.j(this.g, gv0VarK), gv0VarK, true, this.e).f;
    }

    public final eo h() {
        gv0 gv0VarK = ov0.k();
        return g((eo) ov0.j(this.g, gv0VarK), gv0VarK, false, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        eo eoVar = (eo) ov0.i(this.g);
        sb.append(eoVar.c(this, ov0.k()) ? String.valueOf(eoVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
