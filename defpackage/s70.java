package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s70 extends u70 implements Iterator, c20 {
    public final /* synthetic */ int h;

    public s70(v70 v70Var, int i) {
        this.h = i;
        c10.p(v70Var, "map");
        this.g = v70Var;
        this.e = -1;
        this.f = v70Var.k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                b();
                int i = this.d;
                v70 v70Var = (v70) this.g;
                if (i >= v70Var.i) {
                    throw new NoSuchElementException();
                }
                this.d = i + 1;
                this.e = i;
                t70 t70Var = new t70(v70Var, i);
                c();
                return t70Var;
            case 1:
                b();
                int i2 = this.d;
                v70 v70Var2 = (v70) this.g;
                if (i2 >= v70Var2.i) {
                    throw new NoSuchElementException();
                }
                this.d = i2 + 1;
                this.e = i2;
                Object obj = v70Var2.d[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.d;
                v70 v70Var3 = (v70) this.g;
                if (i3 >= v70Var3.i) {
                    throw new NoSuchElementException();
                }
                this.d = i3 + 1;
                this.e = i3;
                Object[] objArr = v70Var3.e;
                c10.m(objArr);
                Object obj2 = objArr[this.e];
                c();
                return obj2;
        }
    }
}
