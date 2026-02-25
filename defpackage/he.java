package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class he {
    public static final he c = new he();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, ge geVar, y40 y40Var, Class cls) {
        y40 y40Var2 = (y40) map.get(geVar);
        if (y40Var2 == null || y40Var == y40Var2) {
            if (y40Var2 == null) {
                map.put(geVar, y40Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + geVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + y40Var2 + ", new value " + y40Var);
    }

    public final fe a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            fe feVarA = (fe) map2.get(superclass);
            if (feVarA == null) {
                feVarA = a(superclass, null);
            }
            map.putAll(feVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            fe feVarA2 = (fe) map2.get(cls2);
            if (feVarA2 == null) {
                feVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : feVarA2.b.entrySet()) {
                b(map, (ge) entry.getKey(), (y40) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            wd0 wd0Var = (wd0) method.getAnnotation(wd0.class);
            if (wd0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!f50.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                y40 y40VarValue = wd0Var.value();
                if (parameterTypes.length > 1) {
                    if (!y40.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (y40VarValue != y40.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new ge(i, method), y40VarValue, cls);
                z = true;
            }
        }
        fe feVar = new fe(map);
        map2.put(cls, feVar);
        this.b.put(cls, Boolean.valueOf(z));
        return feVar;
    }
}
