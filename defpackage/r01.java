package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r01 implements er0 {
    public final /* synthetic */ er0 a;
    public final fo b;
    public final fo c;

    public r01(er0 er0Var, s01 s01Var) {
        this.a = er0Var;
        this.b = qo0.g(new q01(s01Var, 1));
        this.c = qo0.g(new q01(s01Var, 0));
    }

    @Override // defpackage.er0
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.er0
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.er0
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.er0
    public final float d(float f) {
        return this.a.d(f);
    }

    @Override // defpackage.er0
    public final Object e(int i, ob obVar, mk mkVar) {
        return this.a.e(i, obVar, mkVar);
    }
}
