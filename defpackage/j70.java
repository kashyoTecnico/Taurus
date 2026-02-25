package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j70 implements kw {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j70(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        uy uyVar;
        int i = this.d;
        b90 b90Var = b90.a;
        Object obj3 = this.e;
        j41 j41Var = j41.a;
        switch (i) {
            case 0:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    l11.b((String) obj3, a.d(b90Var, 12), 0L, 0L, vy0.c, 0L, 0L, 0, false, 0, 0, null, ciVar, 54, 131004);
                }
                return j41Var;
            case 1:
                ci ciVar2 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar2.z()) {
                    ciVar2.Q();
                } else {
                    float f = 24;
                    e90 e90VarD = a.d(b.b, f);
                    String str = (String) obj3;
                    tf tfVarA = rf.a(o9.d, g2.q, ciVar2, 54);
                    int iJ = c10.J(ciVar2);
                    wh0 wh0VarL = ciVar2.l();
                    e90 e90VarP = r31.P(ciVar2, e90VarD);
                    sh.b.getClass();
                    si siVar = rh.b;
                    ciVar2.X();
                    if (ciVar2.S) {
                        ciVar2.k(siVar);
                    } else {
                        ciVar2.h0();
                    }
                    dq0.m(ciVar2, rh.e, tfVarA);
                    dq0.m(ciVar2, rh.d, wh0VarL);
                    n9 n9Var = rh.f;
                    if (ciVar2.S || !c10.i(ciVar2.K(), Integer.valueOf(iJ))) {
                        b8.k(iJ, ciVar2, iJ, n9Var);
                    }
                    dq0.m(ciVar2, rh.c, e90VarP);
                    uy uyVar2 = b10.r;
                    if (uyVar2 != null) {
                        uyVar = uyVar2;
                    } else {
                        long j = bf.g;
                        ArrayList arrayList = new ArrayList();
                        int i2 = a51.a;
                        ArrayList arrayList2 = new ArrayList();
                        ty tyVar = new ty();
                        tyVar.a = ks.d;
                        tyVar.b = arrayList2;
                        arrayList.add(tyVar);
                        int i3 = a51.a;
                        fw0 fw0Var = new fw0(bf.b);
                        dh0 dh0Var = new dh0();
                        hh0 hh0Var = new hh0(18.0f, 8.0f);
                        ArrayList arrayList3 = dh0Var.d;
                        arrayList3.add(hh0Var);
                        arrayList3.add(new kh0(-1.0f));
                        dh0Var.b(17.0f, 6.0f);
                        dh0Var.a(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                        arrayList3.add(new ih0(2));
                        arrayList3.add(new mh0(2.0f));
                        dh0Var.b(6.0f, 8.0f);
                        dh0Var.a(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        arrayList3.add(new mh0(10.0f));
                        dh0Var.a(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        int i4 = 1;
                        arrayList3.add(new kh0(12.0f));
                        dh0Var.a(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        dh0Var.b(20.0f, 10.0f);
                        dh0Var.a(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        fh0 fh0Var = fh0.b;
                        arrayList3.add(fh0Var);
                        arrayList3.add(new hh0(12.0f, 17.0f));
                        dh0Var.a(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                        arrayList3.add(new lh0(0.9f, -2.0f, 2.0f, -2.0f));
                        arrayList3.add(new lh0(2.0f, 0.9f, 2.0f, 2.0f));
                        arrayList3.add(new lh0(-0.9f, 2.0f, -2.0f, 2.0f));
                        arrayList3.add(fh0Var);
                        arrayList3.add(new hh0(15.1f, 8.0f));
                        dh0Var.b(8.9f, 8.0f);
                        dh0Var.b(8.9f, 6.0f);
                        dh0Var.a(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                        dh0Var.a(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                        arrayList3.add(new mh0(2.0f));
                        arrayList3.add(fh0Var);
                        ((ty) arrayList.get(arrayList.size() - 1)).b.add(new d51(arrayList3, fw0Var));
                        while (true) {
                            int i5 = i4;
                            if (arrayList.size() > i5) {
                                ty tyVar2 = (ty) arrayList.remove(arrayList.size() - i5);
                                ArrayList arrayList4 = ((ty) arrayList.get(arrayList.size() - i5)).b;
                                tyVar2.getClass();
                                arrayList4.add(new z41(tyVar2.a, tyVar2.b));
                                i4 = 1;
                            } else {
                                uy uyVar3 = new uy("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, new z41(tyVar.a, tyVar.b), j, 5);
                                b10.r = uyVar3;
                                uyVar = uyVar3;
                            }
                        }
                    }
                    ry.a(uyVar, b.e(b90Var, 48), 0L, ciVar2, 432);
                    hx0 hx0Var = c41.a;
                    l11.b("EQUIPO NO ACTIVADO", null, ((kf) ciVar2.j(lf.a)).w, 0L, null, 0L, 0L, 0, false, 0, 0, ((b41) ciVar2.j(hx0Var)).f, ciVar2, 6, 65530);
                    float f2 = 20;
                    h9.a(ciVar2, b.b(f2));
                    l11.b("1. ID detectado:", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, ((b41) ciVar2.j(hx0Var)).m, ciVar2, 6, 65534);
                    l81.a(a.f(b.a, 0.0f, 4, 1), null, null, null, b10.b0(1666920743, new k70(str), ciVar2), ciVar2, 196614);
                    h9.a(ciVar2, b.b(f2));
                    wk0.a(b.e(b90Var, f), 0L, 0.0f, 0L, 0, ciVar2, 6);
                    l11.b("Esperando comando ADB...", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, ((b41) ciVar2.j(hx0Var)).l, ciVar2, 6, 65534);
                    ciVar2.p(true);
                }
                return j41Var;
            default:
                ci ciVar3 = (ci) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (ciVar3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    throw null;
                }
                ciVar3.Q();
                return j41Var;
        }
    }
}
