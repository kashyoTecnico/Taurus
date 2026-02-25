package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nj {
    public final nb a;
    public final ad b;

    public nj(nb nbVar, ad adVar) {
        this.a = nbVar;
        this.b = adVar;
    }

    public final String toString() {
        ad adVar = this.b;
        if (adVar.h.n(sl.e) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        b10.x(16);
        String string = Integer.toString(iHashCode, 16);
        c10.o(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(adVar);
        sb.append(')');
        return sb.toString();
    }
}
