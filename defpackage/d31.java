package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d31 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d31(int i, Object obj, Object obj2) {
        super(1);
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i = this.e;
        j41 j41Var = j41.a;
        int i2 = 1;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                nm.z((wl) obj2, null, new bx0((e31) obj3, null), 1);
                return new p6(2);
            case 1:
                e31 e31Var = (e31) obj3;
                c31 c31Var = (c31) obj2;
                e31Var.g.add(c31Var);
                return new i4(4, e31Var, c31Var);
            case 2:
                ((Number) obj).longValue();
                r41 r41Var = (r41) obj2;
                float f = r41Var.e;
                r41Var.e = 0.0f;
                ((iw) obj3).g(Float.valueOf(f));
                return j41Var;
            case 3:
                p71 p71Var = (p71) obj2;
                View view = (View) obj3;
                f00 f00Var = p71Var.t;
                if (p71Var.s == 0) {
                    int i3 = a61.a;
                    w51.a(view, f00Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(f00Var);
                    a61.a(view, f00Var);
                }
                p71Var.s++;
                return new i4(5, p71Var, view);
            default:
                d3 d3Var = (d3) obj;
                kw kwVar = (kw) obj3;
                i81 i81Var = (i81) obj2;
                if (!i81Var.f) {
                    a50 lifecycle = d3Var.a.getLifecycle();
                    i81Var.h = kwVar;
                    if (i81Var.g == null) {
                        i81Var.g = lifecycle;
                        lifecycle.a(i81Var);
                    } else if (((h50) lifecycle).c.compareTo(z40.f) >= 0) {
                        i81Var.e.A(new zg(1330788943, true, new h81(i81Var, kwVar, i2)));
                    }
                }
                return j41Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d31(e31 e31Var, c31 c31Var) {
        super(1);
        this.e = 1;
        this.f = e31Var;
        this.g = c31Var;
    }
}
