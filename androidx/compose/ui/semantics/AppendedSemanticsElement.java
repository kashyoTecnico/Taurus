package androidx.compose.ui.semantics;

import defpackage.c90;
import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.ok;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends i90 implements c90 {
    public final boolean a;
    public final iw b;

    public AppendedSemanticsElement(iw iwVar, boolean z) {
        this.a = z;
        this.b = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && this.b == appendedSemanticsElement.b;
    }

    @Override // defpackage.i90
    public final d90 f() {
        ok okVar = new ok();
        okVar.r = this.a;
        okVar.s = this.b;
        return okVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ok okVar = (ok) d90Var;
        okVar.r = this.a;
        okVar.s = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
