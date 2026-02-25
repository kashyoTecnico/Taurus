package androidx.compose.ui.input.rotary;

import defpackage.d90;
import defpackage.do0;
import defpackage.e3;
import defpackage.i90;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class RotaryInputElement extends i90 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    @Override // defpackage.i90
    public final d90 f() {
        e3 e3Var = e3.h;
        do0 do0Var = new do0();
        do0Var.r = e3Var;
        return do0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((do0) d90Var).r = e3.h;
    }

    public final int hashCode() {
        return e3.h.hashCode() * 31;
    }
}
