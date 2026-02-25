package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class un implements Iterator, c20 {
    public int d = -1;
    public int e;
    public int f;
    public p00 g;
    public final /* synthetic */ vn h;

    public un(vn vnVar) {
        this.h = vnVar;
        int iU = c10.u(0, 0, ((CharSequence) vnVar.b).length());
        this.e = iU;
        this.f = iU;
    }

    public final void a() {
        ng0 ng0Var;
        vn vnVar = this.h;
        CharSequence charSequence = (CharSequence) vnVar.b;
        int i = this.f;
        if (i < 0) {
            this.d = 0;
            this.g = null;
            return;
        }
        if (i <= charSequence.length() && (ng0Var = (ng0) ((j) vnVar.c).e(charSequence, Integer.valueOf(this.f))) != null) {
            int iIntValue = ((Number) ng0Var.d).intValue();
            int iIntValue2 = ((Number) ng0Var.e).intValue();
            this.g = c10.a0(this.e, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.e = i2;
            this.f = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.g = new p00(this.e, px0.p(charSequence), 1);
            this.f = -1;
        }
        this.d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == -1) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d == -1) {
            a();
        }
        if (this.d == 0) {
            throw new NoSuchElementException();
        }
        p00 p00Var = this.g;
        c10.n(p00Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.g = null;
        this.d = -1;
        return p00Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
