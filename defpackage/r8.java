package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class r8 implements iw {
    public final /* synthetic */ int d;

    public /* synthetic */ r8(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i = 0;
        iw0 iw0Var = null;
        hu0Var = null;
        hu0 hu0Var = null;
        u11Var = null;
        u11 u11Var = null;
        s11Var = null;
        s11 s11Var = null;
        s50Var = null;
        s50 s50Var = null;
        t50Var = null;
        t50 t50Var = null;
        s41Var = null;
        s41 s41Var = null;
        p51Var = null;
        p51 p51Var = null;
        iw0Var = null;
        iw0 iw0Var2 = null;
        tg0Var = null;
        tg0 tg0Var = null;
        s11Var = null;
        s11 s11Var2 = null;
        iw0Var = null;
        switch (this.d) {
            case 0:
                return Boolean.valueOf(!(((m8) obj) instanceof tg0));
            case 1:
                kl klVar = (kl) obj;
                if (klVar instanceof pl) {
                    return (pl) klVar;
                }
                return null;
            case 2:
                synchronized (ov0.c) {
                    ?? r0 = ov0.i;
                    int size = r0.size();
                    while (i < size) {
                        ((iw) r0.get(i)).g(obj);
                        i++;
                    }
                }
                return j41.a;
            case 3:
                pg0 pg0Var = (pg0) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(pg0Var.b);
                sb.append(", ");
                return b8.h(sb, pg0Var.c, ')');
            case 4:
                return obj;
            case 5:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                iw iwVar = (iw) up0.h.f;
                Boolean bool = Boolean.FALSE;
                iw0 iw0Var3 = (c10.i(obj2, bool) || obj2 == null) ? null : (iw0) iwVar.g(obj2);
                Object obj3 = list.get(1);
                iw0 iw0Var4 = (c10.i(obj3, bool) || obj3 == null) ? null : (iw0) iwVar.g(obj3);
                Object obj4 = list.get(2);
                iw0 iw0Var5 = (c10.i(obj4, bool) || obj4 == null) ? null : (iw0) iwVar.g(obj4);
                Object obj5 = list.get(3);
                if (!c10.i(obj5, bool) && obj5 != null) {
                    iw0Var = (iw0) iwVar.g(obj5);
                }
                return new s11(iw0Var3, iw0Var4, iw0Var5, iw0Var);
            case 6:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (c10.i(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((iw) up0.a.f).g(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                c10.m(str);
                return new q8(list3, str);
            case 7:
                c10.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new uz0(((Integer) obj).intValue());
            case 8:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new d11(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 9:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                g21[] g21VarArr = f21.b;
                iw iwVar2 = up0.q.e;
                Boolean bool2 = Boolean.FALSE;
                c10.i(obj8, bool2);
                f21 f21Var = obj8 != null ? (f21) iwVar2.g(obj8) : null;
                c10.m(f21Var);
                long j = f21Var.a;
                Object obj9 = list5.get(1);
                c10.i(obj9, bool2);
                f21 f21Var2 = obj9 != null ? (f21) iwVar2.g(obj9) : null;
                c10.m(f21Var2);
                return new e11(j, f21Var2.a);
            case 10:
                c10.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new zv(((Integer) obj).intValue());
            case 11:
                c10.n(obj, "null cannot be cast to non-null type kotlin.Float");
                return new ja(((Float) obj).floatValue());
            case 12:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                c10.m(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                c10.m(num2);
                return new w11(no0.a(iIntValue, num2.intValue()));
            case 13:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = bf.h;
                Boolean bool3 = Boolean.FALSE;
                c10.i(obj12, bool3);
                bf bfVar = obj12 != null ? c10.i(obj12, Boolean.FALSE) ? new bf(bf.g) : new bf(r31.c(((Integer) obj12).intValue())) : null;
                c10.m(bfVar);
                long j2 = bfVar.a;
                Object obj13 = list7.get(1);
                tp0 tp0Var = up0.r;
                c10.i(obj13, bool3);
                ed0 ed0Var = obj13 != null ? (ed0) tp0Var.e.g(obj13) : null;
                c10.m(ed0Var);
                long j3 = ed0Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                c10.m(f);
                return new hu0(f.floatValue(), j2, j3);
            case 14:
                if (c10.i(obj, Boolean.FALSE)) {
                    return new f21(f21.c);
                }
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f2 = obj15 != null ? (Float) obj15 : null;
                c10.m(f2);
                float fFloatValue = f2.floatValue();
                Object obj16 = list8.get(1);
                g21 g21Var = obj16 != null ? (g21) obj16 : null;
                c10.m(g21Var);
                return new f21(jp0.l(g21Var.a, fFloatValue));
            case 15:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                c10.m(str2);
                Object obj18 = list9.get(1);
                xz xzVar = up0.i;
                if (!c10.i(obj18, Boolean.FALSE) && obj18 != null) {
                    s11Var2 = (s11) ((iw) xzVar.f).g(obj18);
                }
                return new t50(str2, s11Var2);
            case 16:
                if (c10.i(obj, Boolean.FALSE)) {
                    return new ed0(9205357640488583168L);
                }
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f3 = obj19 != null ? (Float) obj19 : null;
                c10.m(f3);
                float fFloatValue2 = f3.floatValue();
                Object obj20 = list10.get(1);
                c10.m(obj20 != null ? (Float) obj20 : null);
                return new ed0((Float.floatToRawIntBits(fFloatValue2) << 32) | (Float.floatToRawIntBits(r10.floatValue()) & 4294967295L));
            case 17:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size2 = list11.size();
                while (i < size2) {
                    Object obj21 = list11.get(i);
                    c60 c60Var = (c10.i(obj21, Boolean.FALSE) || obj21 == null) ? null : (c60) ((iw) up0.t.f).g(obj21);
                    c10.m(c60Var);
                    arrayList.add(c60Var);
                    i++;
                }
                return new d60(arrayList);
            case 18:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size3 = list12.size();
                while (i < size3) {
                    Object obj22 = list12.get(i);
                    p8 p8Var = (c10.i(obj22, Boolean.FALSE) || obj22 == null) ? null : (p8) ((iw) up0.b.f).g(obj22);
                    c10.m(p8Var);
                    arrayList2.add(p8Var);
                    i++;
                }
                return arrayList2;
            case 19:
                c10.n(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                ti0.a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (c10.i(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new c60(localeForLanguageTag);
            case 20:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                m50 m50Var = obj23 != null ? (m50) obj23 : null;
                c10.m(m50Var);
                float f4 = m50Var.a;
                Object obj24 = list13.get(1);
                o50 o50Var = obj24 != null ? (o50) obj24 : null;
                c10.m(o50Var);
                int i3 = o50Var.a;
                Object obj25 = list13.get(2);
                c10.m(obj25 != null ? (n50) obj25 : null);
                return new p50(f4, i3);
            case 21:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                t8 t8Var = obj26 != null ? (t8) obj26 : null;
                c10.m(t8Var);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                c10.m(num3);
                int iIntValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                c10.m(num4);
                int iIntValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str4 = obj29 != null ? (String) obj29 : null;
                c10.m(str4);
                switch (t8Var.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        xz xzVar2 = up0.g;
                        if (!c10.i(obj30, Boolean.FALSE) && obj30 != null) {
                            tg0Var = (tg0) ((iw) xzVar2.f).g(obj30);
                        }
                        c10.m(tg0Var);
                        return new p8(tg0Var, iIntValue2, iIntValue3, str4);
                    case 1:
                        Object obj31 = list14.get(1);
                        xz xzVar3 = up0.h;
                        if (!c10.i(obj31, Boolean.FALSE) && obj31 != null) {
                            iw0Var2 = (iw0) ((iw) xzVar3.f).g(obj31);
                        }
                        c10.m(iw0Var2);
                        return new p8(iw0Var2, iIntValue2, iIntValue3, str4);
                    case 2:
                        Object obj32 = list14.get(1);
                        xz xzVar4 = up0.c;
                        if (!c10.i(obj32, Boolean.FALSE) && obj32 != null) {
                            p51Var = (p51) ((iw) xzVar4.f).g(obj32);
                        }
                        c10.m(p51Var);
                        return new p8(p51Var, iIntValue2, iIntValue3, str4);
                    case 3:
                        Object obj33 = list14.get(1);
                        xz xzVar5 = up0.d;
                        if (!c10.i(obj33, Boolean.FALSE) && obj33 != null) {
                            s41Var = (s41) ((iw) xzVar5.f).g(obj33);
                        }
                        c10.m(s41Var);
                        return new p8(s41Var, iIntValue2, iIntValue3, str4);
                    case 4:
                        Object obj34 = list14.get(1);
                        xz xzVar6 = up0.e;
                        if (!c10.i(obj34, Boolean.FALSE) && obj34 != null) {
                            t50Var = (t50) ((iw) xzVar6.f).g(obj34);
                        }
                        c10.m(t50Var);
                        return new p8(t50Var, iIntValue2, iIntValue3, str4);
                    case 5:
                        Object obj35 = list14.get(1);
                        xz xzVar7 = up0.f;
                        if (!c10.i(obj35, Boolean.FALSE) && obj35 != null) {
                            s50Var = (s50) ((iw) xzVar7.f).g(obj35);
                        }
                        c10.m(s50Var);
                        return new p8(s50Var, iIntValue2, iIntValue3, str4);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str5 = obj36 != null ? (String) obj36 : null;
                        c10.m(str5);
                        return new p8(new jx0(str5), iIntValue2, iIntValue3, str4);
                    default:
                        throw new fg();
                }
            case 22:
                String str6 = obj != null ? (String) obj : null;
                c10.m(str6);
                return new p51(str6);
            case 23:
                String str7 = obj != null ? (String) obj : null;
                c10.m(str7);
                return new s41(str7);
            case 24:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str8 = obj37 != null ? (String) obj37 : null;
                c10.m(str8);
                Object obj38 = list15.get(1);
                xz xzVar8 = up0.i;
                if (!c10.i(obj38, Boolean.FALSE) && obj38 != null) {
                    s11Var = (s11) ((iw) xzVar8.f).g(obj38);
                }
                return new s50(str8, s11Var);
            case 25:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                oz0 oz0Var = obj39 != null ? (oz0) obj39 : null;
                c10.m(oz0Var);
                int i4 = oz0Var.a;
                Object obj40 = list16.get(1);
                xz0 xz0Var = obj40 != null ? (xz0) obj40 : null;
                c10.m(xz0Var);
                int i5 = xz0Var.a;
                Object obj41 = list16.get(2);
                g21[] g21VarArr2 = f21.b;
                tp0 tp0Var2 = up0.q;
                Boolean bool4 = Boolean.FALSE;
                c10.i(obj41, bool4);
                f21 f21Var3 = obj41 != null ? (f21) tp0Var2.e.g(obj41) : null;
                c10.m(f21Var3);
                long j4 = f21Var3.a;
                Object obj42 = list16.get(3);
                e11 e11Var = e11.c;
                e11 e11Var2 = (c10.i(obj42, bool4) || obj42 == null) ? null : (e11) ((iw) up0.l.f).g(obj42);
                Object obj43 = list16.get(4);
                vi0 vi0Var = (c10.i(obj43, bool4) || obj43 == null) ? null : (vi0) ((iw) d80.e.f).g(obj43);
                Object obj44 = list16.get(5);
                p50 p50Var = p50.c;
                p50 p50Var2 = (c10.i(obj44, bool4) || obj44 == null) ? null : (p50) ((iw) up0.u.f).g(obj44);
                Object obj45 = list16.get(6);
                k50 k50Var = (c10.i(obj45, bool4) || obj45 == null) ? null : (k50) ((iw) d80.f.f).g(obj45);
                c10.m(k50Var);
                int i6 = k50Var.a;
                Object obj46 = list16.get(7);
                py pyVar = obj46 != null ? (py) obj46 : null;
                c10.m(pyVar);
                int i7 = pyVar.a;
                Object obj47 = list16.get(8);
                xz xzVar9 = d80.g;
                if (!c10.i(obj47, bool4) && obj47 != null) {
                    u11Var = (u11) ((iw) xzVar9.f).g(obj47);
                }
                return new tg0(i4, i5, j4, e11Var2, vi0Var, p50Var2, i6, i7, u11Var);
            case 26:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i8 = bf.h;
                Boolean bool5 = Boolean.FALSE;
                c10.i(obj48, bool5);
                bf bfVar2 = obj48 != null ? obj48.equals(bool5) ? new bf(bf.g) : new bf(r31.c(((Integer) obj48).intValue())) : null;
                c10.m(bfVar2);
                long j5 = bfVar2.a;
                Object obj49 = list17.get(1);
                g21[] g21VarArr3 = f21.b;
                iw iwVar3 = up0.q.e;
                c10.i(obj49, bool5);
                f21 f21Var4 = obj49 != null ? (f21) iwVar3.g(obj49) : null;
                c10.m(f21Var4);
                long j6 = f21Var4.a;
                Object obj50 = list17.get(2);
                zv zvVar = zv.e;
                zv zvVar2 = (c10.i(obj50, bool5) || obj50 == null) ? null : (zv) ((iw) up0.m.f).g(obj50);
                Object obj51 = list17.get(3);
                xv xvVar = obj51 != null ? (xv) obj51 : null;
                Object obj52 = list17.get(4);
                yv yvVar = obj52 != null ? (yv) obj52 : null;
                Object obj53 = list17.get(6);
                String str9 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                c10.i(obj54, bool5);
                f21 f21Var5 = obj54 != null ? (f21) iwVar3.g(obj54) : null;
                c10.m(f21Var5);
                long j7 = f21Var5.a;
                Object obj55 = list17.get(8);
                ja jaVar = (c10.i(obj55, bool5) || obj55 == null) ? null : (ja) ((iw) up0.n.f).g(obj55);
                Object obj56 = list17.get(9);
                d11 d11Var = (c10.i(obj56, bool5) || obj56 == null) ? null : (d11) ((iw) up0.k.f).g(obj56);
                Object obj57 = list17.get(10);
                d60 d60Var = d60.f;
                d60 d60Var2 = (c10.i(obj57, bool5) || obj57 == null) ? null : (d60) ((iw) up0.s.f).g(obj57);
                Object obj58 = list17.get(11);
                c10.i(obj58, bool5);
                bf bfVar3 = obj58 != null ? obj58.equals(bool5) ? new bf(bf.g) : new bf(r31.c(((Integer) obj58).intValue())) : null;
                c10.m(bfVar3);
                long j8 = bfVar3.a;
                Object obj59 = list17.get(12);
                uz0 uz0Var = (c10.i(obj59, bool5) || obj59 == null) ? null : (uz0) ((iw) up0.j.f).g(obj59);
                Object obj60 = list17.get(13);
                hu0 hu0Var2 = hu0.d;
                xz xzVar10 = up0.o;
                if (!c10.i(obj60, bool5) && obj60 != null) {
                    hu0Var = (hu0) ((iw) xzVar10.f).g(obj60);
                }
                return new iw0(j5, j6, zvVar2, xvVar, yvVar, (vy0) null, str9, j7, jaVar, d11Var, d60Var2, j8, uz0Var, hu0Var, 49184);
            case 27:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                c10.m(bool6);
                boolean zBooleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                c10.m(obj62 != null ? (es) obj62 : null);
                return new vi0(zBooleanValue);
            case 28:
                c10.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k50(((Integer) obj).intValue());
            default:
                c10.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                t11 t11Var = obj63 != null ? (t11) obj63 : null;
                c10.m(t11Var);
                int i9 = t11Var.a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                c10.m(bool7);
                return new u11(i9, bool7.booleanValue());
        }
    }
}
