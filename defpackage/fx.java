package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fx {
    public final ix a;
    public Outline f;
    public float j;
    public nf0 k;
    public i6 l;
    public i6 m;
    public boolean n;
    public fd o;
    public a6 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public xn b = r31.b;
    public e30 c = e30.d;
    public y20 d = e3.H;
    public final h e = new h(16, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final ce r = new ce();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        c10.o(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public fx(ix ixVar) {
        this.a = ixVar;
        ixVar.c(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        ix ixVar = this.a;
        RenderNode renderNode = ixVar.c;
        if (this.g) {
            boolean z = this.w;
            if (z || ixVar.l > 0.0f) {
                i6 i6Var = this.l;
                if (i6Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = i6Var instanceof i6;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    i6Var.a.computeBounds(rectF, false);
                    Outline outline = this.f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f = outline;
                    }
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    outline.setPath(i6Var.a);
                    this.n = !outline.canClip();
                    this.l = i6Var;
                    outline.setAlpha(ixVar.h);
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    renderNode.setOutline(outline);
                    ixVar.g = true;
                    ixVar.a();
                    if (this.n && this.w) {
                        ixVar.c(false);
                        renderNode.discardDisplayList();
                    } else {
                        ixVar.c(this.w);
                    }
                } else {
                    ixVar.c(z);
                    Outline outline2 = this.f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    Outline outline3 = outline2;
                    long jF = d80.F(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jF = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (jF >> 32);
                    int i4 = (int) (jF & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), this.j);
                    outline3.setAlpha(ixVar.h);
                    Math.round(Float.intBitsToFloat(i3));
                    Math.round(Float.intBitsToFloat(i4));
                    renderNode.setOutline(outline3);
                    ixVar.g = true;
                    ixVar.a();
                }
            } else {
                ixVar.c(false);
                renderNode.setOutline(null);
                ixVar.g = false;
                ixVar.a();
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L77
            int r0 = r15.q
            if (r0 != 0) goto L77
            ce r0 = r15.r
            java.lang.Object r1 = r0.b
            fx r1 = (defpackage.fx) r1
            if (r1 == 0) goto L1c
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
            r1 = 0
            r0.b = r1
        L1c:
            java.lang.Object r0 = r0.d
            ua0 r0 = (defpackage.ua0) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            fx r11 = (defpackage.fx) r11
            int r12 = r11.q
            int r12 = r12 + (-1)
            r11.q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            ix r15 = r15.a
            android.graphics.RenderNode r15 = r15.c
            r15.discardDisplayList()
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Type inference failed for: r13v1, types: [iw, y20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.sq r14) {
        /*
            r13 = this;
            ce r0 = r13.r
            java.lang.Object r1 = r0.b
            fx r1 = (defpackage.fx) r1
            r0.c = r1
            java.lang.Object r1 = r0.d
            ua0 r1 = (defpackage.ua0) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.e
            ua0 r2 = (defpackage.ua0) r2
            if (r2 != 0) goto L23
            int r2 = defpackage.fq0.a
            ua0 r2 = new ua0
            r2.<init>()
            r0.e = r2
        L23:
            r2.i(r1)
            r1.b()
        L29:
            r1 = 1
            r0.a = r1
            y20 r13 = r13.d
            r13.g(r14)
            r13 = 0
            r0.a = r13
            java.lang.Object r14 = r0.c
            fx r14 = (defpackage.fx) r14
            if (r14 == 0) goto L43
            int r1 = r14.q
            int r1 = r1 + (-1)
            r14.q = r1
            r14.b()
        L43:
            java.lang.Object r14 = r0.e
            ua0 r14 = (defpackage.ua0) r14
            if (r14 == 0) goto L9c
            boolean r0 = r14.h()
            if (r0 == 0) goto L9c
            java.lang.Object[] r0 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L99
            r3 = r13
        L59:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L94
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L73:
            if (r8 >= r6) goto L92
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L8e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            fx r9 = (defpackage.fx) r9
            int r10 = r9.q
            int r10 = r10 + (-1)
            r9.q = r10
            r9.b()
        L8e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L73
        L92:
            if (r6 != r7) goto L99
        L94:
            if (r3 == r2) goto L99
            int r3 = r3 + 1
            goto L59
        L99:
            r14.b()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx.c(sq):void");
    }

    public final nf0 d() {
        nf0 lf0Var;
        nf0 nf0Var = this.k;
        i6 i6Var = this.l;
        if (nf0Var != null) {
            return nf0Var;
        }
        if (i6Var != null) {
            kf0 kf0Var = new kf0(i6Var);
            this.k = kf0Var;
            return kf0Var;
        }
        long jF = d80.F(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jF = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jF >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jF & 4294967295L)) + fIntBitsToFloat2;
        if (this.j > 0.0f) {
            lf0Var = new mf0(d80.g(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            lf0Var = new lf0(new xl0(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = lf0Var;
        return lf0Var;
    }

    public final void e(float f, long j, long j2) {
        if (ed0.b(this.h, j) && yu0.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
