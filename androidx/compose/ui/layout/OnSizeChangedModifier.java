package androidx.compose.ui.layout;

import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.xd0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends i90 {
    public final iw a;

    public OnSizeChangedModifier(iw iwVar) {
        this.a = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.a == ((OnSizeChangedModifier) obj).a;
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        xd0 xd0Var = new xd0();
        xd0Var.r = this.a;
        long j = Integer.MIN_VALUE;
        xd0Var.s = (j & 4294967295L) | (j << 32);
        return xd0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        xd0 xd0Var = (xd0) d90Var;
        xd0Var.r = this.a;
        long j = Integer.MIN_VALUE;
        xd0Var.s = (j & 4294967295L) | (j << 32);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
