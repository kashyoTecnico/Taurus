package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class li0 extends s {
    public final ji0 f;
    public int g;
    public k31 h;
    public int i;

    public li0(ji0 ji0Var, int i) {
        super(i, ji0Var.k);
        this.f = ji0Var;
        this.g = ji0Var.e();
        this.i = -1;
        b();
    }

    public final void a() {
        if (this.g != this.f.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.s, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.d;
        ji0 ji0Var = this.f;
        ji0Var.add(i, obj);
        this.d++;
        this.e = ji0Var.a();
        this.g = ji0Var.e();
        this.i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        ji0 ji0Var = this.f;
        Object[] objArr = ji0Var.i;
        if (objArr == null) {
            this.h = null;
            return;
        }
        int i = (ji0Var.k - 1) & (-32);
        int i2 = this.d;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ji0Var.g / 5) + 1;
        k31 k31Var = this.h;
        if (k31Var == null) {
            this.h = new k31(objArr, i2, i, i3);
            return;
        }
        k31Var.d = i2;
        k31Var.e = i;
        k31Var.f = i3;
        if (k31Var.g.length < i3) {
            k31Var.g = new Object[i3];
        }
        k31Var.g[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        k31Var.h = r0;
        k31Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        this.i = i;
        k31 k31Var = this.h;
        ji0 ji0Var = this.f;
        if (k31Var == null) {
            Object[] objArr = ji0Var.j;
            this.d = i + 1;
            return objArr[i];
        }
        if (k31Var.hasNext()) {
            this.d++;
            return k31Var.next();
        }
        Object[] objArr2 = ji0Var.j;
        int i2 = this.d;
        this.d = i2 + 1;
        return objArr2[i2 - k31Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        this.i = i - 1;
        k31 k31Var = this.h;
        ji0 ji0Var = this.f;
        if (k31Var == null) {
            Object[] objArr = ji0Var.j;
            int i2 = i - 1;
            this.d = i2;
            return objArr[i2];
        }
        int i3 = k31Var.e;
        if (i <= i3) {
            this.d = i - 1;
            return k31Var.previous();
        }
        Object[] objArr2 = ji0Var.j;
        int i4 = i - 1;
        this.d = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.s, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        ji0 ji0Var = this.f;
        ji0Var.b(i);
        int i2 = this.i;
        if (i2 < this.d) {
            this.d = i2;
        }
        this.e = ji0Var.a();
        this.g = ji0Var.e();
        this.i = -1;
        b();
    }

    @Override // defpackage.s, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        ji0 ji0Var = this.f;
        ji0Var.set(i, obj);
        this.g = ji0Var.e();
        b();
    }
}
