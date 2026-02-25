package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f4 implements ap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ap
    public final void a() {
        switch (this.a) {
            case 0:
                ((dp) this.b).b.a();
                break;
            case 1:
                qo qoVar = (qo) this.b;
                qoVar.dismiss();
                mo moVar = qoVar.k;
                i81 i81Var = moVar.f;
                if (i81Var != null) {
                    i81Var.e();
                }
                moVar.f = null;
                moVar.requestLayout();
                break;
            case 2:
                wj0 wj0Var = (wj0) this.b;
                i81 i81Var2 = wj0Var.f;
                if (i81Var2 != null) {
                    i81Var2.e();
                }
                wj0Var.f = null;
                wj0Var.requestLayout();
                dq0.l(wj0Var, null);
                wj0Var.q.removeViewImmediate(wj0Var);
                break;
            case 3:
                ((u01) this.b).k();
                break;
            case 4:
                ss0 ss0Var = (ss0) this.b;
                ss0Var.i();
                ss0Var.i.setValue(Boolean.FALSE);
                break;
            default:
                e31 e31Var = (e31) this.b;
                e31Var.f();
                e31Var.a.getClass();
                break;
        }
    }
}
