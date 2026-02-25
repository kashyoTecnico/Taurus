package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class b80 extends d80 {
    public static int K(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void L(HashMap map, ng0[] ng0VarArr) {
        for (ng0 ng0Var : ng0VarArr) {
            map.put(ng0Var.d, ng0Var.e);
        }
    }
}
