package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v41 implements u61 {
    public final String a;
    public final zg0 b;

    public v41(g00 g00Var, String str) {
        this.a = str;
        this.b = qo0.n(g00Var);
    }

    @Override // defpackage.u61
    public final int a(xn xnVar) {
        return e().d;
    }

    @Override // defpackage.u61
    public final int b(xn xnVar) {
        return e().b;
    }

    @Override // defpackage.u61
    public final int c(xn xnVar, e30 e30Var) {
        return e().c;
    }

    @Override // defpackage.u61
    public final int d(xn xnVar, e30 e30Var) {
        return e().a;
    }

    public final g00 e() {
        return (g00) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v41) {
            return c10.i(e(), ((v41) obj).e());
        }
        return false;
    }

    public final void f(g00 g00Var) {
        this.b.setValue(g00Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return b8.h(sb, e().d, ')');
    }
}
