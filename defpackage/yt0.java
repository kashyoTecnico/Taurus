package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yt0 implements Iterator, lk, c20 {
    public int d;
    public Object e;
    public lk f;

    public final RuntimeException a() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    public final void b(Object obj, xm0 xm0Var) {
        this.e = obj;
        this.d = 3;
        this.f = xm0Var;
    }

    @Override // defpackage.lk
    public final ml f() {
        return is.d;
    }

    @Override // defpackage.lk
    public final void h(Object obj) throws Throwable {
        c10.X(obj);
        this.d = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.d;
            if (i != 0) {
                break;
            }
            this.d = 5;
            lk lkVar = this.f;
            c10.m(lkVar);
            this.f = null;
            lkVar.h(j41.a);
        }
        if (i == 1) {
            c10.m(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.d = 1;
            c10.m(null);
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.d = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
