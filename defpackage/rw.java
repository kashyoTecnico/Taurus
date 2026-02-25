package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class rw extends uc implements qw, a20, ow {
    public final int j;
    public final int k;

    public rw(int i, Class cls, String str, String str2, int i2) {
        this(i, tc.d, cls, str, str2, i2, 0);
    }

    @Override // defpackage.qw
    public final int b() {
        return this.j;
    }

    @Override // defpackage.uc
    public final a20 d() {
        em0.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a20] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rw) {
            rw rwVar = (rw) obj;
            return this.g.equals(rwVar.g) && this.h.equals(rwVar.h) && this.k == rwVar.k && this.j == rwVar.j && c10.i(this.e, rwVar.e) && f().equals(rwVar.f());
        }
        if (!(obj instanceof rw)) {
            return false;
        }
        ?? r0 = this.d;
        if (r0 == 0) {
            d();
            this.d = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        f();
        return this.h.hashCode() + ((this.g.hashCode() + (f().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a20 a20Var = this.d;
        if (a20Var == null) {
            d();
            this.d = this;
            a20Var = this;
        }
        if (a20Var != this) {
            return a20Var.toString();
        }
        String str = this.g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public rw(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.j = i;
        this.k = 0;
    }
}
