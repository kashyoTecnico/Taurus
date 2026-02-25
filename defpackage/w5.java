package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 extends rw implements iw {
    public final /* synthetic */ m40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(m40 m40Var) {
        super(1, b10.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.l = m40Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        float[] fArr = ((e80) obj).a;
        d30 d30Var = (d30) this.l.u.getValue();
        if (d30Var != null) {
            if (!d30Var.H()) {
                d30Var = null;
            }
            if (d30Var != null) {
                d30Var.J(fArr);
            }
        }
        return j41.a;
    }
}
