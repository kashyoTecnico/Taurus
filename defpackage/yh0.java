package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class yh0 implements Iterator, c20 {
    public final m31[] d;
    public int e;
    public boolean f = true;

    public yh0(l31 l31Var, m31[] m31VarArr) {
        this.d = m31VarArr;
        m31VarArr[0].a(l31Var.d, Integer.bitCount(l31Var.a) * 2, 0);
        this.e = 0;
        a();
    }

    public final void a() {
        int i = this.e;
        m31[] m31VarArr = this.d;
        m31 m31Var = m31VarArr[i];
        if (m31Var.f < m31Var.e) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                m31 m31Var2 = m31VarArr[i];
                int i2 = m31Var2.f;
                Object[] objArr = m31Var2.d;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    m31Var2.f = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.e = iB;
                return;
            }
            if (i > 0) {
                m31 m31Var3 = m31VarArr[i - 1];
                int i3 = m31Var3.f;
                int length2 = m31Var3.d.length;
                m31Var3.f = i3 + 1;
            }
            m31VarArr[i].a(l31.e.d, 0, 0);
            i--;
        }
        this.f = false;
    }

    public final int b(int i) {
        m31[] m31VarArr = this.d;
        m31 m31Var = m31VarArr[i];
        int i2 = m31Var.f;
        if (i2 < m31Var.e) {
            return i;
        }
        Object[] objArr = m31Var.d;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        c10.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        l31 l31Var = (l31) obj;
        if (i == 6) {
            m31 m31Var2 = m31VarArr[i + 1];
            Object[] objArr2 = l31Var.d;
            m31Var2.a(objArr2, objArr2.length, 0);
        } else {
            m31VarArr[i + 1].a(l31Var.d, Integer.bitCount(l31Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f) {
            throw new NoSuchElementException();
        }
        Object next = this.d[this.e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
