package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h7 extends TextPaint {
    public a6 a;
    public uz0 b;
    public int c;
    public hu0 d;
    public bf e;
    public ac f;
    public fo g;
    public yu0 h;
    public tq i;

    public final a6 a() {
        a6 a6Var = this.a;
        if (a6Var != null) {
            return a6Var;
        }
        a6 a6Var2 = new a6(this);
        this.a = a6Var2;
        return a6Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ac r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.fw0
            if (r1 == 0) goto L1d
            fw0 r6 = (defpackage.fw0) r6
            long r6 = r6.a
            long r6 = defpackage.no0.t(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.bc
            if (r1 == 0) goto L75
            ac r1 = r5.f
            boolean r1 = defpackage.c10.i(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            yu0 r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.yu0.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f = r6
            yu0 r1 = new yu0
            r1.<init>(r7)
            r5.h = r1
            g7 r1 = new g7
            r1.<init>(r6, r7)
            fo r6 = defpackage.qo0.g(r1)
            r5.g = r6
        L58:
            a6 r6 = r5.a()
            fo r7 = r5.g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.c = r7
            android.graphics.Paint r6 = r6.a
            r6.setShader(r7)
            r5.e = r0
            defpackage.d80.D(r5, r9)
            return
        L75:
            fg r5 = new fg
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.c(ac, long, float):void");
    }

    public final void d(long j) {
        bf bfVar = this.e;
        if (bfVar == null ? false : bf.c(bfVar.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new bf(j);
            setColor(r31.Z(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(tq tqVar) {
        if (tqVar == null || c10.i(this.i, tqVar)) {
            return;
        }
        this.i = tqVar;
        if (tqVar.equals(dt.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(tqVar instanceof qx0)) {
            throw new fg();
        }
        a().i(1);
        a6 a6VarA = a();
        qx0 qx0Var = (qx0) tqVar;
        a6VarA.a.setStrokeWidth(qx0Var.a);
        a6 a6VarA2 = a();
        a6VarA2.a.setStrokeMiter(qx0Var.b);
        a().h(qx0Var.d);
        a().g(qx0Var.c);
        a().a.setPathEffect(null);
    }

    public final void f(hu0 hu0Var) {
        if (hu0Var == null || c10.i(this.d, hu0Var)) {
            return;
        }
        this.d = hu0Var;
        if (hu0Var.equals(hu0.d)) {
            clearShadowLayer();
            return;
        }
        hu0 hu0Var2 = this.d;
        float f = hu0Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (hu0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), r31.Z(this.d.a));
    }

    public final void g(uz0 uz0Var) {
        if (uz0Var == null || c10.i(this.b, uz0Var)) {
            return;
        }
        this.b = uz0Var;
        int i = uz0Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
