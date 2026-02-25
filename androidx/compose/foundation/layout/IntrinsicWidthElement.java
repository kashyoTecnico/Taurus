package androidx.compose.foundation.layout;

import defpackage.a10;
import defpackage.b8;
import defpackage.d90;
import defpackage.i90;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends i90 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    @Override // defpackage.i90
    public final d90 f() {
        a10 a10Var = new a10();
        a10Var.r = 2;
        a10Var.s = true;
        return a10Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        a10 a10Var = (a10) d90Var;
        a10Var.r = 2;
        a10Var.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (b8.p(2) * 31);
    }
}
