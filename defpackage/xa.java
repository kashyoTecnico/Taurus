package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xa {
    public r5 a = null;
    public t2 b = null;
    public fd c = null;
    public i6 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return c10.i(this.a, xaVar.a) && c10.i(this.b, xaVar.b) && c10.i(this.c, xaVar.c) && c10.i(this.d, xaVar.d);
    }

    public final int hashCode() {
        r5 r5Var = this.a;
        int iHashCode = (r5Var == null ? 0 : r5Var.hashCode()) * 31;
        t2 t2Var = this.b;
        int iHashCode2 = (iHashCode + (t2Var == null ? 0 : t2Var.hashCode())) * 31;
        fd fdVar = this.c;
        int iHashCode3 = (iHashCode2 + (fdVar == null ? 0 : fdVar.hashCode())) * 31;
        i6 i6Var = this.d;
        return iHashCode3 + (i6Var != null ? i6Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
