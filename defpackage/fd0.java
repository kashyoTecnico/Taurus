package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fd0 implements f9, f51 {
    public final int a;
    public int b;
    public final Object c;

    public fd0(f9 f9Var, int i) {
        this.c = f9Var;
        this.a = i;
    }

    @Override // defpackage.f9
    public void c(int i, Object obj) {
        ((f9) this.c).c(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.f9
    public void d(Object obj) {
        this.b++;
        ((f9) this.c).d(obj);
    }

    @Override // defpackage.f9
    public void e() {
        ((f9) this.c).e();
    }

    @Override // defpackage.f9
    public void f(int i, Object obj) {
        ((f9) this.c).f(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.f9
    public void h(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((f9) this.c).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.f9
    public Object i() {
        return ((f9) this.c).i();
    }

    @Override // defpackage.f9
    public void j(int i, int i2) {
        ((f9) this.c).j(i + (this.b == 0 ? this.a : 0), i2);
    }

    @Override // defpackage.f51
    public int k() {
        return this.b;
    }

    @Override // defpackage.e51
    public k8 l(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return ((q2) this.c).l(j, k8Var, k8Var2, k8Var3);
    }

    @Override // defpackage.f9
    public void m(kw kwVar, Object obj) {
        ((f9) this.c).m(kwVar, obj);
    }

    @Override // defpackage.f51
    public int n() {
        return this.a;
    }

    @Override // defpackage.e51
    public k8 o(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return ((q2) this.c).o(j, k8Var, k8Var2, k8Var3);
    }

    @Override // defpackage.f9
    public void q() {
        if (!(this.b > 0)) {
            fi.c("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((f9) this.c).q();
    }

    public fd0(int i, int i2, yq yqVar) {
        this.a = i;
        this.b = i2;
        this.c = new q2((rt) new tt(i, i2, yqVar));
    }
}
