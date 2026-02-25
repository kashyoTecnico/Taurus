package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class l81 {
    public static final Object a = new Object();
    public static final bp b = new bp();
    public static final Object c = new Object();
    public static final byte[] d = {112, 114, 111, 0};
    public static final byte[] e = {112, 114, 109, 0};
    public static final xl0 f = new xl0(0.0f, 0.0f, 10.0f, 10.0f);
    public static final kc0 g = new kc0(19);

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A(pi piVar, dl0 dl0Var) {
        if (!((d90) piVar).d.q) {
            pz.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        vh0 vh0Var = (vh0) d80.z(piVar).C;
        vh0Var.getClass();
        return nm.A(vh0Var, dl0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r1.i(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0052, B:28:0x0067, B:30:0x006f, B:20:0x0047, B:23:0x004e), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [ll0] */
    /* JADX WARN: Type inference failed for: r8v7, types: [ll0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0081 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.wt r7, defpackage.kk0 r8, boolean r9, defpackage.mk r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.xt
            if (r0 == 0) goto L13
            r0 = r10
            xt r0 = (defpackage.xt) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            xt r0 = new xt
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.k
            int r1 = r0.l
            r2 = 0
            r3 = 2
            r4 = 1
            xl r5 = defpackage.xl.d
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.j
            fc r7 = r0.i
            ll0 r8 = r0.h
            wt r1 = r0.g
            defpackage.c10.X(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L52
        L35:
            r7 = move-exception
            goto L8c
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.j
            fc r7 = r0.i
            ll0 r8 = r0.h
            wt r1 = r0.g
            defpackage.c10.X(r10)     // Catch: java.lang.Throwable -> L35
            goto L67
        L4b:
            defpackage.c10.X(r10)
            fc r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L52:
            r0.g = r7     // Catch: java.lang.Throwable -> L35
            r0.h = r8     // Catch: java.lang.Throwable -> L35
            r0.i = r10     // Catch: java.lang.Throwable -> L35
            r0.j = r9     // Catch: java.lang.Throwable -> L35
            r0.l = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L63
            goto L83
        L63:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L84
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.g = r1     // Catch: java.lang.Throwable -> L35
            r0.h = r8     // Catch: java.lang.Throwable -> L35
            r0.i = r7     // Catch: java.lang.Throwable -> L35
            r0.j = r9     // Catch: java.lang.Throwable -> L35
            r0.l = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.i(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L83:
            return r5
        L84:
            if (r9 == 0) goto L89
            r8.a(r2)
        L89:
            j41 r7 = defpackage.j41.a
            return r7
        L8c:
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            if (r9 == 0) goto La6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L97
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L97:
            if (r2 != 0) goto La3
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La3:
            r8.a(r2)
        La6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l81.B(wt, kk0, boolean, mk):java.lang.Object");
    }

    public static final d30 C(d30 d30Var) {
        d30 d30Var2;
        d30 d30VarM = d30Var.m();
        while (true) {
            d30 d30Var3 = d30VarM;
            d30Var2 = d30Var;
            d30Var = d30Var3;
            if (d30Var == null) {
                break;
            }
            d30VarM = d30Var.m();
        }
        nc0 nc0Var = d30Var2 instanceof nc0 ? (nc0) d30Var2 : null;
        if (nc0Var == null) {
            return d30Var2;
        }
        nc0 nc0Var2 = nc0Var.t;
        while (true) {
            nc0 nc0Var3 = nc0Var2;
            nc0 nc0Var4 = nc0Var;
            nc0Var = nc0Var3;
            if (nc0Var == null) {
                return nc0Var4;
            }
            nc0Var2 = nc0Var.t;
        }
    }

    public static String D(String str, String str2, byte[] bArr) {
        byte[] bArr2 = c4.j;
        byte[] bArr3 = c4.k;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static final da0 E(jt0 jt0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            gt0 gt0VarA = jt0Var.a();
            t30 t30Var = gt0VarA.c;
            if (t30Var.I() && t30Var.H()) {
                da0 da0Var = new da0(48);
                r1 r1Var = new r1(22);
                q00 q00VarL = m20.L(gt0VarA.g());
                ((Region) r1Var.e).set(q00VarL.a, q00VarL.b, q00VarL.c, q00VarL.d);
                F(r1Var, gt0VarA, da0Var, gt0VarA, new r1(22));
                return da0Var;
            }
            da0 da0Var2 = l00.a;
            c10.n(da0Var2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return da0Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void F(r1 r1Var, gt0 gt0Var, da0 da0Var, gt0 gt0Var2, r1 r1Var2) {
        xl0 xl0VarK1;
        t30 t30Var;
        int i = gt0Var.g;
        Region region = (Region) r1Var2.e;
        t30 t30Var2 = gt0Var2.c;
        int i2 = gt0Var2.g;
        boolean z = (t30Var2.I() && t30Var2.H()) ? false : true;
        Region region2 = (Region) r1Var.e;
        if (!region2.isEmpty() || i2 == i) {
            if (!z || gt0Var2.e) {
                ln lnVarF = gt0Var2.f();
                if (lnVarF == null) {
                    xl0VarK1 = t30Var2.G.c.k1();
                } else {
                    d90 d90Var = ((d90) lnVarF).d;
                    Object objG = gt0Var2.d.d.g(bt0.b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z2 = objG != null;
                    if (!d90Var.d.q) {
                        xl0VarK1 = xl0.e;
                    } else if (z2) {
                        xl0VarK1 = d80.x(d90Var, 8).k1();
                    } else {
                        nc0 nc0VarX = d80.x(d90Var, 8);
                        xl0VarK1 = C(nc0VarX).P(nc0VarX, true);
                    }
                }
                q00 q00VarL = m20.L(xl0VarK1);
                region.set(q00VarL.a, q00VarL.b, q00VarL.c, q00VarL.d);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (gt0Var2.e) {
                        gt0 gt0VarL = gt0Var2.l();
                        da0Var.g(i2, new it0(gt0Var2, m20.L((gt0VarL == null || (t30Var = gt0VarL.c) == null || !t30Var.I()) ? f : gt0VarL.g())));
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            da0Var.g(i2, new it0(gt0Var2, new q00(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                da0Var.g(i2, new it0(gt0Var2, new q00(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = gt0.j(4, gt0Var2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((gt0) listJ.get(size)).k().d.c(lt0.z)) {
                        F(r1Var, gt0Var, da0Var, (gt0) listJ.get(size), r1Var2);
                    }
                }
                if (M(gt0Var2)) {
                    region2.op(q00VarL.a, q00VarL.b, q00VarL.c, q00VarL.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Rect G(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    o oVarZ = c4.z(metricAffectingSpanArr);
                    while (oVarZ.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) oVarZ.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    public static final void H(ml mlVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = rl.a.iterator();
        while (it.hasNext()) {
            try {
                ((ql) it.next()).p(mlVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    c10.h(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            c10.h(th, new ko(mlVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final float[] I(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final boolean J(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean K(gt0 gt0Var) {
        nc0 nc0VarD = gt0Var.d();
        ct0 ct0Var = gt0Var.d;
        if (nc0VarD != null ? nc0VarD.W0() : false) {
            return true;
        }
        ot0 ot0Var = lt0.a;
        if (ct0Var.d.c(lt0.p)) {
            return true;
        }
        return ct0Var.d.c(lt0.o);
    }

    public static final boolean L(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean M(defpackage.gt0 r14) {
        /*
            boolean r0 = K(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            ct0 r14 = r14.d
            boolean r0 = r14.f
            if (r0 != 0) goto L59
            ta0 r14 = r14.d
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            ot0 r11 = (defpackage.ot0) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l81.M(gt0):boolean");
    }

    public static m80 N(io0 io0Var, int i, int i2, int i3, int i4, int i5, n80 n80Var, List list, oi0[] oi0VarArr, int i6) throws Throwable {
        int[] iArr;
        float f2;
        String str;
        long j;
        int i7;
        int i8;
        int iU;
        int i9;
        String str2;
        int i10;
        int i11;
        int i12;
        float f3;
        boolean z;
        float f4;
        int i13;
        int i14;
        List list2 = list;
        int i15 = i6;
        long j2 = i5;
        int[] iArr2 = new int[i15];
        float f5 = 0.0f;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int iMin = 0;
        int iMax = 0;
        while (i16 < i15) {
            g80 g80Var = (g80) list2.get(i16);
            float fG = r31.G(r31.F(g80Var));
            if (fG > 0.0f) {
                f5 += fG;
                i17++;
                i13 = i16;
            } else {
                int i19 = i3 - i18;
                oi0 oi0VarE = oi0VarArr[i16];
                if (oi0VarE == null) {
                    i13 = i16;
                    f4 = f5;
                    i14 = i19;
                    oi0VarE = g80Var.e(io0Var.e(0, i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i19 < 0 ? 0 : i19, i4, false));
                } else {
                    f4 = f5;
                    i13 = i16;
                    i14 = i19;
                }
                oi0 oi0Var = oi0VarE;
                int i20 = io0Var.i(oi0Var);
                int iF = io0Var.f(oi0Var);
                iArr2[i13] = i20;
                int i21 = i14 - i20;
                if (i21 < 0) {
                    i21 = 0;
                }
                iMin = Math.min(i5, i21);
                i18 += i20 + iMin;
                iMax = Math.max(iMax, iF);
                oi0VarArr[i13] = oi0Var;
                f5 = f4;
            }
            i16 = i13 + 1;
        }
        float f6 = f5;
        int i22 = iMax;
        if (i17 != 0) {
            int i23 = i3 != Integer.MAX_VALUE ? i3 : i;
            long j3 = (i17 - 1) * j2;
            iArr = iArr2;
            long j4 = (i23 - i18) - j3;
            if (j4 < 0) {
                j4 = 0;
            }
            float f7 = j4 / f6;
            long jRound = j4;
            int i24 = 0;
            while (true) {
                f2 = f7;
                str = "fixedSpace ";
                j = j4;
                if (i24 >= i15) {
                    break;
                }
                int i25 = i24;
                float fG2 = r31.G(r31.F((g80) list2.get(i24)));
                float f8 = f2 * fG2;
                try {
                    jRound -= Math.round(f8);
                    i24 = i25 + 1;
                    list2 = list;
                    f7 = f2;
                    j4 = j;
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i3 + "mainAxisMin " + i + "targetSpace " + i23 + "arrangementSpacingPx " + j2 + "weightChildrenCount " + i17 + "fixedSpace " + i18 + "arrangementSpacingTotal " + j3 + "remainingToTarget " + j + "totalWeight " + f6 + "weightUnitSpace " + f2 + "itemWeight " + fG2 + "weightedSize " + f8).initCause(e2);
                }
            }
            int i26 = i22;
            int i27 = 0;
            int i28 = 0;
            while (true) {
                long j5 = j;
                if (i28 >= i15) {
                    i7 = i18;
                    i8 = 0;
                    i22 = i26;
                    iU = c10.u((int) (i27 + j3), 0, i3 - i7);
                    break;
                }
                if (oi0VarArr[i28] == null) {
                    i9 = i28;
                    g80 g80Var2 = (g80) list.get(i28);
                    jo0 jo0VarF = r31.F(g80Var2);
                    i10 = i18;
                    float fG3 = r31.G(jo0VarF);
                    if (fG3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    str2 = str;
                    int i29 = i17;
                    jRound -= iSignum;
                    float f9 = f2 * fG3;
                    int iMax2 = Math.max(0, Math.round(f9) + iSignum);
                    if (jo0VarF != null) {
                        try {
                            z = jo0VarF.b;
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            f3 = f9;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i3 + "mainAxisMin " + i + "targetSpace " + i23 + "arrangementSpacingPx " + j2 + "weightChildrenCount " + i29 + str2 + i10 + "arrangementSpacingTotal " + j3 + "remainingToTarget " + j5 + "totalWeight " + f6 + "weightUnitSpace " + f2 + "weight " + fG3 + "weightedSize " + f3 + "crossAxisDesiredSize nullremainderUnit " + iSignum + "childMainAxisSize " + iMax2).initCause(e);
                        }
                    } else {
                        z = true;
                    }
                    f3 = f9;
                    try {
                        oi0 oi0VarE2 = g80Var2.e(io0Var.e((!z || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                        int i30 = io0Var.i(oi0VarE2);
                        int iF2 = io0Var.f(oi0VarE2);
                        iArr[i9] = i30;
                        i12 = i27 + i30;
                        int iMax3 = Math.max(i26, iF2);
                        oi0VarArr[i9] = oi0VarE2;
                        i26 = iMax3;
                        i11 = i29;
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i3 + "mainAxisMin " + i + "targetSpace " + i23 + "arrangementSpacingPx " + j2 + "weightChildrenCount " + i29 + str2 + i10 + "arrangementSpacingTotal " + j3 + "remainingToTarget " + j5 + "totalWeight " + f6 + "weightUnitSpace " + f2 + "weight " + fG3 + "weightedSize " + f3 + "crossAxisDesiredSize nullremainderUnit " + iSignum + "childMainAxisSize " + iMax2).initCause(e);
                    }
                } else {
                    i9 = i28;
                    str2 = str;
                    i10 = i18;
                    i11 = i17;
                    i12 = i27;
                }
                j = j5;
                i28 = i9 + 1;
                i27 = i12;
                i17 = i11;
                i18 = i10;
                str = str2;
                i15 = i6;
            }
        } else {
            iArr = iArr2;
            i7 = i18 - iMin;
            i8 = 0;
            iU = 0;
        }
        int i31 = i7 + iU;
        if (i31 < 0) {
            i31 = i8;
        }
        int iMax4 = Math.max(i31, i);
        int iMax5 = Math.max(i22, Math.max(i2, i8));
        int[] iArr3 = new int[i6];
        for (int i32 = i8; i32 < i6; i32++) {
            iArr3[i32] = i8;
        }
        io0Var.c(iMax4, n80Var, iArr, iArr3);
        return io0Var.a(oi0VarArr, n80Var, iArr3, iMax4, iMax5);
    }

    public static final float[] O(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] P(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static int[] Q(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iA0 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iA0 += (int) b10.a0(byteArrayInputStream, 2);
            iArr[i2] = iA0;
        }
        return iArr;
    }

    public static io[] R(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, io[] ioVarArr) throws IOException {
        byte[] bArr3 = c4.l;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, c4.m)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iA0 = (int) b10.a0(fileInputStream, 2);
            byte[] bArrZ = b10.Z(fileInputStream, (int) b10.a0(fileInputStream, 4), (int) b10.a0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrZ);
            try {
                io[] ioVarArrT = T(byteArrayInputStream, bArr2, iA0, ioVarArr);
                byteArrayInputStream.close();
                return ioVarArrT;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(c4.g, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iA02 = (int) b10.a0(fileInputStream, 1);
        byte[] bArrZ2 = b10.Z(fileInputStream, (int) b10.a0(fileInputStream, 4), (int) b10.a0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrZ2);
        try {
            io[] ioVarArrS = S(byteArrayInputStream2, iA02, ioVarArr);
            byteArrayInputStream2.close();
            return ioVarArrS;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static io[] S(ByteArrayInputStream byteArrayInputStream, int i, io[] ioVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new io[0];
        }
        if (i != ioVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iA0 = (int) b10.a0(byteArrayInputStream, 2);
            iArr[i2] = (int) b10.a0(byteArrayInputStream, 2);
            strArr[i2] = new String(b10.Y(byteArrayInputStream, iA0), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            io ioVar = ioVarArr[i3];
            if (!ioVar.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            ioVar.e = i4;
            ioVar.h = Q(byteArrayInputStream, i4);
        }
        return ioVarArr;
    }

    public static io[] T(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, io[] ioVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new io[0];
        }
        if (i != ioVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            b10.a0(byteArrayInputStream, 2);
            String str = new String(b10.Y(byteArrayInputStream, (int) b10.a0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jA0 = b10.a0(byteArrayInputStream, 4);
            int iA0 = (int) b10.a0(byteArrayInputStream, 2);
            io ioVar = null;
            if (ioVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= ioVarArr.length) {
                        break;
                    }
                    if (ioVarArr[i3].b.equals(strSubstring)) {
                        ioVar = ioVarArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (ioVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            ioVar.d = jA0;
            int[] iArrQ = Q(byteArrayInputStream, iA0);
            if (Arrays.equals(bArr, c4.k)) {
                ioVar.e = iA0;
                ioVar.h = iArrQ;
            }
        }
        return ioVarArr;
    }

    public static io[] U(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, c4.h)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iA0 = (int) b10.a0(fileInputStream, 1);
        byte[] bArrZ = b10.Z(fileInputStream, (int) b10.a0(fileInputStream, 4), (int) b10.a0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrZ);
        try {
            io[] ioVarArrV = V(byteArrayInputStream, str, iA0);
            byteArrayInputStream.close();
            return ioVarArrV;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static io[] V(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new io[0];
        }
        io[] ioVarArr = new io[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iA0 = (int) b10.a0(byteArrayInputStream, 2);
            int iA02 = (int) b10.a0(byteArrayInputStream, 2);
            ioVarArr[i3] = new io(str, new String(b10.Y(byteArrayInputStream, iA0), StandardCharsets.UTF_8), b10.a0(byteArrayInputStream, 4), iA02, (int) b10.a0(byteArrayInputStream, 4), (int) b10.a0(byteArrayInputStream, 4), new int[iA02], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            io ioVar = ioVarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = ioVar.f;
            int i6 = ioVar.g;
            TreeMap treeMap = ioVar.i;
            int i7 = iAvailable - i5;
            int iA03 = i2;
            while (byteArrayInputStream.available() > i7) {
                iA03 += (int) b10.a0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iA03), 1);
                int iA04 = (int) b10.a0(byteArrayInputStream, 2);
                while (iA04 > 0) {
                    b10.a0(byteArrayInputStream, 2);
                    int iA05 = (int) b10.a0(byteArrayInputStream, 1);
                    if (iA05 != 6 && iA05 != 7) {
                        while (iA05 > 0) {
                            b10.a0(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iA06 = (int) b10.a0(byteArrayInputStream, 1); iA06 > 0; iA06--) {
                                b10.a0(byteArrayInputStream, 2);
                            }
                            iA05--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iA04--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            ioVar.h = Q(byteArrayInputStream, ioVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(b10.Y(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return ioVarArr;
    }

    public static final void W(ad adVar, lk lkVar, boolean z) {
        Object obj = ad.j.get(adVar);
        Throwable thE = adVar.e(obj);
        Object objZ = thE != null ? c10.z(thE) : adVar.g(obj);
        if (!z) {
            lkVar.h(objZ);
            return;
        }
        c10.n(lkVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        to toVar = (to) lkVar;
        mk mkVar = toVar.h;
        Object obj2 = toVar.j;
        ml mlVarF = mkVar.f();
        Object objK0 = b10.k0(mlVarF, obj2);
        g41 g41VarE0 = objK0 != b10.n ? r31.e0(mkVar, mlVarF, objK0) : null;
        try {
            mkVar.h(objZ);
            if (g41VarE0 == null || g41VarE0.h0()) {
                b10.f0(mlVarF, objK0);
            }
        } catch (Throwable th) {
            if (g41VarE0 == null || g41VarE0.h0()) {
                b10.f0(mlVarF, objK0);
            }
            throw th;
        }
    }

    public static void X(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            lr.a(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static final int Y(ca0 ca0Var) {
        int iC;
        int i = ca0Var.b;
        int iC2 = ca0Var.c(0);
        while (ca0Var.b != 0 && ca0Var.c(0) == iC2) {
            int i2 = ca0Var.b;
            if (i2 == 0) {
                qo0.t("IntList is empty.");
                throw null;
            }
            ca0Var.e(0, ca0Var.a[i2 - 1]);
            ca0Var.d(ca0Var.b - 1);
            int i3 = ca0Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = ca0Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = ca0Var.c(i7);
                if (i6 >= i3 || (iC = ca0Var.c(i6)) <= iC4) {
                    if (iC4 > iC3) {
                        ca0Var.e(i5, iC4);
                        ca0Var.e(i7, iC3);
                        i5 = i7;
                    }
                } else if (iC > iC3) {
                    ca0Var.e(i5, iC);
                    ca0Var.e(i6, iC3);
                    i5 = i6;
                }
            }
        }
        return iC2;
    }

    public static final Rect Z(q00 q00Var) {
        return new Rect(q00Var.a, q00Var.b, q00Var.c, q00Var.d);
    }

    public static final void a(e90 e90Var, ju0 ju0Var, gd gdVar, hd hdVar, zg zgVar, ci ciVar, int i) {
        gd gdVar2;
        hd hdVar2;
        ju0 ju0Var2;
        zg zgVar2;
        ju0 ju0Var3;
        gd gdVar3;
        hd hdVar3;
        ciVar.W(1179621553);
        if (((i | 25744) & 74899) == 74898 && ciVar.z()) {
            ciVar.Q();
            ju0Var3 = ju0Var;
            gdVar3 = gdVar;
            hdVar3 = hdVar;
            zgVar2 = zgVar;
        } else {
            ciVar.S();
            if ((i & 1) == 0 || ciVar.x()) {
                ju0 ju0VarA = nu0.a(gt.b, ciVar);
                kf kfVar = (kf) ciVar.j(lf.a);
                gd gdVar4 = kfVar.M;
                if (gdVar4 == null) {
                    gdVar2 = new gd(lf.d(kfVar, 39), lf.a(kfVar, lf.d(kfVar, 39)), r31.s(bf.b(lf.d(kfVar, gt.c), gt.e), lf.d(kfVar, 39)), bf.b(lf.a(kfVar, lf.d(kfVar, 39)), 0.38f));
                    kfVar.M = gdVar2;
                } else {
                    gdVar2 = gdVar4;
                }
                hdVar2 = new hd(gt.a, gt.i, gt.g, gt.h, gt.f, gt.d);
                ju0Var2 = ju0VarA;
            } else {
                ciVar.Q();
                ju0Var2 = ju0Var;
                gdVar2 = gdVar;
                hdVar2 = hdVar;
            }
            ciVar.q();
            long j = gdVar2.a;
            long j2 = gdVar2.b;
            float f2 = hdVar2.a;
            ciVar.V(-1763481333);
            ciVar.V(-734838460);
            Object objK = ciVar.K();
            if (objK == vh.a) {
                objK = qo0.n(new kp(f2));
                ciVar.e0(objK);
            }
            ciVar.p(false);
            ciVar.p(false);
            zgVar2 = zgVar;
            dy0.a(e90Var, ju0Var2, j, j2, 0.0f, ((kp) ((za0) objK).getValue()).d, b10.b0(664103990, new y1(zgVar2), ciVar), ciVar, 14155782, 16);
            ju0Var3 = ju0Var2;
            gdVar3 = gdVar2;
            hdVar3 = hdVar2;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new id(e90Var, ju0Var3, gdVar3, hdVar3, zgVar2, i);
        }
    }

    public static final Rect a0(xl0 xl0Var) {
        return new Rect((int) xl0Var.a, (int) xl0Var.b, (int) xl0Var.c, (int) xl0Var.d);
    }

    public static final void b(gw gwVar, no noVar, zg zgVar, ci ciVar, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        e30 e30Var;
        ciVar.W(826668973);
        if ((i & 6) == 0) {
            i2 = (ciVar.h(gwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.f(noVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.h(zgVar) ? 256 : 128;
        }
        int i4 = i2;
        if (ciVar.N(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) ciVar.j(m4.f);
            xn xnVar = (xn) ciVar.j(ti.h);
            e30 e30Var2 = (e30) ciVar.j(ti.n);
            ai aiVarT = c10.T(ciVar);
            za0 za0VarQ = qo0.q(zgVar, ciVar);
            Object[] objArr = new Object[0];
            Object objK = ciVar.K();
            Object obj = vh.a;
            if (objK == obj) {
                objK = d4.k;
                ciVar.e0(objK);
            }
            UUID uuid = (UUID) b10.c0(Arrays.copyOf(objArr, 0), m20.l, (gw) objK, ciVar, 3456, 0);
            boolean zF = ciVar.f(view) | ciVar.f(xnVar);
            Object objK2 = ciVar.K();
            if (zF || objK2 == obj) {
                i3 = i4;
                z = true;
                z2 = false;
                e30Var = e30Var2;
                qo qoVar = new qo(gwVar, noVar, view, e30Var, xnVar, uuid);
                zg zgVar2 = new zg(346960332, true, new j(1, za0VarQ));
                mo moVar = qoVar.k;
                moVar.setParentCompositionContext(aiVarT);
                moVar.m.setValue(zgVar2);
                moVar.q = true;
                if (moVar.g == null && !moVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                moVar.d();
                ciVar.e0(qoVar);
                objK2 = qoVar;
            } else {
                i3 = i4;
                z = true;
                e30Var = e30Var2;
                z2 = false;
            }
            qo qoVar2 = (qo) objK2;
            boolean zH = ciVar.h(qoVar2);
            Object objK3 = ciVar.K();
            if (zH || objK3 == obj) {
                objK3 = new g(qoVar2, null, 2);
                ciVar.e0(objK3);
            }
            d(ciVar, (kw) objK3, j41.a);
            boolean zH2 = ciVar.h(qoVar2);
            Object objK4 = ciVar.K();
            if (zH2 || objK4 == obj) {
                objK4 = new a5(qoVar2, 0);
                ciVar.e0(objK4);
            }
            c(qoVar2, (iw) objK4, ciVar);
            boolean zH3 = ciVar.h(qoVar2) | ((i3 & 14) == 4 ? z : z2);
            if ((i3 & 112) != 32) {
                z = z2;
            }
            boolean zD = zH3 | z | ciVar.d(e30Var.ordinal());
            Object objK5 = ciVar.K();
            if (zD || objK5 == obj) {
                Object b5Var = new b5(qoVar2, gwVar, noVar, e30Var, 0);
                ciVar.e0(b5Var);
                objK5 = b5Var;
            }
            f((gw) objK5, ciVar);
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new c5(gwVar, noVar, zgVar, i, 0);
        }
    }

    public static final RectF b0(xl0 xl0Var) {
        return new RectF(xl0Var.a, xl0Var.b, xl0Var.c, xl0Var.d);
    }

    public static final void c(Object obj, iw iwVar, ci ciVar) {
        boolean zF = ciVar.f(obj);
        Object objK = ciVar.K();
        if (zF || objK == vh.a) {
            objK = new zo(iwVar);
            ciVar.e0(objK);
        }
    }

    public static final xl0 c0(Rect rect) {
        return new xl0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void d(ci ciVar, kw kwVar, Object obj) {
        ml mlVar = ciVar.R;
        boolean zF = ciVar.f(obj);
        Object objK = ciVar.K();
        if (zF || objK == vh.a) {
            objK = new z20(mlVar, kwVar);
            ciVar.e0(objK);
        }
    }

    public static final xl0 d0(RectF rectF) {
        return new xl0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void e(Object obj, Object obj2, kw kwVar, ci ciVar) {
        ml mlVar = ciVar.R;
        boolean zF = ciVar.f(obj) | ciVar.f(obj2);
        Object objK = ciVar.K();
        if (zF || objK == vh.a) {
            objK = new z20(mlVar, kwVar);
            ciVar.e0(objK);
        }
    }

    public static String e0(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static final void f(gw gwVar, ci ciVar) {
        gf0 gf0Var = ciVar.M.b.j;
        gf0Var.O(we0.c);
        m20.O(gf0Var, 0, gwVar);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean f0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, io[] ioVarArr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = c4.k;
        byte[] bArr3 = c4.j;
        byte[] bArr4 = c4.g;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                b10.m0(byteArrayOutputStream2, ioVarArr.length);
                int i2 = 2;
                int i3 = 2;
                for (io ioVar : ioVarArr) {
                    b10.l0(byteArrayOutputStream2, ioVar.c, 4);
                    b10.l0(byteArrayOutputStream2, ioVar.d, 4);
                    b10.l0(byteArrayOutputStream2, ioVar.g, 4);
                    String strD = D(ioVar.a, ioVar.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strD.getBytes(charset).length;
                    b10.m0(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strD.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                k81 k81Var = new k81(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(k81Var);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < ioVarArr.length) {
                    try {
                        io ioVar2 = ioVarArr[i4];
                        b10.m0(byteArrayOutputStream3, i4);
                        b10.m0(byteArrayOutputStream3, ioVar2.e);
                        i5 = i5 + 4 + (ioVar2.e * i2);
                        int[] iArr = ioVar2.h;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            b10.m0(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                k81 k81Var2 = new k81(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(k81Var2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < ioVarArr.length) {
                    try {
                        io ioVar3 = ioVarArr[i10];
                        Iterator it = ioVar3.i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            i0(byteArrayOutputStream4, iIntValue, ioVar3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                j0(byteArrayOutputStream4, ioVar3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                b10.m0(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                b10.l0(byteArrayOutputStream3, length4, 4);
                                b10.m0(byteArrayOutputStream3, iIntValue);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                k81 k81Var3 = new k81(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(k81Var3);
                long j2 = 4;
                long size = j2 + j2 + 4 + (arrayList.size() * 16);
                b10.l0(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    k81 k81Var4 = (k81) arrayList.get(i14);
                    int i15 = k81Var4.a;
                    byte[] bArr5 = k81Var4.b;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    b10.l0(byteArrayOutputStream, j, 4);
                    b10.l0(byteArrayOutputStream, size, 4);
                    if (k81Var4.c) {
                        long length5 = bArr5.length;
                        byte[] bArrY = b10.y(bArr5);
                        arrayList2.add(bArrY);
                        b10.l0(byteArrayOutputStream, bArrY.length, 4);
                        b10.l0(byteArrayOutputStream, length5, 4);
                        length = bArrY.length;
                    } else {
                        arrayList2.add(bArr5);
                        b10.l0(byteArrayOutputStream, bArr5.length, 4);
                        b10.l0(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = c4.h;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrY2 = y(ioVarArr, bArr6);
                b10.l0(byteArrayOutputStream, ioVarArr.length, 1);
                b10.l0(byteArrayOutputStream, bArrY2.length, 4);
                byte[] bArrY3 = b10.y(bArrY2);
                b10.l0(byteArrayOutputStream, bArrY3.length, 4);
                byteArrayOutputStream.write(bArrY3);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                b10.l0(byteArrayOutputStream, ioVarArr.length, 1);
                for (io ioVar4 : ioVarArr) {
                    int size2 = ioVar4.i.size() * 4;
                    String strD2 = D(ioVar4.a, ioVar4.b, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    b10.m0(byteArrayOutputStream, strD2.getBytes(charset2).length);
                    b10.m0(byteArrayOutputStream, ioVar4.h.length);
                    b10.l0(byteArrayOutputStream, size2, 4);
                    b10.l0(byteArrayOutputStream, ioVar4.c, 4);
                    byteArrayOutputStream.write(strD2.getBytes(charset2));
                    Iterator it2 = ioVar4.i.keySet().iterator();
                    while (it2.hasNext()) {
                        b10.m0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        b10.m0(byteArrayOutputStream, 0);
                    }
                    for (int i17 : ioVar4.h) {
                        b10.m0(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = c4.i;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrY4 = y(ioVarArr, bArr7);
                    b10.l0(byteArrayOutputStream, ioVarArr.length, 1);
                    b10.l0(byteArrayOutputStream, bArrY4.length, 4);
                    byte[] bArrY5 = b10.y(bArrY4);
                    b10.l0(byteArrayOutputStream, bArrY5.length, 4);
                    byteArrayOutputStream.write(bArrY5);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                b10.m0(byteArrayOutputStream, ioVarArr.length);
                for (io ioVar5 : ioVarArr) {
                    String str = ioVar5.a;
                    TreeMap treeMap = ioVar5.i;
                    String strD3 = D(str, ioVar5.b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    b10.m0(byteArrayOutputStream, strD3.getBytes(charset3).length);
                    b10.m0(byteArrayOutputStream, treeMap.size());
                    b10.m0(byteArrayOutputStream, ioVar5.h.length);
                    b10.l0(byteArrayOutputStream, ioVar5.c, 4);
                    byteArrayOutputStream.write(strD3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        b10.m0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : ioVar5.h) {
                        b10.m0(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    public static final void g(e90 e90Var, kw kwVar, ci ciVar, int i) {
        ciVar.W(-1298353104);
        int i2 = i | 6 | (ciVar.h(kwVar) ? 32 : 16);
        if (ciVar.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ciVar.K();
            if (objK == vh.a) {
                objK = new wx0();
                ciVar.e0(objK);
            }
            b90 b90Var = b90.a;
            h((wx0) objK, b90Var, kwVar, ciVar, (i2 << 3) & 1008);
            e90Var = b90Var;
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new h4(i, 12, e90Var, kwVar);
        }
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, io ioVar) throws IOException {
        j0(byteArrayOutputStream, ioVar);
        int i = ioVar.g;
        int[] iArr = ioVar.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            b10.m0(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ioVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void h(wx0 wx0Var, e90 e90Var, kw kwVar, ci ciVar, int i) {
        int i2;
        ciVar.W(-511989831);
        if ((i & 6) == 0) {
            i2 = (ciVar.h(wx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.f(e90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.h(kwVar) ? 256 : 128;
        }
        if (ciVar.N(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(ciVar.T);
            ai aiVarT = c10.T(ciVar);
            e90 e90VarP = r31.P(ciVar, e90Var);
            wh0 wh0VarL = ciVar.l();
            si siVar = si.q;
            ciVar.X();
            if (ciVar.S) {
                ciVar.k(siVar);
            } else {
                ciVar.h0();
            }
            dq0.m(ciVar, wx0Var.b, wx0Var);
            dq0.m(ciVar, wx0Var.c, aiVarT);
            dq0.m(ciVar, wx0Var.d, kwVar);
            sh.b.getClass();
            dq0.m(ciVar, rh.d, wh0VarL);
            dq0.m(ciVar, rh.c, e90VarP);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            ciVar.p(true);
            if (ciVar.z()) {
                ciVar.V(-1259216055);
                ciVar.p(false);
            } else {
                ciVar.V(-1259274676);
                boolean zH = ciVar.h(wx0Var);
                Object objK = ciVar.K();
                if (zH || objK == vh.a) {
                    objK = new b(22, wx0Var);
                    ciVar.e0(objK);
                }
                f((gw) objK, ciVar);
                ciVar.p(false);
            }
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new c5(wx0Var, e90Var, kwVar, i, 5);
        }
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, io ioVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        b10.m0(byteArrayOutputStream, str.getBytes(charset).length);
        b10.m0(byteArrayOutputStream, ioVar.e);
        b10.l0(byteArrayOutputStream, ioVar.f, 4);
        b10.l0(byteArrayOutputStream, ioVar.c, 4);
        b10.l0(byteArrayOutputStream, ioVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void i(e90 e90Var, kw kwVar, ci ciVar, int i) {
        int i2;
        ciVar.W(1090521195);
        if ((i & 6) == 0) {
            i2 = (ciVar.f(e90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.h(kwVar) ? 32 : 16;
        }
        if (ciVar.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ciVar.K();
            if (objK == vh.a) {
                objK = e5.b;
                ciVar.e0(objK);
            }
            l80 l80Var = (l80) objK;
            int iHashCode = Long.hashCode(ciVar.T);
            wh0 wh0VarL = ciVar.l();
            e90 e90VarP = r31.P(ciVar, e90Var);
            sh.b.getClass();
            si siVar = rh.b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            ciVar.X();
            if (ciVar.S) {
                ciVar.k(siVar);
            } else {
                ciVar.h0();
            }
            dq0.m(ciVar, rh.e, l80Var);
            dq0.m(ciVar, rh.d, wh0VarL);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            dq0.m(ciVar, rh.c, e90VarP);
            kwVar.e(ciVar, Integer.valueOf((i3 >> 6) & 14));
            ciVar.p(true);
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new f5(e90Var, kwVar, i, 0);
        }
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, int i, io ioVar) throws IOException {
        int i2 = ioVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ioVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final d90 j(ln lnVar, int i) {
        d90 d90Var = ((d90) lnVar).d.i;
        if (d90Var == null || (d90Var.g & i) == 0) {
            return null;
        }
        while (d90Var != null) {
            int i2 = d90Var.f;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return d90Var;
            }
            d90Var = d90Var.i;
        }
        return null;
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, io ioVar) {
        int i = 0;
        for (Map.Entry entry : ioVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                b10.m0(byteArrayOutputStream, iIntValue - i);
                b10.m0(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static mf k(mf mfVar) {
        r61 r61Var = c10.e;
        if (ff.a(mfVar.b, ff.a)) {
            hn0 hn0Var = (hn0) mfVar;
            r61 r61Var2 = hn0Var.d;
            if (!v(r61Var2, r61Var)) {
                return new hn0(hn0Var.a, hn0Var.h, r61Var, O(u((float[]) r1.f.e, r61Var2.a(), r61Var.a()), hn0Var.i), hn0Var.k, hn0Var.n, hn0Var.e, hn0Var.f, hn0Var.g, -1);
            }
        }
        return mfVar;
    }

    public static final void l(ca0 ca0Var, int i) {
        if (ca0Var.b == 0 || !(ca0Var.c(0) == i || ca0Var.c(ca0Var.b - 1) == i)) {
            int i2 = ca0Var.b;
            ca0Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = ca0Var.c(i3);
                if (i <= iC) {
                    break;
                }
                ca0Var.e(i2, iC);
                i2 = i3;
            }
            ca0Var.e(i2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l81.m(int, int, int, boolean):int");
    }

    public static final lz n(nz nzVar, float f2, kz kzVar, ci ciVar) {
        return o(nzVar, Float.valueOf(0.0f), Float.valueOf(f2), y41.a, kzVar, ciVar, 33208, 0);
    }

    public static final lz o(nz nzVar, Number number, Number number2, q31 q31Var, kz kzVar, ci ciVar, int i, int i2) {
        Object objK = ciVar.K();
        v71 v71Var = vh.a;
        if (objK == v71Var) {
            lz lzVar = new lz(nzVar, number, number2, q31Var, kzVar);
            ciVar.e0(lzVar);
            objK = lzVar;
        }
        lz lzVar2 = (lz) objK;
        boolean z = (((57344 & i) ^ 24576) > 16384 && ciVar.h(kzVar)) || (i & 24576) == 16384;
        Object objK2 = ciVar.K();
        if (z || objK2 == v71Var) {
            b5 b5Var = new b5(number, lzVar2, number2, kzVar, 2);
            ciVar.e0(b5Var);
            objK2 = b5Var;
        }
        f((gw) objK2, ciVar);
        boolean zH = ciVar.h(nzVar);
        Object objK3 = ciVar.K();
        if (zH || objK3 == v71Var) {
            objK3 = new j4(15, nzVar, lzVar2);
            ciVar.e0(objK3);
        }
        c(lzVar2, (iw) objK3, ciVar);
        return lzVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:21:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.oy0 r6, defpackage.ia r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.cw
            if (r0 == 0) goto L13
            r0 = r7
            cw r0 = (defpackage.cw) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            cw r0 = new cw
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            int r1 = r0.i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            oy0 r6 = r0.g
            defpackage.c10.X(r7)
            goto L59
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.c10.X(r7)
            py0 r7 = r6.i
            gj0 r7 = r7.w
            java.lang.Object r7 = r7.a
            int r1 = r7.size()
            r4 = r2
        L3e:
            if (r4 >= r1) goto L75
            java.lang.Object r5 = r7.get(r4)
            nj0 r5 = (defpackage.nj0) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L72
        L4a:
            r0.g = r6
            r0.i = r3
            hj0 r7 = defpackage.hj0.f
            java.lang.Object r7 = r6.a(r7, r0)
            xl r1 = defpackage.xl.d
            if (r7 != r1) goto L59
            return r1
        L59:
            gj0 r7 = (defpackage.gj0) r7
            java.lang.Object r7 = r7.a
            int r1 = r7.size()
            r4 = r2
        L62:
            if (r4 >= r1) goto L75
            java.lang.Object r5 = r7.get(r4)
            nj0 r5 = (defpackage.nj0) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L6f
            goto L4a
        L6f:
            int r4 = r4 + 1
            goto L62
        L72:
            int r4 = r4 + 1
            goto L3e
        L75:
            j41 r6 = defpackage.j41.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l81.p(oy0, ia):java.lang.Object");
    }

    public static final Object q(rj0 rj0Var, kw kwVar, lk lkVar) {
        Object objA0 = ((py0) rj0Var).A0(new dw(lkVar.f(), kwVar, null), lkVar);
        return objA0 == xl.d ? objA0 : j41.a;
    }

    public static final xl0 r(d30 d30Var) {
        d30 d30VarM = d30Var.m();
        return d30VarM != null ? d30VarM.P(d30Var, true) : new xl0(0.0f, 0.0f, (int) (d30Var.Q() >> 32), (int) (d30Var.Q() & 4294967295L));
    }

    public static final xl0 s(d30 d30Var) {
        d30 d30VarC = C(d30Var);
        float fQ = (int) (d30VarC.Q() >> 32);
        float fQ2 = (int) (d30VarC.Q() & 4294967295L);
        xl0 xl0VarP = d30VarC.P(d30Var, true);
        float f2 = xl0VarP.a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > fQ) {
            f2 = fQ;
        }
        float f3 = xl0VarP.b;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > fQ2) {
            f3 = fQ2;
        }
        float f4 = xl0VarP.c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= fQ) {
            fQ = f4;
        }
        float f5 = xl0VarP.d;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 <= fQ2) {
            fQ2 = f6;
        }
        if (f2 == fQ || f3 == fQ2) {
            return xl0.e;
        }
        long jI = d30VarC.i((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long jI2 = d30VarC.i((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(fQ) << 32));
        long jI3 = d30VarC.i((Float.floatToRawIntBits(fQ) << 32) | (Float.floatToRawIntBits(fQ2) & 4294967295L));
        long jI4 = d30VarC.i((Float.floatToRawIntBits(fQ2) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jI4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jI3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jI & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jI2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jI4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jI3 & 4294967295L));
        return new xl0(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final void t(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }

    public static final float[] u(float[] fArr, float[] fArr2, float[] fArr3) {
        P(fArr, fArr2);
        P(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrI = I(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return O(fArrI, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean v(r61 r61Var, r61 r61Var2) {
        if (r61Var == r61Var2) {
            return true;
        }
        return Math.abs(r61Var.a - r61Var2.a) < 0.001f && Math.abs(r61Var.b - r61Var2.b) < 0.001f;
    }

    public static final k8 w(k8 k8Var) {
        k8 k8VarC = k8Var.c();
        int iB = k8VarC.b();
        for (int i = 0; i < iB; i++) {
            k8VarC.e(k8Var.a(i), i);
        }
        return k8VarC;
    }

    public static final wl x(ci ciVar) {
        return new mm0(ciVar.R);
    }

    public static byte[] y(io[] ioVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (io ioVar : ioVarArr) {
            length += ((((ioVar.g * 2) + 7) & (-8)) / 8) + (ioVar.e * 2) + D(ioVar.a, ioVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + ioVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, c4.i)) {
            int length2 = ioVarArr.length;
            while (i < length2) {
                io ioVar2 = ioVarArr[i];
                h0(byteArrayOutputStream, ioVar2, D(ioVar2.a, ioVar2.b, bArr));
                g0(byteArrayOutputStream, ioVar2);
                i++;
            }
        } else {
            for (io ioVar3 : ioVarArr) {
                h0(byteArrayOutputStream, ioVar3, D(ioVar3.a, ioVar3.b, bArr));
            }
            int length3 = ioVarArr.length;
            while (i < length3) {
                g0(byteArrayOutputStream, ioVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final dj z(mf mfVar, mf mfVar2) {
        if (mfVar == mfVar2) {
            return new bj(mfVar, mfVar, 1);
        }
        long j = mfVar.b;
        long j2 = ff.a;
        return (ff.a(j, j2) && ff.a(mfVar2.b, j2)) ? new cj((hn0) mfVar, (hn0) mfVar2) : new dj(mfVar, mfVar2, 0);
    }
}
