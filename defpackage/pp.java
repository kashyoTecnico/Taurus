package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pp extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ zl0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(r1 r1Var, qp qpVar, zl0 zl0Var) {
        super(1);
        this.e = 0;
        this.f = zl0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                qp qpVar = (qp) obj;
                if (!qpVar.q) {
                    return i31.e;
                }
                if (qpVar.s != null) {
                    pz.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                qpVar.s = null;
                zl0 zl0Var = this.f;
                zl0Var.d = zl0Var.d;
                return i31.d;
            case 1:
                if (!((jj0) obj).s) {
                    return i31.d;
                }
                this.f.d = false;
                return i31.f;
            default:
                if (((pr0) obj).f.a.a.e.length() > 0) {
                    this.f.d = false;
                }
                return j41.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp(zl0 zl0Var, int i) {
        super(1);
        this.e = i;
        this.f = zl0Var;
    }
}
