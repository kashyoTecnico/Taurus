package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z5 implements dj0 {
    public m40 a;
    public rw0 b;
    public t40 c;
    public qu0 d;

    @Override // defpackage.dj0
    public final void a(a11 a11Var, xy xyVar, u7 u7Var, xk xkVar) {
        j(new u5(a11Var, this, xyVar, u7Var, xkVar, 0));
    }

    @Override // defpackage.dj0
    public final void b() {
        j(null);
    }

    @Override // defpackage.dj0
    public final void c(a11 a11Var, a11 a11Var2) {
        t40 t40Var = this.c;
        if (t40Var != null) {
            boolean z = (w11.a(t40Var.h.b, a11Var2.b) && c10.i(t40Var.h.c, a11Var2.c)) ? false : true;
            t40Var.h = a11Var2;
            int size = t40Var.j.size();
            for (int i = 0; i < size; i++) {
                ul0 ul0Var = (ul0) ((WeakReference) t40Var.j.get(i)).get();
                if (ul0Var != null) {
                    ul0Var.g = a11Var2;
                }
            }
            n40 n40Var = t40Var.m;
            synchronized (n40Var.c) {
                n40Var.j = null;
                n40Var.l = null;
                n40Var.k = null;
                n40Var.m = null;
                n40Var.n = null;
            }
            if (c10.i(a11Var, a11Var2)) {
                if (z) {
                    xz xzVar = t40Var.b;
                    int iE = w11.e(a11Var2.b);
                    int iD = w11.d(a11Var2.b);
                    w11 w11Var = t40Var.h.c;
                    int iE2 = w11Var != null ? w11.e(w11Var.a) : -1;
                    w11 w11Var2 = t40Var.h.c;
                    xzVar.m().updateSelection((View) xzVar.e, iE, iD, iE2, w11Var2 != null ? w11.d(w11Var2.a) : -1);
                    return;
                }
                return;
            }
            if (a11Var != null && (!c10.i(a11Var.a.e, a11Var2.a.e) || (w11.a(a11Var.b, a11Var2.b) && !c10.i(a11Var.c, a11Var2.c)))) {
                xz xzVar2 = t40Var.b;
                xzVar2.m().restartInput((View) xzVar2.e);
                return;
            }
            int size2 = t40Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ul0 ul0Var2 = (ul0) ((WeakReference) t40Var.j.get(i2)).get();
                if (ul0Var2 != null) {
                    a11 a11Var3 = t40Var.h;
                    xz xzVar3 = t40Var.b;
                    if (ul0Var2.k) {
                        ul0Var2.g = a11Var3;
                        if (ul0Var2.i) {
                            xzVar3.m().updateExtractedText((View) xzVar3.e, ul0Var2.h, r31.j(a11Var3));
                        }
                        w11 w11Var3 = a11Var3.c;
                        long j = a11Var3.b;
                        int iE3 = w11Var3 != null ? w11.e(w11Var3.a) : -1;
                        w11 w11Var4 = a11Var3.c;
                        xzVar3.m().updateSelection((View) xzVar3.e, w11.e(j), w11.d(j), iE3, w11Var4 != null ? w11.d(w11Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.dj0
    public final void d() {
        cw0 cw0Var;
        m40 m40Var = this.a;
        if (m40Var == null || (cw0Var = (cw0) l81.A(m40Var, ti.p)) == null) {
            return;
        }
        ((nn) cw0Var).b();
    }

    @Override // defpackage.dj0
    public final void e() {
        cw0 cw0Var;
        m40 m40Var = this.a;
        if (m40Var == null || (cw0Var = (cw0) l81.A(m40Var, ti.p)) == null) {
            return;
        }
        ((nn) cw0Var).a();
    }

    @Override // defpackage.dj0
    public final void f() {
        rw0 rw0Var = this.b;
        if (rw0Var != null) {
            rw0Var.a(null);
        }
        this.b = null;
        xa0 xa0VarI = i();
        if (xa0VarI != null) {
            qu0 qu0Var = (qu0) xa0VarI;
            synchronized (qu0Var) {
                qu0Var.u(qu0Var.o() + qu0Var.n, qu0Var.m, qu0Var.o() + qu0Var.n, qu0Var.o() + qu0Var.n + qu0Var.o);
            }
        }
    }

    @Override // defpackage.dj0
    public final void g(xl0 xl0Var) {
        Rect rect;
        t40 t40Var = this.c;
        if (t40Var != null) {
            t40Var.l = new Rect(d80.B(xl0Var.a), d80.B(xl0Var.b), d80.B(xl0Var.c), d80.B(xl0Var.d));
            if (!t40Var.j.isEmpty() || (rect = t40Var.l) == null) {
                return;
            }
            t40Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.dj0
    public final void h(a11 a11Var, hd0 hd0Var, o11 o11Var, ey0 ey0Var, xl0 xl0Var, xl0 xl0Var2) {
        t40 t40Var = this.c;
        if (t40Var != null) {
            n40 n40Var = t40Var.m;
            synchronized (n40Var.c) {
                try {
                    n40Var.j = a11Var;
                    n40Var.l = hd0Var;
                    n40Var.k = o11Var;
                    n40Var.m = xl0Var;
                    n40Var.n = xl0Var2;
                    if (n40Var.e || n40Var.d) {
                        n40Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final xa0 i() {
        qu0 qu0Var = this.d;
        if (qu0Var != null) {
            return qu0Var;
        }
        if (!sx0.a) {
            return null;
        }
        qu0 qu0VarD = c4.d(2, ec.f);
        this.d = qu0VarD;
        return qu0VarD;
    }

    public final void j(u5 u5Var) {
        m40 m40Var = this.a;
        if (m40Var == null) {
            return;
        }
        this.b = m40Var.q ? nm.z(m40Var.o0(), null, new c(m40Var, new y5(u5Var, this, m40Var, rw0Var, 0), rw0Var, 15), 1) : null;
    }

    public final void k(m40 m40Var) {
        if (this.a == m40Var) {
            this.a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + m40Var + " but was " + this.a).toString());
    }
}
