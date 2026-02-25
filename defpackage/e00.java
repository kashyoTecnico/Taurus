package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.compose.ui.layout.b;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e00 extends v61 implements Runnable, kd0, View.OnAttachStateChangeListener {
    public boolean e;
    public int f;
    public n71 g;
    public final ta0 h;
    public final wg0 i;
    public final ma0 j;
    public final zv0 k;

    public e00() {
        super(1);
        ta0 ta0Var = new ta0(9);
        s71.a.getClass();
        ta0Var.l(r71.b, new c81("caption bar"));
        ta0Var.l(r71.c, new c81("display cutout"));
        ta0Var.l(r71.d, new c81("ime"));
        ta0Var.l(r71.e, new c81("mandatory system gestures"));
        ta0Var.l(r71.f, new c81("navigation bars"));
        ta0Var.l(r71.g, new c81("status bars"));
        ta0Var.l(r71.h, new c81("system gestures"));
        ta0Var.l(r71.i, new c81("tappable element"));
        ta0Var.l(r71.j, new c81("waterfall"));
        this.h = ta0Var;
        this.i = new wg0(0);
        this.j = new ma0(4);
        this.k = new zv0();
    }

    @Override // defpackage.kd0
    public final n71 a(View view, n71 n71Var) {
        if (this.e) {
            this.g = n71Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return n71Var;
            }
        } else if (this.f == 0) {
            f(n71Var);
        }
        return n71Var;
    }

    @Override // defpackage.v61
    public final void b(x61 x61Var) {
        boolean z = false;
        this.e = false;
        int typeMask = ((WindowInsetsAnimation) x61Var.a.a).getTypeMask();
        this.f &= ~typeMask;
        this.g = null;
        s71 s71Var = (s71) b.c.b(typeMask);
        if (s71Var != null) {
            Object objG = this.h.g(s71Var);
            c10.m(objG);
            c81 c81Var = (c81) objG;
            c81Var.c.h(0.0f);
            c81Var.e.h(1.0f);
            c81Var.d.g(0L);
            c81Var.c.h(0.0f);
            c81Var.b.setValue(Boolean.FALSE);
            c81Var.j = -1L;
            c81Var.k = -1L;
            wg0 wg0Var = this.i;
            wg0Var.h(wg0Var.g() + 1);
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

    @Override // defpackage.v61
    public final void c(x61 x61Var) {
        this.e = true;
    }

    @Override // defpackage.v61
    public final n71 d(n71 n71Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x61 x61Var = (x61) list.get(i);
            s71 s71Var = (s71) b.c.b(((WindowInsetsAnimation) x61Var.a.a).getTypeMask());
            if (s71Var != null) {
                Object objG = this.h.g(s71Var);
                c10.m(objG);
                c81 c81Var = (c81) objG;
                if (((Boolean) c81Var.b.getValue()).booleanValue()) {
                    k51 k51Var = x61Var.a;
                    WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) k51Var.a;
                    WindowInsetsAnimation windowInsetsAnimation2 = (WindowInsetsAnimation) k51Var.a;
                    c81Var.c.h(windowInsetsAnimation.getInterpolatedFraction());
                    c81Var.e.h(windowInsetsAnimation2.getAlpha());
                    c81Var.d.g(windowInsetsAnimation2.getDurationMillis());
                }
            }
        }
        f(n71Var);
        return n71Var;
    }

    @Override // defpackage.v61
    public final xz e(x61 x61Var, xz xzVar) {
        n71 n71Var = this.g;
        boolean z = false;
        this.e = false;
        this.g = null;
        if (((WindowInsetsAnimation) x61Var.a.a).getDurationMillis() > 0 && n71Var != null) {
            int typeMask = ((WindowInsetsAnimation) x61Var.a.a).getTypeMask();
            this.f |= typeMask;
            s71 s71Var = (s71) b.c.b(typeMask);
            if (s71Var != null) {
                Object objG = this.h.g(s71Var);
                c10.m(objG);
                c81 c81Var = (c81) objG;
                d00 d00VarF = n71Var.a.f(typeMask);
                long j = (d00VarF.a << 48) | (d00VarF.b << 32) | (d00VarF.c << 16) | d00VarF.d;
                long j2 = c81Var.h;
                if (!h9.b(j, j2)) {
                    c81Var.j = j2;
                    c81Var.k = j;
                    c81Var.b.setValue(Boolean.TRUE);
                    k51 k51Var = x61Var.a;
                    c81Var.c.h(((WindowInsetsAnimation) k51Var.a).getInterpolatedFraction());
                    c81Var.e.h(((WindowInsetsAnimation) k51Var.a).getAlpha());
                    c81Var.d.g(((WindowInsetsAnimation) k51Var.a).getDurationMillis());
                    wg0 wg0Var = this.i;
                    wg0Var.h(wg0Var.g() + 1);
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
                        return xzVar;
                    }
                }
            }
        }
        return xzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.n71 r34) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e00.f(n71):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = a61.a;
        w51.a(view, this);
        a61.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = a61.a;
        w51.a(view, null);
        view.setWindowInsetsAnimationCallback(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            this.f = 0;
            this.e = false;
            n71 n71Var = this.g;
            if (n71Var != null) {
                f(n71Var);
                this.g = null;
            }
        }
    }
}
