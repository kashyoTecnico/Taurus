package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ze0 extends ef0 {
    public static final ze0 c = new ze0(1, 0, 2);

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) {
        int iB = twVar.b(0);
        int i = ev0Var.v;
        int iM = ev0Var.M(ev0Var.b, ev0Var.r(i));
        int iG = ev0Var.g(ev0Var.b, ev0Var.r(i + 1));
        for (int iMax = Math.max(iM, iG - iB); iMax < iG; iMax++) {
            Object obj = ev0Var.c[ev0Var.h(iMax)];
            if (obj instanceof jm0) {
                hm0Var.d((jm0) obj);
            } else if (obj instanceof nl0) {
                ((nl0) obj).d();
            }
        }
        if (iB <= 0) {
            fi.c("Check failed");
        }
        int i2 = ev0Var.v;
        int iM2 = ev0Var.M(ev0Var.b, ev0Var.r(i2));
        int iG2 = ev0Var.g(ev0Var.b, ev0Var.r(i2 + 1)) - iB;
        if (iG2 < iM2) {
            fi.c("Check failed");
        }
        ev0Var.I(iG2, iB, i2);
        int i3 = ev0Var.i;
        if (i3 >= iM2) {
            ev0Var.i = i3 - iB;
        }
    }
}
