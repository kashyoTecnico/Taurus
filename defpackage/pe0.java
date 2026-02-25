package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pe0 extends ef0 {
    public static final pe0 c = new pe0(0, 3, 1);

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) {
        xz xzVar;
        bv0 bv0Var = (bv0) twVar.c(1);
        m2 m2Var = (m2) twVar.c(0);
        mt mtVar = (mt) twVar.c(2);
        ev0 ev0VarD = bv0Var.d();
        if (ff0Var != null) {
            try {
                xzVar = new xz(16, ff0Var, ev0Var);
            } catch (Throwable th) {
                ev0VarD.e(false);
                throw th;
            }
        } else {
            xzVar = null;
        }
        if (!mtVar.k.M()) {
            fi.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        mtVar.j.L(f9Var, ev0VarD, hm0Var, xzVar);
        ev0VarD.e(true);
        ev0Var.d();
        m2Var.getClass();
        ev0Var.z(bv0Var, bv0Var.a(m2Var));
        ev0Var.k();
    }
}
