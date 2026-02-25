package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hm0 {
    public Set a;
    public li b;
    public final eb0 c;
    public ua0 d;
    public eb0 e;
    public final eb0 f;
    public final eb0 g;
    public ua0 h;
    public ta0 i;
    public ArrayList j;
    public ua0 k;

    public hm0() {
        eb0 eb0Var = new eb0(new jm0[16]);
        this.c = eb0Var;
        int i = fq0.a;
        this.d = new ua0();
        this.e = eb0Var;
        this.f = new eb0(new Object[16]);
        this.g = new eb0(new gw[16]);
    }

    public final void a() {
        this.a = null;
        this.b = null;
        eb0 eb0Var = this.c;
        eb0Var.g();
        this.d.b();
        this.e = eb0Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                im0 im0Var = (im0) it.next();
                it.remove();
                im0Var.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        eb0 eb0Var = this.f;
        if (eb0Var.f != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                ua0 ua0Var = this.h;
                int i = eb0Var.f;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = eb0Var.d[i];
                    try {
                        if (obj instanceof jm0) {
                            im0 im0Var = ((jm0) obj).a;
                            set.remove(im0Var);
                            im0Var.f();
                        }
                        if (obj instanceof kh) {
                            if (ua0Var == null || !ua0Var.c(obj)) {
                                ((kh) obj).b();
                            } else {
                                ((kh) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        li liVar = this.b;
                        if (liVar != null) {
                            d80.H(th, new ki(0, liVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        eb0 eb0Var2 = this.c;
        if (eb0Var2.f != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = eb0Var2.d;
                    int i2 = eb0Var2.f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        jm0 jm0Var = (jm0) objArr[i3];
                        im0 im0Var2 = jm0Var.a;
                        set2.remove(im0Var2);
                        try {
                            im0Var2.c();
                        } catch (Throwable th2) {
                            li liVar2 = this.b;
                            if (liVar2 != null) {
                                d80.H(th2, new ki(0, liVar2, jm0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d(jm0 jm0Var) {
        if (this.d.c(jm0Var)) {
            this.d.k(jm0Var);
            if (!this.e.j(jm0Var)) {
                eb0 eb0Var = this.c;
                if (!eb0Var.j(jm0Var)) {
                    Object[] objArr = eb0Var.d;
                    int i = eb0Var.f;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (((jm0) objArr[i2]).a instanceof ph0) {
                            throw null;
                        }
                    }
                }
            }
            Set set = this.a;
            if (set == null) {
                return;
            } else {
                set.add(jm0Var.a);
            }
        }
        ua0 ua0Var = this.k;
        if (ua0Var == null || !ua0Var.c(jm0Var)) {
            this.f.b(jm0Var);
        }
    }

    public final void e(Set set, li liVar) {
        a();
        this.a = set;
        this.b = liVar;
    }
}
