package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ou0 implements cp {
    public final qu0 d;
    public final long e;
    public final Object f;
    public final ad g;

    public ou0(qu0 qu0Var, long j, Object obj, ad adVar) {
        this.d = qu0Var;
        this.e = j;
        this.f = obj;
        this.g = adVar;
    }

    @Override // defpackage.cp
    public final void a() {
        qu0 qu0Var = this.d;
        synchronized (qu0Var) {
            if (this.e < qu0Var.o()) {
                return;
            }
            Object[] objArr = qu0Var.k;
            c10.m(objArr);
            long j = this.e;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            c4.i(objArr, j, c4.n);
            qu0Var.j();
        }
    }
}
