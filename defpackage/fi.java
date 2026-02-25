package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class fi {
    public static final yd0 a = new yd0("provider");
    public static final yd0 b = new yd0("provider");
    public static final yd0 c = new yd0("compositionLocalMap");
    public static final yd0 d = new yd0("providers");
    public static final yd0 e = new yd0("reference");
    public static final di f = new di(0);

    public static final void a(List list, int i, int i2) {
        int iE = e(i, list);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < list.size() && ((l10) list.get(iE)).b < i2) {
        }
    }

    public static final void b(av0 av0Var, ArrayList arrayList, int i) {
        boolean zL = av0Var.l(i);
        int[] iArr = av0Var.b;
        if (zL) {
            arrayList.add(av0Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(av0Var, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new lh("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void d(String str) {
        throw new lh("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int e(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iW = c10.w(((l10) list.get(i3)).b, i);
            if (iW < 0) {
                i2 = i3 + 1;
            } else {
                if (iW <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void f(ev0 ev0Var, int i, Object obj) {
        int iH = ev0Var.h(i);
        Object[] objArr = ev0Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = vh.a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
