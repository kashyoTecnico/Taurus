package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface l80 {
    default int b(x00 x00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new an((g80) list.get(i2), y00.e, z00.e, 0));
        }
        return g(new i10(x00Var, x00Var.getLayoutDirection()), arrayList, hj.b(i, 0, 13)).c();
    }

    default int d(x00 x00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new an((g80) list.get(i2), y00.e, z00.d, 0));
        }
        return g(new i10(x00Var, x00Var.getLayoutDirection()), arrayList, hj.b(0, i, 7)).e();
    }

    m80 g(n80 n80Var, List list, long j);

    default int h(x00 x00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new an((g80) list.get(i2), y00.d, z00.e, 0));
        }
        return g(new i10(x00Var, x00Var.getLayoutDirection()), arrayList, hj.b(i, 0, 13)).c();
    }

    default int j(x00 x00Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new an((g80) list.get(i2), y00.d, z00.d, 0));
        }
        return g(new i10(x00Var, x00Var.getLayoutDirection()), arrayList, hj.b(0, i, 7)).e();
    }
}
