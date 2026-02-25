package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i4 implements ap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ap
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((k4) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((l4) obj);
                break;
            case 2:
                ((nz) obj2).a.j((lz) obj);
                break;
            case 3:
                za0 za0Var = (za0) obj2;
                fk0 fk0Var = (fk0) za0Var.getValue();
                if (fk0Var != null) {
                    ek0 ek0Var = new ek0(fk0Var);
                    fa0 fa0Var = (fa0) obj;
                    if (fa0Var != null) {
                        fa0Var.b(ek0Var);
                    }
                    za0Var.setValue(null);
                    break;
                }
                break;
            case 4:
                ((e31) obj2).g.remove((c31) obj);
                break;
            default:
                p71 p71Var = (p71) obj2;
                View view = (View) obj;
                int i2 = p71Var.s - 1;
                p71Var.s = i2;
                if (i2 == 0) {
                    int i3 = a61.a;
                    w51.a(view, null);
                    view.setWindowInsetsAnimationCallback(null);
                    view.removeOnAttachStateChangeListener(p71Var.t);
                    break;
                }
                break;
        }
    }
}
