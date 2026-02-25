package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vw implements Iterator, c20 {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public final Object g;

    public vw(Object obj, Map map) {
        this.d = 3;
        this.f = obj;
        this.g = map;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [iw, java.lang.Object] */
    public void a() {
        Object objG;
        vn vnVar = (vn) this.g;
        if (this.e == -2) {
            objG = ((gw) vnVar.b).a();
        } else {
            ?? r0 = vnVar.c;
            Object obj = this.f;
            c10.m(obj);
            objG = r0.g(obj);
        }
        this.f = objG;
        this.e = objG == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 1) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                if (this.e < ((Map) this.g).size()) {
                }
                break;
        }
        return ((yt0) this.f).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f;
                c10.n(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.e = -1;
                return obj;
            case 1:
                return ((yt0) this.f).next();
            case 2:
                return ((yt0) this.f).next();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f;
                this.e++;
                Object obj3 = ((Map) this.g).get(obj2);
                if (obj3 != null) {
                    this.f = ((v50) obj3).b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.e;
                if (i != -1) {
                    ((pa0) this.g).e.h(i);
                    this.e = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.e;
                if (i2 != -1) {
                    ((wa0) this.g).e.l(i2);
                    this.e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vw(vn vnVar) {
        this.d = 0;
        this.g = vnVar;
        this.e = -2;
    }

    public vw(wa0 wa0Var) {
        this.d = 2;
        this.g = wa0Var;
        this.e = -1;
        this.f = qo0.l(new va0(wa0Var, this, null));
    }

    public vw(pa0 pa0Var) {
        this.d = 1;
        this.g = pa0Var;
        this.e = -1;
        this.f = qo0.l(new oa0(pa0Var, this, null));
    }
}
