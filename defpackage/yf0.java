package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yf0 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ oi0 g;
    public final /* synthetic */ oi0 h;
    public final /* synthetic */ oi0 i;
    public final /* synthetic */ oi0 j;
    public final /* synthetic */ oi0 k;
    public final /* synthetic */ oi0 l;
    public final /* synthetic */ oi0 m;
    public final /* synthetic */ oi0 n;
    public final /* synthetic */ oi0 o;
    public final /* synthetic */ zf0 p;
    public final /* synthetic */ n80 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(int i, int i2, oi0 oi0Var, oi0 oi0Var2, oi0 oi0Var3, oi0 oi0Var4, oi0 oi0Var5, oi0 oi0Var6, oi0 oi0Var7, oi0 oi0Var8, oi0 oi0Var9, zf0 zf0Var, n80 n80Var) {
        super(1);
        this.e = i;
        this.f = i2;
        this.g = oi0Var;
        this.h = oi0Var2;
        this.i = oi0Var3;
        this.j = oi0Var4;
        this.k = oi0Var5;
        this.l = oi0Var6;
        this.m = oi0Var7;
        this.n = oi0Var8;
        this.o = oi0Var9;
        this.p = zf0Var;
        this.q = n80Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        ni0 ni0Var = (ni0) obj;
        zf0 zf0Var = this.p;
        float f = zf0Var.b;
        n80 n80Var = this.q;
        float fB = n80Var.b();
        e30 layoutDirection = n80Var.getLayoutDirection();
        jg0 jg0Var = zf0Var.c;
        float f2 = xf0.a;
        ni0.i(ni0Var, this.n, 0L);
        float f3 = j01.b;
        oi0 oi0Var = this.o;
        int i = this.e - (oi0Var != null ? oi0Var.e : 0);
        int iB = d80.B(jg0Var.d() * fB);
        int iB2 = d80.B((layoutDirection == e30.d ? jg0Var.b(layoutDirection) : jg0Var.c(layoutDirection)) * fB);
        float f4 = j01.c * fB;
        oi0 oi0Var2 = this.g;
        if (oi0Var2 != null) {
            ni0.j(ni0Var, oi0Var2, 0, Math.round((1 + 0.0f) * ((i - oi0Var2.e) / 2.0f)));
        }
        oi0 oi0Var3 = this.l;
        if (oi0Var3 != null) {
            ni0.j(ni0Var, oi0Var3, d80.B(oi0Var2 == null ? 0.0f : (1 - f) * (oi0Var2.d - f4)) + iB2, r31.L(f, iB, -(oi0Var3.e / 2)));
        }
        oi0 oi0Var4 = this.i;
        if (oi0Var4 != null) {
            ni0.j(ni0Var, oi0Var4, oi0Var2 != null ? oi0Var2.d : 0, xf0.e(i, iB, oi0Var3, oi0Var4));
        }
        int i2 = (oi0Var2 != null ? oi0Var2.d : 0) + (oi0Var4 != null ? oi0Var4.d : 0);
        oi0 oi0Var5 = this.k;
        ni0.j(ni0Var, oi0Var5, i2, xf0.e(i, iB, oi0Var3, oi0Var5));
        oi0 oi0Var6 = this.m;
        if (oi0Var6 != null) {
            ni0.j(ni0Var, oi0Var6, i2, xf0.e(i, iB, oi0Var3, oi0Var6));
        }
        int i3 = this.f;
        oi0 oi0Var7 = this.h;
        oi0 oi0Var8 = this.j;
        if (oi0Var8 != null) {
            ni0.j(ni0Var, oi0Var8, (i3 - (oi0Var7 != null ? oi0Var7.d : 0)) - oi0Var8.d, xf0.e(i, iB, oi0Var3, oi0Var8));
        }
        if (oi0Var7 != null) {
            ni0.j(ni0Var, oi0Var7, i3 - oi0Var7.d, Math.round((1 + 0.0f) * ((i - oi0Var7.e) / 2.0f)));
        }
        if (oi0Var != null) {
            ni0.j(ni0Var, oi0Var, 0, i);
        }
        return j41.a;
    }
}
