package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements kw {
    public final /* synthetic */ hm0 d;
    public final /* synthetic */ ev0 e;

    public /* synthetic */ ei(hm0 hm0Var, ev0 ev0Var) {
        this.d = hm0Var;
        this.e = ev0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        boolean z = obj2 instanceof kh;
        hm0 hm0Var = this.d;
        if (z) {
            hm0Var.f.b((kh) obj2);
        } else {
            boolean z2 = obj2 instanceof jm0;
            ev0 ev0Var = this.e;
            if (z2) {
                jm0 jm0Var = (jm0) obj2;
                if (!(jm0Var.a instanceof zh)) {
                    fi.f(ev0Var, iIntValue, obj2);
                    hm0Var.d(jm0Var);
                }
            } else if (obj2 instanceof nl0) {
                fi.f(ev0Var, iIntValue, obj2);
                ((nl0) obj2).d();
            }
        }
        return j41.a;
    }
}
