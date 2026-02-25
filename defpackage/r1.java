package defpackage;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r1 implements sr, nk0, vt, p90, l8 {
    public static final r1 f = new r1(0, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public final /* synthetic */ int d;
    public Object e;

    public /* synthetic */ r1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.sr
    public void a(final c4 c4Var) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new xi("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: vr
            @Override // java.lang.Runnable
            public final void run() {
                r1 r1Var = this.d;
                c4 c4Var2 = c4Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    tv tvVarY = c10.y((Context) r1Var.e);
                    if (tvVarY == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    sv svVar = (sv) tvVarY.a;
                    synchronized (svVar.g) {
                        svVar.i = threadPoolExecutor2;
                    }
                    tvVarY.a.a(new wr(c4Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    c4Var2.B(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [jy0, kw] */
    @Override // defpackage.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.wt r5, defpackage.lk r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.n
            if (r0 == 0) goto L13
            r0 = r6
            n r0 = (defpackage.n) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            n r0 = new n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.h
            int r1 = r0.j
            j41 r2 = defpackage.j41.a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            ro0 r4 = r0.g
            defpackage.c10.X(r6)     // Catch: java.lang.Throwable -> L29
            goto L56
        L29:
            r5 = move-exception
            goto L60
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.c10.X(r6)
            ro0 r6 = new ro0
            ml r1 = r0.e
            defpackage.c10.m(r1)
            r6.<init>(r5, r1)
            r0.g = r6     // Catch: java.lang.Throwable -> L5e
            r0.j = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L5a
            jy0 r4 = (defpackage.jy0) r4     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = r4.e(r6, r0)     // Catch: java.lang.Throwable -> L5a
            xl r5 = defpackage.xl.d
            if (r4 != r5) goto L51
            goto L52
        L51:
            r4 = r2
        L52:
            if (r4 != r5) goto L55
            return r5
        L55:
            r4 = r6
        L56:
            r4.p()
            return r2
        L5a:
            r4 = move-exception
            r5 = r4
        L5c:
            r4 = r6
            goto L60
        L5e:
            r5 = move-exception
            goto L5c
        L60:
            r4.p()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.b(wt, lk):java.lang.Object");
    }

    @Override // defpackage.p90
    public boolean d(long j, tr0 tr0Var) {
        r40 r40Var;
        u01 u01Var = (u01) this.e;
        if (!u01Var.h() || u01Var.j().a.e.length() == 0 || (r40Var = u01Var.d) == null || r40Var.d() == null) {
            return false;
        }
        vu vuVar = u01Var.i;
        int i = 1;
        if (vuVar != null) {
            vuVar.a(new uu(i));
        }
        u01Var.l = j;
        u01Var.q = -1;
        u01Var.f(true);
        t(u01Var.j(), u01Var.l, true, tr0Var);
        return true;
    }

    @Override // defpackage.p90
    public boolean f(long j, tr0 tr0Var) {
        r40 r40Var;
        u01 u01Var = (u01) this.e;
        if (!u01Var.h() || u01Var.j().a.e.length() == 0 || (r40Var = u01Var.d) == null || r40Var.d() == null) {
            return false;
        }
        t(u01Var.j(), j, false, tr0Var);
        return true;
    }

    @Override // defpackage.nk0
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.l8
    public rt get(int i) {
        switch (this.d) {
            case 28:
                return (st) this.e;
            default:
                return (rt) this.e;
        }
    }

    @Override // defpackage.nk0
    public void h(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.e).setResultCode(i);
    }

    public void i(t30 t30Var) {
        if (!t30Var.H()) {
            pz.b("DepthSortedSet.add called on an unattached node");
        }
        ((gw0) this.e).add(t30Var);
    }

    public void j(CancellationException cancellationException) {
        eb0 eb0Var = (eb0) this.e;
        int i = eb0Var.f;
        yc[] ycVarArr = new yc[i];
        for (int i2 = 0; i2 < i; i2++) {
            ycVarArr[i2] = ((nj) eb0Var.d[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            ycVarArr[i3].m(cancellationException);
        }
        if (eb0Var.f != 0) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void k() {
        ((hi) this.e).getClass();
    }

    public ww0 l() {
        tr trVarA = tr.a();
        if (trVarA.c() == 1) {
            return new yy(true);
        }
        zg0 zg0VarN = qo0.n(Boolean.FALSE);
        zm zmVar = new zm(zg0VarN, this);
        trVarA.a.writeLock().lock();
        try {
            if (trVarA.c == 1 || trVarA.c == 2) {
                trVarA.d.post(new rr(Arrays.asList(zmVar), trVarA.c, null));
            } else {
                trVarA.b.add(zmVar);
            }
            trVarA.a.writeLock().unlock();
            return zg0VarN;
        } catch (Throwable th) {
            trVarA.a.writeLock().unlock();
            throw th;
        }
    }

    public void m(float f2, float f3, float f4, float f5) {
        e9 e9Var = (e9) this.e;
        dd ddVarO = e9Var.o();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e9Var.s() >> 32)) - (f4 + f2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (e9Var.s() & 4294967295L)) - (f5 + f3)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            sz.a("Width and height must be greater than or equal to zero");
        }
        e9Var.C(jFloatToRawIntBits);
        ddVarO.f(f2, f3);
    }

    public void n(View view, int i, boolean z) {
        ((AutofillManager) this.e).notifyViewVisibilityChanged(view, i, z);
    }

    public xz o(xz xzVar, p3 p3Var) {
        Object obj;
        int i;
        long jC;
        long j;
        boolean z;
        Object obj2 = l81.c;
        r60 r60Var = (r60) this.e;
        List list = (List) xzVar.e;
        r60 r60Var2 = new r60(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            pj0 pj0Var = (pj0) list.get(i2);
            long j2 = pj0Var.a;
            int iK = nm.k(r60Var.e, r60Var.g, j2);
            if (iK < 0 || (obj = r60Var.f[iK]) == obj2) {
                obj = null;
            }
            oj0 oj0Var = (oj0) obj;
            if (oj0Var == null) {
                i = i2;
                j = pj0Var.b;
                jC = pj0Var.d;
                z = false;
            } else {
                long j3 = oj0Var.a;
                boolean z2 = oj0Var.c;
                i = i2;
                jC = p3Var.C(oj0Var.b);
                j = j3;
                z = z2;
            }
            long j4 = pj0Var.a;
            List list2 = list;
            int i3 = size;
            r60Var2.b(j4, new nj0(j4, pj0Var.b, pj0Var.d, pj0Var.e, pj0Var.f, j, jC, z, pj0Var.g, pj0Var.i, pj0Var.j, pj0Var.k));
            boolean z3 = pj0Var.e;
            if (z3) {
                r60Var.b(j2, new oj0(pj0Var.b, pj0Var.c, z3));
            } else {
                int iK2 = nm.k(r60Var.e, r60Var.g, j2);
                if (iK2 >= 0) {
                    Object[] objArr = r60Var.f;
                    if (objArr[iK2] != obj2) {
                        objArr[iK2] = obj2;
                        r60Var.d = true;
                    }
                }
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new xz(9, r60Var2, xzVar);
    }

    public boolean p(t30 t30Var) {
        if (!t30Var.H()) {
            pz.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((gw0) this.e).remove(t30Var);
    }

    public void q() {
        eb0 eb0Var = (eb0) this.e;
        int i = 0;
        int i2 = new p00(0, eb0Var.f - 1, 1).e;
        if (i2 >= 0) {
            while (true) {
                ((nj) eb0Var.d[i]).b.h(j41.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eb0Var.g();
    }

    public void r(float f2, float f3, long j) {
        dd ddVarO = ((e9) this.e).o();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ddVarO.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ddVarO.b(f2, f3);
        ddVarO.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void s(float f2, float f3) {
        ((e9) this.e).o().f(f2, f3);
    }

    public void t(a11 a11Var, long j, boolean z, tr0 tr0Var) {
        u01 u01Var = (u01) this.e;
        u01Var.n(w11.b(u01.a(u01Var, a11Var, j, z, false, tr0Var, false)) ? px.f : px.e);
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return "Bradford";
            case 8:
                return ((gw0) this.e).toString();
            default:
                return super.toString();
        }
    }

    public r1(xn xnVar) {
        this.d = 25;
        this.e = new ot(mw0.a, xnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r10
  0x0029: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r1(int[] r21, float[] r22, float[][] r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = 1
            r0.d = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            g9[][] r4 = new defpackage.g9[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L13:
            if (r6 >= r2) goto L6c
            r9 = r21[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L29
            if (r9 == r3) goto L32
            if (r9 == r11) goto L30
            if (r9 == r10) goto L2b
            r10 = 4
            if (r9 == r10) goto L29
            r10 = 5
            if (r9 == r10) goto L29
            r13 = r8
            goto L34
        L29:
            r13 = r10
            goto L34
        L2b:
            if (r7 != r3) goto L32
            goto L30
        L2e:
            r13 = r7
            goto L34
        L30:
            r7 = r11
            goto L2e
        L32:
            r7 = r3
            goto L2e
        L34:
            r8 = r23[r6]
            int r9 = r8.length
            int r9 = r9 / r11
            int r8 = r8.length
            int r8 = r8 % r11
            int r8 = r8 + r9
            g9[] r9 = new defpackage.g9[r8]
            r10 = r5
        L3e:
            if (r10 >= r8) goto L66
            int r11 = r10 * 2
            g9 r12 = new g9
            r14 = r1[r6]
            int r15 = r6 + 1
            r16 = r15
            r15 = r1[r16]
            r17 = r23[r6]
            r18 = r16
            r16 = r17[r11]
            int r19 = r11 + 1
            r17 = r17[r19]
            r18 = r23[r18]
            r11 = r18[r11]
            r19 = r18[r19]
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r10] = r12
            int r10 = r10 + 1
            goto L3e
        L66:
            r4[r6] = r9
            int r6 = r6 + 1
            r8 = r13
            goto L13
        L6c:
            r0.e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.<init>(int[], float[], float[][]):void");
    }

    public r1(int i) {
        this.d = i;
        switch (i) {
            case 4:
                this.e = new t2();
                break;
            case 7:
                break;
            case 8:
                this.e = new gw0(c10.c);
                break;
            case 13:
                this.e = new LinkedHashMap(0, 0.75f, true);
                break;
            case 15:
                this.e = new kc0(4);
                break;
            case 17:
                this.e = new r60(10);
                break;
            case 21:
                this.e = qo0.n(Boolean.FALSE);
                break;
            case 22:
                this.e = new Region();
                break;
            default:
                this.e = new eb0(new nj[16]);
                break;
        }
    }

    public r1(View view) {
        this.d = 24;
        ew0 ew0Var = new ew0(view);
        ew0Var.b = view;
        this.e = ew0Var;
    }

    public r1(long[] jArr) {
        ha0 ha0Var;
        this.d = 23;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            ha0Var = new ha0(jArrCopyOf.length);
            int i = ha0Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = ha0Var.a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        c10.o(jArrCopyOf2, "copyOf(...)");
                        ha0Var.a = jArrCopyOf2;
                    }
                    long[] jArr3 = ha0Var.a;
                    int i2 = ha0Var.b;
                    if (i != i2) {
                        y9.q0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    y9.q0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    ha0Var.b += jArrCopyOf.length;
                }
            } else {
                qo0.s("");
                throw null;
            }
        } else {
            ha0Var = new ha0(16);
        }
        this.e = ha0Var;
    }

    public r1(Context context) {
        this.d = 10;
        this.e = context.getApplicationContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r1(kw kwVar) {
        this.d = 20;
        this.e = (jy0) kwVar;
    }

    public r1(float f2, float f3) {
        this.d = 28;
        this.e = new st(f2, f3, 0.01f);
    }

    @Override // defpackage.p90
    public void c() {
    }
}
