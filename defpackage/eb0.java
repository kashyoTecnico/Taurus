package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class eb0 implements RandomAccess {
    public Object[] d;
    public bb0 e;
    public int f = 0;

    public eb0(Object[] objArr) {
        this.d = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.f + 1;
        if (this.d.length < i2) {
            m(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.f;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f++;
    }

    public final void b(Object obj) {
        int i = this.f + 1;
        if (this.d.length < i) {
            m(i);
        }
        Object[] objArr = this.d;
        int i2 = this.f;
        objArr[i2] = obj;
        this.f = i2 + 1;
    }

    public final void c(int i, eb0 eb0Var) {
        int i2 = eb0Var.f;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f + i2;
        if (this.d.length < i3) {
            m(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.f;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(eb0Var.d, 0, objArr, i, i2);
        this.f += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f + size;
        if (this.d.length < i2) {
            m(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.f;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f + size;
        if (this.d.length < i3) {
            m(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.f;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                ve.N();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f += size;
        return true;
    }

    public final List f() {
        bb0 bb0Var = this.e;
        if (bb0Var != null) {
            return bb0Var;
        }
        bb0 bb0Var2 = new bb0(this);
        this.e = bb0Var2;
        return bb0Var2;
    }

    public final void g() {
        Object[] objArr = this.d;
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f = 0;
    }

    public final boolean h(Object obj) {
        int i = this.f - 1;
        if (i >= 0) {
            for (int i2 = 0; !c10.i(this.d[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.d;
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (c10.i(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    public final Object k(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        int i2 = this.f;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f - 1;
        this.f = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f;
            if (i2 < i3) {
                Object[] objArr = this.d;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.d[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f = i5;
        }
    }

    public final void m(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.d = objArr2;
    }
}
