package androidx.compose.foundation;

import defpackage.b8;
import defpackage.c10;
import defpackage.d90;
import defpackage.gr0;
import defpackage.i90;
import defpackage.tq0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends i90 {
    public final tq0 a;

    public ScrollingLayoutElement(tq0 tq0Var) {
        this.a = tq0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return c10.i(this.a, ((ScrollingLayoutElement) obj).a);
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        gr0 gr0Var = new gr0();
        gr0Var.r = this.a;
        gr0Var.s = true;
        return gr0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        gr0 gr0Var = (gr0) d90Var;
        gr0Var.r = this.a;
        gr0Var.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + b8.d(this.a.hashCode() * 31, 31, false);
    }
}
