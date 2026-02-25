package androidx.compose.foundation.layout;

import defpackage.d90;
import defpackage.hy;
import defpackage.i90;
import defpackage.qa;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends i90 {
    public final qa a;

    public HorizontalAlignElement(qa qaVar) {
        this.a = qaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.a.equals(horizontalAlignElement.a);
    }

    @Override // defpackage.i90
    public final d90 f() {
        hy hyVar = new hy();
        hyVar.r = this.a;
        return hyVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((hy) d90Var).r = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
