package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ce0 extends ef0 {
    public static final ce0 c = new ce0(0, 2, 1);

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) {
        int i = ((r00) twVar.c(0)).a;
        List list = (List) twVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            f9Var.c(i3, obj);
            f9Var.f(i3, obj);
        }
    }
}
