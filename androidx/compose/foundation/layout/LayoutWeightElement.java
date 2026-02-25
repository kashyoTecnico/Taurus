package androidx.compose.foundation.layout;

import defpackage.d90;
import defpackage.g40;
import defpackage.i90;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends i90 {
    public final float a;
    public final boolean b;

    public LayoutWeightElement(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a && this.b == layoutWeightElement.b;
    }

    @Override // defpackage.i90
    public final d90 f() {
        g40 g40Var = new g40();
        g40Var.r = this.a;
        g40Var.s = this.b;
        return g40Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        g40 g40Var = (g40) d90Var;
        g40Var.r = this.a;
        g40Var.s = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
