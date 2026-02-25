package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hn implements pq0 {
    public final /* synthetic */ in a;

    public hn(in inVar) {
        this.a = inVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [iw, y20] */
    @Override // defpackage.pq0
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        in inVar = this.a;
        float fFloatValue = ((Number) inVar.a.g(Float.valueOf(f))).floatValue();
        inVar.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        inVar.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
