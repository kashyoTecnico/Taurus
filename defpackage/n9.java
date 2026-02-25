package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n9 extends y20 implements kw {
    public static final n9 A;
    public static final n9 B;
    public static final n9 C;
    public static final n9 D;
    public static final n9 E;
    public static final n9 F;
    public static final n9 G;
    public static final n9 H;
    public static final n9 I;
    public static final n9 f;
    public static final n9 g;
    public static final n9 h;
    public static final n9 i;
    public static final n9 j;
    public static final n9 k;
    public static final n9 l;
    public static final n9 m;
    public static final n9 n;
    public static final n9 o;
    public static final n9 p;
    public static final n9 q;
    public static final n9 r;
    public static final n9 s;
    public static final n9 t;
    public static final n9 u;
    public static final n9 v;
    public static final n9 w;
    public static final n9 x;
    public static final n9 y;
    public static final n9 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 2;
        f = new n9(i2, 0);
        g = new n9(i2, 1);
        h = new n9(i2, 2);
        i = new n9(i2, 3);
        j = new n9(i2, 4);
        k = new n9(i2, 5);
        l = new n9(i2, 6);
        m = new n9(i2, 7);
        n = new n9(i2, 8);
        o = new n9(i2, 9);
        p = new n9(i2, 10);
        q = new n9(i2, 11);
        r = new n9(i2, 12);
        s = new n9(i2, 13);
        t = new n9(i2, 14);
        u = new n9(i2, 15);
        v = new n9(i2, 16);
        w = new n9(i2, 17);
        x = new n9(i2, 18);
        y = new n9(i2, 19);
        z = new n9(i2, 20);
        A = new n9(i2, 21);
        B = new n9(i2, 22);
        C = new n9(i2, 23);
        D = new n9(i2, 24);
        E = new n9(i2, 25);
        F = new n9(i2, 26);
        G = new n9(i2, 27);
        H = new n9(i2, 28);
        I = new n9(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [d90] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [d90] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [eb0] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [eb0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        vf vfVar;
        switch (this.e) {
            case 0:
                return Integer.valueOf(Math.round((1 + (((e30) obj2) != e30.d ? (-1.0f) * (-1) : -1.0f)) * (((Number) obj).intValue() / 2.0f)));
            case 1:
                String str = (String) obj;
                kl klVar = (kl) obj2;
                c10.p(str, "acc");
                c10.p(klVar, "element");
                if (str.length() == 0) {
                    return klVar.toString();
                }
                return str + ", " + klVar;
            case 2:
                String str2 = (String) obj;
                c90 c90Var = (c90) obj2;
                if (str2.length() == 0) {
                    return c90Var.toString();
                }
                return str2 + ", " + c90Var;
            case 3:
                ci ciVar = (ci) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ciVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ciVar.Q();
                }
                return j41.a;
            case 4:
                ci ciVar2 = (ci) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ciVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ciVar2.Q();
                }
                return j41.a;
            case 5:
                ci ciVar3 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar3.z()) {
                    ciVar3.Q();
                }
                return j41.a;
            case 6:
                ci ciVar4 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar4.z()) {
                    ciVar4.Q();
                }
                return j41.a;
            case 7:
                ci ciVar5 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar5.z()) {
                    ciVar5.Q();
                }
                return j41.a;
            case 8:
                ci ciVar6 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar6.z()) {
                    ciVar6.Q();
                }
                return j41.a;
            case 9:
                ci ciVar7 = (ci) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!ciVar7.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ciVar7.Q();
                }
                return j41.a;
            case 10:
                ci ciVar8 = (ci) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!ciVar8.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ciVar8.Q();
                }
                return j41.a;
            case 11:
                ((Number) obj2).intValue();
                ((sh) obj).getClass();
                return j41.a;
            case 12:
                ((t30) ((sh) obj)).b0((l80) obj2);
                return j41.a;
            case 13:
                ((t30) ((sh) obj)).c0((e90) obj2);
                return j41.a;
            case 14:
                ri riVar = (ri) obj2;
                t30 t30Var = (t30) ((sh) obj);
                t30Var.C = riVar;
                jc0 jc0Var = t30Var.G;
                hx0 hx0Var = ti.h;
                vh0 vh0Var = (vh0) riVar;
                vh0Var.getClass();
                t30Var.Y((xn) nm.A(vh0Var, hx0Var));
                e30 e30Var = (e30) nm.A(vh0Var, ti.n);
                if (t30Var.A != e30Var) {
                    t30Var.A = e30Var;
                    t30Var.D();
                    t30 t30VarT = t30Var.t();
                    if (t30VarT != null) {
                        t30VarT.A();
                    }
                    t30Var.C();
                    for (d90 d90Var = jc0Var.f; d90Var != null; d90Var = d90Var.i) {
                        d90Var.k0();
                    }
                }
                t30Var.d0((c61) nm.A(vh0Var, ti.s));
                d90 d90Var2 = jc0Var.f;
                if ((d90Var2.g & 32768) != 0) {
                    while (d90Var2 != null) {
                        if ((d90Var2.f & 32768) != 0) {
                            mn mnVarI = d90Var2;
                            ?? eb0Var = 0;
                            while (mnVarI != 0) {
                                if (mnVarI instanceof pi) {
                                    d90 d90Var3 = ((d90) ((pi) mnVarI)).d;
                                    if (d90Var3.q) {
                                        oc0.c(d90Var3);
                                    } else {
                                        d90Var3.m = true;
                                    }
                                } else if ((mnVarI.f & 32768) != 0 && (mnVarI instanceof mn)) {
                                    d90 d90Var4 = mnVarI.s;
                                    int i2 = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var4 != null) {
                                        if ((d90Var4.f & 32768) != 0) {
                                            i2++;
                                            eb0Var = eb0Var;
                                            if (i2 == 1) {
                                                mnVarI = d90Var4;
                                            } else {
                                                if (eb0Var == 0) {
                                                    eb0Var = new eb0(new d90[16]);
                                                }
                                                if (mnVarI != 0) {
                                                    eb0Var.b(mnVarI);
                                                    mnVarI = 0;
                                                }
                                                eb0Var.b(d90Var4);
                                            }
                                        }
                                        d90Var4 = d90Var4.i;
                                        mnVarI = mnVarI;
                                        eb0Var = eb0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                mnVarI = d80.i(eb0Var);
                            }
                        }
                        if ((d90Var2.g & 32768) != 0) {
                            d90Var2 = d90Var2.i;
                        }
                    }
                }
                return j41.a;
            case 15:
                ml mlVar = (ml) obj;
                kl klVar2 = (kl) obj2;
                c10.p(mlVar, "acc");
                c10.p(klVar2, "element");
                ml mlVarV = mlVar.v(klVar2.getKey());
                is isVar = is.d;
                if (mlVarV == isVar) {
                    return klVar2;
                }
                g2 g2Var = g2.v;
                nk nkVar = (nk) mlVarV.n(g2Var);
                if (nkVar == null) {
                    vfVar = new vf(klVar2, mlVarV);
                } else {
                    ml mlVarV2 = mlVarV.v(g2Var);
                    if (mlVarV2 == isVar) {
                        return new vf(nkVar, klVar2);
                    }
                    vfVar = new vf(nkVar, new vf(klVar2, mlVarV2));
                }
                return vfVar;
            case 16:
                return Integer.valueOf(((g80) obj).f(((Number) obj2).intValue()));
            case 17:
                return Integer.valueOf(((g80) obj).X(((Number) obj2).intValue()));
            case 18:
                return Integer.valueOf(((g80) obj).b0(((Number) obj2).intValue()));
            case 19:
                return Integer.valueOf(((g80) obj).S(((Number) obj2).intValue()));
            case 20:
                return Integer.valueOf(((tq0) obj2).a.g());
            case 21:
                return Long.valueOf(((zs0) obj2).d.get());
            case 22:
                return (r4) obj;
            case 23:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListE0 = ue.e0(list);
                arrayListE0.addAll(list2);
                return arrayListE0;
            case 24:
                return (rj) obj;
            case 25:
                return (j41) obj;
            case 26:
                return (j41) obj;
            case 27:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 28:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            default:
                return (j41) obj;
        }
    }
}
