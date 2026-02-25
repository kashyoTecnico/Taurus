package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fe {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public fe(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            y40 y40Var = (y40) entry.getValue();
            List arrayList = (List) this.a.get(y40Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(y40Var, arrayList);
            }
            arrayList.add((ge) entry.getKey());
        }
    }

    public static void a(List list, f50 f50Var, y40 y40Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ge geVar = (ge) list.get(size);
                Method method = geVar.b;
                try {
                    int i = geVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, f50Var);
                    } else if (i == 2) {
                        method.invoke(obj, f50Var, y40Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
