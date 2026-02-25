package androidx.compose.foundation;

import defpackage.b90;
import defpackage.cv;
import defpackage.d90;
import defpackage.e90;
import defpackage.fa0;
import defpackage.i90;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class c {
    static {
        new i90() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            @Override // defpackage.i90
            public final d90 f() {
                return new cv();
            }

            @Override // defpackage.i90
            public final /* bridge */ /* synthetic */ void g(d90 d90Var) {
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }
        };
    }

    public static final e90 a(e90 e90Var, boolean z, fa0 fa0Var) {
        return e90Var.c(z ? new FocusableElement(fa0Var) : b90.a);
    }
}
