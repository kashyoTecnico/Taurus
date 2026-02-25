package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class du0 implements hr {
    public final int a;
    public final int b;

    public du0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.hr
    public final void a(jr jrVar) {
        boolean z = jrVar.d != -1;
        ch0 ch0Var = jrVar.a;
        if (z) {
            jrVar.d = -1;
            jrVar.e = -1;
        }
        int iU = c10.u(this.a, 0, ch0Var.b());
        int iU2 = c10.u(this.b, 0, ch0Var.b());
        if (iU != iU2) {
            if (iU < iU2) {
                jrVar.e(iU, iU2);
            } else {
                jrVar.e(iU2, iU);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du0)) {
            return false;
        }
        du0 du0Var = (du0) obj;
        return this.a == du0Var.a && this.b == du0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return b8.h(sb, this.b, ')');
    }
}
