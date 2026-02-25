package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y31 {
    public final vy0 a;
    public final zv b;
    public final int c;
    public final int d;
    public final Object e;

    public y31(vy0 vy0Var, zv zvVar, int i, int i2, Object obj) {
        this.a = vy0Var;
        this.b = zvVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y31)) {
            return false;
        }
        y31 y31Var = (y31) obj;
        return c10.i(this.a, y31Var.a) && c10.i(this.b, y31Var.b) && this.c == y31Var.c && this.d == y31Var.d && c10.i(this.e, y31Var.e);
    }

    public final int hashCode() {
        vy0 vy0Var = this.a;
        int iC = b8.c(this.d, b8.c(this.c, (((vy0Var == null ? 0 : vy0Var.hashCode()) * 31) + this.b.d) * 31, 31), 31);
        Object obj = this.e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
