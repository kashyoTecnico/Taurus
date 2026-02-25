package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fr0 extends y20 implements iw {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(int i, l01 l01Var, zl0 zl0Var) {
        super(1);
        this.f = i;
        this.g = l01Var;
        this.h = zl0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.iw
    public final Object g(Object obj) {
        Integer numD;
        Integer numC;
        Integer numC2;
        Integer numD2;
        o11 o11Var;
        o11 o11Var2;
        p11 p11Var;
        p11 p11Var2;
        o11 o11Var3;
        o11 o11Var4;
        p11 p11Var3;
        p11 p11Var4;
        Integer numC3;
        Integer numD3;
        Integer numD4;
        Integer numC4;
        xz xzVar;
        int i = this.e;
        j41 j41Var = j41.a;
        Object obj2 = this.h;
        int i2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ni0 ni0Var = (ni0) obj;
                gr0 gr0Var = (gr0) obj3;
                int i3 = -c10.u(gr0Var.r.a.g(), 0, i2);
                boolean z = gr0Var.s;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                ni0Var.d = true;
                ni0.l(ni0Var, (oi0) obj2, i4, i3);
                ni0Var.d = false;
                break;
            default:
                n01 n01Var = (n01) obj;
                l01 l01Var = (l01) obj3;
                int iP = b8.p(i2);
                int i5 = 24;
                a11 a11Var = null;
                switch (iP) {
                    case 0:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            if (!w11.b(n01Var.f)) {
                                if (!n01Var.e()) {
                                    int iD = w11.d(n01Var.f);
                                    n01Var.o(iD, iD);
                                    break;
                                } else {
                                    int iE = w11.e(n01Var.f);
                                    n01Var.o(iE, iE);
                                    break;
                                }
                            } else {
                                n01Var.h();
                                break;
                            }
                        }
                        break;
                    case 1:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            if (!w11.b(n01Var.f)) {
                                if (!n01Var.e()) {
                                    int iE2 = w11.e(n01Var.f);
                                    n01Var.o(iE2, iE2);
                                    break;
                                } else {
                                    int iD2 = w11.d(n01Var.f);
                                    n01Var.o(iD2, iD2);
                                    break;
                                }
                            } else {
                                n01Var.k();
                                break;
                            }
                        }
                        break;
                    case 2:
                        v11 v11Var = n01Var.e;
                        v11Var.a = null;
                        q8 q8Var = n01Var.g;
                        String str = q8Var.e;
                        String str2 = q8Var.e;
                        if (str.length() > 0) {
                            if (!n01Var.e()) {
                                v11Var.a = null;
                                if (str2.length() > 0 && (numD = n01Var.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    n01Var.o(iIntValue, iIntValue);
                                    break;
                                }
                            } else {
                                v11Var.a = null;
                                if (str2.length() > 0 && (numC = n01Var.c()) != null) {
                                    int iIntValue2 = numC.intValue();
                                    n01Var.o(iIntValue2, iIntValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        v11 v11Var2 = n01Var.e;
                        v11Var2.a = null;
                        q8 q8Var2 = n01Var.g;
                        String str3 = q8Var2.e;
                        String str4 = q8Var2.e;
                        if (str3.length() > 0) {
                            if (!n01Var.e()) {
                                v11Var2.a = null;
                                if (str4.length() > 0 && (numC2 = n01Var.c()) != null) {
                                    int iIntValue3 = numC2.intValue();
                                    n01Var.o(iIntValue3, iIntValue3);
                                    break;
                                }
                            } else {
                                v11Var2.a = null;
                                if (str4.length() > 0 && (numD2 = n01Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    n01Var.o(iIntValue4, iIntValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        n01Var.i();
                        break;
                    case 5:
                        n01Var.j();
                        break;
                    case 6:
                        n01Var.m();
                        break;
                    case 7:
                        n01Var.l();
                        break;
                    case 8:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            if (!n01Var.e()) {
                                n01Var.l();
                                break;
                            } else {
                                n01Var.m();
                                break;
                            }
                        }
                        break;
                    case 9:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            if (!n01Var.e()) {
                                n01Var.m();
                                break;
                            } else {
                                n01Var.l();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (n01Var.g.e.length() > 0 && (o11Var = n01Var.c) != null) {
                            int iF = n01Var.f(o11Var, -1);
                            n01Var.o(iF, iF);
                            break;
                        }
                        break;
                    case 11:
                        if (n01Var.g.e.length() > 0 && (o11Var2 = n01Var.c) != null) {
                            int iF2 = n01Var.f(o11Var2, 1);
                            n01Var.o(iF2, iF2);
                            break;
                        }
                        break;
                    case 12:
                        if (n01Var.g.e.length() > 0 && (p11Var = n01Var.i) != null) {
                            int iG = n01Var.g(p11Var, -1);
                            n01Var.o(iG, iG);
                            break;
                        }
                        break;
                    case 13:
                        if (n01Var.g.e.length() > 0 && (p11Var2 = n01Var.i) != null) {
                            int iG2 = n01Var.g(p11Var2, 1);
                            n01Var.o(iG2, iG2);
                            break;
                        }
                        break;
                    case 14:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            n01Var.o(0, 0);
                            break;
                        }
                        break;
                    case 15:
                        n01Var.e.a = null;
                        q8 q8Var3 = n01Var.g;
                        if (q8Var3.e.length() > 0) {
                            int length = q8Var3.e.length();
                            n01Var.o(length, length);
                            break;
                        }
                        break;
                    case 16:
                        l01Var.b.b(false);
                        break;
                    case 17:
                        l01Var.b.l();
                        break;
                    case 18:
                        l01Var.b.d();
                        break;
                    case 19:
                        List listA = n01Var.a(s40.I);
                        if (listA != null) {
                            l01Var.a(listA);
                            break;
                        }
                        break;
                    case 20:
                        List listA2 = n01Var.a(k01.f);
                        if (listA2 != null) {
                            l01Var.a(listA2);
                            break;
                        }
                        break;
                    case 21:
                        List listA3 = n01Var.a(k01.g);
                        if (listA3 != null) {
                            l01Var.a(listA3);
                            break;
                        }
                        break;
                    case 22:
                        List listA4 = n01Var.a(k01.h);
                        if (listA4 != null) {
                            l01Var.a(listA4);
                            break;
                        }
                        break;
                    case 23:
                        List listA5 = n01Var.a(k01.i);
                        if (listA5 != null) {
                            l01Var.a(listA5);
                            break;
                        }
                        break;
                    case 24:
                        List listA6 = n01Var.a(k01.j);
                        if (listA6 != null) {
                            l01Var.a(listA6);
                            break;
                        }
                        break;
                    case 25:
                        n01Var.e.a = null;
                        q8 q8Var4 = n01Var.g;
                        if (q8Var4.e.length() > 0) {
                            n01Var.o(0, q8Var4.e.length());
                            break;
                        }
                        break;
                    case 26:
                        n01Var.h();
                        n01Var.n();
                        break;
                    case 27:
                        n01Var.k();
                        n01Var.n();
                        break;
                    case 28:
                        if (n01Var.g.e.length() > 0 && (o11Var3 = n01Var.c) != null) {
                            int iF3 = n01Var.f(o11Var3, -1);
                            n01Var.o(iF3, iF3);
                        }
                        n01Var.n();
                        break;
                    case 29:
                        if (n01Var.g.e.length() > 0 && (o11Var4 = n01Var.c) != null) {
                            int iF4 = n01Var.f(o11Var4, 1);
                            n01Var.o(iF4, iF4);
                        }
                        n01Var.n();
                        break;
                    case 30:
                        if (n01Var.g.e.length() > 0 && (p11Var3 = n01Var.i) != null) {
                            int iG3 = n01Var.g(p11Var3, -1);
                            n01Var.o(iG3, iG3);
                        }
                        n01Var.n();
                        break;
                    case 31:
                        if (n01Var.g.e.length() > 0 && (p11Var4 = n01Var.i) != null) {
                            int iG4 = n01Var.g(p11Var4, 1);
                            n01Var.o(iG4, iG4);
                        }
                        n01Var.n();
                        break;
                    case 32:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            n01Var.o(0, 0);
                        }
                        n01Var.n();
                        break;
                    case 33:
                        n01Var.e.a = null;
                        q8 q8Var5 = n01Var.g;
                        if (q8Var5.e.length() > 0) {
                            int length2 = q8Var5.e.length();
                            n01Var.o(length2, length2);
                        }
                        n01Var.n();
                        break;
                    case 34:
                        v11 v11Var3 = n01Var.e;
                        v11Var3.a = null;
                        q8 q8Var6 = n01Var.g;
                        String str5 = q8Var6.e;
                        String str6 = q8Var6.e;
                        if (str5.length() > 0) {
                            if (n01Var.e()) {
                                v11Var3.a = null;
                                if (str6.length() > 0 && (numD3 = n01Var.d()) != null) {
                                    int iIntValue5 = numD3.intValue();
                                    n01Var.o(iIntValue5, iIntValue5);
                                }
                            } else {
                                v11Var3.a = null;
                                if (str6.length() > 0 && (numC3 = n01Var.c()) != null) {
                                    int iIntValue6 = numC3.intValue();
                                    n01Var.o(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        n01Var.n();
                        break;
                    case 35:
                        v11 v11Var4 = n01Var.e;
                        v11Var4.a = null;
                        q8 q8Var7 = n01Var.g;
                        String str7 = q8Var7.e;
                        String str8 = q8Var7.e;
                        if (str7.length() > 0) {
                            if (n01Var.e()) {
                                v11Var4.a = null;
                                if (str8.length() > 0 && (numC4 = n01Var.c()) != null) {
                                    int iIntValue7 = numC4.intValue();
                                    n01Var.o(iIntValue7, iIntValue7);
                                }
                            } else {
                                v11Var4.a = null;
                                if (str8.length() > 0 && (numD4 = n01Var.d()) != null) {
                                    int iIntValue8 = numD4.intValue();
                                    n01Var.o(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        n01Var.n();
                        break;
                    case 36:
                        n01Var.i();
                        n01Var.n();
                        break;
                    case 37:
                        n01Var.j();
                        n01Var.n();
                        break;
                    case 38:
                        n01Var.m();
                        n01Var.n();
                        break;
                    case 39:
                        n01Var.l();
                        n01Var.n();
                        break;
                    case 40:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            if (n01Var.e()) {
                                n01Var.m();
                            } else {
                                n01Var.l();
                            }
                        }
                        n01Var.n();
                        break;
                    case 41:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            if (n01Var.e()) {
                                n01Var.l();
                            } else {
                                n01Var.m();
                            }
                        }
                        n01Var.n();
                        break;
                    case 42:
                        n01Var.e.a = null;
                        if (n01Var.g.e.length() > 0) {
                            long j = n01Var.f;
                            int i6 = w11.c;
                            int i7 = (int) (j & 4294967295L);
                            n01Var.o(i7, i7);
                            break;
                        }
                        break;
                    case 43:
                        if (!l01Var.e) {
                            l01Var.a(d80.t(new xf("\n", 1)));
                            break;
                        } else {
                            l01Var.a.u.g(new wy(l01Var.l));
                            break;
                        }
                    case 44:
                        if (!l01Var.e) {
                            l01Var.a(d80.t(new xf("\t", 1)));
                            break;
                        } else {
                            ((zl0) obj2).d = false;
                            break;
                        }
                    case 45:
                        h41 h41Var = l01Var.h;
                        if (h41Var != null) {
                            h41Var.a(a11.a(n01Var.h, n01Var.g, n01Var.f, 4));
                        }
                        h41 h41Var2 = l01Var.h;
                        if (h41Var2 != null) {
                            xz xzVar2 = h41Var2.a;
                            if (xzVar2 != null && (xzVar = (xz) xzVar2.e) != null) {
                                h41Var2.a = xzVar;
                                h41Var2.c -= ((a11) xzVar2.f).a.e.length();
                                h41Var2.b = new xz(i5, h41Var2.b, (a11) xzVar2.f);
                                a11Var = (a11) xzVar.f;
                            }
                            if (a11Var != null) {
                                l01Var.k.g(a11Var);
                                break;
                            }
                        }
                        break;
                    case 46:
                        h41 h41Var3 = l01Var.h;
                        if (h41Var3 != null) {
                            xz xzVar3 = h41Var3.b;
                            if (xzVar3 != null) {
                                h41Var3.b = (xz) xzVar3.e;
                                a11 a11Var2 = (a11) xzVar3.f;
                                h41Var3.a = new xz(i5, h41Var3.a, a11Var2);
                                h41Var3.c = a11Var2.a.e.length() + h41Var3.c;
                                a11Var = (a11) xzVar3.f;
                            }
                            if (a11Var != null) {
                                l01Var.k.g(a11Var);
                                break;
                            }
                        }
                        break;
                }
        }
        return j41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(gr0 gr0Var, int i, oi0 oi0Var) {
        super(1);
        this.g = gr0Var;
        this.f = i;
        this.h = oi0Var;
    }
}
