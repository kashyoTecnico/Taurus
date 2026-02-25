package androidx.compose.foundation;

import defpackage.c10;
import defpackage.d90;
import defpackage.ev;
import defpackage.fa0;
import defpackage.i90;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class FocusableElement extends i90 {
    public final fa0 a;

    public FocusableElement(fa0 fa0Var) {
        this.a = fa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return c10.i(this.a, ((FocusableElement) obj).a);
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new ev(this.a);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((ev) d90Var).D0(this.a);
    }

    public final int hashCode() {
        fa0 fa0Var = this.a;
        if (fa0Var != null) {
            return fa0Var.hashCode();
        }
        return 0;
    }
}
