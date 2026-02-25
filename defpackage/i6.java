package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i6 {
    public final Path a;
    public RectF b;
    public float[] c;

    public i6(Path path) {
        this.a = path;
    }

    public static void a(i6 i6Var, fo0 fo0Var) {
        if (i6Var.b == null) {
            i6Var.b = new RectF();
        }
        RectF rectF = i6Var.b;
        c10.m(rectF);
        float f = fo0Var.a;
        long j = fo0Var.h;
        long j2 = fo0Var.g;
        long j3 = fo0Var.f;
        long j4 = fo0Var.e;
        rectF.set(f, fo0Var.b, fo0Var.c, fo0Var.d);
        if (i6Var.c == null) {
            i6Var.c = new float[8];
        }
        float[] fArr = i6Var.c;
        c10.m(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = i6Var.a;
        RectF rectF2 = i6Var.b;
        c10.m(rectF2);
        float[] fArr2 = i6Var.c;
        c10.m(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final xl0 b() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        c10.m(rectF);
        this.a.computeBounds(rectF, true);
        return new xl0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean c(i6 i6Var, i6 i6Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(i6Var instanceof i6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = i6Var.a;
        if (i6Var2 instanceof i6) {
            return this.a.op(path, i6Var2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void d() {
        this.a.reset();
    }
}
