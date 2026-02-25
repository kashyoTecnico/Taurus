package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p00 extends n00 {
    public static final p00 g = new p00(1, 0, 1);

    @Override // defpackage.n00
    public final boolean equals(Object obj) {
        if (!(obj instanceof p00)) {
            return false;
        }
        if (isEmpty() && ((p00) obj).isEmpty()) {
            return true;
        }
        p00 p00Var = (p00) obj;
        return this.d == p00Var.d && this.e == p00Var.e;
    }

    @Override // defpackage.n00
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.d * 31) + this.e;
    }

    @Override // defpackage.n00
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    @Override // defpackage.n00
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
