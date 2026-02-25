package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class uu0 {
    public int[] d = nm.b;
    public Object[] e = nm.d;
    public int f;

    public uu0(int i) {
    }

    public final int a(Object obj) {
        int i = this.f * 2;
        Object[] objArr = this.e;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i2 = this.f;
        if (i2 == 0) {
            return -1;
        }
        int iJ = nm.j(this.d, i2, i);
        if (iJ < 0 || c10.i(obj, this.e[iJ << 1])) {
            return iJ;
        }
        int i3 = iJ + 1;
        while (i3 < i2 && this.d[i3] == i) {
            if (c10.i(obj, this.e[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iJ - 1; i4 >= 0 && this.d[i4] == i; i4--) {
            if (c10.i(obj, this.e[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f > 0) {
            this.d = nm.b;
            this.e = nm.d;
            this.f = 0;
        }
        if (this.f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        int iJ = nm.j(this.d, i, 0);
        if (iJ < 0 || this.e[iJ << 1] == null) {
            return iJ;
        }
        int i2 = iJ + 1;
        while (i2 < i && this.d[i2] == 0) {
            if (this.e[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iJ - 1; i3 >= 0 && this.d[i3] == 0; i3--) {
            if (this.e[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (z) {
            return this.e[i << 1];
        }
        qo0.r("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof uu0) {
                int i = this.f;
                if (i != ((uu0) obj).f) {
                    return false;
                }
                uu0 uu0Var = (uu0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objE = e(i2);
                    Object objH = h(i2);
                    Object obj2 = uu0Var.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !uu0Var.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objE2 = e(i4);
                Object objH2 = h(i4);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f)) {
            qo0.r("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.e;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                y9.p0(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.e;
                y9.r0(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.e;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            c10.o(iArrCopyOf, "copyOf(...)");
            this.d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.e, i7 << 1);
            c10.o(objArrCopyOf, "copyOf(...)");
            this.e = objArrCopyOf;
            if (i2 != this.f) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                y9.p0(iArr, this.d, 0, 0, i);
                y9.r0(objArr, this.e, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                y9.p0(iArr, this.d, i, i8, i2);
                y9.r0(objArr, this.e, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = i4;
        return obj;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (!z) {
            qo0.r("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.e[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.e[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (z) {
            return this.e[(i << 1) + 1];
        }
        qo0.r("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.d;
        Object[] objArr = this.e;
        int i = this.f;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i2 = (iB << 1) + 1;
            Object[] objArr = this.e;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iB;
        int[] iArr = this.d;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            c10.o(iArrCopyOf, "copyOf(...)");
            this.d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.e, i4 << 1);
            c10.o(objArrCopyOf, "copyOf(...)");
            this.e = objArrCopyOf;
            if (i != this.f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.d;
            int i5 = i3 + 1;
            y9.p0(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.e;
            y9.r0(objArr2, objArr2, i5 << 1, i3 << 1, this.f << 1);
        }
        int i6 = this.f;
        if (i == i6) {
            int[] iArr3 = this.d;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.e;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objE = e(i2);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i2);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !c10.i(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !c10.i(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }
}
