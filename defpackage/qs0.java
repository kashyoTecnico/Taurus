package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qs0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qs0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                ga0 ga0Var = (ga0) this.b;
                return c4.m(Integer.valueOf(ga0Var.c(jLongValue)), Integer.valueOf(ga0Var.c(((Number) obj2).longValue())));
            case 1:
                int iCompare = ((Comparator) this.b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return t30.S.compare(((gt0) obj).c, ((gt0) obj2).c);
            default:
                int iCompare2 = ((qs0) this.b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : c4.m(Integer.valueOf(((gt0) obj).g), Integer.valueOf(((gt0) obj2).g));
        }
    }

    public qs0(Comparator comparator) {
        this.a = 1;
        this.b = comparator;
    }
}
