package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class i50 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, e50 e50Var) {
        try {
            c10.m(constructor.newInstance(e50Var));
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int iQ = px0.q(str, ".", 0, false);
        if (iQ >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i = 0;
            do {
                sb2.append((CharSequence) str, i, iQ);
                sb2.append("_");
                i = iQ + 1;
                if (iQ >= str.length()) {
                    break;
                }
                iQ = px0.q(str, ".", i, false);
            } while (iQ > 0);
            sb2.append((CharSequence) str, i, str.length());
            str = sb2.toString();
            c10.o(str, "toString(...)");
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i50.c(java.lang.Class):int");
    }
}
