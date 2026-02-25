package androidx.compose.ui.draw;

import defpackage.c51;
import defpackage.e90;
import defpackage.iw;
import defpackage.ta;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a {
    public static final e90 a(e90 e90Var, iw iwVar) {
        return e90Var.c(new DrawBehindElement(iwVar));
    }

    public static final e90 b(e90 e90Var, iw iwVar) {
        return e90Var.c(new DrawWithCacheElement(iwVar));
    }

    public static final e90 c(e90 e90Var, iw iwVar) {
        return e90Var.c(new DrawWithContentElement(iwVar));
    }

    public static e90 d(e90 e90Var, c51 c51Var, ta taVar) {
        return e90Var.c(new PainterElement(c51Var, taVar));
    }
}
