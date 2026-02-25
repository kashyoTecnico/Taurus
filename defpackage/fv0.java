package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fv0 extends x {
    public static final fv0 e = new fv0(new Object[0]);
    public final Object[] d;

    public fv0(Object[] objArr) {
        this.d = objArr;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.length;
    }

    @Override // defpackage.x
    public final x b(int i, Object obj) {
        Object[] objArr = this.d;
        nm.n(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            y9.t0(objArr, objArr2, 0, i, 6);
            y9.r0(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new fv0(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        c10.o(objArrCopyOf, "copyOf(...)");
        y9.r0(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ii0(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.x
    public final x c(Object obj) {
        Object[] objArr = this.d;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new ii0(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        c10.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new fv0(objArrCopyOf);
    }

    @Override // defpackage.x
    public final x d(Collection collection) {
        Object[] objArr = this.d;
        if (collection.size() + objArr.length > 32) {
            ji0 ji0VarE = e();
            ji0VarE.addAll(collection);
            return ji0VarE.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        c10.o(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new fv0(objArrCopyOf);
    }

    @Override // defpackage.x
    public final ji0 e() {
        return new ji0(this, null, this.d, 0);
    }

    @Override // defpackage.x
    public final x f(w wVar) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) wVar.g(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    c10.o(objArrCopyOf, "copyOf(...)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? e : new fv0(y9.u0(objArrCopyOf, 0, length));
    }

    @Override // defpackage.x
    public final x g(int i) {
        Object[] objArr = this.d;
        nm.m(i, objArr.length);
        if (objArr.length == 1) {
            return e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        c10.o(objArrCopyOf, "copyOf(...)");
        y9.r0(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new fv0(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        nm.m(i, a());
        return this.d[i];
    }

    @Override // defpackage.x
    public final x h(int i, Object obj) {
        Object[] objArr = this.d;
        nm.m(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        c10.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = obj;
        return new fv0(objArrCopyOf);
    }

    @Override // defpackage.r, java.util.List
    public final int indexOf(Object obj) {
        return y9.y0(this.d, obj);
    }

    @Override // defpackage.r, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.d;
        c10.p(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.d;
        nm.n(i, objArr.length);
        return new dc(objArr, i, objArr.length);
    }
}
