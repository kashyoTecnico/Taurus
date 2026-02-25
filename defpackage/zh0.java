package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class zh0 extends yh0 {
    public final uh0 g;
    public Object h;
    public boolean i;
    public int j;

    public zh0(uh0 uh0Var, m31[] m31VarArr) {
        super(uh0Var.e, m31VarArr);
        this.g = uh0Var;
        this.j = uh0Var.g;
    }

    public final void c(int i, l31 l31Var, Object obj, int i2) {
        int i3 = i2 * 5;
        m31[] m31VarArr = this.d;
        if (i3 <= 30) {
            int iG = 1 << mq0.g(i, i3);
            if (l31Var.h(iG)) {
                m31VarArr[i2].a(l31Var.d, Integer.bitCount(l31Var.a) * 2, l31Var.f(iG));
                this.e = i2;
                return;
            } else {
                int iT = l31Var.t(iG);
                l31 l31VarS = l31Var.s(iT);
                m31VarArr[i2].a(l31Var.d, Integer.bitCount(l31Var.a) * 2, iT);
                c(i, l31VarS, obj, i2 + 1);
                return;
            }
        }
        m31 m31Var = m31VarArr[i2];
        Object[] objArr = l31Var.d;
        m31Var.a(objArr, objArr.length, 0);
        while (true) {
            m31 m31Var2 = m31VarArr[i2];
            if (c10.i(m31Var2.d[m31Var2.f], obj)) {
                this.e = i2;
                return;
            } else {
                m31VarArr[i2].f += 2;
            }
        }
    }

    @Override // defpackage.yh0, java.util.Iterator
    public final Object next() {
        if (this.g.g != this.j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f) {
            throw new NoSuchElementException();
        }
        m31 m31Var = this.d[this.e];
        this.h = m31Var.d[m31Var.f];
        this.i = true;
        return super.next();
    }

    @Override // defpackage.yh0, java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        boolean z = this.f;
        uh0 uh0Var = this.g;
        if (!z) {
            r31.k(uh0Var).remove(this.h);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            m31 m31Var = this.d[this.e];
            Object obj = m31Var.d[m31Var.f];
            r31.k(uh0Var).remove(this.h);
            c(obj != null ? obj.hashCode() : 0, uh0Var.e, obj, 0);
        }
        this.h = null;
        this.i = false;
        this.j = uh0Var.g;
    }
}
