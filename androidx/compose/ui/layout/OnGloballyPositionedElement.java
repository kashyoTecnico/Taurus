package androidx.compose.ui.layout;

import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.vd0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends i90 {
    public final iw a;

    public OnGloballyPositionedElement(iw iwVar) {
        this.a = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.a == ((OnGloballyPositionedElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        vd0 vd0Var = new vd0();
        vd0Var.r = this.a;
        return vd0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((vd0) d90Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
