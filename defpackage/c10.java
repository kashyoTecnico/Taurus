package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.util.Log;
import android.view.DragEvent;
import androidx.compose.ui.graphics.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class c10 {
    public static final v71 a = new v71(5);
    public static final v71 b = new v71(6);
    public static final bv c = new bv(7);
    public static final r61 d = new r61(0.31006f, 0.31616f);
    public static final r61 e = new r61(0.34567f, 0.3585f);
    public static final r61 f = new r61(0.32168f, 0.33767f);
    public static final r61 g = new r61(0.31271f, 0.32902f);
    public static final float[] h = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final kc0 j = new kc0(12);
    public static final kc0 k = new kc0(13);
    public static final kc0 l = new kc0(14);
    public static final l21 m = new l21(0, new long[0], new Object[0]);
    public static final at n = new at(0, 0);

    public static f61 A(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                m(objNewInstance);
                return (f61) objNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public static final Object B(rj0 rj0Var, yz0 yz0Var, jy0 jy0Var) {
        Object objQ = nm.q(new n60(rj0Var, yz0Var, null), jy0Var);
        return objQ == xl.d ? objQ : j41.a;
    }

    public static final boolean C(long j2, long j3) {
        return j2 == j3;
    }

    public static final y21 D(of ofVar, q8 q8Var) {
        ofVar.getClass();
        int length = q8Var.e.length();
        int length2 = q8Var.e.length();
        int iMin = Math.min(length, 100);
        for (int i2 = 0; i2 < iMin; i2++) {
            c0(i2, length2, i2);
        }
        c0(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < iMin2; i3++) {
            d0(i3, length, i3);
        }
        d0(length2, length, length2);
        return new y21(q8Var, new at(q8Var.e.length(), q8Var.e.length()));
    }

    public static final long E(long j2, boolean z, int i2, float f2) {
        int iH = ((z || i2 == 2) && gj.d(j2)) ? gj.h(j2) : Integer.MAX_VALUE;
        if (gj.j(j2) != iH) {
            iH = u(mq0.e(f2), gj.j(j2), iH);
        }
        return b10.C(0, iH, 0, gj.g(j2));
    }

    public static final int F(int i2, List list) {
        int i3;
        int i4 = ((pg0) ue.X(list)).c;
        if (i2 > ((pg0) ue.X(list)).c) {
            qz.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            pg0 pg0Var = (pg0) list.get(i3);
            char c2 = pg0Var.b > i2 ? (char) 1 : pg0Var.c <= i2 ? (char) 65535 : (char) 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        StringBuilder sbI = b8.i("Found paragraph index ", i3, " should be in range [0, ");
        sbI.append(list.size());
        sbI.append(").\nDebug info: index=");
        sbI.append(i2);
        sbI.append(", paragraphs=[");
        sbI.append(z50.a(list, null, new r8(3), 31));
        sbI.append(']');
        qz.a(sbI.toString());
        return i3;
    }

    public static final int G(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            pg0 pg0Var = (pg0) arrayList.get(i4);
            char c2 = pg0Var.d > i2 ? (char) 1 : pg0Var.e <= i2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int H(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((pg0) ue.X(arrayList)).g) {
            return ve.L(arrayList);
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            pg0 pg0Var = (pg0) arrayList.get(i3);
            char c2 = pg0Var.f > f2 ? (char) 1 : pg0Var.g <= f2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void I(ArrayList arrayList, long j2, iw iwVar) {
        int size = arrayList.size();
        for (int iF = F(w11.e(j2), arrayList); iF < size; iF++) {
            pg0 pg0Var = (pg0) arrayList.get(iF);
            if (pg0Var.b >= w11.d(j2)) {
                return;
            }
            if (pg0Var.b != pg0Var.c) {
                iwVar.g(pg0Var);
            }
        }
    }

    public static final int J(ci ciVar) {
        ciVar.getClass();
        return Long.hashCode(ciVar.T);
    }

    public static final long K(r1 r1Var) {
        DragEvent dragEvent = (DragEvent) r1Var.e;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:8:0x0031, B:10:0x004a, B:16:0x0067, B:19:0x006f, B:20:0x0083, B:26:0x009c, B:28:0x00ab, B:22:0x008a, B:24:0x0093, B:11:0x0053, B:13:0x0059, B:14:0x0061), top: B:36:0x0031, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ip0 L(defpackage.l61 r9) {
        /*
            gp0 r0 = new gp0
            r0.<init>()
            boolean r1 = r9 instanceof defpackage.zx
            if (r1 == 0) goto L11
            r1 = r9
            zx r1 = (defpackage.zx) r1
            cm r1 = r1.getDefaultViewModelCreationExtras()
            goto L13
        L11:
            bm r1 = defpackage.bm.b
        L13:
            java.lang.String r2 = "extras"
            p(r1, r2)
            k61 r9 = r9.getViewModelStore()
            java.lang.String r2 = "store"
            p(r9, r2)
            kc0 r2 = new kc0
            r3 = 20
            r2.<init>(r3)
            java.lang.String r3 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            java.lang.Class<ip0> r4 = defpackage.ip0.class
            ee r4 = defpackage.em0.a(r4)
            monitor-enter(r2)
            java.util.LinkedHashMap r5 = r9.a     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L6d
            f61 r5 = (defpackage.f61) r5     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r6 = r4.a     // Catch: java.lang.Throwable -> L6d
            java.util.Map r7 = defpackage.ee.b     // Catch: java.lang.Throwable -> L6d
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
            n(r7, r8)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L53
            int r6 = r7.intValue()     // Catch: java.lang.Throwable -> L6d
            boolean r6 = defpackage.r31.J(r6, r5)     // Catch: java.lang.Throwable -> L6d
            goto L65
        L53:
            boolean r7 = r6.isPrimitive()     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L61
            ee r6 = defpackage.em0.a(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r6 = defpackage.b10.H(r6)     // Catch: java.lang.Throwable -> L6d
        L61:
            boolean r6 = r6.isInstance(r5)     // Catch: java.lang.Throwable -> L6d
        L65:
            if (r6 == 0) goto L6f
            java.lang.String r9 = "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel"
            n(r5, r9)     // Catch: java.lang.Throwable -> L6d
            goto Lae
        L6d:
            r9 = move-exception
            goto Lb2
        L6f:
            java.lang.String r5 = "initialExtras"
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L6d
            p(r1, r5)     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L6d
            r5.<init>()     // Catch: java.lang.Throwable -> L6d
            r5.putAll(r1)     // Catch: java.lang.Throwable -> L6d
            kc0 r1 = defpackage.m20.n     // Catch: java.lang.Throwable -> L6d
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L6d
            ip0 r1 = new ip0     // Catch: java.lang.Throwable -> L6d java.lang.AbstractMethodError -> L8a
            r1.<init>()     // Catch: java.lang.Throwable -> L6d java.lang.AbstractMethodError -> L8a
            r5 = r1
            goto L9c
        L8a:
            java.lang.Class r1 = defpackage.b10.G(r4)     // Catch: java.lang.Throwable -> L6d java.lang.AbstractMethodError -> L93
            f61 r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L6d java.lang.AbstractMethodError -> L93
            goto L9b
        L93:
            java.lang.Class r1 = defpackage.b10.G(r4)     // Catch: java.lang.Throwable -> L6d
            f61 r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L6d
        L9b:
            r5 = r0
        L9c:
            java.lang.String r0 = "viewModel"
            p(r5, r0)     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap r9 = r9.a     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r9 = r9.put(r3, r5)     // Catch: java.lang.Throwable -> L6d
            f61 r9 = (defpackage.f61) r9     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto Lae
            r9.a()     // Catch: java.lang.Throwable -> L6d
        Lae:
            monitor-exit(r2)
            ip0 r5 = (defpackage.ip0) r5
            return r5
        Lb2:
            monitor-exit(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c10.L(l61):ip0");
    }

    public static final boolean M(nj0 nj0Var, long j2, long j3) {
        int i2 = nj0Var.i == 1 ? 1 : 0;
        long j4 = nj0Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j2 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final jm N(av avVar) {
        int iOrdinal = avVar.C0().ordinal();
        jm jmVar = jm.d;
        if (iOrdinal != 0) {
            jm jmVar2 = jm.e;
            if (iOrdinal == 1) {
                av avVarU = m20.u(avVar);
                if (avVarU == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                jm jmVarN = N(avVarU);
                if (jmVarN == jmVar) {
                    jmVarN = null;
                }
                if (jmVarN != null) {
                    return jmVarN;
                }
                if (avVar.s) {
                    return jmVar;
                }
                avVar.s = true;
                try {
                    su suVarB0 = avVar.B0();
                    ou focusOwner = ((p3) d80.A(avVar)).getFocusOwner();
                    av avVar2 = ((qu) focusOwner).h;
                    suVarB0.k.getClass();
                    av avVar3 = ((qu) focusOwner).h;
                    return (avVar2 == avVar3 || avVar3 == null) ? jmVar : vu.d == vu.c ? jmVar2 : jm.f;
                } finally {
                    avVar.s = false;
                }
            }
            if (iOrdinal == 2) {
                return jmVar2;
            }
            if (iOrdinal != 3) {
                throw new fg();
            }
        }
        return jmVar;
    }

    public static final jm O(av avVar) {
        if (!avVar.t) {
            avVar.t = true;
            try {
                su suVarB0 = avVar.B0();
                ou focusOwner = ((p3) d80.A(avVar)).getFocusOwner();
                av avVar2 = ((qu) focusOwner).h;
                suVarB0.j.getClass();
                av avVar3 = ((qu) focusOwner).h;
                if (avVar2 != avVar3 && avVar3 != null) {
                    return vu.d == vu.c ? jm.e : jm.f;
                }
            } finally {
                avVar.t = false;
            }
        }
        return jm.d;
    }

    public static final jm P(av avVar) {
        d90 d90VarI;
        jc0 jc0Var;
        int iOrdinal = avVar.C0().ordinal();
        jm jmVar = jm.d;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                av avVarU = m20.u(avVar);
                if (avVarU != null) {
                    return N(avVarU);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fg();
                }
                if (!avVar.d.q) {
                    pz.b("visitAncestors called on an unattached node");
                }
                d90 d90Var = avVar.d.h;
                t30 t30VarZ = d80.z(avVar);
                loop0: while (true) {
                    if (t30VarZ == null) {
                        d90VarI = null;
                        break;
                    }
                    if ((t30VarZ.G.f.g & 1024) != 0) {
                        while (d90Var != null) {
                            if ((d90Var.f & 1024) != 0) {
                                d90VarI = d90Var;
                                eb0 eb0Var = null;
                                while (d90VarI != null) {
                                    if (d90VarI instanceof av) {
                                        break loop0;
                                    }
                                    if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                        int i2 = 0;
                                        for (d90 d90Var2 = ((mn) d90VarI).s; d90Var2 != null; d90Var2 = d90Var2.i) {
                                            if ((d90Var2.f & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    d90VarI = d90Var2;
                                                } else {
                                                    if (eb0Var == null) {
                                                        eb0Var = new eb0(new d90[16]);
                                                    }
                                                    if (d90VarI != null) {
                                                        eb0Var.b(d90VarI);
                                                        d90VarI = null;
                                                    }
                                                    eb0Var.b(d90Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    d90VarI = d80.i(eb0Var);
                                }
                            }
                            d90Var = d90Var.h;
                        }
                    }
                    t30VarZ = t30VarZ.t();
                    d90Var = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
                }
                av avVar2 = (av) d90VarI;
                if (avVar2 == null) {
                    return jmVar;
                }
                int iOrdinal2 = avVar2.C0().ordinal();
                if (iOrdinal2 == 0) {
                    return O(avVar2);
                }
                if (iOrdinal2 == 1) {
                    return P(avVar2);
                }
                if (iOrdinal2 == 2) {
                    return jm.e;
                }
                if (iOrdinal2 != 3) {
                    throw new fg();
                }
                jm jmVarP = P(avVar2);
                jm jmVar2 = jmVarP != jmVar ? jmVarP : null;
                return jmVar2 == null ? O(avVar2) : jmVar2;
            }
        }
        return jmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fc A[ADDED_TO_REGION, LOOP:9: B:144:0x01fc->B:151:0x020c, LOOP_START, PHI: r12
  0x01fc: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:143:0x01fa, B:151:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0217  */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean Q(defpackage.av r18) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c10.Q(av):boolean");
    }

    public static final long R(nj0 nj0Var, boolean z) {
        long jF = ed0.f(nj0Var.c, nj0Var.g);
        if (z || !nj0Var.b()) {
            return jF;
        }
        return 0L;
    }

    public static final void S(ev0 ev0Var, f9 f9Var, int i2) {
        while (true) {
            int i3 = ev0Var.v;
            if (i2 > i3 && i2 < ev0Var.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            ev0Var.L();
            if (ev0Var.x(ev0Var.v)) {
                f9Var.q();
            }
            ev0Var.j();
        }
    }

    public static final ai T(ci ciVar) {
        ci ciVar2;
        ciVar.T(206, fi.e);
        if (ciVar.S) {
            ev0.y(ciVar.I);
        }
        Object objC = ciVar.C();
        zh zhVar = objC instanceof zh ? (zh) objC : null;
        if (zhVar == null) {
            ciVar2 = ciVar;
            zhVar = new zh(new ai(ciVar2, ciVar.T, ciVar.q, ciVar.C, ciVar.h.u));
            ciVar2.f0(zhVar);
        } else {
            ciVar2 = ciVar;
        }
        ai aiVar = zhVar.d;
        aiVar.f.setValue(ciVar2.l());
        ciVar2.p(false);
        return aiVar;
    }

    public static final long U(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    public static void V(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static n00 W(p00 p00Var) {
        p(p00Var, "<this>");
        return new n00(p00Var.d, p00Var.e, p00Var.f > 0 ? 2 : -2);
    }

    public static final void X(Object obj) throws Throwable {
        if (obj instanceof ym0) {
            throw ((ym0) obj).d;
        }
    }

    public static void Y(String str) {
        fg fgVar = new fg("lateinit property " + str + " has not been initialized");
        V(fgVar, c10.class.getName());
        throw fgVar;
    }

    public static String Z(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + c4.I(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + c4.I(Float.intBitsToFloat(i2)) + ", " + c4.I(Float.intBitsToFloat(i3)) + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r23, defpackage.e90 r24, defpackage.c21 r25, int r26, boolean r27, int r28, int r29, defpackage.ci r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c10.a(java.lang.String, e90, c21, int, boolean, int, int, ci, int, int):void");
    }

    public static p00 a0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new p00(i2, i3 - 1, 1);
        }
        p00 p00Var = p00.g;
        return p00.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.gw r30, defpackage.e90 r31, boolean r32, defpackage.ju0 r33, defpackage.kc r34, defpackage.nc r35, defpackage.jg0 r36, defpackage.zg r37, defpackage.ci r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c10.b(gw, e90, boolean, ju0, kc, nc, jg0, zg, ci, int, int):void");
    }

    public static final void b0(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            if (i2 > i3) {
                throw new IllegalArgumentException(b8.g("minLines ", i2, " must be less than or equal to maxLines ", i3).toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero").toString());
    }

    public static final long c(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final void c0(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i4);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of transformed text [0, ");
            throw new IllegalStateException(b8.h(sb, i3, ']').toString());
        }
    }

    public static final a6 d() {
        return new a6(new Paint(7));
    }

    public static final void d0(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i4);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of original text [0, ");
            throw new IllegalStateException(b8.h(sb, i3, ']').toString());
        }
    }

    public static final void e(gw gwVar, e90 e90Var, boolean z, ju0 ju0Var, kc kcVar, jg0 jg0Var, ci ciVar, int i2) {
        kc kcVar2;
        boolean z2;
        jg0 jg0Var2;
        e90 e90Var2;
        kc kcVar3;
        ju0 ju0Var2;
        e90 e90Var3;
        boolean z3;
        ju0 ju0Var3;
        kc kcVar4;
        jg0 jg0Var3;
        zg zgVar = fh.c;
        ciVar.W(-2106428362);
        if (((i2 | 115025328) & 306783379) == 306783378 && ciVar.z()) {
            ciVar.Q();
            e90Var3 = e90Var;
            z3 = z;
            ju0Var3 = ju0Var;
            kcVar4 = kcVar;
            jg0Var3 = jg0Var;
        } else {
            ciVar.S();
            if ((i2 & 1) == 0 || ciVar.x()) {
                jg0 jg0Var4 = lc.a;
                ju0 ju0VarA = nu0.a(5, ciVar);
                kf kfVar = (kf) ciVar.j(lf.a);
                kc kcVar5 = kfVar.L;
                if (kcVar5 == null) {
                    long j2 = bf.f;
                    kcVar2 = new kc(j2, lf.d(kfVar, 26), j2, bf.b(lf.d(kfVar, 18), 0.38f));
                    kfVar.L = kcVar2;
                } else {
                    kcVar2 = kcVar5;
                }
                z2 = true;
                jg0Var2 = lc.b;
                e90Var2 = b90.a;
                kcVar3 = kcVar2;
                ju0Var2 = ju0VarA;
            } else {
                ciVar.Q();
                e90Var2 = e90Var;
                z2 = z;
                ju0Var2 = ju0Var;
                kcVar3 = kcVar;
                jg0Var2 = jg0Var;
            }
            ciVar.q();
            b(gwVar, e90Var2, z2, ju0Var2, kcVar3, null, jg0Var2, zgVar, ciVar, 920322486, 0);
            e90Var3 = e90Var2;
            z3 = z2;
            ju0Var3 = ju0Var2;
            kcVar4 = kcVar3;
            jg0Var3 = jg0Var2;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new pc(gwVar, e90Var3, z3, ju0Var3, kcVar4, jg0Var3, i2);
        }
    }

    public static final float f(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final void g(z0 z0Var, gt0 gt0Var) {
        ct0 ct0Var = gt0Var.d;
        ta0 ta0Var = ct0Var.d;
        Object objG = ct0Var.d.g(lt0.x);
        if (objG == null) {
            objG = null;
        }
        zn0 zn0Var = (zn0) objG;
        if (m20.h(gt0Var)) {
            if (zn0Var != null && zn0Var.a == 8) {
                return;
            }
            Object objG2 = ta0Var.g(bt0.w);
            if (objG2 == null) {
                objG2 = null;
            }
            j0 j0Var = (j0) objG2;
            if (j0Var != null) {
                z0Var.a(new v0(null, R.id.accessibilityActionPageUp, j0Var.a, null));
            }
            Object objG3 = ta0Var.g(bt0.y);
            if (objG3 == null) {
                objG3 = null;
            }
            j0 j0Var2 = (j0) objG3;
            if (j0Var2 != null) {
                z0Var.a(new v0(null, R.id.accessibilityActionPageDown, j0Var2.a, null));
            }
            Object objG4 = ta0Var.g(bt0.x);
            if (objG4 == null) {
                objG4 = null;
            }
            j0 j0Var3 = (j0) objG4;
            if (j0Var3 != null) {
                z0Var.a(new v0(null, R.id.accessibilityActionPageLeft, j0Var3.a, null));
            }
            Object objG5 = ta0Var.g(bt0.z);
            if (objG5 == null) {
                objG5 = null;
            }
            j0 j0Var4 = (j0) objG5;
            if (j0Var4 != null) {
                z0Var.a(new v0(null, R.id.accessibilityActionPageRight, j0Var4.a, null));
            }
        }
    }

    public static void h(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p(th, "<this>");
        p(th2, "exception");
        if (th != th2) {
            Integer num = p10.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = si0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static boolean i(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final boolean j(nj0 nj0Var) {
        return !nj0Var.h && nj0Var.d;
    }

    public static final boolean k(nj0 nj0Var) {
        return (nj0Var.b() || !nj0Var.h || nj0Var.d) ? false : true;
    }

    public static final boolean l(nj0 nj0Var) {
        return nj0Var.h && !nj0Var.d;
    }

    public static void m(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        V(nullPointerException, c10.class.getName());
        throw nullPointerException;
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        V(nullPointerException, c10.class.getName());
        throw nullPointerException;
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        V(nullPointerException, c10.class.getName());
        throw nullPointerException;
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = c10.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            V(nullPointerException, c10.class.getName());
            throw nullPointerException;
        }
    }

    public static final boolean q(av avVar, boolean z) {
        int iOrdinal = avVar.C0().ordinal();
        yu yuVar = yu.g;
        if (iOrdinal == 0) {
            ((qu) ((p3) d80.A(avVar)).getFocusOwner()).g(null);
            avVar.A0(yu.d, yuVar);
            return true;
        }
        if (iOrdinal == 1) {
            av avVarU = m20.u(avVar);
            if (!(avVarU != null ? q(avVarU, z) : true)) {
                return false;
            }
            avVar.A0(yu.e, yuVar);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new fg();
        }
        if (z) {
            ((qu) ((p3) d80.A(avVar)).getFocusOwner()).g(null);
            avVar.A0(yu.f, yuVar);
        }
        return z;
    }

    public static final e90 r(e90 e90Var, ju0 ju0Var) {
        return a.b(e90Var, 0.0f, ju0Var, 518143);
    }

    public static double s(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float t(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int u(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static long v(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    public static int w(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int x(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static tv y(Context context) {
        ProviderInfo providerInfo;
        rv rvVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        r31.q(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            rvVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                rvVar = new rv(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (rvVar == null) {
            return null;
        }
        return new tv(new sv(context, rvVar));
    }

    public static final ym0 z(Throwable th) {
        p(th, "exception");
        return new ym0(th);
    }
}
