package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g40 extends d90 implements ah0 {
    public float r;
    public boolean s;

    @Override // defpackage.ah0
    public final Object g0(Object obj) {
        jo0 jo0Var = obj instanceof jo0 ? (jo0) obj : null;
        if (jo0Var == null) {
            jo0Var = new jo0();
        }
        jo0Var.a = this.r;
        jo0Var.b = this.s;
        return jo0Var;
    }
}
