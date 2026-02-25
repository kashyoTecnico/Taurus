package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oy0 implements xn, lk {
    public final /* synthetic */ py0 d;
    public final ad e;
    public ad f;
    public hj0 g = hj0.e;
    public final is h = is.d;
    public final /* synthetic */ py0 i;

    public oy0(py0 py0Var, ad adVar) {
        this.i = py0Var;
        this.d = py0Var;
        this.e = adVar;
    }

    @Override // defpackage.xn
    public final float A(float f) {
        return this.d.b() * f;
    }

    @Override // defpackage.xn
    public final float I(long j) {
        return this.d.I(j);
    }

    @Override // defpackage.xn
    public final int N(float f) {
        return this.d.N(f);
    }

    @Override // defpackage.xn
    public final long W(long j) {
        return this.d.W(j);
    }

    @Override // defpackage.xn
    public final float Z(long j) {
        return this.d.Z(j);
    }

    public final Object a(hj0 hj0Var, ia iaVar) {
        ad adVar = new ad(1, r31.I(iaVar));
        adVar.t();
        this.g = hj0Var;
        this.f = adVar;
        return adVar.s();
    }

    @Override // defpackage.xn
    public final float b() {
        return this.d.b();
    }

    public final long d() {
        py0 py0Var = this.i;
        py0Var.getClass();
        long jW = py0Var.W(d80.z(py0Var).B.g());
        long j = py0Var.B;
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jW >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jW & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final c61 e() {
        py0 py0Var = this.i;
        py0Var.getClass();
        return d80.z(py0Var).B;
    }

    @Override // defpackage.lk
    public final ml f() {
        return this.h;
    }

    @Override // defpackage.xn
    public final long f0(float f) {
        return this.d.f0(f);
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        py0 py0Var = this.i;
        synchronized (py0Var.y) {
            py0Var.x.j(this);
        }
        this.e.h(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r7, defpackage.kw r9, defpackage.ia r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ny0
            if (r0 == 0) goto L13
            r0 = r10
            ny0 r0 = (defpackage.ny0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ny0 r0 = new ny0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            rw0 r6 = r0.g
            defpackage.c10.X(r10)     // Catch: java.lang.Throwable -> L27
            goto L69
        L27:
            r7 = move-exception
            goto L73
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.c10.X(r10)
            r3 = 0
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 > 0) goto L4a
            ad r10 = r6.f
            if (r10 == 0) goto L4a
            ij0 r1 = new ij0
            r1.<init>(r7)
            ym0 r1 = defpackage.c10.z(r1)
            r10.h(r1)
        L4a:
            py0 r10 = r6.i
            wl r10 = r10.o0()
            ns0 r1 = new ns0
            r3 = 0
            r1.<init>(r7, r6, r3)
            r7 = 3
            rw0 r7 = defpackage.nm.z(r10, r3, r1, r7)
            r0.g = r7     // Catch: java.lang.Throwable -> L6f
            r0.j = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = r9.e(r6, r0)     // Catch: java.lang.Throwable -> L6f
            xl r6 = defpackage.xl.d
            if (r10 != r6) goto L68
            return r6
        L68:
            r6 = r7
        L69:
            xc r7 = defpackage.xc.e
            r6.a(r7)
            return r10
        L6f:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L73:
            xc r8 = defpackage.xc.e
            r6.a(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy0.i(long, kw, ia):java.lang.Object");
    }

    @Override // defpackage.xn
    public final float j0(int i) {
        return this.d.j0(i);
    }

    @Override // defpackage.xn
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.xn
    public final float l0(float f) {
        return f / this.d.b();
    }

    @Override // defpackage.xn
    public final long x(float f) {
        return this.d.x(f);
    }

    @Override // defpackage.xn
    public final long y(long j) {
        return this.d.y(j);
    }
}
