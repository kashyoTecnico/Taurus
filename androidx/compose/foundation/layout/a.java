package androidx.compose.foundation.layout;

import defpackage.e90;
import defpackage.jg0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a {
    public static final jg0 a(float f, float f2, float f3, float f4) {
        return new jg0(f, f2, f3, f4);
    }

    public static jg0 b(float f) {
        return new jg0(0, 0, 0, f);
    }

    public static final e90 c(e90 e90Var, jg0 jg0Var) {
        return e90Var.c(new PaddingValuesElement(jg0Var));
    }

    public static final e90 d(e90 e90Var, float f) {
        return e90Var.c(new PaddingElement(f, f, f, f));
    }

    public static final e90 e(e90 e90Var, float f, float f2) {
        return e90Var.c(new PaddingElement(f, f2, f, f2));
    }

    public static e90 f(e90 e90Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return e(e90Var, f, f2);
    }

    public static e90 g(e90 e90Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        return e90Var.c(new PaddingElement(f, f2, f3, 0));
    }

    public static final e90 h(e90 e90Var) {
        return e90Var.c(new IntrinsicWidthElement());
    }
}
