package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t7 implements u61 {
    public final int a;
    public final String b;
    public final zg0 c = qo0.n(d00.e);
    public final zg0 d = qo0.n(Boolean.TRUE);

    public t7(String str, int i) {
        this.a = i;
        this.b = str;
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

    public final d00 e() {
        return (d00) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t7) {
            return this.a == ((t7) obj).a;
        }
        return false;
    }

    public final void f(n71 n71Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(n71Var.a.f(i2));
            this.d.setValue(Boolean.valueOf(n71Var.a.m(i2)));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return b8.h(sb, e().d, ')');
    }
}
