package defpackage;

import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.inputmethod.ExtractedText;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class nm {
    public static final cs e;
    public static final cs f;
    public static final cs g;
    public static r5 k;
    public static t2 l;
    public static fd m;
    public static final lk[] a = new lk[0];
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final ne h = new ne(2);
    public static final long[] i = new long[0];
    public static final n6 j = new n6(1008);

    static {
        int i2 = 1;
        e = new cs("REMOVED_TASK", i2);
        f = new cs("CLOSED_EMPTY", i2);
        g = new cs("NO_OWNER", i2);
    }

    public static final Object A(wh0 wh0Var, dl0 dl0Var) {
        c10.n(dl0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        vh0 vh0Var = (vh0) wh0Var;
        Object objB = vh0Var.get(dl0Var);
        if (objB == null) {
            objB = dl0Var.b();
        }
        return ((u41) objB).a(vh0Var);
    }

    public static final Object B(Object obj) {
        return obj instanceof eg ? c10.z(((eg) obj).a) : obj;
    }

    public static final void C(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void D(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final String E(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final BlendMode F(int i2) {
        return i2 == 0 ? BlendMode.CLEAR : i2 == 1 ? BlendMode.SRC : i2 == 2 ? BlendMode.DST : i2 == 3 ? BlendMode.SRC_OVER : i2 == 4 ? BlendMode.DST_OVER : i2 == 5 ? BlendMode.SRC_IN : i2 == 6 ? BlendMode.DST_IN : i2 == 7 ? BlendMode.SRC_OUT : i2 == 8 ? BlendMode.DST_OUT : i2 == 9 ? BlendMode.SRC_ATOP : i2 == 10 ? BlendMode.DST_ATOP : i2 == 11 ? BlendMode.XOR : i2 == 12 ? BlendMode.PLUS : i2 == 13 ? BlendMode.MODULATE : i2 == 14 ? BlendMode.SCREEN : i2 == 15 ? BlendMode.OVERLAY : i2 == 16 ? BlendMode.DARKEN : i2 == 17 ? BlendMode.LIGHTEN : i2 == 18 ? BlendMode.COLOR_DODGE : i2 == 19 ? BlendMode.COLOR_BURN : i2 == 20 ? BlendMode.HARD_LIGHT : i2 == 21 ? BlendMode.SOFT_LIGHT : i2 == 22 ? BlendMode.DIFFERENCE : i2 == 23 ? BlendMode.EXCLUSION : i2 == 24 ? BlendMode.MULTIPLY : i2 == 25 ? BlendMode.HUE : i2 == 26 ? BlendMode.SATURATION : i2 == 27 ? BlendMode.COLOR : i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final String G(lk lkVar) {
        Object objZ;
        if (lkVar instanceof to) {
            return ((to) lkVar).toString();
        }
        try {
            objZ = lkVar + '@' + t(lkVar);
        } catch (Throwable th) {
            objZ = c10.z(th);
        }
        if (zm0.a(objZ) != null) {
            objZ = lkVar.getClass().getName() + '@' + t(lkVar);
        }
        return (String) objZ;
    }

    public static final ExtractedText H(a11 a11Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = a11Var.a.e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = a11Var.b;
        extractedText.selectionStart = w11.e(j2);
        extractedText.selectionEnd = w11.d(j2);
        extractedText.flags = !px0.o(a11Var.a.e, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void I(List list, i6 i6Var) {
        nh0 nh0Var;
        float f2;
        float f3;
        float f4;
        Path path = i6Var.a;
        Path path2 = i6Var.a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path2.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        nh0 nh0Var2 = list.isEmpty() ? fh0.b : (nh0) list.get(0);
        int size = list.size();
        float f5 = 0.0f;
        int i2 = 0;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i2 < size) {
            nh0 nh0Var3 = (nh0) list.get(i2);
            if (nh0Var3 instanceof fh0) {
                path2.close();
                nh0Var = nh0Var3;
                f6 = f8;
                f10 = f6;
                f7 = f9;
                f11 = f7;
            } else if (nh0Var3 instanceof hh0) {
                hh0 hh0Var = (hh0) nh0Var3;
                f8 = hh0Var.b;
                f9 = hh0Var.c;
                path2.moveTo(f8, f9);
                nh0Var = nh0Var3;
                f10 = f8;
                f11 = f9;
            } else if (nh0Var3 instanceof gh0) {
                gh0 gh0Var = (gh0) nh0Var3;
                float f12 = gh0Var.c;
                float f13 = gh0Var.b;
                path2.lineTo(f13, f12);
                f10 = f13;
                nh0Var = nh0Var3;
                f11 = f12;
            } else {
                if (nh0Var3 instanceof kh0) {
                    float f14 = ((kh0) nh0Var3).b;
                    path2.rLineTo(f14, f5);
                    f10 += f14;
                } else if (nh0Var3 instanceof mh0) {
                    float f15 = ((mh0) nh0Var3).b;
                    path2.rLineTo(f5, f15);
                    f11 += f15;
                } else {
                    if (nh0Var3 instanceof jh0) {
                        jh0 jh0Var = (jh0) nh0Var3;
                        nh0Var = nh0Var3;
                        path2.rCubicTo(jh0Var.b, jh0Var.c, jh0Var.d, jh0Var.e, jh0Var.f, jh0Var.g);
                        f6 = jh0Var.d + f10;
                        f7 = jh0Var.e + f11;
                        f10 += jh0Var.f;
                        f4 = jh0Var.g;
                    } else {
                        nh0Var = nh0Var3;
                        if (nh0Var instanceof lh0) {
                            if (nh0Var2.a) {
                                f3 = f11 - f7;
                                f2 = f10 - f6;
                            } else {
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            lh0 lh0Var = (lh0) nh0Var;
                            path2.rCubicTo(f2, f3, lh0Var.b, lh0Var.c, lh0Var.d, lh0Var.e);
                            f6 = lh0Var.b + f10;
                            f7 = lh0Var.c + f11;
                            f10 += lh0Var.d;
                            f4 = lh0Var.e;
                        } else {
                            if (!(nh0Var instanceof ih0)) {
                                throw new fg();
                            }
                            if (nh0Var2.a) {
                                float f16 = 2;
                                f10 = (f10 * f16) - f6;
                                f11 = (f16 * f11) - f7;
                            }
                            path2.cubicTo(f10, f11, 7.0f, 3.24f, 7.0f, 6.0f);
                            f10 = 7.0f;
                            f11 = 6.0f;
                            f7 = 3.24f;
                            f6 = 7.0f;
                        }
                    }
                    f11 += f4;
                }
                nh0Var = nh0Var3;
            }
            i2++;
            nh0Var2 = nh0Var;
            f5 = 0.0f;
        }
    }

    public static final vh0 J(fl0[] fl0VarArr, wh0 wh0Var, wh0 wh0Var2) {
        uh0 uh0Var = new uh0(vh0.g);
        for (fl0 fl0Var : fl0VarArr) {
            dl0 dl0Var = fl0Var.a;
            if (fl0Var.f || !((vh0) wh0Var).containsKey(dl0Var)) {
                uh0Var.put(dl0Var, dl0Var.c(fl0Var, (u41) ((vh0) wh0Var2).get(dl0Var)));
            }
        }
        return uh0Var.a();
    }

    public static final Object K(ml mlVar, kw kwVar, jy0 jy0Var) throws Throwable {
        ml mlVar2 = jy0Var.e;
        c10.m(mlVar2);
        ml mlVarK = !((Boolean) mlVar.r(new nl(2), Boolean.FALSE)).booleanValue() ? mlVar2.k(mlVar) : r31.A(mlVar2, mlVar, false);
        c4.o(mlVarK);
        if (mlVarK == mlVar2) {
            iq0 iq0Var = new iq0(jy0Var, mlVarK);
            return dp0.j(iq0Var, iq0Var, kwVar);
        }
        g2 g2Var = g2.v;
        if (c10.i(mlVarK.n(g2Var), mlVar2.n(g2Var))) {
            g41 g41Var = new g41(mlVarK, jy0Var);
            ml mlVar3 = g41Var.f;
            Object objK0 = b10.k0(mlVar3, null);
            try {
                return dp0.j(g41Var, g41Var, kwVar);
            } finally {
                b10.f0(mlVar3, objK0);
            }
        }
        uo uoVar = new uo(jy0Var, mlVarK);
        try {
            m20.K(r31.I(r31.v(uoVar, uoVar, kwVar)), j41.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = uo.h;
            do {
                int i2 = atomicIntegerFieldUpdater.get(uoVar);
                if (i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objR = m20.R(y10.d.get(uoVar));
                    if (objR instanceof eg) {
                        throw ((eg) objR).a;
                    }
                    return objR;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(uoVar, 0, 1));
            return xl.d;
        } catch (Throwable th) {
            uoVar.h(c10.z(th));
            throw th;
        }
    }

    public static gc a(int i2, int i3, ec ecVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        ec ecVar2 = ec.d;
        if (i4 != 0) {
            ecVar = ecVar2;
        }
        if (i2 == -2) {
            if (ecVar != ecVar2) {
                return new aj(1, ecVar);
            }
            ld.a.getClass();
            return new gc(kd.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? ecVar == ecVar2 ? new gc(i2) : new aj(i2, ecVar) : new gc(Integer.MAX_VALUE) : ecVar == ecVar2 ? new gc(0) : new aj(1, ecVar);
        }
        if (ecVar == ecVar2) {
            return new aj(1, ec.e);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final void b(ss0 ss0Var, zg zgVar, ci ciVar, int i2) {
        zg zgVar2;
        ci ciVar2;
        ciVar.W(605522716);
        if ((((ciVar.h(ss0Var) ? 4 : 2) | i2) & 19) == 18 && ciVar.z()) {
            ciVar.Q();
            zgVar2 = zgVar;
            ciVar2 = ciVar;
        } else {
            Object objK = ciVar.K();
            v71 v71Var = vh.a;
            if (objK == v71Var) {
                objK = new ck();
                ciVar.e0(objK);
            }
            ck ckVar = (ck) objK;
            Object objK2 = ciVar.K();
            if (objK2 == v71Var) {
                objK2 = new hk(ckVar, 1);
                ciVar.e0(objK2);
            }
            zgVar2 = zgVar;
            ciVar2 = ciVar;
            d80.c(ckVar, (gw) objK2, new j4(23, ckVar, ss0Var), null, false, zgVar2, ciVar2, 196662, 24);
        }
        nl0 nl0VarR = ciVar2.r();
        if (nl0VarR != null) {
            nl0VarR.d = new ik(ss0Var, zgVar2, i2);
        }
    }

    public static final void c(u01 u01Var, zg zgVar, ci ciVar, int i2) {
        int i3;
        zg zgVar2;
        ci ciVar2;
        ciVar.W(-1985516685);
        if ((i2 & 6) == 0) {
            i3 = (ciVar.h(u01Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ciVar.h(zgVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && ciVar.z()) {
            ciVar.Q();
            zgVar2 = zgVar;
            ciVar2 = ciVar;
        } else {
            Object objK = ciVar.K();
            v71 v71Var = vh.a;
            if (objK == v71Var) {
                objK = new ck();
                ciVar.e0(objK);
            }
            ck ckVar = (ck) objK;
            Object objK2 = ciVar.K();
            if (objK2 == v71Var) {
                objK2 = new hk(ckVar, 0);
                ciVar.e0(objK2);
            }
            zgVar2 = zgVar;
            ciVar2 = ciVar;
            d80.c(ckVar, (gw) objK2, new j4(29, u01Var, ckVar), null, u01Var.h(), zgVar2, ciVar2, ((i3 << 12) & 458752) | 54, 8);
        }
        nl0 nl0VarR = ciVar2.r();
        if (nl0VarR != null) {
            nl0VarR.d = new f5(u01Var, zgVar2, i2, 1);
        }
    }

    public static final kk d(ml mlVar) {
        if (mlVar.n(g2.E) == null) {
            mlVar = mlVar.k(new t10(null));
        }
        return new kk(mlVar);
    }

    public static final long e(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final long f(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void g(long j2, c21 c21Var, kw kwVar, ci ciVar, int i2) {
        int i3;
        ciVar.W(-716124955);
        if ((i2 & 6) == 0) {
            i3 = (ciVar.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ciVar.f(c21Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ciVar.h(kwVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            vi viVar = l11.a;
            c4.c(new fl0[]{mj.a.a(new bf(j2)), viVar.a(((c21) ciVar.j(viVar)).d(c21Var))}, kwVar, ciVar, ((i3 >> 3) & 112) | 8);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new el0(j2, c21Var, kwVar, i2, 0);
        }
    }

    public static final int h(float[] fArr) {
        int i2 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i3 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i2 = 1;
        }
        return (i3 << 1) | i2;
    }

    public static final boolean i(long j2) {
        return !m00.a(j2, 9223372034707292159L);
    }

    public static final int j(int[] iArr, int i2, int i3) {
        c10.p(iArr, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int k(long[] jArr, int i2, long j2) {
        c10.p(jArr, "array");
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void l(wl wlVar, CancellationException cancellationException) {
        r10 r10Var = (r10) wlVar.g().n(g2.E);
        if (r10Var != null) {
            r10Var.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + wlVar).toString());
        }
    }

    public static final void m(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i2, ", size: ", i3));
        }
    }

    public static final void n(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i2, ", size: ", i3));
        }
    }

    public static final void o(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(b8.g("fromIndex: ", i2, " > toIndex: ", i3));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static final za0 p(fa0 fa0Var, ci ciVar, int i2) {
        Object objK = ciVar.K();
        v71 v71Var = vh.a;
        if (objK == v71Var) {
            objK = qo0.n(Boolean.FALSE);
            ciVar.e0(objK);
        }
        za0 za0Var = (za0) objK;
        boolean z = (((i2 & 14) ^ 6) > 4 && ciVar.f(fa0Var)) || (i2 & 6) == 4;
        Object objK2 = ciVar.K();
        if (z || objK2 == v71Var) {
            objK2 = new c(fa0Var, za0Var, null, 14);
            ciVar.e0(objK2);
        }
        l81.d(ciVar, (kw) objK2, fa0Var);
        return za0Var;
    }

    public static final Object q(kw kwVar, lk lkVar) {
        iq0 iq0Var = new iq0(lkVar, lkVar.f());
        return dp0.j(iq0Var, iq0Var, kwVar);
    }

    public static x80 r(x80 x80Var, e30 e30Var, c21 c21Var, xn xnVar, jv jvVar) {
        if (x80Var != null && e30Var == x80Var.a && c10.i(c21Var, x80Var.b) && xnVar.b() == x80Var.c.b() && jvVar == x80Var.d) {
            return x80Var;
        }
        x80 x80Var2 = x80.h;
        if (x80Var2 != null && e30Var == x80Var2.a && c10.i(c21Var, x80Var2.b) && xnVar.b() == x80Var2.c.b() && jvVar == x80Var2.d) {
            return x80Var2;
        }
        x80 x80Var3 = new x80(e30Var, dp0.i(c21Var, e30Var), xnVar, jvVar);
        x80.h = x80Var3;
        return x80Var3;
    }

    public static Set s() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final String t(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final int u(x9 x9Var, Object obj, int i2) {
        int i3 = x9Var.f;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iJ = j(x9Var.d, i3, i2);
            if (iJ < 0 || c10.i(obj, x9Var.e[iJ])) {
                return iJ;
            }
            int i4 = iJ + 1;
            while (i4 < i3 && x9Var.d[i4] == i2) {
                if (c10.i(obj, x9Var.e[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iJ - 1; i5 >= 0 && x9Var.d[i5] == i2; i5--) {
                if (c10.i(obj, x9Var.e[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final void v(l30 l30Var) {
        d80.z(l30Var).D();
    }

    public static final boolean w(wl wlVar) {
        r10 r10Var = (r10) wlVar.g().n(g2.E);
        if (r10Var != null) {
            return r10Var.b();
        }
        return true;
    }

    public static final boolean x(long j2) {
        return (j2 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean y(long j2) {
        return (j2 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static rw0 z(wl wlVar, ml mlVar, kw kwVar, int i2) {
        if ((i2 & 1) != 0) {
            mlVar = is.d;
        }
        zl zlVar = (i2 & 2) != 0 ? zl.d : zl.g;
        ml mlVarA = r31.A(wlVar.g(), mlVar, true);
        fn fnVar = xo.a;
        if (mlVarA != fnVar && mlVarA.n(g2.v) == null) {
            mlVarA = mlVarA.k(fnVar);
        }
        rw0 i40Var = zlVar == zl.e ? new i40(mlVarA, kwVar) : new rw0(mlVarA, true);
        i40Var.g0(zlVar, i40Var, kwVar);
        return i40Var;
    }
}
