package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fd implements sq {
    public final ed d;
    public final e9 e;
    public a6 f;
    public a6 g;

    public fd() {
        yn ynVar = r31.b;
        ed edVar = new ed();
        edVar.a = ynVar;
        edVar.b = e30.d;
        edVar.c = hs.a;
        edVar.d = 0L;
        this.d = edVar;
        e9 e9Var = new e9();
        e9Var.c = this;
        e9Var.a = new r1(3, e9Var);
        this.e = e9Var;
    }

    public static a6 a(fd fdVar, long j, tq tqVar, int i) {
        a6 a6VarF = fdVar.f(tqVar);
        Paint paint = a6VarF.a;
        if (!bf.c(r31.c(paint.getColor()), j)) {
            a6VarF.e(j);
        }
        if (a6VarF.c != null) {
            a6VarF.c = null;
            paint.setShader(null);
        }
        if (!c10.i(a6VarF.d, null)) {
            a6VarF.f(null);
        }
        if (a6VarF.b != i) {
            a6VarF.d(i);
        }
        if (paint.isFilterBitmap()) {
            return a6VarF;
        }
        paint.setFilterBitmap(true);
        return a6VarF;
    }

    @Override // defpackage.sq
    public final e9 D() {
        return this.e;
    }

    @Override // defpackage.sq
    public final void L(long j, long j2, long j3, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.d.c.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, dt.a, i));
    }

    @Override // defpackage.sq
    public final void O(r5 r5Var, long j, long j2, float f, ta taVar) {
        this.d.c.d(r5Var, j, j2, d(null, dt.a, f, taVar, 3));
    }

    @Override // defpackage.sq
    public final void V(i6 i6Var, long j) {
        this.d.c.g(i6Var, a(this, j, dt.a, 3));
    }

    @Override // defpackage.xn
    public final float b() {
        return this.d.a.b();
    }

    public final a6 d(ac acVar, tq tqVar, float f, ta taVar, int i) {
        a6 a6VarF = f(tqVar);
        Paint paint = a6VarF.a;
        if (acVar != null) {
            acVar.a(f, c(), a6VarF);
        } else {
            if (a6VarF.c != null) {
                a6VarF.c = null;
                paint.setShader(null);
            }
            long jC = r31.c(paint.getColor());
            long j = bf.b;
            if (!bf.c(jC, j)) {
                a6VarF.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                a6VarF.c(f);
            }
        }
        if (!c10.i(a6VarF.d, taVar)) {
            a6VarF.f(taVar);
        }
        if (a6VarF.b != i) {
            a6VarF.d(i);
        }
        if (paint.isFilterBitmap()) {
            return a6VarF;
        }
        paint.setFilterBitmap(true);
        return a6VarF;
    }

    public final void e(r5 r5Var, ta taVar) {
        this.d.c.a(r5Var, d(null, dt.a, 1.0f, taVar, 3));
    }

    public final a6 f(tq tqVar) {
        if (c10.i(tqVar, dt.a)) {
            a6 a6Var = this.f;
            if (a6Var != null) {
                return a6Var;
            }
            a6 a6VarD = c10.d();
            a6VarD.i(0);
            this.f = a6VarD;
            return a6VarD;
        }
        if (!(tqVar instanceof qx0)) {
            throw new fg();
        }
        a6 a6VarD2 = this.g;
        if (a6VarD2 == null) {
            a6VarD2 = c10.d();
            a6VarD2.i(1);
            this.g = a6VarD2;
        }
        Paint paint = a6VarD2.a;
        float strokeWidth = paint.getStrokeWidth();
        qx0 qx0Var = (qx0) tqVar;
        float f = qx0Var.a;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        int iA = a6VarD2.a();
        int i = qx0Var.c;
        if (iA != i) {
            a6VarD2.g(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = qx0Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iB = a6VarD2.b();
        int i2 = qx0Var.d;
        if (iB == i2) {
            return a6VarD2;
        }
        a6VarD2.h(i2);
        return a6VarD2;
    }

    @Override // defpackage.sq
    public final void g(i6 i6Var, ac acVar, float f, tq tqVar, int i) {
        this.d.c.g(i6Var, d(acVar, tqVar, f, null, i));
    }

    @Override // defpackage.sq
    public final e30 getLayoutDirection() {
        return this.d.b;
    }

    @Override // defpackage.xn
    public final float k() {
        return this.d.a.k();
    }

    @Override // defpackage.sq
    public final void m0(long j, float f, float f2, long j2, long j3, tq tqVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.s(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, tqVar, 3));
    }

    @Override // defpackage.sq
    public final void p(float f, long j, long j2) {
        this.d.c.c(f, j2, a(this, j, dt.a, 3));
    }

    @Override // defpackage.sq
    public final void w(long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.d.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, dt.a, 3));
    }
}
