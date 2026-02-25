package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ot {
    public final float a;
    public final float b;

    public ot(float f, xn xnVar) {
        this.a = f;
        float fB = xnVar.b();
        float f2 = pt.a;
        this.b = fB * 386.0878f * 160.0f * 0.84f;
    }

    public final nt a(float f) {
        double dB = b(f);
        double d = pt.a;
        double d2 = d - 1.0d;
        return new nt(f, (float) (Math.exp((d / d2) * dB) * this.a * this.b), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = n5.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
