package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class b10 {
    public static final g8 a = new g8(Float.POSITIVE_INFINITY);
    public static final h8 b = new h8(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final i8 c = new i8(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final j8 d = new j8(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final g8 e = new g8(Float.NEGATIVE_INFINITY);
    public static final h8 f = new h8(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final i8 g = new i8(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final j8 h = new j8(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ej0 i = new ej0(null, new vi0());
    public static final int[] j = new int[2];
    public static final cs k = new cs("NULL", 1);
    public static final in0 l = new in0(0.16f, 0.1f, 0.08f, 0.1f);
    public static final Object m = new Object();
    public static final cs n = new cs("NO_THREAD_ELEMENTS", 1);
    public static final vp0 o = new vp0(1);
    public static final vp0 p = new vp0(2);
    public static final vp0 q = new vp0(3);
    public static uy r;

    public static final void A(u90 u90Var, dd ddVar, ac acVar, float f2, hu0 hu0Var, uz0 uz0Var, tq tqVar) {
        ArrayList arrayList = u90Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pg0 pg0Var = (pg0) arrayList.get(i2);
            pg0Var.a.g(ddVar, acVar, f2, hu0Var, uz0Var, tqVar);
            ddVar.f(0.0f, pg0Var.a.b());
        }
    }

    public static long B(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    hj.l(i7);
                    throw new fg();
                }
                i6 = 8190;
            }
        }
        return hj.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long C(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    hj.l(i7);
                    throw new fg();
                }
                i6 = 8190;
            }
        }
        return hj.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final boolean D(av avVar, u7 u7Var) {
        int iOrdinal = avVar.C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                av avVarU = m20.u(avVar);
                if (avVarU != null) {
                    return D(avVarU, u7Var) || E(avVar, avVarU, 1, u7Var);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return avVar.B0().a ? ((Boolean) u7Var.g(avVar)).booleanValue() : X(avVar, u7Var);
                }
                throw new fg();
            }
        }
        return X(avVar, u7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0199 A[EDGE_INSN: B:160:0x0199->B:127:0x0199 BREAK  A[LOOP:5: B:89:0x012e->B:165:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean E(defpackage.av r12, defpackage.av r13, int r14, defpackage.u7 r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.E(av, av, int, u7):boolean");
    }

    public static final String F(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Class G(ee eeVar) {
        Class clsA = eeVar.a();
        c10.n(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class H(b20 b20Var) {
        c10.p(b20Var, "<this>");
        Class clsA = ((de) b20Var).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final int I(u90 u90Var, long j2, c61 c61Var) {
        float f2 = c61Var != null ? c61Var.f() : 0.0f;
        int iC = u90Var.c(ed0.e(j2));
        if (ed0.e(j2) < u90Var.d(iC) - f2 || ed0.e(j2) > u90Var.b(iC) + f2 || ed0.d(j2) < (-f2) || ed0.d(j2) > u90Var.d + f2) {
            return -1;
        }
        return iC;
    }

    public static final j90 J(ml mlVar) {
        j90 j90Var = (j90) mlVar.n(g2.F);
        if (j90Var != null) {
            return j90Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final long K(r40 r40Var, xl0 xl0Var, int i2) {
        p11 p11VarD = r40Var.d();
        u90 u90Var = p11VarD != null ? p11VarD.a.b : null;
        d30 d30VarC = r40Var.c();
        return (u90Var == null || d30VarC == null) ? w11.b : u90Var.f(xl0Var.h(d30VarC.C(0L)), i2, g2.X);
    }

    public static final cx0 L(zv0 zv0Var) {
        cx0 cx0Var = zv0Var.d;
        c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (cx0) ov0.t(cx0Var, zv0Var);
    }

    public static final int M(zv0 zv0Var) {
        cx0 cx0Var = zv0Var.d;
        c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((cx0) ov0.i(cx0Var)).e;
    }

    public static final boolean N(t30 t30Var) {
        if (t30Var.j == null) {
            return false;
        }
        t30 t30VarT = t30Var.t();
        return (t30VarT != null ? t30VarT.j : null) == null || t30Var.H.b;
    }

    public static final boolean O(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static boolean P(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final boolean Q(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean R(int i2) {
        int type;
        return (!Q(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static final boolean T(zv0 zv0Var, iw iwVar) {
        int i2;
        x xVar;
        Object objG;
        gv0 gv0VarK;
        boolean zS;
        do {
            synchronized (m) {
                cx0 cx0Var = zv0Var.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i2 = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            ji0 ji0VarE = xVar.e();
            objG = iwVar.g(ji0VarE);
            x xVarC = ji0VarE.c();
            if (c10.i(xVarC, xVar)) {
                break;
            }
            cx0 cx0Var3 = zv0Var.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = s((cx0) ov0.w(cx0Var3, zv0Var, gv0VarK), i2, xVarC, true);
            }
            ov0.n(gv0VarK, zv0Var);
        } while (!zS);
        return ((Boolean) objG).booleanValue();
    }

    public static final int U(p00 p00Var) {
        y yVar = hl0.d;
        int i2 = p00Var.d;
        if (p00Var.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + p00Var);
        }
        int i3 = p00Var.e;
        if (i3 < Integer.MAX_VALUE) {
            return hl0.d.c(i2, i3 + 1);
        }
        if (i2 <= Integer.MIN_VALUE) {
            return hl0.d.b();
        }
        return hl0.d.c(i2 - 1, i3) + 1;
    }

    public static final void V(r40 r40Var, a11 a11Var, hd0 hd0Var) {
        gv0 gv0VarG = h9.g();
        iw iwVarE = gv0VarG != null ? gv0VarG.e() : null;
        gv0 gv0VarJ = h9.j(gv0VarG);
        try {
            p11 p11VarD = r40Var.d();
            if (p11VarD == null) {
                return;
            }
            j11 j11Var = r40Var.e;
            if (j11Var == null) {
                return;
            }
            d30 d30VarC = r40Var.c();
            if (d30VarC == null) {
                return;
            }
            qo0.o(a11Var, r40Var.a, p11VarD.a, d30VarC, j11Var, r40Var.b(), hd0Var);
        } finally {
            h9.l(gv0VarG, gv0VarJ, iwVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean W(av avVar, u7 u7Var) {
        av[] avVarArr = new av[16];
        if (!avVar.d.q) {
            pz.b("visitChildren called on an unattached node");
        }
        eb0 eb0Var = new eb0(new d90[16]);
        d90 d90Var = avVar.d;
        d90 d90Var2 = d90Var.i;
        if (d90Var2 == null) {
            d80.h(eb0Var, d90Var);
        } else {
            eb0Var.b(d90Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = eb0Var.f;
            if (i3 == 0) {
                break;
            }
            d90 d90VarI = (d90) eb0Var.k(i3 - 1);
            if ((d90VarI.g & 1024) == 0) {
                d80.h(eb0Var, d90VarI);
            } else {
                while (true) {
                    if (d90VarI == null) {
                        break;
                    }
                    if ((d90VarI.f & 1024) != 0) {
                        eb0 eb0Var2 = null;
                        while (d90VarI != null) {
                            if (d90VarI instanceof av) {
                                av avVar2 = (av) d90VarI;
                                int i4 = i2 + 1;
                                if (avVarArr.length < i4) {
                                    int length = avVarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(avVarArr, 0, r10, 0, length);
                                    avVarArr = r10;
                                }
                                avVarArr[i2] = avVar2;
                                i2 = i4;
                            } else if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                int i5 = 0;
                                for (d90 d90Var3 = ((mn) d90VarI).s; d90Var3 != null; d90Var3 = d90Var3.i) {
                                    if ((d90Var3.f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            d90VarI = d90Var3;
                                        } else {
                                            if (eb0Var2 == null) {
                                                eb0Var2 = new eb0(new d90[16]);
                                            }
                                            if (d90VarI != null) {
                                                eb0Var2.b(d90VarI);
                                                d90VarI = null;
                                            }
                                            eb0Var2.b(d90Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            d90VarI = d80.i(eb0Var2);
                        }
                    } else {
                        d90VarI = d90VarI.i;
                    }
                }
            }
        }
        y9.z0(avVarArr, bv.b, 0, i2);
        int i6 = i2 - 1;
        if (i6 < avVarArr.length) {
            while (i6 >= 0) {
                av avVar3 = avVarArr[i6];
                if (m20.H(avVar3) && t(avVar3, u7Var)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean X(av avVar, u7 u7Var) {
        av[] avVarArr = new av[16];
        if (!avVar.d.q) {
            pz.b("visitChildren called on an unattached node");
        }
        eb0 eb0Var = new eb0(new d90[16]);
        d90 d90Var = avVar.d;
        d90 d90Var2 = d90Var.i;
        if (d90Var2 == null) {
            d80.h(eb0Var, d90Var);
        } else {
            eb0Var.b(d90Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = eb0Var.f;
            if (i3 == 0) {
                break;
            }
            d90 d90VarI = (d90) eb0Var.k(i3 - 1);
            if ((d90VarI.g & 1024) == 0) {
                d80.h(eb0Var, d90VarI);
            } else {
                while (true) {
                    if (d90VarI == null) {
                        break;
                    }
                    if ((d90VarI.f & 1024) != 0) {
                        eb0 eb0Var2 = null;
                        while (d90VarI != null) {
                            if (d90VarI instanceof av) {
                                av avVar2 = (av) d90VarI;
                                int i4 = i2 + 1;
                                if (avVarArr.length < i4) {
                                    int length = avVarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(avVarArr, 0, r10, 0, length);
                                    avVarArr = r10;
                                }
                                avVarArr[i2] = avVar2;
                                i2 = i4;
                            } else if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                int i5 = 0;
                                for (d90 d90Var3 = ((mn) d90VarI).s; d90Var3 != null; d90Var3 = d90Var3.i) {
                                    if ((d90Var3.f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            d90VarI = d90Var3;
                                        } else {
                                            if (eb0Var2 == null) {
                                                eb0Var2 = new eb0(new d90[16]);
                                            }
                                            if (d90VarI != null) {
                                                eb0Var2.b(d90VarI);
                                                d90VarI = null;
                                            }
                                            eb0Var2.b(d90Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            d90VarI = d80.i(eb0Var2);
                        }
                    } else {
                        d90VarI = d90VarI.i;
                    }
                }
            }
        }
        y9.z0(avVarArr, bv.b, 0, i2);
        for (int i6 = 0; i6 < i2; i6++) {
            av avVar3 = avVarArr[i6];
            if (m20.H(avVar3) && D(avVar3, u7Var)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] Y(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] Z(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long a0(InputStream inputStream, int i2) {
        byte[] bArrY = Y(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (bArrY[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static final zg b0(int i2, ow owVar, ci ciVar) {
        Object objK = ciVar.K();
        if (objK == vh.a) {
            objK = new zg(i2, true, owVar);
            ciVar.e0(objK);
        }
        zg zgVar = (zg) objK;
        if (!c10.i(zgVar.f, owVar)) {
            boolean z = zgVar.f == null;
            zgVar.f = owVar;
            if (!z && zgVar.e) {
                nl0 nl0Var = zgVar.g;
                if (nl0Var != null) {
                    oi oiVar = nl0Var.a;
                    if (oiVar != null) {
                        oiVar.r(nl0Var, null);
                    }
                    zgVar.g = null;
                }
                ArrayList arrayList = zgVar.h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        nl0 nl0Var2 = (nl0) arrayList.get(i3);
                        oi oiVar2 = nl0Var2.a;
                        if (oiVar2 != null) {
                            oiVar2.r(nl0Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return zgVar;
    }

    public static final Object c0(Object[] objArr, rp0 rp0Var, gw gwVar, ci ciVar, int i2, int i3) {
        Object[] objArr2;
        rp0 rp0Var2;
        final Object obj;
        Object objB;
        long j2 = ciVar.T;
        x(36);
        final String string = Long.toString(j2, 36);
        c10.o(string, "toString(...)");
        c10.n(rp0Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final ap0 ap0Var = (ap0) ciVar.j(cp0.a);
        Object objK = ciVar.K();
        Object obj2 = vh.a;
        if (objK == obj2) {
            Object objD = (ap0Var == null || (objB = ap0Var.b(string)) == null) ? null : rp0Var.d(objB);
            if (objD == null) {
                objD = gwVar.a();
            }
            objArr2 = objArr;
            rp0Var2 = rp0Var;
            Object zo0Var = new zo0(rp0Var2, ap0Var, string, objD, objArr2);
            ciVar.e0(zo0Var);
            objK = zo0Var;
        } else {
            objArr2 = objArr;
            rp0Var2 = rp0Var;
        }
        final zo0 zo0Var2 = (zo0) objK;
        Object objA = Arrays.equals(objArr2, zo0Var2.h) ? zo0Var2.g : null;
        if (objA == null) {
            objA = gwVar.a();
        }
        boolean zH = ciVar.h(zo0Var2) | ((((i2 & 112) ^ 48) > 32 && ciVar.h(rp0Var2)) || (i2 & 48) == 32) | ciVar.h(ap0Var) | ciVar.f(string) | ciVar.h(objA) | ciVar.h(objArr2);
        Object objK2 = ciVar.K();
        if (zH || objK2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objA;
            final rp0 rp0Var3 = rp0Var2;
            Object obj3 = new gw() { // from class: km0
                @Override // defpackage.gw
                public final Object a() {
                    boolean z;
                    zo0 zo0Var3 = zo0Var2;
                    ap0 ap0Var2 = zo0Var3.e;
                    ap0 ap0Var3 = ap0Var;
                    boolean z2 = true;
                    if (ap0Var2 != ap0Var3) {
                        zo0Var3.e = ap0Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = zo0Var3.f;
                    String str2 = string;
                    if (c10.i(str, str2)) {
                        z2 = z;
                    } else {
                        zo0Var3.f = str2;
                    }
                    zo0Var3.d = rp0Var3;
                    zo0Var3.g = obj;
                    zo0Var3.h = objArr3;
                    e9 e9Var = zo0Var3.i;
                    if (e9Var != null && z2) {
                        e9Var.D();
                        zo0Var3.i = null;
                        zo0Var3.a();
                    }
                    return j41.a;
                }
            };
            ciVar.e0(obj3);
            objK2 = obj3;
        } else {
            obj = objA;
        }
        l81.f((gw) objK2, ciVar);
        return obj;
    }

    public static final boolean d0(nl0 nl0Var, nl0 nl0Var2) {
        if (nl0Var == null) {
            return true;
        }
        if (nl0Var instanceof nl0) {
            return !nl0Var.b() || nl0Var.equals(nl0Var2) || c10.i(nl0Var.c, nl0Var2.c);
        }
        return false;
    }

    public static final boolean e0(View view, Integer num, Rect rect) {
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof p3) {
            return ((p3) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static x7 f() {
        return new x7(Float.valueOf(0.0f), y41.a, Float.valueOf(0.01f), 8);
    }

    public static final void f0(ml mlVar, Object obj) {
        if (obj == n) {
            return;
        }
        if (!(obj instanceof n21)) {
            Object objR = mlVar.r(p, null);
            c10.n(objR, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            b8.o(objR);
            throw null;
        }
        n21 n21Var = (n21) obj;
        j21[] j21VarArr = n21Var.b;
        int length = j21VarArr.length - 1;
        if (length < 0) {
            return;
        }
        j21 j21Var = j21VarArr[length];
        c10.m(null);
        Object obj2 = n21Var.a[length];
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void g(defpackage.a11 r62, defpackage.iw r63, defpackage.e90 r64, defpackage.c21 r65, defpackage.of r66, defpackage.iw r67, defpackage.fa0 r68, defpackage.fw0 r69, boolean r70, int r71, int r72, defpackage.xy r73, defpackage.s20 r74, boolean r75, defpackage.zg r76, defpackage.ci r77, int r78, int r79) {
        /*
            Method dump skipped, instructions count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.g(a11, iw, e90, c21, of, iw, fa0, fw0, boolean, int, int, xy, s20, boolean, zg, ci, int, int):void");
    }

    public static final void h(e90 e90Var, u01 u01Var, zg zgVar, ci ciVar, int i2) {
        ciVar.W(-20551815);
        int i3 = (ciVar.f(e90Var) ? 4 : 2) | i2 | (ciVar.h(u01Var) ? 32 : 16);
        if ((i3 & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            l80 l80VarD = eb.d(g2.e, true);
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
            dq0.m(ciVar, rh.e, l80VarD);
            dq0.m(ciVar, rh.d, wh0VarL);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            dq0.m(ciVar, rh.c, e90VarP);
            nm.c(u01Var, zgVar, ciVar, (i3 >> 3) & 126);
            ciVar.p(true);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new g4(e90Var, u01Var, zgVar, i2, 2);
        }
    }

    public static final Object h0(ml mlVar) {
        Object objR = mlVar.r(o, 0);
        c10.m(objR);
        return objR;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.u01 r14, defpackage.ci r15, int r16) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.i(u01, ci, int):void");
    }

    public static final Integer i0(int i2) {
        if (i2 == 5) {
            return 33;
        }
        if (i2 == 6) {
            return 130;
        }
        if (i2 == 3) {
            return 17;
        }
        if (i2 == 4) {
            return 66;
        }
        if (i2 == 1) {
            return 2;
        }
        return i2 == 2 ? 1 : null;
    }

    public static final void j(u01 u01Var, boolean z, ci ciVar, int i2) {
        int i3;
        p11 p11VarD;
        ciVar.W(626339208);
        if ((i2 & 6) == 0) {
            i3 = (ciVar.h(u01Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ciVar.g(z) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else if (z) {
            ciVar.V(-1286242594);
            r40 r40Var = u01Var.d;
            o11 o11Var = null;
            if (r40Var != null && (p11VarD = r40Var.d()) != null) {
                o11 o11Var2 = p11VarD.a;
                r40 r40Var2 = u01Var.d;
                if (!(r40Var2 != null ? r40Var2.p : true)) {
                    o11Var = o11Var2;
                }
            }
            if (o11Var == null) {
                ciVar.V(-1285984396);
            } else {
                ciVar.V(-1285984395);
                if (w11.b(u01Var.j().b)) {
                    ciVar.V(-1679637798);
                    ciVar.p(false);
                } else {
                    ciVar.V(-1680616096);
                    int iD = u01Var.b.d((int) (u01Var.j().b >> 32));
                    int iD2 = u01Var.b.d((int) (u01Var.j().b & 4294967295L));
                    um0 um0VarA = o11Var.a(iD);
                    um0 um0VarA2 = o11Var.a(Math.max(iD2 - 1, 0));
                    r40 r40Var3 = u01Var.d;
                    if (r40Var3 == null || !((Boolean) r40Var3.m.getValue()).booleanValue()) {
                        ciVar.V(-1679975078);
                        ciVar.p(false);
                    } else {
                        ciVar.V(-1680216289);
                        dq0.b(true, um0VarA, u01Var, ciVar, ((i3 << 6) & 896) | 6);
                        ciVar.p(false);
                    }
                    r40 r40Var4 = u01Var.d;
                    if (r40Var4 == null || !((Boolean) r40Var4.n.getValue()).booleanValue()) {
                        ciVar.V(-1679655654);
                        ciVar.p(false);
                    } else {
                        ciVar.V(-1679895904);
                        dq0.b(false, um0VarA2, u01Var, ciVar, ((i3 << 6) & 896) | 6);
                        ciVar.p(false);
                    }
                    ciVar.p(false);
                }
                r40 r40Var5 = u01Var.d;
                if (r40Var5 != null) {
                    zg0 zg0Var = r40Var5.l;
                    if (!c10.i(u01Var.r.a.e, u01Var.j().a.e)) {
                        zg0Var.setValue(Boolean.FALSE);
                    }
                    if (r40Var5.b()) {
                        if (((Boolean) zg0Var.getValue()).booleanValue()) {
                            u01Var.o();
                        } else {
                            u01Var.k();
                        }
                    }
                }
            }
            ciVar.p(false);
            ciVar.p(false);
        } else {
            ciVar.V(651305535);
            ciVar.p(false);
            u01Var.k();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new fl(u01Var, z, i2);
        }
    }

    public static final gu j0(int i2) {
        if (i2 == 1) {
            return new gu(2);
        }
        if (i2 == 2) {
            return new gu(1);
        }
        if (i2 == 17) {
            return new gu(3);
        }
        if (i2 == 33) {
            return new gu(5);
        }
        if (i2 == 66) {
            return new gu(4);
        }
        if (i2 != 130) {
            return null;
        }
        return new gu(6);
    }

    public static final boolean k(qp qpVar, long j2) {
        if (!qpVar.d.q) {
            return false;
        }
        vz vzVar = d80.z(qpVar).G.c;
        if (!vzVar.R.q) {
            return false;
        }
        long jR = vzVar.R(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR & 4294967295L));
        long j3 = qpVar.t;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final Object k0(ml mlVar, Object obj) {
        if (obj == null) {
            obj = h0(mlVar);
        }
        if (obj == 0) {
            return n;
        }
        if (obj instanceof Integer) {
            return mlVar.r(q, new n21(((Number) obj).intValue(), mlVar));
        }
        b8.o(obj);
        throw null;
    }

    public static final void l(r40 r40Var) {
        j11 j11Var = r40Var.e;
        if (j11Var != null) {
            r40Var.t.g(a11.a((a11) r40Var.d.e, null, 0L, 3));
            f11 f11Var = j11Var.a;
            AtomicReference atomicReference = f11Var.b;
            while (true) {
                if (atomicReference.compareAndSet(j11Var, null)) {
                    f11Var.a.f();
                    break;
                } else if (atomicReference.get() != j11Var) {
                    break;
                }
            }
        }
        r40Var.e = null;
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final long m(r40 r40Var, xl0 xl0Var, xl0 xl0Var2, int i2) {
        long jK = K(r40Var, xl0Var, i2);
        if (w11.b(jK)) {
            return w11.b;
        }
        long jK2 = K(r40Var, xl0Var2, i2);
        if (w11.b(jK2)) {
            return w11.b;
        }
        int i3 = (int) (jK >> 32);
        int i4 = (int) (jK2 & 4294967295L);
        return no0.a(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        l0(byteArrayOutputStream, i2, 2);
    }

    public static final boolean n(o11 o11Var, int i2) {
        int iF = o11Var.f(i2);
        return i2 == o11Var.i(iF) || i2 == o11Var.e(iF, false) ? o11Var.j(i2) != o11Var.a(i2) : o11Var.a(i2) != o11Var.a(i2 - 1);
    }

    public static final void o(f11 f11Var, r40 r40Var, a11 a11Var, xy xyVar, hd0 hd0Var) {
        xz xzVar = r40Var.d;
        xk xkVar = r40Var.t;
        xk xkVar2 = r40Var.u;
        dm0 dm0Var = new dm0();
        u7 u7Var = new u7(xzVar, xkVar, dm0Var, 8);
        dj0 dj0Var = f11Var.a;
        dj0Var.a(a11Var, xyVar, u7Var, xkVar2);
        j11 j11Var = new j11(f11Var, dj0Var);
        f11Var.b.set(j11Var);
        dm0Var.d = j11Var;
        r40Var.e = j11Var;
        V(r40Var, a11Var, hd0Var);
    }

    public static final void p(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final void q(z0 z0Var, gt0 gt0Var) {
        if (m20.h(gt0Var)) {
            Object objG = gt0Var.d.d.g(bt0.g);
            if (objG == null) {
                objG = null;
            }
            j0 j0Var = (j0) objG;
            if (j0Var != null) {
                z0Var.a(new v0(null, R.id.accessibilityActionSetProgress, j0Var.a, null));
            }
        }
    }

    public static final boolean s(cx0 cx0Var, int i2, x xVar, boolean z) {
        boolean z2;
        synchronized (m) {
            try {
                int i3 = cx0Var.d;
                if (i3 == i2) {
                    cx0Var.c = xVar;
                    z2 = true;
                    if (z) {
                        cx0Var.e++;
                    }
                    cx0Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean t(defpackage.av r7, defpackage.u7 r8) {
        /*
            yu r0 = r7.C0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = W(r7, r8)
            if (r0 != 0) goto L7d
            su r0 = r7.B0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.g(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            fg r7 = new fg
            r7.<init>()
            throw r7
        L37:
            av r0 = defpackage.m20.u(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            yu r6 = r0.C0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            fg r7 = new fg
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = t(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = E(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            su r7 = r0.B0()
            boolean r7 = r7.a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.g(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = E(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = W(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.t(av, u7):boolean");
    }

    public static final int u(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final Bundle v(ng0... ng0VarArr) {
        Bundle bundle = new Bundle(ng0VarArr.length);
        for (ng0 ng0Var : ng0VarArr) {
            String str = (String) ng0Var.d;
            Object obj = ng0Var.e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                c10.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final xl0 w(View view, p3 p3Var) {
        int[] iArr = j;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        p3Var.getLocationInWindow(iArr);
        float f2 = i2 - iArr[0];
        float f3 = i3 - iArr[1];
        return new xl0(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static void x(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder sbI = b8.i("radix ", i2, " was not in valid range ");
            sbI.append(new p00(2, 36, 1));
            throw new IllegalArgumentException(sbI.toString());
        }
    }

    public static byte[] y(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final boolean z(xl0 xl0Var, float f2, float f3) {
        float f4 = xl0Var.a;
        if (f2 > xl0Var.c || f4 > f2) {
            return false;
        }
        return f3 <= xl0Var.d && xl0Var.b <= f3;
    }

    public abstract void S();

    public abstract boolean g0(of ofVar);

    public abstract void r();
}
