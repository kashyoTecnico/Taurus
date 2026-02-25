package androidx.compose.foundation;

import defpackage.b8;
import defpackage.c10;
import defpackage.d90;
import defpackage.i90;
import defpackage.rq0;
import defpackage.tq0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class ScrollSemanticsElement extends i90 {
    public final tq0 a;

    public ScrollSemanticsElement(tq0 tq0Var) {
        this.a = tq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrollSemanticsElement) && c10.i(this.a, ((ScrollSemanticsElement) obj).a);
    }

    @Override // defpackage.i90
    public final d90 f() {
        rq0 rq0Var = new rq0();
        rq0Var.r = this.a;
        rq0Var.s = true;
        return rq0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        rq0 rq0Var = (rq0) d90Var;
        rq0Var.r = this.a;
        rq0Var.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + b8.d(b8.d(this.a.hashCode() * 31, 961, false), 31, true);
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}
