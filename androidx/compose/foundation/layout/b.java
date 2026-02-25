package androidx.compose.foundation.layout;

import defpackage.c10;
import defpackage.e90;
import defpackage.g2;
import defpackage.j;
import defpackage.ra;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class b {
    public static final FillElement a = new FillElement(2);
    public static final FillElement b = new FillElement(3);
    public static final WrapContentElement c;
    public static final WrapContentElement d;

    static {
        ra raVar = g2.o;
        c = new WrapContentElement(1, new j(14, raVar), raVar);
        ra raVar2 = g2.n;
        d = new WrapContentElement(1, new j(14, raVar2), raVar2);
    }

    public static final e90 a(e90 e90Var, float f, float f2) {
        return e90Var.c(new UnspecifiedConstraintsElement(f, f2));
    }

    public static final e90 b(float f) {
        return new SizeElement(f, f);
    }

    public static final e90 c(e90 e90Var, float f, float f2) {
        return e90Var.c(new SizeElement(f, f2));
    }

    public static e90 d(e90 e90Var, float f, float f2, float f3, float f4, int i) {
        return e90Var.c(new SizeElement(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    public static final e90 e(e90 e90Var, float f) {
        return e90Var.c(new SizeElement(f, f, f, f, true));
    }

    public static final e90 f(e90 e90Var, float f, float f2) {
        return e90Var.c(new SizeElement(f, f2, f, f2, true));
    }

    public static final e90 g(e90 e90Var, float f, float f2, float f3, float f4) {
        return e90Var.c(new SizeElement(f, f2, f3, f4, true));
    }

    public static e90 h(e90 e90Var) {
        ra raVar = g2.o;
        return e90Var.c(c10.i(raVar, raVar) ? c : c10.i(raVar, g2.n) ? d : new WrapContentElement(1, new j(14, raVar), raVar));
    }
}
