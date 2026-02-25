package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qg0 {
    public final h6 a;
    public final int b;
    public final int c;

    public qg0(h6 h6Var, int i, int i2) {
        this.a = h6Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg0)) {
            return false;
        }
        qg0 qg0Var = (qg0) obj;
        return this.a.equals(qg0Var.a) && this.b == qg0Var.b && this.c == qg0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b8.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return b8.h(sb, this.c, ')');
    }
}
