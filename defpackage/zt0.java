package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zt0 extends au0 {
    public static List v(xt0 xt0Var) {
        Iterator it = xt0Var.iterator();
        if (!it.hasNext()) {
            return ks.d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return d80.t(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
