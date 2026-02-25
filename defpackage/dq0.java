package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.taurus.dgmobilemx.R;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class dq0 {
    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void b(boolean z, um0 um0Var, u01 u01Var, ci ciVar, int i) {
        int i2;
        ciVar.W(-1344558920);
        if ((i & 6) == 0) {
            i2 = (ciVar.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.f(um0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.h(u01Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | ciVar.f(u01Var);
            Object objK = ciVar.K();
            Object obj = vh.a;
            if (zF || objK == obj) {
                objK = new rs0(u01Var, z);
                ciVar.e0(objK);
            }
            yz0 yz0Var = (yz0) objK;
            boolean zH = ciVar.h(u01Var) | (i3 == 4);
            Object objK2 = ciVar.K();
            if (zH || objK2 == obj) {
                objK2 = new v01(u01Var, z);
                ciVar.e0(objK2);
            }
            id0 id0Var = (id0) objK2;
            boolean zF2 = w11.f(u01Var.j().b);
            boolean zH2 = ciVar.h(yz0Var);
            Object objK3 = ciVar.K();
            if (zH2 || objK3 == obj) {
                objK3 = new wr0(yz0Var, null, 1);
                ciVar.e0(objK3);
            }
            m20.f(id0Var, z, um0Var, zF2, 0L, b90.a.c(new SuspendPointerInputElement(yz0Var, null, new ky0((kw) objK3), 6)), ciVar, (i2 << 3) & 1008);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new c7(z, um0Var, u01Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.f8 r24, defpackage.a8 r25, long r26, defpackage.iw r28, defpackage.mk r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq0.c(f8, a8, long, iw, mk):java.lang.Object");
    }

    public static final long d() {
        return Thread.currentThread().getId();
    }

    public static final void e(d8 d8Var, long j, float f, a8 a8Var, f8 f8Var, iw iwVar) {
        long jC = f == 0.0f ? a8Var.c() : (long) ((j - d8Var.c) / f);
        d8Var.g = j;
        d8Var.e.setValue(a8Var.b(jC));
        d8Var.f = a8Var.f(jC);
        if (a8Var.g(jC)) {
            d8Var.h = d8Var.g;
            d8Var.i.setValue(Boolean.FALSE);
        }
        o(d8Var, f8Var);
        iwVar.g(d8Var);
    }

    public static final f50 f(View view) {
        c10.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            f50 f50Var = tag instanceof f50 ? (f50) tag : null;
            if (f50Var != null) {
                return f50Var;
            }
            Object objG = jp0.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static final long g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final float h(ml mlVar) {
        k90 k90Var = (k90) mlVar.n(g2.G);
        float fW = k90Var != null ? k90Var.w() : 1.0f;
        if (fW >= 0.0f) {
            return fW;
        }
        ak0.b("negative scale factor");
        return fW;
    }

    public static final um0 i(o11 o11Var, int i) {
        n11 n11Var = o11Var.a;
        if (n11Var.a.e.length() != 0) {
            int iF = o11Var.f(i);
            if ((i != 0 && iF == o11Var.f(i - 1)) || (i != n11Var.a.e.length() && iF == o11Var.f(i + 1))) {
                return o11Var.a(i);
            }
        }
        return o11Var.j(i);
    }

    public static final boolean j(u01 u01Var, boolean z) {
        d30 d30VarC;
        r40 r40Var = u01Var.d;
        if (r40Var == null || (d30VarC = r40Var.c()) == null) {
            return false;
        }
        return r31.t(r31.f0(d30VarC), u01Var.i(z));
    }

    public static final int k(int i, int i2) {
        int iP = b8.p(i2);
        if (iP != 0) {
            if (iP != 1) {
                if (iP == 2) {
                    return 3;
                }
                throw new fg();
            }
            int iP2 = b8.p(i);
            if (iP2 != 0) {
                if (iP2 == 1) {
                    return 2;
                }
                if (iP2 == 2) {
                    return 3;
                }
                throw new fg();
            }
        }
        return 1;
    }

    public static final void l(View view, f50 f50Var) {
        c10.p(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, f50Var);
    }

    public static final void m(ci ciVar, kw kwVar, Object obj) {
        if (ciVar.S || !c10.i(ciVar.K(), obj)) {
            ciVar.e0(obj);
            ciVar.b(kwVar, obj);
        }
    }

    public static final long n(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final void o(d8 d8Var, f8 f8Var) {
        f8Var.e.setValue(d8Var.e.getValue());
        k8 k8Var = f8Var.f;
        k8 k8Var2 = d8Var.f;
        int iB = k8Var.b();
        for (int i = 0; i < iB; i++) {
            k8Var.e(k8Var2.a(i), i);
        }
        f8Var.h = d8Var.h;
        f8Var.g = d8Var.g;
        f8Var.i = ((Boolean) d8Var.i.getValue()).booleanValue();
    }
}
