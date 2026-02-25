package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fb extends y20 implements iw {
    public final /* synthetic */ oi0 e;
    public final /* synthetic */ g80 f;
    public final /* synthetic */ n80 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ hb j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(oi0 oi0Var, g80 g80Var, n80 n80Var, int i, int i2, hb hbVar) {
        super(1);
        this.e = oi0Var;
        this.f = g80Var;
        this.g = n80Var;
        this.h = i;
        this.i = i2;
        this.j = hbVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        e30 layoutDirection = this.g.getLayoutDirection();
        sa saVar = this.j.a;
        HashMap map = eb.a;
        this.f.l();
        oi0 oi0Var = this.e;
        ni0.i((ni0) obj, oi0Var, saVar.a(d80.e(oi0Var.d, oi0Var.e), d80.e(this.h, this.i), layoutDirection));
        return j41.a;
    }
}
