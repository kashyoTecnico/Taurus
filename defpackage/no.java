package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class no {
    public final boolean a = true;
    public final boolean b = true;
    public final nr0 c = nr0.d;
    public final boolean d = true;
    public final boolean e = true;
    public final String f = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no)) {
            return false;
        }
        no noVar = (no) obj;
        return this.a == noVar.a && this.b == noVar.b && this.c == noVar.c && this.d == noVar.d && this.e == noVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b8.d((this.c.hashCode() + b8.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
