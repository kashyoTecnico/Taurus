package androidx.compose.foundation.layout;

import defpackage.b8;
import defpackage.d90;
import defpackage.et;
import defpackage.i90;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class FillElement extends i90 {
    public final int a;

    public FillElement(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.a == ((FillElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        et etVar = new et();
        etVar.r = this.a;
        etVar.s = 1.0f;
        return etVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        et etVar = (et) d90Var;
        etVar.r = this.a;
        etVar.s = 1.0f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (b8.p(this.a) * 31);
    }
}
