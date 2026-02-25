package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bs implements as {
    public final int d;
    public int e = -1;
    public int f = -1;

    public bs(int i) {
        this.d = i;
    }

    @Override // defpackage.as
    public final boolean f(CharSequence charSequence, int i, int i2, w31 w31Var) {
        int i3 = this.d;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.e = i;
        this.f = i2;
        return false;
    }

    @Override // defpackage.as
    public final Object a() {
        return this;
    }
}
