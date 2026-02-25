package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class mq0 {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.gt0 a(defpackage.t30 r8, boolean r9) {
        /*
            jc0 r0 = r8.G
            d90 r0 = r0.f
            int r1 = r0.g
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof defpackage.et0
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof defpackage.mn
            if (r4 == 0) goto L56
            r4 = r1
            mn r4 = (defpackage.mn) r4
            d90 r4 = r4.s
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            eb0 r3 = new eb0
            r6 = 16
            d90[] r6 = new defpackage.d90[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.b(r1)
            r1 = r2
        L4d:
            r3.b(r4)
        L50:
            d90 r4 = r4.i
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            d90 r1 = defpackage.d80.i(r3)
            goto L15
        L5b:
            int r1 = r0.g
            r1 = r1 & 8
            if (r1 == 0) goto L64
            d90 r0 = r0.i
            goto Lb
        L64:
            defpackage.c10.m(r2)
            et0 r2 = (defpackage.et0) r2
            d90 r2 = (defpackage.d90) r2
            d90 r0 = r2.d
            ct0 r1 = r8.v()
            if (r1 != 0) goto L78
            ct0 r1 = new ct0
            r1.<init>()
        L78:
            gt0 r2 = new gt0
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq0.a(t30, boolean):gt0");
    }

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        y9.t0(objArr, objArr2, 0, i, 6);
        y9.r0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        y9.t0(objArr, objArr2, 0, i, 6);
        y9.r0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        y9.t0(objArr, objArr2, 0, i, 6);
        y9.r0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final int e(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final void f(jx jxVar, z41 z41Var) {
        ArrayList arrayList = z41Var.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b51 b51Var = (b51) arrayList.get(i);
            if (b51Var instanceof d51) {
                eh0 eh0Var = new eh0();
                d51 d51Var = (d51) b51Var;
                eh0Var.c = d51Var.d;
                eh0Var.e = true;
                eh0Var.c();
                eh0Var.h.a.setFillType(Path.FillType.WINDING);
                eh0Var.c();
                eh0Var.c();
                eh0Var.b = d51Var.e;
                eh0Var.c();
                eh0Var.c();
                eh0Var.c();
                eh0Var.c();
                eh0Var.c();
                eh0Var.c();
                eh0Var.c();
                eh0Var.c();
                eh0Var.f = true;
                eh0Var.c();
                eh0Var.d = 1.0f;
                eh0Var.f = true;
                eh0Var.c();
                eh0Var.f = true;
                eh0Var.c();
                jxVar.e(i, eh0Var);
            } else if (b51Var instanceof z41) {
                jx jxVar2 = new jx();
                z41 z41Var2 = (z41) b51Var;
                jxVar2.k = "";
                jxVar2.c();
                jxVar2.n = true;
                jxVar2.c();
                jxVar2.l = 1.0f;
                jxVar2.n = true;
                jxVar2.c();
                jxVar2.m = 1.0f;
                jxVar2.n = true;
                jxVar2.c();
                jxVar2.n = true;
                jxVar2.c();
                jxVar2.n = true;
                jxVar2.c();
                jxVar2.n = true;
                jxVar2.c();
                jxVar2.n = true;
                jxVar2.c();
                jxVar2.f = z41Var2.d;
                jxVar2.g = true;
                jxVar2.c();
                f(jxVar2, z41Var2);
                jxVar.e(i, jxVar2);
            }
        }
    }

    public static final int g(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final float h(long j, float f, xn xnVar) {
        float fC;
        long jB = f21.b(j);
        if (g21.a(jB, 4294967296L)) {
            if (xnVar.k() <= 1.05d) {
                return xnVar.Z(j);
            }
            fC = f21.c(j) / f21.c(xnVar.f0(f));
        } else {
            if (!g21.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = f21.c(j);
        }
        return fC * f;
    }

    public static final Object i(ln lnVar, xl0 xl0Var, mk mkVar) {
        jb jbVar;
        Object objL;
        if (((d90) lnVar).d.q) {
            nc0 nc0VarY = d80.y(lnVar);
            if (((d90) lnVar).d.q) {
                jb rbVar = (jb) h9.c(lnVar, qb.t);
                if (rbVar == null) {
                    rbVar = new rb(lnVar);
                }
                jbVar = rbVar;
            } else {
                jbVar = null;
            }
            if (jbVar != null && (objL = jbVar.l(nc0VarY, new g3(12, xl0Var, nc0VarY), mkVar)) == xl.d) {
                return objL;
            }
        }
        return j41.a;
    }

    public static final void j(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(r31.Z(j)), i, i2, 33);
        }
    }

    public static void k(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static final void l(Spannable spannable, long j, xn xnVar, int i, int i2) {
        long jB = f21.b(j);
        if (g21.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(d80.B(xnVar.Z(j)), false), i, i2, 33);
        } else if (g21.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(f21.c(j)), i, i2, 33);
        }
    }

    public static final void m(Spannable spannable, d60 d60Var, int i, int i2) {
        if (d60Var != null) {
            ArrayList arrayList = new ArrayList(we.O(d60Var));
            Iterator it = d60Var.d.iterator();
            while (it.hasNext()) {
                arrayList.add(((c60) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static String n(int i) {
        return i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
    }
}
