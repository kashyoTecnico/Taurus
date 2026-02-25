package androidx.compose.ui.layout;

import defpackage.da0;
import defpackage.e00;
import defpackage.e90;
import defpackage.h9;
import defpackage.r71;
import defpackage.s60;
import defpackage.s71;
import defpackage.t71;
import defpackage.wz;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class b {
    public static final da0 a;
    public static final s71[] b;
    public static final da0 c;

    static {
        da0 da0Var = new da0(8);
        s71.a.getClass();
        t71 t71Var = r71.g;
        da0Var.g(1, t71Var);
        t71 t71Var2 = r71.f;
        da0Var.g(2, t71Var2);
        t71 t71Var3 = r71.b;
        da0Var.g(4, t71Var3);
        t71 t71Var4 = r71.d;
        da0Var.g(8, t71Var4);
        t71 t71Var5 = r71.h;
        da0Var.g(16, t71Var5);
        t71 t71Var6 = r71.e;
        da0Var.g(32, t71Var6);
        t71 t71Var7 = r71.i;
        da0Var.g(64, t71Var7);
        a = da0Var;
        b = new s71[]{t71Var, t71Var2, t71Var3, t71Var7, t71Var5, t71Var6, t71Var4, r71.j, r71.c};
        da0 da0Var2 = new da0(7);
        da0Var2.g(1, t71Var);
        da0Var2.g(2, t71Var2);
        da0Var2.g(4, t71Var3);
        da0Var2.g(16, t71Var5);
        da0Var2.g(64, t71Var7);
        da0Var2.g(32, t71Var6);
        da0Var2.g(8, t71Var4);
        c = da0Var2;
    }

    public static final void a(s60 s60Var, wz wzVar, long j, int i, int i2) {
        if (h9.b(j, -1L)) {
            return;
        }
        s60Var.a(wzVar.b(), (int) ((j >>> 48) & 65535));
        s60Var.a(wzVar.d(), (int) ((j >>> 32) & 65535));
        s60Var.a(wzVar.c(), i - ((int) ((j >>> 16) & 65535)));
        s60Var.a(wzVar.a(), i2 - ((int) (j & 65535)));
    }

    public static final e90 b(e00 e00Var) {
        return new RulerProviderModifierElement(e00Var);
    }
}
