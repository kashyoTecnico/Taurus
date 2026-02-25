package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hc0 {
    public d90 a;
    public int b;
    public eb0 c;
    public eb0 d;
    public boolean e;
    public final /* synthetic */ jc0 f;

    public hc0(jc0 jc0Var, d90 d90Var, int i, eb0 eb0Var, eb0 eb0Var2, boolean z) {
        this.f = jc0Var;
        this.a = d90Var;
        this.b = i;
        this.c = eb0Var;
        this.d = eb0Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        eb0 eb0Var = this.c;
        int i3 = this.b;
        c90 c90Var = (c90) eb0Var.d[i + i3];
        c90 c90Var2 = (c90) this.d.d[i3 + i2];
        return c10.i(c90Var, c90Var2) || c90Var.getClass() == c90Var2.getClass();
    }
}
