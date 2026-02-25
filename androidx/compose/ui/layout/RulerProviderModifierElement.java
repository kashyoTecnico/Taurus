package androidx.compose.ui.layout;

import defpackage.d80;
import defpackage.d90;
import defpackage.e00;
import defpackage.i90;
import defpackage.oo0;
import defpackage.t30;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class RulerProviderModifierElement extends i90 {
    public final e00 a;

    public RulerProviderModifierElement(e00 e00Var) {
        this.a = e00Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.a : null) == this.a;
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new oo0(this.a);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        oo0 oo0Var = (oo0) d90Var;
        e00 e00Var = oo0Var.r;
        e00 e00Var2 = this.a;
        if (e00Var != e00Var2) {
            oo0Var.r = e00Var2;
            t30.U(d80.z(oo0Var), false, 7);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
