package androidx.compose.ui.draw;

import defpackage.b8;
import defpackage.c10;
import defpackage.c51;
import defpackage.d90;
import defpackage.g2;
import defpackage.i90;
import defpackage.m20;
import defpackage.mg0;
import defpackage.nm;
import defpackage.pj;
import defpackage.sa;
import defpackage.ta;
import defpackage.yu0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class PainterElement extends i90 {
    public final c51 a;
    public final ta b;

    public PainterElement(c51 c51Var, ta taVar) {
        this.a = c51Var;
        this.b = taVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!c10.i(this.a, painterElement.a)) {
            return false;
        }
        sa saVar = g2.i;
        if (!saVar.equals(saVar)) {
            return false;
        }
        Object obj2 = pj.a;
        return obj2.equals(obj2) && Float.compare(1.0f, 1.0f) == 0 && c10.i(this.b, painterElement.b);
    }

    @Override // defpackage.i90
    public final d90 f() {
        sa saVar = g2.i;
        mg0 mg0Var = new mg0();
        mg0Var.r = this.a;
        mg0Var.s = true;
        mg0Var.t = saVar;
        mg0Var.u = pj.a;
        mg0Var.v = 1.0f;
        mg0Var.w = this.b;
        return mg0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        mg0 mg0Var = (mg0) d90Var;
        boolean z = mg0Var.s;
        c51 c51Var = this.a;
        boolean z2 = (z && yu0.a(mg0Var.r.b(), c51Var.b())) ? false : true;
        mg0Var.r = c51Var;
        mg0Var.s = true;
        mg0Var.t = g2.i;
        mg0Var.u = pj.a;
        mg0Var.v = 1.0f;
        mg0Var.w = this.b;
        if (z2) {
            nm.v(mg0Var);
        }
        m20.F(mg0Var);
    }

    public final int hashCode() {
        int iB = b8.b(1.0f, (pj.a.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + b8.d(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        ta taVar = this.b;
        return iB + (taVar == null ? 0 : taVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + g2.i + ", contentScale=" + pj.a + ", alpha=1.0, colorFilter=" + this.b + ')';
    }
}
