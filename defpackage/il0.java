package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class il0 {
    public final ArrayList a = new ArrayList();

    public il0(Object obj) {
    }

    public final boolean a(mx mxVar, Object obj) {
        ArrayList arrayList = mxVar.a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof m2) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof mx)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (a((mx) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(mx mxVar, Object obj) {
    }
}
