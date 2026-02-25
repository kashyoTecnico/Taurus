package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class of implements ip, yq {
    public final /* synthetic */ int a;

    @Override // defpackage.ip
    public double b(double d) {
        switch (this.a) {
            case 0:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 1:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 2:
                float[] fArr = pf.a;
                return pf.b(pf.c, d);
            case 3:
                float[] fArr2 = pf.a;
                return pf.a(pf.c, d);
            case 4:
                float[] fArr3 = pf.a;
                return pf.d(pf.d, d);
            case 5:
                float[] fArr4 = pf.a;
                return pf.c(pf.d, d);
            default:
                return d;
        }
    }

    @Override // defpackage.yq
    public float a(float f) {
        return f;
    }
}
