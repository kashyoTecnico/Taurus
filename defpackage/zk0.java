package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class zk0 extends uc implements h20 {
    public final boolean j;

    public zk0(int i, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zk0) {
            zk0 zk0Var = (zk0) obj;
            return f().equals(zk0Var.f()) && this.g.equals(zk0Var.g) && this.h.equals(zk0Var.h) && c10.i(this.e, zk0Var.e);
        }
        if (obj instanceof h20) {
            return obj.equals(h());
        }
        return false;
    }

    public final a20 h() {
        if (this.j) {
            return this;
        }
        a20 a20Var = this.d;
        if (a20Var != null) {
            return a20Var;
        }
        a20 a20VarD = d();
        this.d = a20VarD;
        return a20VarD;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + (f().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a20 a20VarH = h();
        if (a20VarH != this) {
            return a20VarH.toString();
        }
        return "property " + this.g + " (Kotlin reflection is not available)";
    }
}
