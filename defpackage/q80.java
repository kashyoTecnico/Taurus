package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class q80 implements d50 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q80(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                e9 e9Var = (e9) obj;
                e9Var.getClass();
                if (y40Var == y40.ON_DESTROY) {
                    e9Var.x();
                    break;
                }
                break;
            default:
                np0 np0Var = (np0) obj;
                if (y40Var != y40.ON_START) {
                    if (y40Var == y40.ON_STOP) {
                        np0Var.h = false;
                        break;
                    }
                } else {
                    np0Var.h = true;
                    break;
                }
                break;
        }
    }
}
