package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u7 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u7(av avVar, qu quVar, iw iwVar) {
        super(1);
        this.e = 5;
        this.f = avVar;
        this.g = quVar;
        this.h = (y20) iwVar;
    }

    /* JADX WARN: Type inference failed for: r13v30, types: [iw, y20] */
    /* JADX WARN: Type inference failed for: r14v2, types: [gw, y20] */
    @Override // defpackage.iw
    public final Object g(Object obj) {
        boolean zBooleanValue;
        switch (this.e) {
            case 0:
                d8 d8Var = (d8) obj;
                x7 x7Var = (x7) this.f;
                dq0.o(d8Var, x7Var.c);
                zg0 zg0Var = d8Var.e;
                Object objA = x7.a(x7Var, zg0Var.getValue());
                if (!c10.i(objA, zg0Var.getValue())) {
                    x7Var.c.e.setValue(objA);
                    ((f8) this.g).e.setValue(objA);
                    d8Var.i.setValue(Boolean.FALSE);
                    d8Var.d.a();
                    ((zl0) this.h).d = true;
                }
                return j41.a;
            case 1:
                a11 a11Var = (a11) obj;
                ((za0) this.g).setValue(a11Var);
                za0 za0Var = (za0) this.h;
                boolean zI = c10.i((String) za0Var.getValue(), a11Var.a.e);
                q8 q8Var = a11Var.a;
                za0Var.setValue(q8Var.e);
                if (!zI) {
                    ((iw) this.f).g(q8Var.e);
                }
                return j41.a;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                oj ojVar = (oj) this.f;
                float f = ojVar.t ? 1.0f : -1.0f;
                mr0 mr0Var = ojVar.s;
                kr0 kr0Var = (kr0) this.h;
                long jD = mr0Var.d(mr0Var.g(f * fFloatValue));
                mr0 mr0Var2 = kr0Var.a;
                float f2 = mr0Var.f(mr0Var.d(mr0.a(mr0Var2, mr0Var2.h, jD, 1))) * f;
                if (Math.abs(f2) < Math.abs(fFloatValue)) {
                    r10 r10Var = (r10) this.g;
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    r10Var.a(cancellationException);
                }
                return j41.a;
            case 3:
                sq sqVar = (sq) obj;
                r40 r40Var = (r40) this.f;
                p11 p11VarD = r40Var.d();
                if (p11VarD != null) {
                    long j = ((a11) this.g).b;
                    hd0 hd0Var = (hd0) this.h;
                    dd ddVarO = sqVar.D().o();
                    long j2 = ((w11) r40Var.x.getValue()).a;
                    long j3 = ((w11) r40Var.y.getValue()).a;
                    o11 o11Var = p11VarD.a;
                    u90 u90Var = o11Var.b;
                    n11 n11Var = o11Var.a;
                    a6 a6Var = r40Var.v;
                    long j4 = r40Var.w;
                    if (!w11.b(j2)) {
                        a6Var.e(j4);
                        int iD = hd0Var.d(w11.e(j2));
                        int iD2 = hd0Var.d(w11.d(j2));
                        if (iD != iD2) {
                            ddVarO.g(o11Var.k(iD, iD2), a6Var);
                        }
                    } else if (!w11.b(j3)) {
                        long jB = n11Var.b.b();
                        bf bfVar = new bf(jB);
                        if (jB == 16) {
                            bfVar = null;
                        }
                        long j5 = bfVar != null ? bfVar.a : bf.b;
                        a6Var.e(bf.b(j5, bf.d(j5) * 0.2f));
                        int iD3 = hd0Var.d(w11.e(j3));
                        int iD4 = hd0Var.d(w11.d(j3));
                        if (iD3 != iD4) {
                            ddVarO.g(o11Var.k(iD3, iD4), a6Var);
                        }
                    } else if (!w11.b(j)) {
                        a6Var.e(j4);
                        int iD5 = hd0Var.d(w11.e(j));
                        int iD6 = hd0Var.d(w11.d(j));
                        if (iD5 != iD6) {
                            ddVarO.g(o11Var.k(iD5, iD6), a6Var);
                        }
                    }
                    boolean z = o11Var.d() && n11Var.f != 3;
                    if (z) {
                        long j6 = o11Var.c;
                        xl0 xl0VarF = c4.f(0L, (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32));
                        ddVarO.l();
                        dd.k(ddVarO, xl0VarF);
                    }
                    iw0 iw0Var = n11Var.b.a;
                    uz0 uz0Var = iw0Var.m;
                    c11 c11Var = iw0Var.a;
                    if (uz0Var == null) {
                        uz0Var = uz0.b;
                    }
                    uz0 uz0Var2 = uz0Var;
                    hu0 hu0Var = iw0Var.n;
                    if (hu0Var == null) {
                        hu0Var = hu0.d;
                    }
                    hu0 hu0Var2 = hu0Var;
                    tq tqVar = iw0Var.p;
                    if (tqVar == null) {
                        tqVar = dt.a;
                    }
                    tq tqVar2 = tqVar;
                    try {
                        ac acVarB = c11Var.b();
                        b11 b11Var = b11.a;
                        if (acVarB != null) {
                            u90.h(u90Var, ddVarO, acVarB, c11Var != b11Var ? c11Var.c() : 1.0f, hu0Var2, uz0Var2, tqVar2);
                        } else {
                            u90.g(u90Var, ddVarO, c11Var != b11Var ? c11Var.a() : bf.b, hu0Var2, uz0Var2, tqVar2);
                        }
                        if (z) {
                            ddVarO.i();
                        }
                    } finally {
                    }
                }
                return j41.a;
            case 4:
                j31 j31Var = (j31) obj;
                qp qpVar = (qp) j31Var;
                if (!((h5) ((p3) d80.A((qp) this.g)).m3getDragAndDropManager()).b.contains(qpVar) || !b10.k(qpVar, c10.K((r1) this.h))) {
                    return i31.d;
                }
                ((dm0) this.f).d = j31Var;
                return i31.f;
            case 5:
                av avVar = (av) obj;
                if (c10.i(avVar, (av) this.f)) {
                    zBooleanValue = false;
                } else {
                    if (c10.i(avVar, ((qu) this.g).c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((y20) this.h).g(avVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 6:
                oi0 oi0Var = (oi0) this.g;
                ni0 ni0Var = (ni0) obj;
                n80 n80Var = (n80) this.h;
                ig0 ig0Var = (ig0) this.f;
                if (ig0Var.v) {
                    ni0.j(ni0Var, oi0Var, n80Var.N(ig0Var.r), n80Var.N(ig0Var.s));
                } else {
                    ni0.h(ni0Var, oi0Var, n80Var.N(ig0Var.r), n80Var.N(ig0Var.s));
                }
                return j41.a;
            case 7:
                oi0 oi0Var2 = (oi0) this.f;
                n80 n80Var2 = (n80) this.g;
                kg0 kg0Var = (kg0) this.h;
                ni0.h((ni0) obj, oi0Var2, n80Var2.N(kg0Var.r.b(n80Var2.getLayoutDirection())), n80Var2.N(kg0Var.r.d()));
                return j41.a;
            default:
                xz xzVar = (xz) this.f;
                iw iwVar = (iw) this.g;
                j11 j11Var = (j11) ((dm0) this.h).d;
                a11 a11VarI = xzVar.i((List) obj);
                if (j11Var != null) {
                    j11Var.a(null, a11VarI);
                }
                iwVar.g(a11VarI);
                return j41.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
