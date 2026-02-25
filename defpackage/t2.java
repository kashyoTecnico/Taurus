package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t2 implements dd {
    public Canvas a = u2.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.dd
    public final void a(r5 r5Var, a6 a6Var) {
        this.a.drawBitmap(r5Var.a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), a6Var.a);
    }

    @Override // defpackage.dd
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.dd
    public final void c(float f, long j, a6 a6Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, a6Var.a);
    }

    @Override // defpackage.dd
    public final void d(r5 r5Var, long j, long j2, a6 a6Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        if (r5Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = r5Var.a;
        Rect rect = this.b;
        c10.m(rect);
        int i = (int) 0;
        rect.left = i;
        int i2 = (int) 0;
        rect.top = i2;
        rect.right = ((int) (j >> 32)) + i;
        rect.bottom = ((int) (j & 4294967295L)) + i2;
        Rect rect2 = this.c;
        c10.m(rect2);
        rect2.left = i;
        rect2.top = i2;
        rect2.right = i + ((int) (j2 >> 32));
        rect2.bottom = i2 + ((int) (j2 & 4294967295L));
        canvas.drawBitmap(bitmap, rect, rect2, a6Var.a);
    }

    @Override // defpackage.dd
    public final void e(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.dd
    public final void f(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.dd
    public final void g(i6 i6Var, a6 a6Var) {
        Canvas canvas = this.a;
        if (!(i6Var instanceof i6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(i6Var.a, a6Var.a);
    }

    @Override // defpackage.dd
    public final void h() {
        this.a.rotate(45.0f);
    }

    @Override // defpackage.dd
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.dd
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, a6 a6Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, a6Var.a);
    }

    @Override // defpackage.dd
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.dd
    public final void m(long j, long j2, a6 a6Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), a6Var.a);
    }

    @Override // defpackage.dd
    public final void n() {
        this.a.disableZ();
    }

    @Override // defpackage.dd
    public final void o(float f, float f2, float f3, float f4, a6 a6Var) {
        this.a.drawRect(f, f2, f3, f4, a6Var.a);
    }

    @Override // defpackage.dd
    public final void p(float[] fArr) {
        if (l81.L(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        nm.C(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.dd
    public final void q() {
        this.a.enableZ();
    }

    @Override // defpackage.dd
    public final void r(i6 i6Var) {
        Canvas canvas = this.a;
        if (!(i6Var instanceof i6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(i6Var.a, Region.Op.INTERSECT);
    }

    @Override // defpackage.dd
    public final void s(float f, float f2, float f3, float f4, float f5, float f6, a6 a6Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, a6Var.a);
    }
}
