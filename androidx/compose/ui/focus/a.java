package androidx.compose.ui.focus;

import defpackage.e90;
import defpackage.iw;
import defpackage.vu;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a {
    public static final e90 a(e90 e90Var, vu vuVar) {
        return e90Var.c(new FocusRequesterElement(vuVar));
    }

    public static final e90 b(e90 e90Var, iw iwVar) {
        return e90Var.c(new FocusChangedElement(iwVar));
    }
}
