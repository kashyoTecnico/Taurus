package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zo0 implements im0 {
    public rp0 d;
    public ap0 e;
    public String f;
    public Object g;
    public Object[] h;
    public e9 i;
    public final g7 j = new g7(2, this);

    public zo0(rp0 rp0Var, ap0 ap0Var, String str, Object obj, Object[] objArr) {
        this.d = rp0Var;
        this.e = ap0Var;
        this.f = str;
        this.g = obj;
        this.h = objArr;
    }

    public final void a() {
        String strF;
        ap0 ap0Var = this.e;
        if (this.i != null) {
            throw new IllegalArgumentException(("entry(" + this.i + ") is not null").toString());
        }
        if (ap0Var != null) {
            g7 g7Var = this.j;
            Object objA = g7Var.a();
            if (objA == null || ap0Var.a(objA)) {
                this.i = ap0Var.c(this.f, g7Var);
                return;
            }
            if (objA instanceof sv0) {
                sv0 sv0Var = (sv0) objA;
                if (sv0Var.d() == g2.I || sv0Var.d() == g2.V || sv0Var.d() == g2.N) {
                    strF = "MutableState containing " + sv0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strF = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strF = b10.F(objA);
            }
            throw new IllegalArgumentException(strF);
        }
    }

    @Override // defpackage.im0
    public final void c() {
        a();
    }

    @Override // defpackage.im0
    public final void d() {
        e9 e9Var = this.i;
        if (e9Var != null) {
            e9Var.D();
        }
    }

    @Override // defpackage.im0
    public final void f() {
        e9 e9Var = this.i;
        if (e9Var != null) {
            e9Var.D();
        }
    }
}
