package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ht0 {
    public final ct0 a;
    public final ea0 b;

    public ht0(gt0 gt0Var, k00 k00Var) {
        this.a = gt0Var.d;
        this.b = new ea0(gt0.j(4, gt0Var).size());
        List listJ = gt0.j(4, gt0Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            gt0 gt0Var2 = (gt0) listJ.get(i);
            if (k00Var.a(gt0Var2.g)) {
                this.b.a(gt0Var2.g);
            }
        }
    }
}
