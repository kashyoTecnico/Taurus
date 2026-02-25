package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ve extends d80 {
    public static ArrayList K(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new p9(objArr, true));
    }

    public static int L(List list) {
        c10.p(list, "<this>");
        return list.size() - 1;
    }

    public static List M(Object... objArr) {
        if (objArr.length <= 0) {
            return ks.d;
        }
        List listAsList = Arrays.asList(objArr);
        c10.o(listAsList, "asList(...)");
        return listAsList;
    }

    public static void N() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
