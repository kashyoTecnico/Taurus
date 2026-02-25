package androidx.compose.ui.input.pointer;

import defpackage.c10;
import defpackage.d90;
import defpackage.i90;
import defpackage.ky0;
import defpackage.py0;
import defpackage.yz0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends i90 {
    public final Object a;
    public final Object b;
    public final ky0 c;

    public SuspendPointerInputElement(Object obj, yz0 yz0Var, ky0 ky0Var, int i) {
        yz0Var = (i & 2) != 0 ? null : yz0Var;
        this.a = obj;
        this.b = yz0Var;
        this.c = ky0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return c10.i(this.a, suspendPointerInputElement.a) && c10.i(this.b, suspendPointerInputElement.b) && this.c == suspendPointerInputElement.c;
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new py0(this.a, this.b, this.c);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        py0 py0Var = (py0) d90Var;
        Object obj = py0Var.r;
        Object obj2 = this.a;
        boolean z = !c10.i(obj, obj2);
        py0Var.r = obj2;
        Object obj3 = py0Var.s;
        Object obj4 = this.b;
        if (!c10.i(obj3, obj4)) {
            z = true;
        }
        py0Var.s = obj4;
        if (py0Var.u.getClass() == ky0.class ? z : true) {
            py0Var.C0();
        }
        py0Var.u = this.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
