package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s9 implements Iterator, c20 {
    public int d;
    public int e;
    public boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public s9(int i) {
        this.d = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.e;
        switch (this.g) {
            case 0:
                objE = ((w9) this.h).e(i);
                break;
            case 1:
                objE = ((w9) this.h).h(i);
                break;
            default:
                objE = ((x9) this.h).e[i];
                break;
        }
        this.e++;
        this.f = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.e - 1;
        this.e = i;
        switch (this.g) {
            case 0:
                ((w9) this.h).f(i);
                break;
            case 1:
                ((w9) this.h).f(i);
                break;
            default:
                ((x9) this.h).a(i);
                break;
        }
        this.d--;
        this.f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s9(x9 x9Var) {
        this(x9Var.f);
        this.g = 2;
        this.h = x9Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s9(w9 w9Var, int i) {
        this(w9Var.f);
        this.g = i;
        switch (i) {
            case 1:
                this.h = w9Var;
                this(w9Var.f);
                break;
            default:
                this.h = w9Var;
                break;
        }
    }
}
