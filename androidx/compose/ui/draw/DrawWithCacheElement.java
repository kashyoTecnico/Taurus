package androidx.compose.ui.draw;

import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.qc;
import defpackage.rc;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class DrawWithCacheElement extends i90 {
    public final iw a;

    public DrawWithCacheElement(iw iwVar) {
        this.a = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.a == ((DrawWithCacheElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new qc(new rc(), this.a);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        qc qcVar = (qc) d90Var;
        qcVar.t = this.a;
        qcVar.A0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
