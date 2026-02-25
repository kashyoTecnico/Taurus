package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o10 extends u10 {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ o10(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.u10
    public final boolean k() {
        switch (this.h) {
        }
        return false;
    }

    @Override // defpackage.u10
    public final void l(Throwable th) {
        switch (this.h) {
            case 0:
                ((iw) this.i).g(th);
                break;
            default:
                v10 v10Var = (v10) this.i;
                Object obj = y10.d.get(j());
                if (!(obj instanceof eg)) {
                    v10Var.h(m20.R(obj));
                    break;
                } else {
                    v10Var.h(c10.z(((eg) obj).a));
                    break;
                }
        }
    }
}
