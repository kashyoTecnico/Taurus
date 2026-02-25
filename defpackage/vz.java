package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vz extends nc0 {
    public static final a6 T;
    public final xy0 R;
    public uz S;

    static {
        a6 a6VarD = c10.d();
        a6VarD.e(bf.d);
        a6VarD.a.setStrokeWidth(1.0f);
        a6VarD.i(1);
        T = a6VarD;
    }

    public vz(t30 t30Var) {
        super(t30Var);
        xy0 xy0Var = new xy0();
        xy0Var.g = 0;
        this.R = xy0Var;
        xy0Var.k = this;
        this.S = t30Var.j != null ? new uz(this) : null;
    }

    @Override // defpackage.nc0
    public final void J0() {
        if (this.S == null) {
            this.S = new uz(this);
        }
    }

    @Override // defpackage.nc0
    public final x60 M0() {
        return this.S;
    }

    @Override // defpackage.nc0
    public final d90 O0() {
        return this.R;
    }

    @Override // defpackage.g80
    public final int S(int i) {
        xz xzVarS = this.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.j(t30Var.G.d, t30Var.l(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.nc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(defpackage.lc0 r17, long r18, defpackage.gy r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz.U0(lc0, long, gy, int, boolean):void");
    }

    @Override // defpackage.g80
    public final int X(int i) {
        xz xzVarS = this.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.d(t30Var.G.d, t30Var.l(), i);
    }

    @Override // defpackage.g80
    public final int b0(int i) {
        xz xzVarS = this.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.h(t30Var.G.d, t30Var.l(), i);
    }

    @Override // defpackage.nc0
    public final void d1(dd ddVar, fx fxVar) {
        t30 t30Var = this.r;
        eg0 eg0VarU = r31.U(t30Var);
        eb0 eb0VarW = t30Var.w();
        Object[] objArr = eb0VarW.d;
        int i = eb0VarW.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            if (t30Var2.I()) {
                t30Var2.i(ddVar, fxVar);
            }
        }
        if (((p3) eg0VarU).getShowLayoutBounds()) {
            long j = this.f;
            ddVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, T);
        }
    }

    @Override // defpackage.g80
    public final oi0 e(long j) {
        i0(j);
        t30 t30Var = this.r;
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((t30) objArr[i2]).H.p.o = r30.f;
        }
        h1(t30Var.x.g(this, t30Var.l(), j));
        Z0();
        return this;
    }

    @Override // defpackage.g80
    public final int f(int i) {
        xz xzVarS = this.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.b(t30Var.G.d, t30Var.l(), i);
    }

    @Override // defpackage.oi0
    public final void g0(long j, float f, iw iwVar) {
        e1(j, f, iwVar);
        if (this.m) {
            return;
        }
        this.r.H.p.s0();
    }

    @Override // defpackage.v60
    public final int o0(iy iyVar) {
        uz uzVar = this.S;
        if (uzVar != null) {
            return uzVar.o0(iyVar);
        }
        k80 k80Var = this.r.H.p;
        u30 u30Var = k80Var.z;
        if (k80Var.i.d == p30.d) {
            u30Var.d = true;
            if (u30Var.b) {
                k80Var.x = true;
                k80Var.y = true;
            }
        } else {
            u30Var.e = true;
        }
        k80Var.o().n = true;
        k80Var.r();
        k80Var.o().n = false;
        Integer num = (Integer) u30Var.g.get(iyVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
