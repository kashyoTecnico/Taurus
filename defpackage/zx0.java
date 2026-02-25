package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zx0 extends qu0 implements xw0 {
    @Override // defpackage.xw0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.k;
            c10.m(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.l + ((int) ((o() + this.n) - this.l))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.k;
            c10.m(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.l + ((int) ((o() + this.n) - this.l))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
