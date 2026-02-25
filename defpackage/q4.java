package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q4 implements cn, View.OnAttachStateChangeListener {
    public final p3 d;
    public final f3 e;
    public xz f;
    public final ArrayList g = new ArrayList();
    public final long h = 100;
    public n4 i = n4.d;
    public boolean j = true;
    public final gc k = nm.a(1, 6, null);
    public final Handler l = new Handler(Looper.getMainLooper());
    public da0 m;
    public long n;
    public final da0 o;
    public ht0 p;
    public boolean q;
    public final b3 r;

    public q4(p3 p3Var, f3 f3Var) {
        this.d = p3Var;
        this.e = f3Var;
        da0 da0Var = l00.a;
        c10.n(da0Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.m = da0Var;
        this.o = new da0();
        gt0 gt0VarA = p3Var.getSemanticsOwner().a();
        c10.n(da0Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.p = new ht0(gt0VarA, da0Var);
        this.r = new b3(3, this);
    }

    @Override // defpackage.cn
    public final void a(f50 f50Var) {
        l(this.d.getSemanticsOwner().a());
        i();
        this.f = null;
    }

    @Override // defpackage.cn
    public final void b(f50 f50Var) {
        this.f = (xz) this.e.a();
        k(-1, this.d.getSemanticsOwner().a());
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.mk r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.p4
            if (r0 == 0) goto L13
            r0 = r8
            p4 r0 = (defpackage.p4) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            p4 r0 = new p4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.j
            r2 = 2
            r3 = 1
            xl r4 = defpackage.xl.d
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            fc r1 = r0.g
            defpackage.c10.X(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            fc r1 = r0.g
            defpackage.c10.X(r8)
            goto L52
        L3a:
            defpackage.c10.X(r8)
            gc r8 = r7.k
            r8.getClass()
            fc r1 = new fc
            r1.<init>(r8)
        L47:
            r0.g = r1
            r0.j = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r1.c()
            boolean r8 = r7.h()
            if (r8 == 0) goto L66
            r7.i()
        L66:
            boolean r8 = r7.q
            if (r8 != 0) goto L73
            r7.q = r3
            android.os.Handler r8 = r7.l
            b3 r5 = r7.r
            r8.post(r5)
        L73:
            r0.g = r1
            r0.j = r2
            long r5 = r7.h
            java.lang.Object r8 = defpackage.m20.p(r5, r0)
            if (r8 != r4) goto L47
        L7f:
            return r4
        L80:
            j41 r7 = defpackage.j41.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.e(mk):java.lang.Object");
    }

    public final void f(k00 k00Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long[] jArr3;
        ht0 ht0Var;
        int i3;
        long[] jArr4;
        ht0 ht0Var2;
        String str;
        long j3;
        String str2;
        int i4;
        k00 k00Var2 = k00Var;
        int[] iArr3 = k00Var2.b;
        long[] jArr5 = k00Var2.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j4 = jArr5[i5];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j4 & 255) < 128) {
                        int i9 = iArr3[(i5 << 3) + i8];
                        c = c2;
                        ht0 ht0Var3 = (ht0) this.o.b(i9);
                        it0 it0Var = (it0) k00Var2.b(i9);
                        gt0 gt0Var = it0Var != null ? it0Var.a : null;
                        if (gt0Var == null) {
                            throw b8.f("no value for specified key");
                        }
                        j2 = j5;
                        int i10 = gt0Var.g;
                        ta0 ta0Var = gt0Var.d.d;
                        String str3 = "Invalid content capture ID";
                        if (ht0Var3 == null) {
                            Object[] objArr = ta0Var.b;
                            long[] jArr6 = ta0Var.a;
                            int i11 = i6;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j6 = jArr6[i12];
                                    j = j4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j6 & 255) < 128) {
                                                j3 = j6;
                                                ot0 ot0Var = (ot0) objArr[(i12 << 3) + i14];
                                                ot0 ot0Var2 = lt0.A;
                                                if (c10.i(ot0Var, ot0Var2)) {
                                                    Object objG = ta0Var.g(ot0Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    String strValueOf = String.valueOf(list != null ? (q8) ue.T(list) : null);
                                                    xz xzVar = this.f;
                                                    if (xzVar != null) {
                                                        str2 = str3;
                                                        i4 = i8;
                                                        AutofillId autofillIdP = xzVar.p(i10);
                                                        if (autofillIdP == null) {
                                                            throw b8.f(str2);
                                                        }
                                                        ((ContentCaptureSession) xzVar.f).notifyViewTextChanged(autofillIdP, strValueOf);
                                                    }
                                                }
                                                j6 = j3 >> i11;
                                                i14++;
                                                i8 = i4;
                                                str3 = str2;
                                            } else {
                                                j3 = j6;
                                            }
                                            str2 = str3;
                                            i4 = i8;
                                            j6 = j3 >> i11;
                                            i14++;
                                            i8 = i4;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i = i8;
                                        if (i13 != i11) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i = i8;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    j4 = j;
                                    i8 = i;
                                    str3 = str;
                                    i11 = 8;
                                }
                            } else {
                                j = j4;
                                i = i8;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j = j4;
                            i = i8;
                            Object[] objArr2 = ta0Var.b;
                            long[] jArr7 = ta0Var.a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j7 = jArr7[i15];
                                    Object[] objArr3 = objArr2;
                                    long[] jArr8 = jArr7;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j7 & 255) < 128) {
                                                ot0 ot0Var3 = (ot0) objArr3[(i15 << 3) + i17];
                                                i3 = i17;
                                                ot0 ot0Var4 = lt0.A;
                                                if (c10.i(ot0Var3, ot0Var4)) {
                                                    Object objG2 = ht0Var3.a.d.g(ot0Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    q8 q8Var = list2 != null ? (q8) ue.T(list2) : null;
                                                    Object objG3 = ta0Var.g(ot0Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    q8 q8Var2 = list3 != null ? (q8) ue.T(list3) : null;
                                                    if (!c10.i(q8Var, q8Var2)) {
                                                        String strValueOf2 = String.valueOf(q8Var2);
                                                        xz xzVar2 = this.f;
                                                        if (xzVar2 != null) {
                                                            jArr4 = jArr8;
                                                            ht0Var2 = ht0Var3;
                                                            AutofillId autofillIdP2 = xzVar2.p(i10);
                                                            if (autofillIdP2 == null) {
                                                                throw b8.f("Invalid content capture ID");
                                                            }
                                                            ((ContentCaptureSession) xzVar2.f).notifyViewTextChanged(autofillIdP2, strValueOf2);
                                                        }
                                                    }
                                                }
                                                j7 >>= 8;
                                                i17 = i3 + 1;
                                                ht0Var3 = ht0Var2;
                                                jArr8 = jArr4;
                                            } else {
                                                i3 = i17;
                                            }
                                            jArr4 = jArr8;
                                            ht0Var2 = ht0Var3;
                                            j7 >>= 8;
                                            i17 = i3 + 1;
                                            ht0Var3 = ht0Var2;
                                            jArr8 = jArr4;
                                        }
                                        jArr3 = jArr8;
                                        ht0Var = ht0Var3;
                                        if (i16 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr8;
                                        ht0Var = ht0Var3;
                                    }
                                    if (i15 == length3) {
                                        break;
                                    }
                                    i15++;
                                    objArr2 = objArr3;
                                    ht0Var3 = ht0Var;
                                    jArr7 = jArr3;
                                }
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i8;
                        i2 = i6;
                    }
                    j4 = j >> i2;
                    i8 = i + 1;
                    k00Var2 = k00Var;
                    i6 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr5;
                if (i7 != i6) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            k00Var2 = k00Var;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    public final k00 g() {
        if (this.j) {
            this.j = false;
            this.m = l81.E(this.d.getSemanticsOwner());
            this.n = System.currentTimeMillis();
        }
        return this.m;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final void i() {
        xz xzVar = this.f;
        if (xzVar == null) {
            return;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) xzVar.f;
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kj kjVar = (kj) arrayList.get(i);
            int iOrdinal = kjVar.c.ordinal();
            if (iOrdinal == 0) {
                k51 k51Var = kjVar.d;
                if (k51Var != null) {
                    contentCaptureSession.notifyViewAppeared((ViewStructure) k51Var.a);
                }
            } else {
                if (iOrdinal != 1) {
                    throw new fg();
                }
                AutofillId autofillIdP = xzVar.p(kjVar.a);
                if (autofillIdP != null) {
                    contentCaptureSession.notifyViewDisappeared(autofillIdP);
                }
            }
        }
        contentCaptureSession.notifyViewsDisappeared(((View) xzVar.e).getAutofillId(), new long[]{Long.MIN_VALUE});
        arrayList.clear();
    }

    public final void j(gt0 gt0Var, ht0 ht0Var) {
        h4 h4Var = new h4(1, ht0Var, this);
        gt0Var.getClass();
        List listJ = gt0.j(4, gt0Var);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (g().a(((gt0) obj).g)) {
                h4Var.e(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listJ2 = gt0.j(4, gt0Var);
        int size2 = listJ2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            gt0 gt0Var2 = (gt0) listJ2.get(i3);
            k00 k00VarG = g();
            int i4 = gt0Var2.g;
            if (k00VarG.a(i4)) {
                da0 da0Var = this.o;
                if (da0Var.a(i4)) {
                    Object objB = da0Var.b(i4);
                    if (objB == null) {
                        throw b8.f("node not present in pruned tree before this change");
                    }
                    j(gt0Var2, (ht0) objB);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r19, defpackage.gt0 r20) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.k(int, gt0):void");
    }

    public final void l(gt0 gt0Var) {
        if (h()) {
            this.g.add(new kj(gt0Var.g, this.n, lj.e, null));
            List listJ = gt0.j(4, gt0Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                l((gt0) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r17 = this;
            r0 = r17
            da0 r1 = r0.o
            r1.c()
            k00 r2 = r0.g()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            it0 r13 = (defpackage.it0) r13
            ht0 r15 = new ht0
            gt0 r13 = r13.a
            k00 r6 = r0.g()
            r15.<init>(r13, r6)
            r1.g(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            ht0 r1 = new ht0
            p3 r2 = r0.d
            jt0 r2 = r2.getSemanticsOwner()
            gt0 r2 = r2.a()
            k00 r3 = r0.g()
            r1.<init>(r2, r3)
            r0.p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.m():void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l.removeCallbacks(this.r);
        this.f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
