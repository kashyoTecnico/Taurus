package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tq0 implements er0 {
    public static final xz i = new xz(21, n9.z, s40.B);
    public final wg0 a;
    public float e;
    public final wg0 b = new wg0(0);
    public final fa0 c = new fa0();
    public final wg0 d = new wg0(Integer.MAX_VALUE);
    public final in f = new in(new h(22, this));
    public final fo g = qo0.g(new sq0(this, 1));
    public final fo h = qo0.g(new sq0(this, 0));

    public tq0(int i2) {
        this.a = new wg0(i2);
    }

    @Override // defpackage.er0
    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.er0
    public final boolean b() {
        return this.f.b();
    }

    @Override // defpackage.er0
    public final boolean c() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.er0
    public final float d(float f) {
        return this.f.d(f);
    }

    @Override // defpackage.er0
    public final Object e(int i2, ob obVar, mk mkVar) {
        Object objE = this.f.e(i2, obVar, mkVar);
        return objE == xl.d ? objE : j41.a;
    }
}
