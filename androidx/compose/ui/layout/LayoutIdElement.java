package androidx.compose.ui.layout;

import defpackage.d90;
import defpackage.h30;
import defpackage.i90;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class LayoutIdElement extends i90 {
    public final String a;

    public LayoutIdElement(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.a.equals(((LayoutIdElement) obj).a);
    }

    @Override // defpackage.i90
    public final d90 f() {
        h30 h30Var = new h30();
        h30Var.r = this.a;
        return h30Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((h30) d90Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.a) + ')';
    }
}
