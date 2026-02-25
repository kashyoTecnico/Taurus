package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ji0 extends u implements Collection, d20 {
    public x d;
    public Object[] e;
    public Object[] f;
    public int g;
    public v71 h = new v71(28);
    public Object[] i;
    public Object[] j;
    public int k;

    public ji0(x xVar, Object[] objArr, Object[] objArr2, int i) {
        this.d = xVar;
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.i = objArr;
        this.j = objArr2;
        this.k = xVar.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.k - i;
        if (i4 == 1) {
            Object obj = this.j[0];
            q(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.j;
        Object obj2 = objArr2[i3];
        Object[] objArrK = k(objArr2);
        y9.r0(objArr2, objArrK, i3, i3 + 1, i4);
        objArrK[i4 - 1] = null;
        this.i = objArr;
        this.j = objArrK;
        this.k = (i + i4) - 1;
        this.g = i2;
        return obj2;
    }

    public final int B() {
        int i = this.k;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i, int i2, Object obj, y0 y0Var) {
        int i3 = n2.i(i2, i);
        Object[] objArrK = k(objArr);
        if (i != 0) {
            Object obj2 = objArrK[i3];
            c10.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrK[i3] = C((Object[]) obj2, i - 5, i2, obj, y0Var);
            return objArrK;
        }
        if (objArrK != objArr) {
            ((AbstractList) this).modCount++;
        }
        y0Var.a = objArrK[i3];
        objArrK[i3] = obj;
        return objArrK;
    }

    public final void D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM;
        if (i3 < 1) {
            zj0.a("requires at least one nullBuffer");
        }
        Object[] objArrK = k(objArr);
        objArr2[0] = objArrK;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            y9.r0(objArrK, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM = objArrK;
            } else {
                objArrM = m();
                i3--;
                objArr2[i3] = objArrM;
            }
            int i7 = i2 - i6;
            y9.r0(objArrK, objArr3, 0, i7, i2);
            y9.r0(objArrK, objArrM, size + 1, i4, i7);
            objArr3 = objArrM;
        }
        Iterator it = collection.iterator();
        d(objArrK, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM2 = m();
            d(objArrM2, 0, it);
            objArr2[i8] = objArrM2;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i = this.k;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.u
    public final int a() {
        return this.k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        nm.n(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            h(this.i, i - iB, obj);
            return;
        }
        y0 y0Var = new y0(null);
        Object[] objArr = this.i;
        c10.m(objArr);
        h(g(objArr, this.g, i, obj, y0Var), 0, y0Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM;
        nm.n(i, this.k);
        if (i == this.k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.k - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.j;
            Object[] objArrK = k(objArr);
            y9.r0(objArr, objArrK, size2 + 1, i3, E());
            d(objArrK, i3, collection.iterator());
            this.j = objArrK;
            this.k = collection.size() + this.k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iE = E();
        int size3 = collection.size() + this.k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= B()) {
            objArrM = m();
            collection2 = collection;
            D(collection2, i, this.j, iE, objArr2, size, objArrM);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            if (size3 > iE) {
                int i4 = size3 - iE;
                Object[] objArrL = l(i4, this.j);
                f(collection2, i, i4, objArr2, size, objArrL);
                objArr2 = objArr2;
                objArrM = objArrL;
            } else {
                Object[] objArr3 = this.j;
                objArrM = m();
                int i5 = iE - size3;
                y9.r0(objArr3, objArrM, 0, i5, iE);
                int i6 = 32 - i5;
                Object[] objArrL2 = l(i6, this.j);
                int i7 = size - 1;
                objArr2[i7] = objArrL2;
                f(collection2, i, i6, objArr2, i7, objArrL2);
                collection2 = collection2;
            }
        }
        this.i = s(this.i, i2, objArr2);
        this.j = objArrM;
        this.k = collection2.size() + this.k;
        return true;
    }

    @Override // defpackage.u
    public final Object b(int i) {
        nm.m(i, a());
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            return A(this.i, iB, this.g, i - iB);
        }
        y0 y0Var = new y0(this.j[0]);
        Object[] objArr = this.i;
        c10.m(objArr);
        A(z(objArr, this.g, i, y0Var), iB, this.g, 0);
        return y0Var.a;
    }

    public final x c() {
        x ii0Var;
        Object[] objArr = this.i;
        if (objArr == this.e && this.j == this.f) {
            ii0Var = this.d;
        } else {
            this.h = new v71(28);
            this.e = objArr;
            Object[] objArr2 = this.j;
            this.f = objArr2;
            if (objArr != null) {
                ii0Var = new ii0(objArr, objArr2, this.k, this.g);
            } else if (objArr2.length == 0) {
                ii0Var = fv0.e;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.k);
                c10.o(objArrCopyOf, "copyOf(...)");
                ii0Var = new fv0(objArrCopyOf);
            }
        }
        this.d = ii0Var;
        return ii0Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.i == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        s sVarJ = j(B() >> 5);
        int i5 = i3;
        Object[] objArrL = objArr2;
        while (sVarJ.d - 1 != i4) {
            Object[] objArr3 = (Object[]) sVarJ.previous();
            y9.r0(objArr3, objArrL, 0, 32 - i2, 32);
            objArrL = l(i2, objArr3);
            i5--;
            objArr[i5] = objArrL;
        }
        Object[] objArr4 = (Object[]) sVarJ.previous();
        int iB = i3 - (((B() >> 5) - 1) - i4);
        if (iB < i3) {
            objArr2 = objArr[iB];
            c10.m(objArr2);
        }
        D(collection, i, objArr4, 32, objArr, iB, objArr2);
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, y0 y0Var) {
        Object obj2;
        int i3 = n2.i(i2, i);
        if (i == 0) {
            y0Var.a = objArr[31];
            Object[] objArrK = k(objArr);
            y9.r0(objArr, objArrK, i3 + 1, i3, 31);
            objArrK[i3] = obj;
            return objArrK;
        }
        Object[] objArrK2 = k(objArr);
        int i4 = i - 5;
        Object obj3 = objArrK2[i3];
        c10.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrK2[i3] = g((Object[]) obj3, i4, i2, obj, y0Var);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = objArrK2[i3]) == null) {
                break;
            }
            objArrK2[i3] = g((Object[]) obj2, i4, 0, y0Var.a, y0Var);
        }
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        nm.m(i, a());
        if (B() <= i) {
            objArr = this.j;
        } else {
            Object[] objArr2 = this.i;
            c10.m(objArr2);
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[n2.i(i, i2)];
                c10.n(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Object[] objArr, int i, Object obj) {
        int iE = E();
        Object[] objArrK = k(this.j);
        if (iE < 32) {
            y9.r0(this.j, objArrK, i + 1, i, iE);
            objArrK[i] = obj;
            this.i = objArr;
            this.j = objArrK;
            this.k++;
            return;
        }
        Object[] objArr2 = this.j;
        Object obj2 = objArr2[31];
        y9.r0(objArr2, objArrK, i + 1, i, 31);
        objArrK[i] = obj;
        t(objArr, objArrK, n(obj2));
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final s j(int i) {
        Object[] objArr = this.i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iB = B() >> 5;
        nm.n(i, iB);
        int i2 = this.g;
        return i2 == 0 ? new dc(i, objArr) : new k31(objArr, i, iB, i2 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] objArrM = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        y9.t0(objArr, objArrM, 0, length, 6);
        return objArrM;
    }

    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            y9.r0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM = m();
        y9.r0(objArr, objArrM, i, 0, 32 - i);
        return objArrM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        nm.n(i, this.k);
        return new li0(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            zj0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = n2.i(i, i2);
        Object obj = objArr[i3];
        c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objO = o((Object[]) obj, i, i2 - 5);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] objArrM = m();
                y9.r0(objArr, objArrM, 0, 0, i4);
                objArr = objArrM;
            }
        }
        if (objO == objArr[i3]) {
            return objArr;
        }
        Object[] objArrK = k(objArr);
        objArrK[i3] = objO;
        return objArrK;
    }

    public final Object[] p(Object[] objArr, int i, int i2, y0 y0Var) {
        Object[] objArrP;
        int i3 = n2.i(i2 - 1, i);
        if (i == 5) {
            y0Var.a = objArr[i3];
            objArrP = null;
        } else {
            Object obj = objArr[i3];
            c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrP = p((Object[]) obj, i - 5, i2, y0Var);
        }
        if (objArrP == null && i3 == 0) {
            return null;
        }
        Object[] objArrK = k(objArr);
        objArrK[i3] = objArrP;
        return objArrK;
    }

    public final void q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.j = objArr;
            this.k = i;
            this.g = i2;
            return;
        }
        y0 y0Var = new y0(null);
        c10.m(objArr);
        Object[] objArrP = p(objArr, i2, i, y0Var);
        c10.m(objArrP);
        Object obj = y0Var.a;
        c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.j = (Object[]) obj;
        this.k = i;
        if (objArrP[1] == null) {
            this.i = (Object[]) objArrP[0];
            this.g = i2 - 5;
        } else {
            this.i = objArrP;
            this.g = i2;
        }
    }

    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            zj0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            zj0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrK = k(objArr);
        int i3 = n2.i(i, i2);
        int i4 = i2 - 5;
        objArrK[i3] = r((Object[]) objArrK[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrK[i3] = r((Object[]) objArrK[i3], 0, i4, it);
        }
        return objArrK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new w(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        o oVarZ = c4.z(objArr2);
        int i2 = i >> 5;
        int i3 = this.g;
        Object[] objArrR = i2 < (1 << i3) ? r(objArr, i, i3, oVarZ) : k(objArr);
        while (oVarZ.hasNext()) {
            this.g += 5;
            objArrR = n(objArrR);
            int i4 = this.g;
            r(objArrR, 1 << i4, i4, oVarZ);
        }
        return objArrR;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        nm.m(i, a());
        if (B() > i) {
            y0 y0Var = new y0(null);
            Object[] objArr = this.i;
            c10.m(objArr);
            this.i = C(objArr, this.g, i, obj, y0Var);
            return y0Var.a;
        }
        Object[] objArrK = k(this.j);
        if (objArrK != this.j) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrK[i2];
        objArrK[i2] = obj;
        this.j = objArrK;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.k;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 > (1 << i3)) {
            this.i = u(this.g + 5, n(objArr), objArr2);
            this.j = objArr3;
            this.g += 5;
            this.k++;
            return;
        }
        if (objArr == null) {
            this.i = objArr2;
            this.j = objArr3;
            this.k = i + 1;
        } else {
            this.i = u(i3, objArr, objArr2);
            this.j = objArr3;
            this.k++;
        }
    }

    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int i2 = n2.i(a() - 1, i);
        Object[] objArrK = k(objArr);
        if (i == 5) {
            objArrK[i2] = objArr2;
            return objArrK;
        }
        objArrK[i2] = u(i - 5, (Object[]) objArrK[i2], objArr2);
        return objArrK;
    }

    public final int v(iw iwVar, Object[] objArr, int i, int i2, y0 y0Var, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = y0Var.a;
        c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) iwVar.g(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i2 = 0;
                }
                objArrM[i2] = obj2;
                i2++;
            }
        }
        y0Var.a = objArrM;
        if (objArr2 != objArrM) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int w(iw iwVar, Object[] objArr, int i, y0 y0Var) {
        Object[] objArrK = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) iwVar.g(obj)).booleanValue()) {
                if (!z) {
                    objArrK = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrK[i2] = obj;
                i2++;
            }
        }
        y0Var.a = objArrK;
        return i2;
    }

    public final int x(iw iwVar, int i, y0 y0Var) {
        int iW = w(iwVar, this.j, i, y0Var);
        if (iW == i) {
            return i;
        }
        Object obj = y0Var.a;
        c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iW, i, (Object) null);
        this.j = objArr;
        this.k -= i - iW;
        return iW;
    }

    public final boolean y(iw iwVar) {
        Object[] objArrR;
        int i;
        iw iwVar2 = iwVar;
        int iE = E();
        Object[] objArrO = null;
        y0 y0Var = new y0(null);
        boolean z = false;
        if (this.i != null) {
            s sVarJ = j(0);
            int iW = 32;
            while (iW == 32 && sVarJ.hasNext()) {
                iW = w(iwVar2, (Object[]) sVarJ.next(), 32, y0Var);
            }
            if (iW == 32) {
                int iX = x(iwVar2, iE, y0Var);
                if (iX == 0) {
                    q(this.i, this.k, this.g);
                }
                if (iX != iE) {
                }
            } else {
                int i2 = (sVarJ.d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iV = iW;
                while (sVarJ.hasNext()) {
                    iV = v(iwVar2, (Object[]) sVarJ.next(), 32, iV, y0Var, arrayList2, arrayList);
                    iwVar2 = iwVar;
                }
                int iV2 = v(iwVar, this.j, iE, iV, y0Var, arrayList2, arrayList);
                Object obj = y0Var.a;
                c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iV2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrR = this.i;
                    c10.m(objArrR);
                } else {
                    objArrR = r(this.i, i2, this.g, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    zj0.a("invalid size");
                }
                if (size == 0) {
                    this.g = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.g;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.g = i - 5;
                        Object[] objArr2 = objArrR[0];
                        c10.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrR = objArr2;
                    }
                    objArrO = o(objArrR, i3, i);
                }
                this.i = objArrO;
                this.j = objArr;
                this.k = size + iV2;
            }
            z = true;
        } else if (x(iwVar2, iE, y0Var) != iE) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] z(Object[] objArr, int i, int i2, y0 y0Var) {
        int i3 = n2.i(i2, i);
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrK = k(objArr);
            y9.r0(objArr, objArrK, i3, i3 + 1, 32);
            objArrK[31] = y0Var.a;
            y0Var.a = obj;
            return objArrK;
        }
        int i4 = objArr[31] == null ? n2.i(B() - 1, i) : 31;
        Object[] objArrK2 = k(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = objArrK2[i4];
                c10.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrK2[i4] = z((Object[]) obj2, i5, 0, y0Var);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = objArrK2[i3];
        c10.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrK2[i3] = z((Object[]) obj3, i5, i2, y0Var);
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iE = E();
        if (iE < 32) {
            Object[] objArrK = k(this.j);
            objArrK[iE] = obj;
            this.j = objArrK;
            this.k = a() + 1;
        } else {
            t(this.i, this.j, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        Iterator it = collection.iterator();
        if (32 - iE >= collection.size()) {
            Object[] objArrK = k(this.j);
            d(objArrK, iE, it);
            this.j = objArrK;
            this.k = collection.size() + this.k;
            return true;
        }
        int size = ((collection.size() + iE) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrK2 = k(this.j);
        d(objArrK2, iE, it);
        objArr[0] = objArrK2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM = m();
            d(objArrM, 0, it);
            objArr[i] = objArrM;
        }
        this.i = s(this.i, B(), objArr);
        Object[] objArrM2 = m();
        d(objArrM2, 0, it);
        this.j = objArrM2;
        this.k = collection.size() + this.k;
        return true;
    }
}
