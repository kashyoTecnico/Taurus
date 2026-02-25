package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class qp0 {
    public static final List a = ve.M(Application.class, ep0.class);
    public static final List b = d80.t(ep0.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        c10.p(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        c10.o(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            c10.o(parameterTypes, "getParameterTypes(...)");
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new p9(parameterTypes, false)) : d80.t(parameterTypes[0]) : ks.d;
            if (list.equals(arrayList)) {
                return constructor;
            }
            if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final f61 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (f61) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
