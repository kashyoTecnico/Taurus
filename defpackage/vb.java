package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vb implements ub {
    public final p31 b = r31.c0(125, 2, new em(0.25f, 0.1f, 0.25f));

    @Override // defpackage.ub
    public final float a(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        float f5 = f3 - f4;
        if ((fAbs <= f3) && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }

    @Override // defpackage.ub
    public final e8 b() {
        return this.b;
    }
}
