package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class is0 {
    public final nx a;
    public final long b;
    public final int c;
    public final boolean d;

    public is0(nx nxVar, long j, int i, boolean z) {
        this.a = nxVar;
        this.b = j;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is0)) {
            return false;
        }
        is0 is0Var = (is0) obj;
        return this.a == is0Var.a && ed0.b(this.b, is0Var.b) && this.c == is0Var.c && this.d == is0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((b8.p(this.c) + b8.e(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) ed0.i(this.b));
        sb.append(", anchor=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
