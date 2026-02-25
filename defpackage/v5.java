package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v5 implements wt {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v5(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.wt
    public final Object i(Object obj, lk lkVar) {
        switch (this.d) {
            case 0:
                xz xzVar = (xz) this.e;
                if (Build.VERSION.SDK_INT >= 34) {
                    c9.a.a(xzVar.m(), (View) xzVar.e);
                }
                break;
            case 1:
                v00 v00Var = (v00) obj;
                zv0 zv0Var = (zv0) this.e;
                if (v00Var instanceof ny) {
                    zv0Var.add(v00Var);
                } else if (v00Var instanceof oy) {
                    zv0Var.remove(((oy) v00Var).a);
                } else if (v00Var instanceof lu) {
                    zv0Var.add(v00Var);
                } else if (v00Var instanceof mu) {
                    zv0Var.remove(((mu) v00Var).a);
                } else if (v00Var instanceof fk0) {
                    zv0Var.add(v00Var);
                } else if (v00Var instanceof gk0) {
                    zv0Var.remove(((gk0) v00Var).a);
                } else if (v00Var instanceof ek0) {
                    zv0Var.remove(((ek0) v00Var).a);
                }
                break;
            default:
                ((l90) this.e).d.h(((Number) obj).floatValue());
                break;
        }
        return j41.a;
    }
}
