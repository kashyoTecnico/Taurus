package defpackage;

import androidx.compose.ui.draw.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y4 extends y20 implements lw {
    public static final y4 f;
    public static final y4 g;
    public static final y4 h;
    public final /* synthetic */ int e;

    static {
        int i = 3;
        f = new y4(i, 0);
        g = new y4(i, 1);
        h = new y4(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(int i, int i2) {
        super(i);
        this.e = i2;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                e90 e90Var = (e90) obj;
                ci ciVar = (ci) obj2;
                ((Number) obj3).intValue();
                ciVar.V(-2126899193);
                long j = ((x11) ciVar.j(y11.a)).a;
                boolean zE = ciVar.e(j);
                Object objK = ciVar.K();
                if (zE || objK == vh.a) {
                    objK = new x4(j, 0);
                    ciVar.e0(objK);
                }
                e90 e90VarC = e90Var.c(a.b(b90.a, (iw) objK));
                ciVar.p(false);
                return e90VarC;
            case 1:
                n80 n80Var = (n80) obj;
                long j2 = ((gj) obj3).a;
                int iN = n80Var.N(wk0.a);
                int i = iN * 2;
                oi0 oi0VarE = ((g80) obj2).e(hj.i(j2, 0, i));
                return n80Var.a0(oi0VarE.d, oi0VarE.e - i, ls.d, new pu(iN, 1, oi0VarE));
            default:
                b31 b31Var = (b31) obj;
                ci ciVar2 = (ci) obj2;
                ((Number) obj3).intValue();
                ciVar2.V(-1154662212);
                c00 c00Var = c00.d;
                c00 c00Var2 = c00.e;
                Object objC0 = b31Var.a(c00Var, c00Var2) ? r31.c0(67, 2, zq.b) : (b31Var.a(c00Var2, c00Var) || b31Var.a(c00.f, c00Var2)) ? new p31(83, 67, zq.b) : r31.W(7, null);
                ciVar2.p(false);
                return objC0;
        }
    }
}
