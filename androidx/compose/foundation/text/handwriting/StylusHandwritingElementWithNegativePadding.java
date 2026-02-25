package androidx.compose.foundation.text.handwriting;

import defpackage.c10;
import defpackage.d90;
import defpackage.gw;
import defpackage.i90;
import defpackage.rx0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends i90 {
    public final gw a;

    public StylusHandwritingElementWithNegativePadding(gw gwVar) {
        this.a = gwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && c10.i(this.a, ((StylusHandwritingElementWithNegativePadding) obj).a);
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new rx0(this.a);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((rx0) d90Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.a + ')';
    }
}
