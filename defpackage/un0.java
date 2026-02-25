package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class un0 extends d90 implements pi, qq, b30 {
    public final fa0 r;
    public final boolean s;
    public final float t;
    public final on u;
    public final pn v;
    public ce w;
    public float x;
    public boolean z;
    public long y = 0;
    public final ma0 A = new ma0();

    public un0(fa0 fa0Var, boolean z, float f, on onVar, pn pnVar) {
        this.r = fa0Var;
        this.s = z;
        this.t = f;
        this.u = onVar;
        this.v = pnVar;
    }

    public abstract void A0(fk0 fk0Var, long j, float f);

    public abstract void B0(v30 v30Var);

    public final void C0(hk0 hk0Var) {
        if (hk0Var instanceof fk0) {
            A0((fk0) hk0Var, this.y, this.x);
        } else if (hk0Var instanceof gk0) {
            D0(((gk0) hk0Var).a);
        } else if (hk0Var instanceof ek0) {
            D0(((ek0) hk0Var).a);
        }
    }

    public abstract void D0(fk0 fk0Var);

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        v30Var.a();
        ce ceVar = this.w;
        if (ceVar != null) {
            ceVar.a(v30Var, this.x, this.u.a());
        }
        B0(v30Var);
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.b30
    public final void r(long j) {
        this.z = true;
        xn xnVar = d80.z(this).z;
        this.y = d80.F(j);
        float f = this.t;
        this.x = Float.isNaN(f) ? nn0.a(xnVar, this.s, this.y) : xnVar.A(f);
        ma0 ma0Var = this.A;
        Object[] objArr = ma0Var.a;
        int i = ma0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            C0((hk0) objArr[i2]);
        }
        ma0Var.c();
    }

    @Override // defpackage.d90
    public final void s0() {
        nm.z(o0(), null, new c(this, null, 16), 3);
    }
}
