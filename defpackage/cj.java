package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cj extends dj {
    public final hn0 e;
    public final hn0 f;
    public final float[] g;

    public cj(hn0 hn0Var, hn0 hn0Var2) {
        float[] fArrO;
        super(hn0Var2, hn0Var, hn0Var2, null);
        this.e = hn0Var;
        this.f = hn0Var2;
        float[] fArr = (float[]) r1.f.e;
        r61 r61Var = hn0Var.d;
        float[] fArr2 = hn0Var.i;
        r61 r61Var2 = hn0Var2.d;
        float[] fArr3 = hn0Var2.j;
        if (l81.v(r61Var, r61Var2)) {
            fArrO = l81.O(fArr3, fArr2);
        } else {
            float[] fArrA = r61Var.a();
            float[] fArrA2 = r61Var2.a();
            r61 r61Var3 = c10.e;
            fArrO = l81.O(l81.v(r61Var2, r61Var3) ? fArr3 : l81.I(l81.O(l81.u(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), hn0Var2.i)), l81.v(r61Var, r61Var3) ? fArr2 : l81.O(l81.u(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrO;
    }

    @Override // defpackage.dj
    public final long a(long j) {
        float fH = bf.h(j);
        float fG = bf.g(j);
        float fE = bf.e(j);
        float fD = bf.d(j);
        dn0 dn0Var = this.e.p;
        float fB = (float) dn0Var.b(fH);
        float fB2 = (float) dn0Var.b(fG);
        float fB3 = (float) dn0Var.b(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f2 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f3 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        hn0 hn0Var = this.f;
        float fB4 = (float) hn0Var.m.b(f);
        dn0 dn0Var2 = hn0Var.m;
        return r31.b(fB4, (float) dn0Var2.b(f2), (float) dn0Var2.b(f3), fD, hn0Var);
    }
}
