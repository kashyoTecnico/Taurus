package androidx.compose.ui.input.key;

import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.p20;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class KeyInputElement extends i90 {
    public final iw a;
    public final iw b;

    public KeyInputElement(iw iwVar, iw iwVar2) {
        this.a = iwVar;
        this.b = iwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.a == keyInputElement.a && this.b == keyInputElement.b;
    }

    @Override // defpackage.i90
    public final d90 f() {
        p20 p20Var = new p20();
        p20Var.r = this.a;
        p20Var.s = this.b;
        return p20Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        p20 p20Var = (p20) d90Var;
        p20Var.r = this.a;
        p20Var.s = this.b;
    }

    public final int hashCode() {
        iw iwVar = this.a;
        int iHashCode = (iwVar != null ? iwVar.hashCode() : 0) * 31;
        iw iwVar2 = this.b;
        return iHashCode + (iwVar2 != null ? iwVar2.hashCode() : 0);
    }
}
