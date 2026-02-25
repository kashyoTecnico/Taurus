package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class c01 implements gf, pw {
    public final /* synthetic */ g60 a;

    public c01(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // defpackage.gf
    public final long a() {
        return ((bf) this.a.get()).a;
    }

    @Override // defpackage.pw
    public final ow b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gf) || !(obj instanceof pw)) {
            return false;
        }
        return this.a.equals(((pw) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
