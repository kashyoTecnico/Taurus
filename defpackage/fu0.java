package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fu0 implements hr {
    public final int a;
    public final int b;

    public fu0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.hr
    public final void a(jr jrVar) {
        int iU = c10.u(this.a, 0, jrVar.a.b());
        int iU2 = c10.u(this.b, 0, jrVar.a.b());
        if (iU < iU2) {
            jrVar.f(iU, iU2);
        } else {
            jrVar.f(iU2, iU);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu0)) {
            return false;
        }
        fu0 fu0Var = (fu0) obj;
        return this.a == fu0Var.a && this.b == fu0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return b8.h(sb, this.b, ')');
    }
}
