package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mg0 extends d90 implements l30, qq {
    public c51 r;
    public boolean s;
    public sa t;
    public v71 u;
    public float v;
    public ta w;

    public static boolean B0(long j) {
        return !yu0.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean C0(long j) {
        return !yu0.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean A0() {
        return this.s && this.r.b() != 9205357640488583168L;
    }

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        if (!A0()) {
            return g80Var.b0(i);
        }
        long jD0 = D0(hj.b(i, 0, 13));
        return Math.max(gj.i(jD0), g80Var.b0(i));
    }

    public final long D0(long j) {
        boolean z = false;
        boolean z2 = gj.d(j) && gj.c(j);
        if (gj.f(j) && gj.e(j)) {
            z = true;
        }
        if ((!A0() && z2) || z) {
            return gj.a(j, gj.h(j), 0, gj.g(j), 0, 10);
        }
        long jB = this.r.b();
        int iRound = C0(jB) ? Math.round(Float.intBitsToFloat((int) (jB >> 32))) : gj.j(j);
        int iRound2 = B0(jB) ? Math.round(Float.intBitsToFloat((int) (jB & 4294967295L))) : gj.i(j);
        int iG = hj.g(j, iRound);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(hj.f(j, iRound2)) & 4294967295L) | (Float.floatToRawIntBits(iG) << 32);
        if (A0()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!C0(this.r.b()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.r.b() >> 32))) << 32) | (Float.floatToRawIntBits(!B0(this.r.b()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.r.b() & 4294967295L))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : dq0.n(jFloatToRawIntBits2, this.u.i(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return gj.a(j, hj.g(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, hj.f(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        if (!A0()) {
            return g80Var.S(i);
        }
        long jD0 = D0(hj.b(0, i, 7));
        return Math.max(gj.j(jD0), g80Var.S(i));
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        fd fdVar = v30Var.d;
        long jB = this.r.b();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(C0(jB) ? Float.intBitsToFloat((int) (jB >> 32)) : Float.intBitsToFloat((int) (fdVar.c() >> 32))) << 32) | (Float.floatToRawIntBits(B0(jB) ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (fdVar.c() & 4294967295L))) & 4294967295L);
        long jN = (Float.intBitsToFloat((int) (fdVar.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (fdVar.c() & 4294967295L)) == 0.0f) ? 0L : dq0.n(jFloatToRawIntBits, this.u.i(jFloatToRawIntBits, fdVar.c()));
        long jA = this.t.a((Math.round(Float.intBitsToFloat((int) (jN >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jN & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (fdVar.c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (fdVar.c() & 4294967295L))) & 4294967295L), v30Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((r1) fdVar.e.a).s(f, f2);
        try {
            this.r.a(v30Var, jN, this.v, this.w);
            ((r1) fdVar.e.a).s(-f, -f2);
            v30Var.a();
        } catch (Throwable th) {
            ((r1) fdVar.e.a).s(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        oi0 oi0VarE = g80Var.e(D0(j));
        return n80Var.a0(oi0VarE.d, oi0VarE.e, ls.d, new t6(oi0VarE, 3));
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        if (!A0()) {
            return g80Var.X(i);
        }
        long jD0 = D0(hj.b(0, i, 7));
        return Math.max(gj.j(jD0), g80Var.X(i));
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        if (!A0()) {
            return g80Var.f(i);
        }
        long jD0 = D0(hj.b(i, 0, 13));
        return Math.max(gj.i(jD0), g80Var.f(i));
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.r + ", sizeToIntrinsics=" + this.s + ", alignment=" + this.t + ", alpha=" + this.v + ", colorFilter=" + this.w + ')';
    }
}
