package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lx implements Iterator, c20 {
    public final /* synthetic */ int d = 0;
    public final bv0 e;
    public final int f;
    public int g;
    public int h;

    public lx(bv0 bv0Var, int i, int i2) {
        this.e = bv0Var;
        this.f = i2;
        this.g = i;
        this.h = bv0Var.k;
        if (bv0Var.j) {
            dv0.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return this.g < this.f;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                bv0 bv0Var = this.e;
                int i = bv0Var.k;
                int i2 = this.h;
                if (i != i2) {
                    dv0.f();
                }
                int i3 = this.g;
                this.g = dv0.a(bv0Var.d, i3) + i3;
                return new cv0(bv0Var, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public lx(bv0 bv0Var, int i, mx mxVar, n2 n2Var) {
        this.e = bv0Var;
        this.f = i;
        this.g = bv0Var.k;
    }
}
