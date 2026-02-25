package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.LocaleList;
import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class dp0 implements b61 {
    public static final void a(e90 e90Var, zg zgVar, ci ciVar, int i) {
        ciVar.W(-1075498320);
        if (((i | 6) & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else {
            Object objK = ciVar.K();
            v71 v71Var = vh.a;
            if (objK == v71Var) {
                objK = qo0.n(null);
                ciVar.e0(objK);
            }
            za0 za0Var = (za0) objK;
            sr0 sr0Var = (sr0) za0Var.getValue();
            Object objK2 = ciVar.K();
            if (objK2 == v71Var) {
                objK2 = new e4(za0Var, 2);
                ciVar.e0(objK2);
            }
            b(sr0Var, (iw) objK2, zgVar, ciVar, 3462);
            e90Var = b90.a;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new d2(e90Var, zgVar, i, 1);
        }
    }

    public static final void b(sr0 sr0Var, iw iwVar, zg zgVar, ci ciVar, int i) {
        int i2;
        ci ciVar2;
        ciVar.W(2078139907);
        if ((i & 6) == 0) {
            i2 = (ciVar.f(b90.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.f(sr0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.h(iwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ciVar.h(zgVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && ciVar.z()) {
            ciVar.Q();
            ciVar2 = ciVar;
        } else {
            ciVar2 = ciVar;
            zs0 zs0Var = (zs0) b10.c0(new Object[0], zs0.l, si.z, ciVar2, 3072, 4);
            Object objK = ciVar2.K();
            v71 v71Var = vh.a;
            if (objK == v71Var) {
                objK = new ss0(zs0Var);
                ciVar2.e0(objK);
            }
            ss0 ss0Var = (ss0) objK;
            ss0Var.e = (yx) ciVar2.j(ti.l);
            ss0Var.f = (qe) ciVar2.j(ti.e);
            ss0Var.g = (d21) ciVar2.j(ti.q);
            ss0Var.d = new j4(22, ss0Var, iwVar);
            ss0Var.m(sr0Var);
            nm.b(ss0Var, b10.b0(-123806316, new g4(zs0Var, ss0Var, zgVar), ciVar2), ciVar2, 48);
            boolean zH = ciVar2.h(ss0Var);
            Object objK2 = ciVar2.K();
            if (zH || objK2 == v71Var) {
                objK2 = new yr0(ss0Var, 0);
                ciVar2.e0(objK2);
            }
            l81.c(ss0Var, (iw) objK2, ciVar2);
        }
        nl0 nl0VarR = ciVar2.r();
        if (nl0VarR != null) {
            nl0VarR.d = new c5(sr0Var, iwVar, zgVar, i);
        }
    }

    public static final boolean c(int i, KeyEvent keyEvent) {
        return ((int) (m20.z(keyEvent) >> 32)) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(java.lang.String r12, int r13) {
        /*
            boolean r0 = defpackage.tr.d()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            tr r0 = defpackage.tr.a()
            int r3 = r0.c()
            if (r3 != r1) goto L13
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L89
            int r3 = r0.c()
            r4 = 0
            if (r3 != r1) goto L1e
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 == 0) goto L81
            java.lang.String r1 = "charSequence cannot be null"
            defpackage.r31.q(r12, r1)
            pr r0 = r0.e
            e9 r5 = r0.b
            r5.getClass()
            r0 = -1
            if (r13 < 0) goto L36
            int r1 = r12.length()
            if (r13 < r1) goto L38
        L36:
            r6 = r12
            goto L77
        L38:
            boolean r1 = r12 instanceof android.text.Spanned
            if (r1 == 0) goto L54
            r1 = r12
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r3 = r13 + 1
            java.lang.Class<x31> r6 = defpackage.x31.class
            java.lang.Object[] r3 = r1.getSpans(r13, r3, r6)
            x31[] r3 = (defpackage.x31[]) r3
            int r6 = r3.length
            if (r6 <= 0) goto L54
            r3 = r3[r4]
            int r1 = r1.getSpanEnd(r3)
            r6 = r12
            goto L78
        L54:
            int r1 = r13 + (-16)
            int r7 = java.lang.Math.max(r4, r1)
            int r1 = r12.length()
            int r3 = r13 + 16
            int r8 = java.lang.Math.min(r1, r3)
            bs r11 = new bs
            r11.<init>(r13)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 1
            r6 = r12
            java.lang.Object r12 = r5.w(r6, r7, r8, r9, r10, r11)
            bs r12 = (defpackage.bs) r12
            int r1 = r12.f
            goto L78
        L77:
            r1 = r0
        L78:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            if (r1 != r0) goto L7f
            goto L8a
        L7f:
            r2 = r12
            goto L8a
        L81:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Not initialized yet"
            r12.<init>(r13)
            throw r12
        L89:
            r6 = r12
        L8a:
            if (r2 == 0) goto L91
            int r12 = r2.intValue()
            return r12
        L91:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r6)
            int r12 = r12.following(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp0.d(java.lang.String, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(java.lang.String r4, int r5) {
        /*
            boolean r0 = defpackage.tr.d()
            r1 = 0
            if (r0 == 0) goto L13
            tr r0 = defpackage.tr.a()
            int r2 = r0.c()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L2a
            int r2 = r5 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.b(r4, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L31
            int r4 = r1.intValue()
            return r4
        L31:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r4)
            int r4 = r0.preceding(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp0.e(java.lang.String, int):int");
    }

    public static final boolean f(float f, float f2, i6 i6Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        i6 i6VarA = k6.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            k6.b("Invalid rectangle, make sure no value is NaN");
        }
        if (i6VarA.b == null) {
            i6VarA.b = new RectF();
        }
        RectF rectF = i6VarA.b;
        c10.m(rectF);
        rectF.set(f3, f4, f5, f6);
        Path path = i6VarA.a;
        RectF rectF2 = i6VarA.b;
        c10.m(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        i6 i6VarA2 = k6.a();
        i6VarA2.c(i6Var, i6VarA, 1);
        boolean zIsEmpty = i6VarA2.a.isEmpty();
        i6VarA2.d();
        i6VarA.d();
        return !zIsEmpty;
    }

    public static boolean g(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final c21 i(c21 c21Var, e30 e30Var) {
        c11 c11Var;
        long j;
        zv zvVar;
        xv xvVar;
        d60 d60Var;
        iw0 iw0Var = c21Var.a;
        c11 c11Var2 = jw0.d;
        c11 c11Var3 = iw0Var.a;
        if (c11Var3.equals(b11.a)) {
            c11Var3 = jw0.d;
        }
        c11 c11Var4 = c11Var3;
        long j2 = iw0Var.b;
        g21[] g21VarArr = f21.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = jw0.a;
        }
        long j3 = j2;
        zv zvVar2 = iw0Var.c;
        if (zvVar2 == null) {
            zvVar2 = zv.f;
        }
        zv zvVar3 = zvVar2;
        xv xvVar2 = iw0Var.d;
        xv xvVar3 = new xv(xvVar2 != null ? xvVar2.a : 0);
        yv yvVar = iw0Var.e;
        yv yvVar2 = new yv(yvVar != null ? yvVar.a : 65535);
        vy0 vy0Var = iw0Var.f;
        if (vy0Var == null) {
            vy0Var = vy0.a;
        }
        vy0 vy0Var2 = vy0Var;
        String str = iw0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = iw0Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = jw0.b;
        }
        ja jaVar = iw0Var.i;
        ja jaVar2 = new ja(jaVar != null ? jaVar.a : 0.0f);
        d11 d11Var = iw0Var.j;
        if (d11Var == null) {
            d11Var = d11.c;
        }
        d11 d11Var2 = d11Var;
        d60 d60Var2 = iw0Var.k;
        if (d60Var2 == null) {
            d60 d60Var3 = d60.f;
            e9 e9Var = ti0.a;
            e9Var.getClass();
            LocaleList localeList = LocaleList.getDefault();
            c11Var = c11Var4;
            synchronized (((kc0) e9Var.c)) {
                j = j3;
                try {
                    d60Var = (d60) e9Var.b;
                    if (d60Var == null || localeList != ((LocaleList) e9Var.a)) {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        zvVar = zvVar3;
                        int i = 0;
                        while (i < size) {
                            arrayList.add(new c60(localeList.get(i)));
                            i++;
                            size = size;
                            xvVar3 = xvVar3;
                        }
                        xvVar = xvVar3;
                        d60Var = new d60(arrayList);
                        e9Var.a = localeList;
                        e9Var.b = d60Var;
                    } else {
                        zvVar = zvVar3;
                        xvVar = xvVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            d60Var2 = d60Var;
        } else {
            c11Var = c11Var4;
            j = j3;
            zvVar = zvVar3;
            xvVar = xvVar3;
        }
        d60 d60Var4 = d60Var2;
        long j5 = iw0Var.l;
        if (j5 == 16) {
            j5 = jw0.c;
        }
        uz0 uz0Var = iw0Var.m;
        if (uz0Var == null) {
            uz0Var = uz0.b;
        }
        hu0 hu0Var = iw0Var.n;
        if (hu0Var == null) {
            hu0Var = hu0.d;
        }
        zi0 zi0Var = iw0Var.o;
        tq tqVar = iw0Var.p;
        if (tqVar == null) {
            tqVar = dt.a;
        }
        uz0 uz0Var2 = uz0Var;
        c11 c11Var5 = c11Var;
        iw0 iw0Var2 = new iw0(c11Var5, j, zvVar, xvVar, yvVar2, vy0Var2, str2, j4, jaVar2, d11Var2, d60Var4, j5, uz0Var2, hu0Var, zi0Var, tqVar);
        tg0 tg0Var = c21Var.b;
        int i2 = ug0.b;
        int i3 = tg0Var.a;
        int i4 = 5;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 5;
        }
        int i5 = tg0Var.b;
        if (i5 == 3) {
            int iOrdinal = e30Var.ordinal();
            if (iOrdinal == 0) {
                i4 = 4;
            } else if (iOrdinal != 1) {
                throw new fg();
            }
        } else if (i5 == Integer.MIN_VALUE) {
            int iOrdinal2 = e30Var.ordinal();
            if (iOrdinal2 == 0) {
                i4 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new fg();
                }
                i4 = 2;
            }
        } else {
            i4 = i5;
        }
        long j6 = tg0Var.c;
        if ((j6 & 1095216660480L) == 0) {
            j6 = ug0.a;
        }
        e11 e11Var = tg0Var.d;
        if (e11Var == null) {
            e11Var = e11.c;
        }
        vi0 vi0Var = tg0Var.e;
        e11 e11Var2 = e11Var;
        p50 p50Var = tg0Var.f;
        int i6 = tg0Var.g;
        if (i6 == 0) {
            i6 = k50.b;
        }
        int i7 = tg0Var.h;
        if (i7 == Integer.MIN_VALUE) {
            i7 = 1;
        }
        u11 u11Var = tg0Var.i;
        if (u11Var == null) {
            u11Var = u11.c;
        }
        return new c21(iw0Var2, new tg0(i3, i4, j6, e11Var2, vi0Var, p50Var, i6, i7, u11Var), c21Var.c);
    }

    public static final Object j(iq0 iq0Var, iq0 iq0Var2, kw kwVar) throws Throwable {
        Object egVar;
        Object objT;
        try {
            r31.m(2, kwVar);
            egVar = kwVar.e(iq0Var2, iq0Var);
        } catch (Throwable th) {
            egVar = new eg(th, false);
        }
        xl xlVar = xl.d;
        if (egVar == xlVar || (objT = iq0Var.T(egVar)) == m20.e) {
            return xlVar;
        }
        if (objT instanceof eg) {
            throw ((eg) objT).a;
        }
        return m20.R(objT);
    }

    public static final void k() {
        throw new UnsupportedOperationException();
    }
}
