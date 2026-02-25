package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class kx0 extends jp0 {
    public static String n(String str) {
        Comparable comparable;
        String strSubstring;
        c10.p(str, "<this>");
        c10.p(str, "<this>");
        List listAsList = Arrays.asList("\r\n", "\n", "\r");
        c10.o(listAsList, "asList(...)");
        List listV = zt0.v(new vn(new vn(str, new j(13, listAsList)), new h(29, str), 2));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            if (!px0.t((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(we.O(arrayList));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!b10.P(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listV.size();
        int iL = ve.L(listV);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listV) {
            int i3 = i + 1;
            if (i < 0) {
                ve.N();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == iL) && px0.t(str3)) {
                strSubstring = null;
            } else {
                c10.p(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(("Requested character count " + iIntValue + " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                c10.o(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        ue.V(arrayList3, sb, null, 124);
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }
}
