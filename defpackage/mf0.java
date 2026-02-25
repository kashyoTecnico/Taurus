package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mf0 extends nf0 {
    public final fo0 a;
    public final i6 b;

    public mf0(fo0 fo0Var) {
        i6 i6VarA;
        this.a = fo0Var;
        if (d80.s(fo0Var)) {
            i6VarA = null;
        } else {
            i6VarA = k6.a();
            i6.a(i6VarA, fo0Var);
        }
        this.b = i6VarA;
    }

    @Override // defpackage.nf0
    public final xl0 a() {
        fo0 fo0Var = this.a;
        return new xl0(fo0Var.a, fo0Var.b, fo0Var.c, fo0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mf0) {
            return c10.i(this.a, ((mf0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
