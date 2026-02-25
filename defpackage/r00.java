package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r00 {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int iHashCode = hashCode();
        b10.x(16);
        String string = Integer.toString(iHashCode, 16);
        c10.o(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
