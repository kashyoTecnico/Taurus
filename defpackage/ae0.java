package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ae0 extends ef0 {
    public static final ae0 c = new ae0(0, 2, 1);

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) {
        m2 m2Var = (m2) twVar.c(0);
        Object objC = twVar.c(1);
        if (objC instanceof jm0) {
            jm0 jm0Var = (jm0) objC;
            hm0Var.e.b(jm0Var);
            hm0Var.d.a(jm0Var);
        }
        if (ev0Var.n != 0) {
            fi.c("Can only append a slot if not current inserting");
        }
        int i = ev0Var.i;
        int i2 = ev0Var.j;
        int iC = ev0Var.c(m2Var);
        int iG = ev0Var.g(ev0Var.b, ev0Var.r(iC + 1));
        ev0Var.i = iG;
        ev0Var.j = iG;
        ev0Var.w(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        ev0Var.c[iG] = objC;
        ev0Var.i = i;
        ev0Var.j = i2;
    }
}
