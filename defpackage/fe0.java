package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fe0 extends ef0 {
    public static final fe0 c = new fe0(0, 2, 1);

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) {
        int i;
        r00 r00Var = (r00) twVar.c(0);
        int iC = ev0Var.c((m2) twVar.c(1));
        if (ev0Var.t >= iC) {
            fi.c("Check failed");
        }
        c10.S(ev0Var, f9Var, iC);
        int i2 = ev0Var.t;
        int iD = ev0Var.v;
        while (iD >= 0 && !ev0Var.x(iD)) {
            iD = ev0Var.D(ev0Var.b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i2) {
            if (ev0Var.u(i2, iT)) {
                if (ev0Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += ev0Var.x(iT) ? 1 : ev0Var.b[(ev0Var.r(iT) * 5) + 1] & 67108863;
                iT += ev0Var.t(iT);
            }
        }
        while (true) {
            i = ev0Var.t;
            if (i >= iC) {
                break;
            }
            if (ev0Var.u(iC, i)) {
                int i3 = ev0Var.t;
                if (i3 < ev0Var.u && (ev0Var.b[(ev0Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    f9Var.d(ev0Var.C(ev0Var.t));
                    iK = 0;
                }
                ev0Var.O();
            } else {
                iK += ev0Var.K();
            }
        }
        if (i != iC) {
            fi.c("Check failed");
        }
        r00Var.a = iK;
    }
}
