package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class u70 {
    public int d;
    public int e;
    public int f;
    public Object g;

    public u70() {
        if (kc0.e == null) {
            kc0.e = new kc0(26);
        }
    }

    public int a(int i) {
        if (i < this.f) {
            return ((ByteBuffer) this.g).getShort(this.e + i);
        }
        return 0;
    }

    public void b() {
        if (((v70) this.g).k != this.f) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.d;
            v70 v70Var = (v70) this.g;
            if (i >= v70Var.i || v70Var.f[i] >= 0) {
                return;
            } else {
                this.d = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.d < ((v70) this.g).i;
    }

    public void remove() {
        v70 v70Var = (v70) this.g;
        b();
        if (this.e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        v70Var.b();
        v70Var.k(this.e);
        this.e = -1;
        this.f = v70Var.k;
    }
}
