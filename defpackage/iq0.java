package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class iq0 extends l implements yl {
    public final lk g;

    public iq0(lk lkVar, ml mlVar) {
        super(mlVar, true);
        this.g = lkVar;
    }

    @Override // defpackage.y10
    public final boolean R() {
        return true;
    }

    @Override // defpackage.yl
    public final yl d() {
        lk lkVar = this.g;
        if (lkVar instanceof yl) {
            return (yl) lkVar;
        }
        return null;
    }

    @Override // defpackage.y10
    public void y(Object obj) {
        m20.K(r31.I(this.g), nm.B(obj));
    }

    @Override // defpackage.y10
    public void z(Object obj) {
        this.g.h(nm.B(obj));
    }
}
