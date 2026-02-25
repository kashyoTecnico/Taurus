package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sz0 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ tz0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz0(tz0 tz0Var, int i) {
        super(1);
        this.e = i;
        this.f = tz0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        o11 o11Var;
        switch (this.e) {
            case 0:
                List list = (List) obj;
                tz0 tz0Var = this.f;
                o11 o11Var2 = tz0Var.B0().m;
                if (o11Var2 != null) {
                    n11 n11Var = o11Var2.a;
                    o11Var = new o11(new n11(n11Var.a, c21.e(tz0Var.s, bf.g, 0L, null, 0L, 0, 0L, 16777214), n11Var.c, n11Var.d, n11Var.e, n11Var.f, n11Var.g, n11Var.h, n11Var.i, n11Var.j), o11Var2.b, o11Var2.c);
                    list.add(o11Var);
                } else {
                    o11Var = null;
                }
                break;
            case 1:
                q8 q8Var = (q8) obj;
                tz0 tz0Var2 = this.f;
                rz0 rz0Var = tz0Var2.D;
                if (rz0Var == null) {
                    rz0 rz0Var2 = new rz0(tz0Var2.r, q8Var);
                    w90 w90Var = new w90(q8Var, tz0Var2.s, tz0Var2.t, tz0Var2.v, tz0Var2.w, tz0Var2.x, tz0Var2.y);
                    w90Var.c(tz0Var2.B0().j);
                    rz0Var2.d = w90Var;
                    tz0Var2.D = rz0Var2;
                } else if (!c10.i(q8Var, rz0Var.b)) {
                    rz0Var.b = q8Var;
                    w90 w90Var2 = rz0Var.d;
                    if (w90Var2 != null) {
                        c21 c21Var = tz0Var2.s;
                        jv jvVar = tz0Var2.t;
                        int i = tz0Var2.v;
                        boolean z = tz0Var2.w;
                        int i2 = tz0Var2.x;
                        int i3 = tz0Var2.y;
                        w90Var2.a = q8Var;
                        w90Var2.b = c21Var;
                        w90Var2.c = jvVar;
                        w90Var2.d = i;
                        w90Var2.e = z;
                        w90Var2.f = i2;
                        w90Var2.g = i3;
                        w90Var2.k = null;
                        w90Var2.m = null;
                        w90Var2.o = -1;
                        w90Var2.n = -1;
                    }
                }
                h9.i(tz0Var2);
                nm.v(tz0Var2);
                m20.F(tz0Var2);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tz0 tz0Var3 = this.f;
                rz0 rz0Var3 = tz0Var3.D;
                if (rz0Var3 != null) {
                    if (rz0Var3 != null) {
                        rz0Var3.c = zBooleanValue;
                    }
                    h9.i(tz0Var3);
                    nm.v(tz0Var3);
                    m20.F(tz0Var3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
