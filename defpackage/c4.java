package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class c4 {
    public static final cs c;
    public static final e9 e;
    public static e9 f;
    public static final cs n;
    public static final pa a = new pa(-1.0f);
    public static final pa b = new pa(1.0f);
    public static final yy d = new yy(false);
    public static final byte[] g = {48, 49, 53, 0};
    public static final byte[] h = {48, 49, 48, 0};
    public static final byte[] i = {48, 48, 57, 0};
    public static final byte[] j = {48, 48, 53, 0};
    public static final byte[] k = {48, 48, 49, 0};
    public static final byte[] l = {48, 48, 49, 0};
    public static final byte[] m = {48, 48, 50, 0};
    public static final StackTraceElement[] o = new StackTraceElement[0];

    static {
        int i2 = 1;
        c = new cs("CLOSED", i2);
        Object obj = null;
        e = new e9(obj, obj, obj);
        n = new cs("NO_VALUE", i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A(d90 d90Var, gw gwVar) {
        dd0 dd0Var = d90Var.j;
        if (dd0Var == null) {
            dd0Var = new dd0((cd0) d90Var);
            d90Var.j = dd0Var;
        }
        ((p3) d80.A(d90Var)).getSnapshotObserver().a(dd0Var, s40.l, gwVar);
    }

    public static final Object D(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static v80 E(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    v80 v80Var = new v80();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    v80Var.g = byteBufferDuplicate;
                    v80Var.d = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    v80Var.e = i7;
                    v80Var.f = ((ByteBuffer) v80Var.g).getShort(i7);
                    return v80Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void F(Object[] objArr, int i2, int i3) {
        c10.p(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final long G(long j2, float f2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public static final Bitmap.Config H(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final String I(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final Object J(ml mlVar, Object obj, Object obj2, kw kwVar, lk lkVar) {
        Object objE;
        Object objK0 = b10.k0(mlVar, obj2);
        try {
            pw0 pw0Var = new pw0(lkVar, mlVar);
            if (kwVar == null) {
                objE = r31.g0(kwVar, obj, pw0Var);
            } else {
                r31.m(2, kwVar);
                objE = kwVar.e(obj, pw0Var);
            }
            b10.f0(mlVar, objK0);
            if (objE == xl.d) {
                c10.p(lkVar, "frame");
            }
            return objE;
        } catch (Throwable th) {
            b10.f0(mlVar, objK0);
            throw th;
        }
    }

    public static final void a(gw gwVar, zg zgVar, e90 e90Var, kw kwVar, kw kwVar2, kw kwVar3, ju0 ju0Var, long j2, long j3, long j4, long j5, float f2, no noVar, ci ciVar, int i2) {
        long j6;
        float f3;
        no noVar2;
        long j7;
        ju0 ju0Var2;
        long j8;
        e90 e90Var2;
        long j9;
        e90 e90Var3;
        ju0 ju0Var3;
        long j10;
        long j11;
        long j12;
        long j13;
        float f4;
        no noVar3;
        ciVar.W(-2081346864);
        if (((i2 | 306209152) & 306783379) == 306783378 && ciVar.z()) {
            ciVar.Q();
            e90Var3 = e90Var;
            ju0Var3 = ju0Var;
            j10 = j2;
            j11 = j3;
            j12 = j4;
            j13 = j5;
            f4 = f2;
            noVar3 = noVar;
        } else {
            ciVar.S();
            if ((i2 & 1) == 0 || ciVar.x()) {
                float f5 = t1.a;
                ju0 ju0VarA = nu0.a(oo.a, ciVar);
                long jE = lf.e(38, ciVar);
                long jE2 = lf.e(oo.f, ciVar);
                long jE3 = lf.e(oo.b, ciVar);
                long jE4 = lf.e(oo.d, ciVar);
                float f6 = t1.a;
                j6 = jE4;
                f3 = f6;
                noVar2 = new no();
                j7 = jE2;
                ju0Var2 = ju0VarA;
                j8 = jE;
                e90Var2 = b90.a;
                j9 = jE3;
            } else {
                ciVar.Q();
                e90Var2 = e90Var;
                ju0Var2 = ju0Var;
                j8 = j2;
                j7 = j3;
                j9 = j4;
                j6 = j5;
                f3 = f2;
                noVar2 = noVar;
            }
            ciVar.q();
            f2.c(gwVar, zgVar, e90Var2, kwVar, kwVar2, kwVar3, ju0Var2, j8, j7, j9, j6, f3, noVar2, ciVar, 1797558, 3456);
            e90Var3 = e90Var2;
            ju0Var3 = ju0Var2;
            j10 = j8;
            j11 = j7;
            j12 = j9;
            j13 = j6;
            f4 = f3;
            noVar3 = noVar2;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new p2(gwVar, zgVar, e90Var3, kwVar, kwVar2, kwVar3, ju0Var3, j10, j11, j12, j13, f4, noVar3, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.fl0 r11, defpackage.kw r12, defpackage.ci r13, int r14) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.W(r0)
            u00 r0 = r13.x
            wh0 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            yd0 r3 = defpackage.fi.b
            r13.T(r2, r3)
            java.lang.Object r2 = r13.K()
            v71 r3 = defpackage.vh.a
            boolean r3 = defpackage.c10.i(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L29
        L22:
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            defpackage.c10.n(r2, r3)
            u41 r2 = (defpackage.u41) r2
        L29:
            dl0 r3 = r11.a
            u41 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r13.e0(r5)
        L38:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L55
            boolean r2 = r11.f
            if (r2 != 0) goto L4b
            r2 = r1
            vh0 r2 = (defpackage.vh0) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L51
        L4b:
            vh0 r1 = (defpackage.vh0) r1
            vh0 r1 = r1.b(r3, r5)
        L51:
            r13.J = r7
        L53:
            r2 = r8
            goto L97
        L55:
            av0 r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r10, r9)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            defpackage.c10.n(r6, r9)
            wh0 r6 = (defpackage.wh0) r6
            boolean r9 = r13.z()
            if (r9 == 0) goto L6e
            if (r2 != 0) goto L7c
        L6e:
            boolean r9 = r11.f
            if (r9 != 0) goto L8a
            r9 = r1
            vh0 r9 = (defpackage.vh0) r9
            boolean r9 = r9.containsKey(r3)
            if (r9 != 0) goto L7c
            goto L8a
        L7c:
            if (r2 == 0) goto L83
            boolean r2 = r13.w
            if (r2 != 0) goto L83
            goto L88
        L83:
            boolean r2 = r13.w
            if (r2 == 0) goto L88
            goto L90
        L88:
            r1 = r6
            goto L90
        L8a:
            vh0 r1 = (defpackage.vh0) r1
            vh0 r1 = r1.b(r3, r5)
        L90:
            boolean r2 = r13.y
            if (r2 != 0) goto L96
            if (r6 == r1) goto L53
        L96:
            r2 = r7
        L97:
            if (r2 == 0) goto La0
            boolean r3 = r13.S
            if (r3 != 0) goto La0
            r13.I(r1)
        La0:
            boolean r3 = r13.w
            r0.c(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            yd0 r3 = defpackage.fi.c
            r13.R(r2, r3, r8, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.e(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lc8
            goto Lc9
        Lc8:
            r7 = r8
        Lc9:
            r13.w = r7
            r13.K = r4
            nl0 r13 = r13.r()
            if (r13 == 0) goto Ldb
            xg r0 = new xg
            r1 = 1
            r0.<init>(r14, r1, r11, r12)
            r13.d = r0
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4.b(fl0, kw, ci, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, wh0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.fl0[] r8, defpackage.kw r9, defpackage.ci r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.W(r0)
            u00 r0 = r10.x
            wh0 r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            yd0 r3 = defpackage.fi.b
            r10.T(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            vh0 r2 = defpackage.vh0.g
            vh0 r2 = defpackage.nm.J(r8, r1, r2)
            vh0 r1 = r10.d0(r1, r2)
            r10.J = r3
        L25:
            r2 = r4
            goto L74
        L27:
            av0 r2 = r10.G
            int r5 = r2.g
            java.lang.Object r2 = r2.h(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            defpackage.c10.n(r2, r5)
            wh0 r2 = (defpackage.wh0) r2
            av0 r6 = r10.G
            int r7 = r6.g
            java.lang.Object r6 = r6.h(r7, r3)
            defpackage.c10.n(r6, r5)
            wh0 r6 = (defpackage.wh0) r6
            vh0 r5 = defpackage.nm.J(r8, r1, r6)
            boolean r7 = r10.z()
            if (r7 == 0) goto L65
            boolean r7 = r10.y
            if (r7 != 0) goto L65
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.l
            av0 r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.l = r5
            r1 = r2
            goto L25
        L65:
            vh0 r1 = r10.d0(r1, r5)
            boolean r5 = r10.y
            if (r5 != 0) goto L73
            boolean r2 = defpackage.c10.i(r1, r2)
            if (r2 != 0) goto L25
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.S
            if (r5 != 0) goto L7d
            r10.I(r1)
        L7d:
            boolean r5 = r10.w
            r0.c(r5)
            r10.w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            yd0 r5 = defpackage.fi.c
            r10.R(r2, r5, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.e(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r10.w = r3
            r0 = 0
            r10.K = r0
            nl0 r10 = r10.r()
            if (r10 == 0) goto Lb9
            xg r0 = new xg
            r1 = 2
            r0.<init>(r11, r1, r8, r9)
            r10.d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4.c(fl0[], kw, ci, int):void");
    }

    public static qu0 d(int i2, ec ecVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        int i4 = (i2 & 2) == 0 ? 16 : 0;
        if (i3 <= 0 && i4 <= 0 && ecVar != ec.d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + ecVar).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new qu0(i3, i5, ecVar);
    }

    public static d6 e(String str, c21 c21Var, long j2, xn xnVar, jv jvVar, int i2, int i3) {
        ks ksVar = ks.d;
        return new d6(new h6(str, c21Var, ksVar, ksVar, jvVar, xnVar), i2, 1, j2);
    }

    public static final xl0 f(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new xl0(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    public static final int g(v60 v60Var, iy iyVar) {
        v60 v60VarS0 = v60Var.s0();
        if (v60VarS0 == null) {
            pz.b("Child of " + v60Var + " cannot be null when calculating alignment line");
        }
        if (v60Var.w0().a().containsKey(iyVar)) {
            Integer num = (Integer) v60Var.w0().a().get(iyVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iR0 = v60VarS0.r0(iyVar);
            if (iR0 != Integer.MIN_VALUE) {
                v60VarS0.m = true;
                v60Var.n = true;
                v60Var.C0();
                v60VarS0.m = false;
                v60Var.n = false;
                return iR0 + ((int) (iyVar instanceof iy ? v60VarS0.y0() & 4294967295L : v60VarS0.y0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View h(android.view.View r4, android.view.View r5, int r6) {
        /*
            r0 = 1
            r1 = -1
            r2 = 0
            if (r6 == r0) goto L33
            r0 = 2
            if (r6 == r0) goto L9
            goto L39
        L9:
            int r6 = r4.getNextFocusForwardId()
            if (r6 != r1) goto L10
            goto L39
        L10:
            l3 r0 = new l3
            r1 = 1
            r0.<init>(r6, r1)
            r6 = r2
        L17:
            android.view.View r6 = q(r4, r0, r6)
            if (r6 != 0) goto L32
            if (r4 != r5) goto L20
            goto L32
        L20:
            android.view.ViewParent r6 = r4.getParent()
            if (r6 == 0) goto L31
            boolean r1 = r6 instanceof android.view.View
            if (r1 != 0) goto L2b
            goto L31
        L2b:
            android.view.View r6 = (android.view.View) r6
            r3 = r6
            r6 = r4
            r4 = r3
            goto L17
        L31:
            return r2
        L32:
            return r6
        L33:
            int r6 = r4.getId()
            if (r6 != r1) goto L3a
        L39:
            return r2
        L3a:
            j4 r6 = new j4
            r0 = 13
            r6.<init>(r0, r5, r4)
            r0 = r2
        L42:
            android.view.View r0 = q(r4, r6, r0)
            if (r0 != 0) goto L5d
            if (r4 != r5) goto L4b
            goto L5d
        L4b:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L5c
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L56
            goto L5c
        L56:
            android.view.View r0 = (android.view.View) r0
            r3 = r0
            r0 = r4
            r4 = r3
            goto L42
        L5c:
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4.h(android.view.View, android.view.View, int):android.view.View");
    }

    public static final void i(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final String j(Object[] objArr, int i2, int i3, u uVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == uVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }

    public static final void k(ck ckVar) {
        ckVar.a.setValue(zj.a);
    }

    public static final int l(long j2, long j3) {
        boolean zY = y(j2);
        if (zY != y(j3)) {
            return zY ? -1 : 1;
        }
        return (Math.min(r(j2), r(j3)) >= 0.0f && x(j2) != x(j3)) ? x(j2) ? -1 : 1 : (int) Math.signum(r(j2) - r(j3));
    }

    public static int m(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final float n(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void o(ml mlVar) {
        r10 r10Var = (r10) mlVar.n(g2.E);
        if (r10Var != null && !r10Var.b()) {
            throw r10Var.q();
        }
    }

    public static final Object p(or0 or0Var, long j2, kw kwVar) {
        while (true) {
            if (or0Var.c >= j2 && !or0Var.c()) {
                return or0Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zi.a;
            Object obj = atomicReferenceFieldUpdater.get(or0Var);
            cs csVar = c;
            if (obj == csVar) {
                return csVar;
            }
            or0 or0Var2 = (or0) ((zi) obj);
            if (or0Var2 == null) {
                or0Var2 = (or0) kwVar.e(Long.valueOf(or0Var.c + 1), or0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(or0Var, null, or0Var2)) {
                    if (atomicReferenceFieldUpdater.get(or0Var) != null) {
                        break;
                    }
                }
                if (or0Var.c()) {
                    or0Var.d();
                }
            }
            or0Var = or0Var2;
        }
    }

    public static final View q(View view, iw iwVar, View view2) {
        View viewQ;
        if (((Boolean) iwVar.g(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != view2 && (viewQ = q(childAt, iwVar, view2)) != null) {
                return viewQ;
            }
        }
        return null;
    }

    public static final float r(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static sk0 s() {
        return sk0.b;
    }

    public static final r10 t(ml mlVar) {
        r10 r10Var = (r10) mlVar.n(g2.E);
        if (r10Var != null) {
            return r10Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + mlVar).toString());
    }

    public static final void u(ml mlVar, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            ql qlVar = (ql) mlVar.n(g2.w);
            if (qlVar != null) {
                qlVar.p(mlVar, th);
            } else {
                l81.H(mlVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                c10.h(runtimeException, th);
                th = runtimeException;
            }
            l81.H(mlVar, th);
        }
    }

    public static final cp v(r10 r10Var, boolean z, u10 u10Var) {
        if (r10Var instanceof y10) {
            return ((y10) r10Var).Q(z, u10Var);
        }
        return r10Var.i(u10Var.k(), z, new zu(1, u10Var, u10.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1));
    }

    public static final boolean w(ml mlVar) {
        r10 r10Var = (r10) mlVar.n(g2.E);
        if (r10Var != null) {
            return r10Var.b();
        }
        return true;
    }

    public static final boolean x(long j2) {
        return (j2 & 2) != 0;
    }

    public static final boolean y(long j2) {
        return (j2 & 1) != 0;
    }

    public static final o z(Object[] objArr) {
        c10.p(objArr, "array");
        return new o(objArr);
    }

    public abstract void B(Throwable th);

    public abstract void C(q2 q2Var);
}
