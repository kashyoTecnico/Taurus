package androidx.compose.ui.semantics;

import defpackage.d90;
import defpackage.i90;
import defpackage.ms;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends i90 {
    public final ms a;

    public EmptySemanticsElement(ms msVar) {
        this.a = msVar;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.i90
    public final d90 f() {
        return this.a;
    }

    @Override // defpackage.i90
    public final /* bridge */ /* synthetic */ void g(d90 d90Var) {
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
