package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class s8 {
    public static final q8 a = new q8("");

    public static final List a(q8 q8Var, int i, int i2, r8 r8Var) {
        List list;
        if (i == i2 || (list = q8Var.d) == null) {
            return null;
        }
        if (i != 0 || i2 < q8Var.e.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                p8 p8Var = (p8) list.get(i3);
                if ((r8Var != null ? ((Boolean) r8Var.g(p8Var.a)).booleanValue() : true) && b(i, i2, p8Var.b, p8Var.c)) {
                    arrayList.add(new p8((m8) p8Var.a, c10.u(p8Var.b, i, i2) - i, c10.u(p8Var.c, i, i2) - i, p8Var.d));
                }
            }
            return arrayList;
        }
        if (r8Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) r8Var.g(((p8) obj).a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
