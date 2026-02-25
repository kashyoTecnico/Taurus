package androidx.compose.foundation;

import defpackage.bb;
import defpackage.c10;
import defpackage.d90;
import defpackage.fw0;
import defpackage.i90;
import defpackage.ju0;
import defpackage.kp;
import defpackage.qc;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends i90 {
    public final float a;
    public final fw0 b;
    public final ju0 c;

    public BorderModifierNodeElement(float f, fw0 fw0Var, ju0 ju0Var) {
        this.a = f;
        this.b = fw0Var;
        this.c = ju0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return kp.a(this.a, borderModifierNodeElement.a) && this.b.equals(borderModifierNodeElement.b) && c10.i(this.c, borderModifierNodeElement.c);
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new bb(this.a, this.b, this.c);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        bb bbVar = (bb) d90Var;
        float f = bbVar.u;
        qc qcVar = bbVar.x;
        float f2 = this.a;
        if (!kp.a(f, f2)) {
            bbVar.u = f2;
            qcVar.A0();
        }
        fw0 fw0Var = bbVar.v;
        fw0 fw0Var2 = this.b;
        if (!c10.i(fw0Var, fw0Var2)) {
            bbVar.v = fw0Var2;
            qcVar.A0();
        }
        ju0 ju0Var = bbVar.w;
        ju0 ju0Var2 = this.c;
        if (c10.i(ju0Var, ju0Var2)) {
            return;
        }
        bbVar.w = ju0Var2;
        qcVar.A0();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) kp.b(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
