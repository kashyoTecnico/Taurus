package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h11 implements dj0 {
    public final View a;
    public final e9 b;
    public final i11 c;
    public boolean d;
    public y20 e;
    public iw f;
    public a11 g;
    public xy h;
    public final ArrayList i;
    public final Object j;
    public Rect k;
    public final hm l;
    public final eb0 m;
    public b3 n;

    public h11(View view, p3 p3Var) {
        e9 e9Var = new e9();
        e9Var.a = view;
        e9Var.b = m20.I(new b(11, e9Var));
        e9Var.c = new r1(view);
        i11 i11Var = new i11(Choreographer.getInstance());
        this.a = view;
        this.b = e9Var;
        this.c = i11Var;
        this.e = k01.m;
        this.f = k01.n;
        this.g = new a11("", w11.b, 4);
        this.h = xy.f;
        this.i = new ArrayList();
        this.j = m20.I(new b(24, this));
        this.l = new hm(p3Var, e9Var);
        this.m = new eb0(new g11[16]);
    }

    @Override // defpackage.dj0
    public final void a(a11 a11Var, xy xyVar, u7 u7Var, xk xkVar) {
        this.d = true;
        this.g = a11Var;
        this.h = xyVar;
        this.e = u7Var;
        this.f = xkVar;
        i(g11.d);
    }

    @Override // defpackage.dj0
    public final void b() {
        i(g11.d);
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [h40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [h40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [h40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h40, java.lang.Object] */
    @Override // defpackage.dj0
    public final void c(a11 a11Var, a11 a11Var2) {
        boolean z = (w11.a(this.g.b, a11Var2.b) && c10.i(this.g.c, a11Var2.c)) ? false : true;
        this.g = a11Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            tl0 tl0Var = (tl0) ((WeakReference) this.i.get(i)).get();
            if (tl0Var != null) {
                tl0Var.d = a11Var2;
            }
        }
        hm hmVar = this.l;
        synchronized (hmVar.c) {
            hmVar.j = null;
            hmVar.l = null;
            hmVar.k = null;
            hmVar.m = e3.B;
            hmVar.n = null;
            hmVar.o = null;
        }
        if (c10.i(a11Var, a11Var2)) {
            if (z) {
                e9 e9Var = this.b;
                int iE = w11.e(a11Var2.b);
                int iD = w11.d(a11Var2.b);
                w11 w11Var = this.g.c;
                int iE2 = w11Var != null ? w11.e(w11Var.a) : -1;
                w11 w11Var2 = this.g.c;
                ((InputMethodManager) e9Var.b.getValue()).updateSelection((View) e9Var.a, iE, iD, iE2, w11Var2 != null ? w11.d(w11Var2.a) : -1);
                return;
            }
            return;
        }
        if (a11Var != null && (!c10.i(a11Var.a.e, a11Var2.a.e) || (w11.a(a11Var.b, a11Var2.b) && !c10.i(a11Var.c, a11Var2.c)))) {
            e9 e9Var2 = this.b;
            ((InputMethodManager) e9Var2.b.getValue()).restartInput((View) e9Var2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            tl0 tl0Var2 = (tl0) ((WeakReference) this.i.get(i2)).get();
            if (tl0Var2 != null) {
                a11 a11Var3 = this.g;
                e9 e9Var3 = this.b;
                if (tl0Var2.h) {
                    tl0Var2.d = a11Var3;
                    if (tl0Var2.f) {
                        ((InputMethodManager) e9Var3.b.getValue()).updateExtractedText((View) e9Var3.a, tl0Var2.e, nm.H(a11Var3));
                    }
                    w11 w11Var3 = a11Var3.c;
                    long j = a11Var3.b;
                    int iE3 = w11Var3 != null ? w11.e(w11Var3.a) : -1;
                    w11 w11Var4 = a11Var3.c;
                    ((InputMethodManager) e9Var3.b.getValue()).updateSelection((View) e9Var3.a, w11.e(j), w11.d(j), iE3, w11Var4 != null ? w11.d(w11Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.dj0
    public final void d() {
        i(g11.f);
    }

    @Override // defpackage.dj0
    public final void e() {
        i(g11.g);
    }

    @Override // defpackage.dj0
    public final void f() {
        this.d = false;
        this.e = k01.o;
        this.f = k01.p;
        this.k = null;
        i(g11.e);
    }

    @Override // defpackage.dj0
    public final void g(xl0 xl0Var) {
        Rect rect;
        this.k = new Rect(d80.B(xl0Var.a), d80.B(xl0Var.b), d80.B(xl0Var.c), d80.B(xl0Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.dj0
    public final void h(a11 a11Var, hd0 hd0Var, o11 o11Var, ey0 ey0Var, xl0 xl0Var, xl0 xl0Var2) {
        hm hmVar = this.l;
        synchronized (hmVar.c) {
            try {
                hmVar.j = a11Var;
                hmVar.l = hd0Var;
                hmVar.k = o11Var;
                hmVar.m = ey0Var;
                hmVar.n = xl0Var;
                hmVar.o = xl0Var2;
                if (hmVar.e || hmVar.d) {
                    hmVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(g11 g11Var) {
        this.m.b(g11Var);
        if (this.n == null) {
            b3 b3Var = new b3(11, this);
            this.c.execute(b3Var);
            this.n = b3Var;
        }
    }
}
