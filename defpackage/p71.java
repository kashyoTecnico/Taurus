package defpackage;

import android.view.View;
import com.taurus.dgmobilemx.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p71 {
    public static final WeakHashMap u = new WeakHashMap();
    public final t7 a = kc0.j("captionBar", 4);
    public final t7 b;
    public final t7 c;
    public final t7 d;
    public final t7 e;
    public final t7 f;
    public final t7 g;
    public final t7 h;
    public final t7 i;
    public final v41 j;
    public final v41 k;
    public final v41 l;
    public final v41 m;
    public final v41 n;
    public final v41 o;
    public final v41 p;
    public final v41 q;
    public final boolean r;
    public int s;
    public final f00 t;

    public p71(View view) {
        t7 t7VarJ = kc0.j("displayCutout", 128);
        this.b = t7VarJ;
        t7 t7VarJ2 = kc0.j("ime", 8);
        this.c = t7VarJ2;
        t7 t7VarJ3 = kc0.j("mandatorySystemGestures", 32);
        this.d = t7VarJ3;
        this.e = kc0.j("navigationBars", 2);
        this.f = kc0.j("statusBars", 1);
        t7 t7VarJ4 = kc0.j("systemBars", 519);
        this.g = t7VarJ4;
        t7 t7VarJ5 = kc0.j("systemGestures", 16);
        this.h = t7VarJ5;
        t7 t7VarJ6 = kc0.j("tappableElement", 64);
        this.i = t7VarJ6;
        v41 v41Var = new v41(new g00(0, 0, 0, 0), "waterfall");
        this.j = v41Var;
        new i41(new i41(t7VarJ4, t7VarJ2), t7VarJ);
        new i41(new i41(new i41(t7VarJ6, t7VarJ3), t7VarJ5), v41Var);
        this.k = kc0.l("captionBarIgnoringVisibility", 4);
        this.l = kc0.l("navigationBarsIgnoringVisibility", 2);
        this.m = kc0.l("statusBarsIgnoringVisibility", 1);
        this.n = kc0.l("systemBarsIgnoringVisibility", 519);
        this.o = kc0.l("tappableElementIgnoringVisibility", 64);
        this.p = kc0.l("imeAnimationTarget", 8);
        this.q = kc0.l("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.r = bool != null ? bool.booleanValue() : true;
        this.t = new f00(this);
    }

    public static void a(p71 p71Var, n71 n71Var) {
        boolean z = false;
        p71Var.a.f(n71Var, 0);
        p71Var.c.f(n71Var, 0);
        p71Var.b.f(n71Var, 0);
        p71Var.e.f(n71Var, 0);
        p71Var.f.f(n71Var, 0);
        p71Var.g.f(n71Var, 0);
        p71Var.h.f(n71Var, 0);
        p71Var.i.f(n71Var, 0);
        p71Var.d.f(n71Var, 0);
        p71Var.k.f(qo0.u(n71Var.a.g(4)));
        p71Var.l.f(qo0.u(n71Var.a.g(2)));
        p71Var.m.f(qo0.u(n71Var.a.g(1)));
        p71Var.n.f(qo0.u(n71Var.a.g(519)));
        p71Var.o.f(qo0.u(n71Var.a.g(64)));
        yo yoVarE = n71Var.a.e();
        if (yoVarE != null) {
            p71Var.j.f(qo0.u(d00.c(yoVarE.a.getWaterfallInsets())));
        }
        synchronized (ov0.c) {
            ua0 ua0Var = ov0.j.h;
            if (ua0Var != null) {
                if (ua0Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            ov0.a();
        }
    }
}
