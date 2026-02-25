package androidx.compose.ui.graphics;

import defpackage.e90;
import defpackage.hx;
import defpackage.ju0;
import defpackage.nm;
import defpackage.x21;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a {
    public static e90 a(e90 e90Var, float f, ju0 ju0Var, int i) {
        if ((i & 32) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        long j = x21.a;
        if ((i & 2048) != 0) {
            ju0Var = nm.h;
        }
        long j2 = hx.a;
        return e90Var.c(new GraphicsLayerElement(1.0f, f2, j, ju0Var, false, j2, j2));
    }

    public static e90 b(e90 e90Var, float f, ju0 ju0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        long j = x21.a;
        if ((i & 2048) != 0) {
            ju0Var = nm.h;
        }
        long j2 = hx.a;
        return e90Var.c(new GraphicsLayerElement(f2, 0.0f, j, ju0Var, true, j2, j2));
    }
}
