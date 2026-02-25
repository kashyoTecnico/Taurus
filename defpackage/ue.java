package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ue extends af {
    public static boolean R(Iterable iterable, Object obj) {
        int iIndexOf;
        c10.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    ve.N();
                    throw null;
                }
                if (c10.i(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static Object S(List list) {
        c10.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object T(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void U(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, iw iwVar) {
        c10.p(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            jp0.f(sb, obj, iwVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void V(List list, StringBuilder sb, ir irVar, int i) {
        if ((i & 64) != 0) {
            irVar = null;
        }
        U(list, sb, "\n", "", "", "...", irVar);
    }

    public static String W(Collection collection, String str, String str2, String str3, iw iwVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            iwVar = null;
        }
        c10.p(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        U(collection, sb, str4, str5, str6, "...", iwVar);
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }

    public static Object X(List list) {
        c10.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ve.L(list));
    }

    public static Object Y(List list) {
        c10.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList Z(Collection collection, Object obj) {
        c10.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList a0(Collection collection, List list) {
        c10.p(collection, "<this>");
        c10.p(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static Object b0(List list) {
        c10.p(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List c0(ArrayList arrayList, Comparator comparator) {
        c10.p(arrayList, "<this>");
        if (arrayList.size() <= 1) {
            return d0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        c10.p(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        c10.o(listAsList, "asList(...)");
        return listAsList;
    }

    public static List d0(Iterable iterable) {
        ArrayList arrayListE0;
        c10.p(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        ks ksVar = ks.d;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return ksVar;
            }
            if (size != 1) {
                return e0(collection);
            }
            return d80.t(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z) {
            arrayListE0 = e0((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayListE0 = arrayList;
        }
        int size2 = arrayListE0.size();
        return size2 != 0 ? size2 != 1 ? arrayListE0 : d80.t(arrayListE0.get(0)) : ksVar;
    }

    public static ArrayList e0(Collection collection) {
        c10.p(collection, "<this>");
        return new ArrayList(collection);
    }
}
