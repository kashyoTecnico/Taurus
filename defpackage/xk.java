package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xk extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ r40 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xk(r40 r40Var, int i) {
        super(1);
        this.e = i;
        this.f = r40Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        cw0 cw0Var;
        int i = this.e;
        boolean z = false;
        j41 j41Var = null;
        j41 j41Var2 = j41.a;
        r40 r40Var = this.f;
        switch (i) {
            case 0:
                d30 d30Var = (d30) obj;
                p11 p11VarD = r40Var.d();
                if (p11VarD != null) {
                    p11VarD.c = d30Var;
                }
                return j41Var2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                r40Var.q.setValue(bool);
                return j41Var2;
            case 2:
                List list = (List) obj;
                if (r40Var.d() != null) {
                    p11 p11VarD2 = r40Var.d();
                    c10.m(p11VarD2);
                    list.add(p11VarD2.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                q8 q8Var = (q8) obj;
                j11 j11Var = r40Var.e;
                xk xkVar = r40Var.t;
                if (j11Var != null) {
                    a11 a11VarI = r40Var.d.i(ve.M(new rn(), new xf(q8Var, 1)));
                    j11Var.a(null, a11VarI);
                    xkVar.g(a11VarI);
                    j41Var = j41Var2;
                }
                if (j41Var == null) {
                    String str = q8Var.e;
                    int length = str.length();
                    xkVar.g(new a11(str, no0.a(length, length), 4));
                }
                return Boolean.TRUE;
            case 4:
                int i2 = ((wy) obj).a;
                e9 e9Var = r40Var.r;
                e9Var.getClass();
                if (i2 == 7 || i2 == 2 || i2 == 6 || i2 == 5 || i2 == 3 || i2 == 4) {
                    e9Var.r();
                } else if (i2 != 1 && i2 != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                if (i2 == 6) {
                    ou ouVar = (ou) e9Var.c;
                    if (ouVar == null) {
                        c10.Y("focusManager");
                        throw null;
                    }
                    ((qu) ouVar).f(1);
                } else if (i2 == 5) {
                    ou ouVar2 = (ou) e9Var.c;
                    if (ouVar2 == null) {
                        c10.Y("focusManager");
                        throw null;
                    }
                    ((qu) ouVar2).f(2);
                } else if (i2 == 7 && (cw0Var = (cw0) e9Var.a) != null) {
                    ((nn) cw0Var).a();
                }
                return j41Var2;
            default:
                a11 a11Var = (a11) obj;
                String str2 = a11Var.a.e;
                q8 q8Var2 = r40Var.j;
                if (!c10.i(str2, q8Var2 != null ? q8Var2.e : null)) {
                    r40Var.k.setValue(px.d);
                }
                long j = w11.b;
                r40Var.f(j);
                r40Var.e(j);
                r40Var.s.g(a11Var);
                nl0 nl0Var = r40Var.b;
                oi oiVar = nl0Var.a;
                if (oiVar != null) {
                    oiVar.r(nl0Var, null);
                }
                return j41Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(r40 r40Var, ct0 ct0Var) {
        super(1);
        this.e = 3;
        this.f = r40Var;
    }
}
