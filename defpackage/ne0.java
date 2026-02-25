package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ne0 extends ef0 {
    public static final ne0 d;
    public static final ne0 e;
    public static final ne0 f;
    public static final ne0 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new ne0(i, 2, 0);
        int i2 = 1;
        e = new ne0(i2, i2, 1);
        f = new ne0(i, 2, 2);
        int i3 = 1;
        g = new ne0(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne0(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) {
        switch (this.c) {
            case 0:
                Object objA = ((gw) twVar.c(0)).a();
                m2 m2Var = (m2) twVar.c(1);
                int iB = twVar.b(0);
                m2Var.getClass();
                ev0Var.T(ev0Var.c(m2Var), objA);
                f9Var.f(iB, objA);
                f9Var.d(objA);
                break;
            case 1:
                m2 m2Var2 = (m2) twVar.c(0);
                int iB2 = twVar.b(0);
                f9Var.q();
                m2Var2.getClass();
                f9Var.c(iB2, ev0Var.C(ev0Var.c(m2Var2)));
                break;
            case 2:
                Object objC = twVar.c(0);
                m2 m2Var3 = (m2) twVar.c(1);
                int iB3 = twVar.b(0);
                if (objC instanceof jm0) {
                    jm0 jm0Var = (jm0) objC;
                    hm0Var.e.b(jm0Var);
                    hm0Var.d.a(jm0Var);
                }
                Object objJ = ev0Var.J(ev0Var.c(m2Var3), iB3, objC);
                if (!(objJ instanceof jm0)) {
                    if (objJ instanceof nl0) {
                        ((nl0) objJ).d();
                        break;
                    }
                } else {
                    hm0Var.d((jm0) objJ);
                    break;
                }
                break;
            default:
                Object objC2 = twVar.c(0);
                int iB4 = twVar.b(0);
                if (objC2 instanceof jm0) {
                    jm0 jm0Var2 = (jm0) objC2;
                    hm0Var.e.b(jm0Var2);
                    hm0Var.d.a(jm0Var2);
                }
                Object objJ2 = ev0Var.J(ev0Var.t, iB4, objC2);
                if (!(objJ2 instanceof jm0)) {
                    if (objJ2 instanceof nl0) {
                        ((nl0) objJ2).d();
                        break;
                    }
                } else {
                    hm0Var.d((jm0) objJ2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ef0
    public m2 b(tw twVar) {
        switch (this.c) {
            case 0:
                return (m2) twVar.c(1);
            case 1:
                return (m2) twVar.c(0);
            default:
                return super.b(twVar);
        }
    }
}
