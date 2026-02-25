package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class nl implements kw {
    public final /* synthetic */ int d;

    public /* synthetic */ nl(int i) {
        this.d = i;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ap0 ap0Var;
        t8 t8Var;
        Object objA;
        switch (this.d) {
            case 0:
                return ((ml) obj).k((kl) obj2);
            case 1:
                return ((ml) obj).k((kl) obj2);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                zo0 zo0Var = (zo0) obj;
                s01 s01Var = (s01) obj2;
                List listM = ve.M(Float.valueOf(s01Var.a.g()), Boolean.valueOf(((if0) s01Var.e.getValue()) == if0.d));
                int size = listM.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = listM.get(i);
                    if (obj3 != null && (ap0Var = zo0Var.e) != null && !ap0Var.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (listM.isEmpty()) {
                    return null;
                }
                return new ArrayList(listM);
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 5:
                return obj2;
            case 6:
                q8 q8Var = (q8) obj2;
                return ve.K(q8Var.e, up0.a(q8Var.d, up0.a, (zo0) obj));
            case 7:
                return Integer.valueOf(((uz0) obj2).a);
            case 8:
                d11 d11Var = (d11) obj2;
                return ve.K(Float.valueOf(d11Var.a), Float.valueOf(d11Var.b));
            case 9:
                zo0 zo0Var2 = (zo0) obj;
                e11 e11Var = (e11) obj2;
                f21 f21Var = new f21(e11Var.a);
                tp0 tp0Var = up0.q;
                return ve.K(up0.a(f21Var, tp0Var, zo0Var2), up0.a(new f21(e11Var.b), tp0Var, zo0Var2));
            case 10:
                return Integer.valueOf(((zv) obj2).d);
            case 11:
                t50 t50Var = (t50) obj2;
                return ve.K(t50Var.a, up0.a(t50Var.b, up0.i, (zo0) obj));
            case 12:
                return Float.valueOf(((ja) obj2).a);
            case 13:
                zo0 zo0Var3 = (zo0) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add(up0.a((p8) list.get(i2), up0.b, zo0Var3));
                }
                return arrayList;
            case 14:
                w11 w11Var = (w11) obj2;
                return ve.K(Integer.valueOf((int) (w11Var.a >> 32)), Integer.valueOf((int) (w11Var.a & 4294967295L)));
            case 15:
                zo0 zo0Var4 = (zo0) obj;
                hu0 hu0Var = (hu0) obj2;
                return ve.K(up0.a(new bf(hu0Var.a), up0.p, zo0Var4), up0.a(new ed0(hu0Var.b), up0.r, zo0Var4), Float.valueOf(hu0Var.c));
            case 16:
                f21 f21Var2 = (f21) obj2;
                return f21Var2 != null ? f21.a(f21Var2.a, f21.c) : false ? Boolean.FALSE : ve.K(Float.valueOf(f21.c(f21Var2.a)), new g21(f21.b(f21Var2.a)));
            case 17:
                ed0 ed0Var = (ed0) obj2;
                return ed0Var != null ? ed0.b(ed0Var.a, 9205357640488583168L) : false ? Boolean.FALSE : ve.K(Float.valueOf(Float.intBitsToFloat((int) (ed0Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (ed0Var.a & 4294967295L))));
            case 18:
                zo0 zo0Var5 = (zo0) obj;
                List list2 = ((d60) obj2).d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList2.add(up0.a((c60) list2.get(i3), up0.t, zo0Var5));
                }
                return arrayList2;
            case 19:
                return ((c60) obj2).a.toLanguageTag();
            case 20:
                p50 p50Var = (p50) obj2;
                return ve.K(new m50(p50Var.a), new o50(p50Var.b), new n50());
            case 21:
                zo0 zo0Var6 = (zo0) obj;
                p8 p8Var = (p8) obj2;
                Object obj4 = p8Var.a;
                if (obj4 instanceof tg0) {
                    t8Var = t8.d;
                } else if (obj4 instanceof iw0) {
                    t8Var = t8.e;
                } else if (obj4 instanceof p51) {
                    t8Var = t8.f;
                } else if (obj4 instanceof s41) {
                    t8Var = t8.g;
                } else if (obj4 instanceof t50) {
                    t8Var = t8.h;
                } else if (obj4 instanceof s50) {
                    t8Var = t8.i;
                } else {
                    if (!(obj4 instanceof jx0)) {
                        throw new UnsupportedOperationException();
                    }
                    t8Var = t8.j;
                }
                switch (t8Var.ordinal()) {
                    case 0:
                        c10.n(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = up0.a((tg0) obj4, up0.g, zo0Var6);
                        break;
                    case 1:
                        c10.n(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = up0.a((iw0) obj4, up0.h, zo0Var6);
                        break;
                    case 2:
                        c10.n(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = up0.a((p51) obj4, up0.c, zo0Var6);
                        break;
                    case 3:
                        c10.n(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = up0.a((s41) obj4, up0.d, zo0Var6);
                        break;
                    case 4:
                        c10.n(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = up0.a((t50) obj4, up0.e, zo0Var6);
                        break;
                    case 5:
                        c10.n(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = up0.a((s50) obj4, up0.f, zo0Var6);
                        break;
                    case 6:
                        c10.n(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((jx0) obj4).a;
                        break;
                    default:
                        throw new fg();
                }
                return ve.K(t8Var, objA, Integer.valueOf(p8Var.b), Integer.valueOf(p8Var.c), p8Var.d);
            case 22:
                s50 s50Var = (s50) obj2;
                return ve.K(s50Var.a, up0.a(s50Var.b, up0.i, (zo0) obj));
            case 23:
                return ((p51) obj2).a;
            case 24:
                return ((s41) obj2).a;
            case 25:
                zo0 zo0Var7 = (zo0) obj;
                tg0 tg0Var = (tg0) obj2;
                oz0 oz0Var = new oz0(tg0Var.a);
                xz0 xz0Var = new xz0(tg0Var.b);
                Object objA2 = up0.a(new f21(tg0Var.c), up0.q, zo0Var7);
                e11 e11Var2 = tg0Var.d;
                e11 e11Var3 = e11.c;
                Object objA3 = up0.a(e11Var2, up0.l, zo0Var7);
                Object objA4 = up0.a(tg0Var.e, d80.e, zo0Var7);
                p50 p50Var2 = tg0Var.f;
                p50 p50Var3 = p50.c;
                return ve.K(oz0Var, xz0Var, objA2, objA3, objA4, up0.a(p50Var2, up0.u, zo0Var7), up0.a(new k50(tg0Var.g), d80.f, zo0Var7), new py(tg0Var.h), up0.a(tg0Var.i, d80.g, zo0Var7));
            case 26:
                zo0 zo0Var8 = (zo0) obj;
                iw0 iw0Var = (iw0) obj2;
                bf bfVar = new bf(iw0Var.a.a());
                tp0 tp0Var2 = up0.p;
                Object objA5 = up0.a(bfVar, tp0Var2, zo0Var8);
                f21 f21Var3 = new f21(iw0Var.b);
                tp0 tp0Var3 = up0.q;
                Object objA6 = up0.a(f21Var3, tp0Var3, zo0Var8);
                zv zvVar = iw0Var.c;
                zv zvVar2 = zv.e;
                Object objA7 = up0.a(zvVar, up0.m, zo0Var8);
                xv xvVar = iw0Var.d;
                yv yvVar = iw0Var.e;
                String str = iw0Var.g;
                Object objA8 = up0.a(new f21(iw0Var.h), tp0Var3, zo0Var8);
                Object objA9 = up0.a(iw0Var.i, up0.n, zo0Var8);
                Object objA10 = up0.a(iw0Var.j, up0.k, zo0Var8);
                d60 d60Var = iw0Var.k;
                d60 d60Var2 = d60.f;
                Object objA11 = up0.a(d60Var, up0.s, zo0Var8);
                Object objA12 = up0.a(new bf(iw0Var.l), tp0Var2, zo0Var8);
                Object objA13 = up0.a(iw0Var.m, up0.j, zo0Var8);
                hu0 hu0Var2 = iw0Var.n;
                hu0 hu0Var3 = hu0.d;
                return ve.K(objA5, objA6, objA7, xvVar, yvVar, -1, str, objA8, objA9, objA10, objA11, objA12, objA13, up0.a(hu0Var2, up0.o, zo0Var8));
            case 27:
                zo0 zo0Var9 = (zo0) obj;
                s11 s11Var = (s11) obj2;
                iw0 iw0Var2 = s11Var.a;
                xz xzVar = up0.h;
                return ve.K(up0.a(iw0Var2, xzVar, zo0Var9), up0.a(s11Var.b, xzVar, zo0Var9), up0.a(s11Var.c, xzVar, zo0Var9), up0.a(s11Var.d, xzVar, zo0Var9));
            case 28:
                Boolean boolValueOf = Boolean.valueOf(((vi0) obj2).a);
                xz xzVar2 = up0.a;
                return ve.K(boolValueOf, new es());
            default:
                return Integer.valueOf(((k50) obj2).a);
        }
    }
}
