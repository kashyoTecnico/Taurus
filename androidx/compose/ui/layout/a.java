package androidx.compose.ui.layout;

import defpackage.e90;
import defpackage.g80;
import defpackage.h30;
import defpackage.iw;
import defpackage.lw;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(g80 g80Var) {
        Object objL = g80Var.l();
        h30 h30Var = objL instanceof h30 ? (h30) objL : null;
        if (h30Var != null) {
            return h30Var.r;
        }
        return null;
    }

    public static final e90 b(lw lwVar) {
        return new LayoutElement(lwVar);
    }

    public static final e90 c(e90 e90Var, String str) {
        return e90Var.c(new LayoutIdElement(str));
    }

    public static final e90 d(e90 e90Var, iw iwVar) {
        return e90Var.c(new OnGloballyPositionedElement(iwVar));
    }

    public static final e90 e(e90 e90Var, iw iwVar) {
        return e90Var.c(new OnSizeChangedModifier(iwVar));
    }
}
