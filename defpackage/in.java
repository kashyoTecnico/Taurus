package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class in implements er0 {
    public final y20 a;
    public final hn b = new hn(this);
    public final kb0 c = new kb0();
    public final zg0 d;
    public final zg0 e;
    public final zg0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public in(iw iwVar) {
        this.a = (y20) iwVar;
        Boolean bool = Boolean.FALSE;
        this.d = qo0.n(bool);
        this.e = qo0.n(bool);
        this.f = qo0.n(bool);
    }

    @Override // defpackage.er0
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [iw, y20] */
    @Override // defpackage.er0
    public final float d(float f) {
        return ((Number) this.a.g(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.er0
    public final Object e(int i, ob obVar, mk mkVar) {
        Object objQ = nm.q(new gn(this, i, obVar, null), mkVar);
        return objQ == xl.d ? objQ : j41.a;
    }
}
