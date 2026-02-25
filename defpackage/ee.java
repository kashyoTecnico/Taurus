package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ee implements b20, de {
    public static final Map b;
    public static final LinkedHashMap c;
    public final Class a;

    static {
        Map mapSingletonMap;
        List listM = ve.M(gw.class, iw.class, kw.class, lw.class, mw.class, vg.class, nw.class, vg.class, vg.class, vg.class, vg.class, vg.class, hw.class, vg.class, vg.class, vg.class, vg.class, vg.class, vg.class, vg.class, vg.class, vg.class, jw.class);
        ArrayList arrayList = new ArrayList(we.O(listM));
        int i = 0;
        int i2 = 0;
        for (Object obj : listM) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ve.N();
                throw null;
            }
            arrayList.add(new ng0((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        int size = arrayList.size();
        if (size == 0) {
            mapSingletonMap = ls.d;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(b80.K(arrayList.size()));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                ng0 ng0Var = (ng0) obj2;
                mapSingletonMap.put(ng0Var.d, ng0Var.e);
            }
        } else {
            ng0 ng0Var2 = (ng0) arrayList.get(0);
            c10.p(ng0Var2, "pair");
            mapSingletonMap = Collections.singletonMap(ng0Var2.d, ng0Var2.e);
            c10.o(mapSingletonMap, "singletonMap(...)");
        }
        b = mapSingletonMap;
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        c10.o(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            c10.m(str);
            sb.append(px0.y(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b80.K(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), px0.y((String) entry2.getValue()));
        }
        c = linkedHashMap;
    }

    public ee(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.de
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String str;
        Class cls = this.a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = c;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return px0.x(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return px0.x(simpleName, enclosingConstructor.getName() + '$');
        }
        int iR = px0.r(simpleName, '$', 0, 6);
        if (iR == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iR + 1, simpleName.length());
        c10.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ee) && b10.H(this).equals(b10.H((b20) obj));
    }

    public final int hashCode() {
        return b10.H(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
