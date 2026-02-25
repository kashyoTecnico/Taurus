package androidx.compose.ui.focus;

import defpackage.c10;
import defpackage.d90;
import defpackage.i90;
import defpackage.vu;
import defpackage.xu;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class FocusRequesterElement extends i90 {
    public final vu a;

    public FocusRequesterElement(vu vuVar) {
        this.a = vuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && c10.i(this.a, ((FocusRequesterElement) obj).a);
    }

    @Override // defpackage.i90
    public final d90 f() {
        xu xuVar = new xu();
        xuVar.r = this.a;
        return xuVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        xu xuVar = (xu) d90Var;
        xuVar.r.a.j(xuVar);
        vu vuVar = this.a;
        xuVar.r = vuVar;
        vuVar.a.b(xuVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
