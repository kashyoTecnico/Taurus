package androidx.compose.foundation.gestures;

import defpackage.b8;
import defpackage.c10;
import defpackage.cg0;
import defpackage.d90;
import defpackage.dr0;
import defpackage.er0;
import defpackage.fa0;
import defpackage.h9;
import defpackage.i90;
import defpackage.if0;
import defpackage.mr0;
import defpackage.oj;
import defpackage.py0;
import defpackage.q2;
import defpackage.s40;
import defpackage.xz;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class ScrollableElement extends i90 {
    public final er0 a;
    public final if0 b;
    public final cg0 c;
    public final boolean d;
    public final boolean e;
    public final fa0 f;

    public ScrollableElement(fa0 fa0Var, if0 if0Var, cg0 cg0Var, er0 er0Var, boolean z, boolean z2) {
        this.a = er0Var;
        this.b = if0Var;
        this.c = cg0Var;
        this.d = z;
        this.e = z2;
        this.f = fa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return c10.i(this.a, scrollableElement.a) && this.b == scrollableElement.b && c10.i(this.c, scrollableElement.c) && this.d == scrollableElement.d && this.e == scrollableElement.e && c10.i(this.f, scrollableElement.f);
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new dr0(this.f, this.b, this.c, this.a, this.d, this.e);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        boolean z;
        py0 py0Var;
        dr0 dr0Var = (dr0) d90Var;
        mr0 mr0Var = dr0Var.F;
        boolean z2 = dr0Var.v;
        boolean z3 = this.d;
        boolean z4 = true;
        boolean z5 = false;
        if (z2 != z3) {
            dr0Var.G.b = z3;
            dr0Var.D.r = z3;
            z = true;
        } else {
            z = false;
        }
        xz xzVar = dr0Var.E;
        q2 q2Var = dr0Var.C;
        er0 er0Var = mr0Var.a;
        er0 er0Var2 = this.a;
        if (!c10.i(er0Var, er0Var2)) {
            mr0Var.a = er0Var2;
            z5 = true;
        }
        cg0 cg0Var = this.c;
        mr0Var.b = cg0Var;
        if0 if0Var = mr0Var.d;
        if0 if0Var2 = this.b;
        if (if0Var != if0Var2) {
            mr0Var.d = if0Var2;
            z5 = true;
        }
        boolean z6 = mr0Var.e;
        boolean z7 = this.e;
        if (z6 != z7) {
            mr0Var.e = z7;
            z5 = true;
        }
        mr0Var.c = xzVar;
        mr0Var.f = q2Var;
        oj ojVar = dr0Var.H;
        ojVar.r = if0Var2;
        ojVar.t = z7;
        dr0Var.B = cg0Var;
        s40 s40Var = s40.C;
        if0 if0Var3 = mr0Var.d;
        if0 if0Var4 = if0.d;
        if (if0Var3 != if0Var4) {
            if0Var4 = if0.e;
        }
        dr0Var.u = s40Var;
        if (dr0Var.v != z3) {
            dr0Var.v = z3;
            if (!z3) {
                dr0Var.G0();
                py0 py0Var2 = dr0Var.A;
                if (py0Var2 != null) {
                    dr0Var.B0(py0Var2);
                }
                dr0Var.A = null;
            }
            z5 = true;
        }
        fa0 fa0Var = dr0Var.w;
        fa0 fa0Var2 = this.f;
        if (!c10.i(fa0Var, fa0Var2)) {
            dr0Var.G0();
            dr0Var.w = fa0Var2;
        }
        if (dr0Var.t != if0Var4) {
            dr0Var.t = if0Var4;
        } else {
            z4 = z5;
        }
        if (z4 && (py0Var = dr0Var.A) != null) {
            py0Var.C0();
        }
        if (z) {
            dr0Var.J = null;
            dr0Var.K = null;
            h9.i(dr0Var);
        }
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        cg0 cg0Var = this.c;
        int iD = b8.d(b8.d((iHashCode + (cg0Var != null ? cg0Var.hashCode() : 0)) * 31, 31, this.d), 961, this.e);
        fa0 fa0Var = this.f;
        return (iD + (fa0Var != null ? fa0Var.hashCode() : 0)) * 31;
    }
}
