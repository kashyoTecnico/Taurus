package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f00 extends v61 implements Runnable, kd0, View.OnAttachStateChangeListener {
    public final p71 e;
    public boolean f;
    public boolean g;
    public n71 h;

    public f00(p71 p71Var) {
        super(!p71Var.r ? 1 : 0);
        this.e = p71Var;
    }

    @Override // defpackage.kd0
    public final n71 a(View view, n71 n71Var) {
        this.h = n71Var;
        p71 p71Var = this.e;
        v41 v41Var = p71Var.p;
        k71 k71Var = n71Var.a;
        v41Var.f(qo0.u(k71Var.f(8)));
        if (this.f) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.g) {
            p71Var.q.f(qo0.u(k71Var.f(8)));
            p71.a(p71Var, n71Var);
        }
        return p71Var.r ? n71.b : n71Var;
    }

    @Override // defpackage.v61
    public final void b(x61 x61Var) {
        this.f = false;
        this.g = false;
        n71 n71Var = this.h;
        if (((WindowInsetsAnimation) x61Var.a.a).getDurationMillis() != 0 && n71Var != null) {
            k71 k71Var = n71Var.a;
            p71 p71Var = this.e;
            p71Var.q.f(qo0.u(k71Var.f(8)));
            p71Var.p.f(qo0.u(k71Var.f(8)));
            p71.a(p71Var, n71Var);
        }
        this.h = null;
    }

    @Override // defpackage.v61
    public final void c(x61 x61Var) {
        this.f = true;
        this.g = true;
    }

    @Override // defpackage.v61
    public final n71 d(n71 n71Var, List list) {
        p71 p71Var = this.e;
        p71.a(p71Var, n71Var);
        return p71Var.r ? n71.b : n71Var;
    }

    @Override // defpackage.v61
    public final xz e(x61 x61Var, xz xzVar) {
        this.f = false;
        return xzVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            this.f = false;
            this.g = false;
            n71 n71Var = this.h;
            if (n71Var != null) {
                p71 p71Var = this.e;
                p71Var.q.f(qo0.u(n71Var.a.f(8)));
                p71.a(p71Var, n71Var);
                this.h = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
