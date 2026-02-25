package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o31 extends m31 {
    public final bi0 g;

    public o31(bi0 bi0Var) {
        this.g = bi0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        this.f = i + 2;
        Object[] objArr = this.d;
        return new ka0(this.g, objArr[i], objArr[i + 1]);
    }
}
