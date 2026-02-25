package androidx.compose.foundation.relocation;

import defpackage.c10;
import defpackage.d90;
import defpackage.i90;
import defpackage.lb;
import defpackage.mb;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends i90 {
    public final lb a;

    public BringIntoViewRequesterElement(lb lbVar) {
        this.a = lbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return c10.i(this.a, ((BringIntoViewRequesterElement) obj).a);
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        mb mbVar = new mb();
        mbVar.r = this.a;
        return mbVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        mb mbVar = (mb) d90Var;
        lb lbVar = mbVar.r;
        if (lbVar != null) {
            lbVar.a.j(mbVar);
        }
        lb lbVar2 = this.a;
        if (lbVar2 != null) {
            lbVar2.a.b(mbVar);
        }
        mbVar.r = lbVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
