package androidx.compose.foundation.text.input.internal;

import defpackage.c10;
import defpackage.d90;
import defpackage.i90;
import defpackage.m40;
import defpackage.r40;
import defpackage.u01;
import defpackage.z5;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends i90 {
    public final z5 a;
    public final r40 b;
    public final u01 c;

    public LegacyAdaptingPlatformTextInputModifier(z5 z5Var, r40 r40Var, u01 u01Var) {
        this.a = z5Var;
        this.b = r40Var;
        this.c = u01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return c10.i(this.a, legacyAdaptingPlatformTextInputModifier.a) && c10.i(this.b, legacyAdaptingPlatformTextInputModifier.b) && c10.i(this.c, legacyAdaptingPlatformTextInputModifier.c);
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new m40(this.a, this.b, this.c);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        m40 m40Var = (m40) d90Var;
        if (m40Var.q) {
            m40Var.r.f();
            m40Var.r.k(m40Var);
        }
        z5 z5Var = this.a;
        m40Var.r = z5Var;
        if (m40Var.q) {
            if (z5Var.a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            z5Var.a = m40Var;
        }
        m40Var.s = this.b;
        m40Var.t = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
