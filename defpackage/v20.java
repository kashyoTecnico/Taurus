package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v20 {
    public final Float a;
    public yq b;

    public v20(Float f, yq yqVar) {
        this.a = f;
        this.b = yqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return v20Var.a.equals(this.a) && c10.i(v20Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + b8.c(0, this.a.hashCode() * 31, 31);
    }
}
