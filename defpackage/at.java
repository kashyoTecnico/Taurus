package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class at implements hd0 {
    public final int d;
    public final int e;

    public /* synthetic */ at(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.hd0
    public int a(int i) {
        if (i >= 0 && i <= this.e) {
            c10.d0(i, this.d, i);
        }
        return i;
    }

    @Override // defpackage.hd0
    public int d(int i) {
        if (i >= 0 && i <= this.d) {
            c10.c0(i, this.e, i);
        }
        return i;
    }
}
