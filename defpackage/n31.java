package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n31 extends m31 {
    public final /* synthetic */ int g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g) {
            case 0:
                int i = this.f;
                this.f = i + 2;
                Object[] objArr = this.d;
                return new y70(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f;
                this.f = i2 + 2;
                return this.d[i2];
            default:
                int i3 = this.f;
                this.f = i3 + 2;
                return this.d[i3 + 1];
        }
    }
}
