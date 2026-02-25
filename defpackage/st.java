package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class st implements rt {
    public final float a;
    public final nw0 b;

    public st(float f, float f2, float f3) {
        this.a = f3;
        nw0 nw0Var = new nw0();
        nw0Var.a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        nw0Var.b = dSqrt;
        nw0Var.g = 1.0f;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        nw0Var.g = f;
        nw0Var.c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        nw0Var.b = Math.sqrt(f2);
        nw0Var.c = false;
        this.b = nw0Var;
    }

    @Override // defpackage.rt
    public final float b(long j, float f, float f2, float f3) {
        nw0 nw0Var = this.b;
        nw0Var.a = f2;
        return Float.intBitsToFloat((int) (nw0Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.rt
    public final float c(long j, float f, float f2, float f3) {
        nw0 nw0Var = this.b;
        nw0Var.a = f2;
        return Float.intBitsToFloat((int) (nw0Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    @Override // defpackage.rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(float r32, float r33, float r34) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st.d(float, float, float):long");
    }

    @Override // defpackage.rt
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }
}
