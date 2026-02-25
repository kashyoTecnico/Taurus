package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class be0 extends ef0 {
    public static final be0 c = new be0(0, 2, 1);

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        r00 r00Var = (r00) twVar.c(1);
        int i = r00Var != null ? r00Var.a : 0;
        jd jdVar = (jd) twVar.c(0);
        if (i > 0) {
            f9Var = new fd0(f9Var, i);
        }
        jdVar.K(f9Var, ev0Var, hm0Var, ff0Var != null ? new xz(16, ff0Var, ev0Var) : null);
    }
}
