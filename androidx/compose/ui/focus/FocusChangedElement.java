package androidx.compose.ui.focus;

import defpackage.d90;
import defpackage.fu;
import defpackage.i90;
import defpackage.iw;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class FocusChangedElement extends i90 {
    public final iw a;

    public FocusChangedElement(iw iwVar) {
        this.a = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.a == ((FocusChangedElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        fu fuVar = new fu();
        fuVar.r = this.a;
        return fuVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((fu) d90Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
