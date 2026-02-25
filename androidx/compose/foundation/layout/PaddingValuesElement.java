package androidx.compose.foundation.layout;

import defpackage.c10;
import defpackage.d90;
import defpackage.i90;
import defpackage.jg0;
import defpackage.kg0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class PaddingValuesElement extends i90 {
    public final jg0 a;

    public PaddingValuesElement(jg0 jg0Var) {
        this.a = jg0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return c10.i(this.a, paddingValuesElement.a);
    }

    @Override // defpackage.i90
    public final d90 f() {
        kg0 kg0Var = new kg0();
        kg0Var.r = this.a;
        return kg0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((kg0) d90Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
