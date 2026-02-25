package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jo0 {
    public float a = 0.0f;
    public boolean b = true;
    public dm c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo0)) {
            return false;
        }
        jo0 jo0Var = (jo0) obj;
        return Float.compare(this.a, jo0Var.a) == 0 && this.b == jo0Var.b && c10.i(this.c, jo0Var.c);
    }

    public final int hashCode() {
        int iD = b8.d(Float.hashCode(this.a) * 31, 31, this.b);
        dm dmVar = this.c;
        return (iD + (dmVar == null ? 0 : dmVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
