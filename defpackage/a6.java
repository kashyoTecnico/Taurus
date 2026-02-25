package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a6 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public ta d;

    public a6(Paint paint) {
        this.a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : b6.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : b6.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void d(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        this.a.setBlendMode(nm.F(i));
    }

    public final void e(long j) {
        this.a.setColor(r31.Z(j));
    }

    public final void f(ta taVar) {
        this.d = taVar;
        this.a.setColorFilter(taVar != null ? taVar.a : null);
    }

    public final void g(int i) {
        this.a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void h(int i) {
        this.a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void i(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
