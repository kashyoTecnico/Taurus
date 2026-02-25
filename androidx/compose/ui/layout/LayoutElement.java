package androidx.compose.ui.layout;

import defpackage.d90;
import defpackage.i90;
import defpackage.k30;
import defpackage.lw;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class LayoutElement extends i90 {
    public final lw a;

    public LayoutElement(lw lwVar) {
        this.a = lwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.a == ((LayoutElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        k30 k30Var = new k30();
        k30Var.r = this.a;
        return k30Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((k30) d90Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
