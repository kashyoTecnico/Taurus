package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xf implements hr {
    public final q8 a;
    public final int b;

    public xf(q8 q8Var, int i) {
        this.a = q8Var;
        this.b = i;
    }

    @Override // defpackage.hr
    public final void a(jr jrVar) {
        int i = jrVar.d;
        q8 q8Var = this.a;
        if (i != -1) {
            jrVar.d(i, jrVar.e, q8Var.e);
        } else {
            jrVar.d(jrVar.b, jrVar.c, q8Var.e);
        }
        int i2 = jrVar.b;
        int i3 = jrVar.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iU = c10.u(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - q8Var.e.length(), 0, jrVar.a.b());
        jrVar.f(iU, iU);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        return c10.i(this.a.e, xfVar.a.e) && this.b == xfVar.b;
    }

    public final int hashCode() {
        return (this.a.e.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.e);
        sb.append("', newCursorPosition=");
        return b8.h(sb, this.b, ')');
    }

    public xf(String str, int i) {
        this(new q8(str), i);
    }
}
