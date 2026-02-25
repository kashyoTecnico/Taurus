package androidx.compose.ui.input.pointer;

import defpackage.c10;
import defpackage.d90;
import defpackage.i90;
import defpackage.jj0;
import defpackage.n6;
import defpackage.nm;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends i90 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        n6 n6Var = nm.j;
        return n6Var.equals(n6Var);
    }

    @Override // defpackage.i90
    public final d90 f() {
        n6 n6Var = nm.j;
        jj0 jj0Var = new jj0();
        jj0Var.r = n6Var;
        return jj0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        jj0 jj0Var = (jj0) d90Var;
        n6 n6Var = nm.j;
        if (c10.i(jj0Var.r, n6Var)) {
            return;
        }
        jj0Var.r = n6Var;
        if (jj0Var.s) {
            jj0Var.C0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (1008 * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + nm.j + ", overrideDescendants=false)";
    }
}
