package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ma0 {
    public Object[] a;
    public int b;

    public ma0(int i) {
        this.a = i == 0 ? ad0.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            l(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void c() {
        y9.v0(this.a, 0, this.b);
        this.b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.a[0];
        }
        qo0.t("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        m(i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ma0) {
            ma0 ma0Var = (ma0) obj;
            int i = ma0Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = ma0Var.a;
                p00 p00VarA0 = c10.a0(0, i2);
                int i3 = p00VarA0.d;
                int i4 = p00VarA0.e;
                if (i3 > i4) {
                    return true;
                }
                while (c10.i(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean g() {
        return this.b == 0;
    }

    public final boolean h() {
        return this.b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        j(iF);
        return true;
    }

    public final Object j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            m(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            y9.r0(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void k(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            qo0.s("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
            throw null;
        }
        if (i2 < i) {
            qo0.r("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                y9.r0(objArr, objArr, i, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            y9.v0(this.a, i5, i4);
            this.b = i5;
        }
    }

    public final void l(int i, Object[] objArr) {
        c10.p(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        y9.r0(objArr, objArr2, 0, 0, length);
        this.a = objArr2;
    }

    public final void m(int i) {
        StringBuilder sbI = b8.i("Index ", i, " must be in 0..");
        sbI.append(this.b - 1);
        qo0.s(sbI.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ma0() {
        this(16);
    }
}
