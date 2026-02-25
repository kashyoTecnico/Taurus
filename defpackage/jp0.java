package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.taurus.dgmobilemx.R;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class jp0 {
    public static final void a(e90 e90Var, zg zgVar, ci ciVar, int i) {
        ciVar.W(-2105228848);
        if ((((ciVar.f(e90Var) ? 4 : 2) | i) & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else {
            e5 e5Var = e5.f;
            int iHashCode = Long.hashCode(ciVar.T);
            wh0 wh0VarL = ciVar.l();
            e90 e90VarP = r31.P(ciVar, e90Var);
            sh.b.getClass();
            si siVar = rh.b;
            ciVar.X();
            if (ciVar.S) {
                ciVar.k(siVar);
            } else {
                ciVar.h0();
            }
            dq0.m(ciVar, rh.e, e5Var);
            dq0.m(ciVar, rh.d, wh0VarL);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            dq0.m(ciVar, rh.c, e90VarP);
            zgVar.e(ciVar, 6);
            ciVar.p(true);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new d2(e90Var, zgVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.oy0 r6, defpackage.ia r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.es0
            if (r0 == 0) goto L13
            r0 = r7
            es0 r0 = (defpackage.es0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            es0 r0 = new es0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            oy0 r6 = r0.g
            defpackage.c10.X(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.c10.X(r7)
        L32:
            r0.g = r6
            r0.i = r2
            hj0 r7 = defpackage.hj0.e
            java.lang.Object r7 = r6.a(r7, r0)
            xl r1 = defpackage.xl.d
            if (r7 != r1) goto L41
            return r1
        L41:
            gj0 r7 = (defpackage.gj0) r7
            java.lang.Object r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L4a:
            if (r4 >= r3) goto L5c
            java.lang.Object r5 = r1.get(r4)
            nj0 r5 = (defpackage.nj0) r5
            boolean r5 = defpackage.c10.j(r5)
            if (r5 != 0) goto L59
            goto L32
        L59:
            int r4 = r4 + 1
            goto L4a
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.b(oy0, ia):java.lang.Object");
    }

    public static final xl0 c(xn xnVar, int i, y21 y21Var, o11 o11Var, boolean z, int i2) {
        xl0 xl0VarC = o11Var != null ? o11Var.c(y21Var.b.d(i)) : xl0.e;
        float f = xl0VarC.a;
        int iN = xnVar.N(b01.a);
        return xl0.a(xl0VarC, z ? (i2 - f) - iN : f, z ? i2 - f : iN + f, 0.0f, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.oy0 r10, defpackage.p90 r11, defpackage.me r12, defpackage.gj0 r13, defpackage.ia r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.d(oy0, p90, me, gj0, ia):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r14 == r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.oy0 r11, defpackage.yz0 r12, defpackage.gj0 r13, defpackage.ia r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.e(oy0, yz0, gj0, ia):java.lang.Object");
    }

    public static void f(StringBuilder sb, Object obj, iw iwVar) {
        if (iwVar != null) {
            sb.append((CharSequence) iwVar.g(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static final ViewParent g(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final Bundle h(String str, Bundle bundle) {
        c10.p(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }

    public static final long i(double d) {
        return l(4294967296L, (float) d);
    }

    public static final long j(int i) {
        return l(4294967296L, i);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean k(gj0 gj0Var) {
        ?? r5 = gj0Var.a;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            if (((nj0) r5.get(i)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final long l(long j, float f) {
        long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        g21[] g21VarArr = f21.b;
        return jFloatToRawIntBits;
    }

    public static final double m(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }
}
