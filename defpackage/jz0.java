package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jz0 implements a8 {
    public final e51 a;
    public final q31 b;
    public final Object c;
    public final Object d;
    public final k8 e;
    public final k8 f;
    public final k8 g;
    public long h;
    public k8 i;

    public jz0(e8 e8Var, q31 q31Var, Object obj, Object obj2, k8 k8Var) {
        this.a = e8Var.a(q31Var);
        this.b = q31Var;
        this.c = obj2;
        this.d = obj;
        this.e = (k8) q31Var.a.g(obj);
        iw iwVar = q31Var.a;
        this.f = (k8) iwVar.g(obj2);
        this.g = k8Var != null ? l81.w(k8Var) : ((k8) iwVar.g(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.a8
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.a8
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        k8 k8VarO = this.a.o(j, this.e, this.f, this.g);
        int iB = k8VarO.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(k8VarO.a(i))) {
                ak0.b("AnimationVector cannot contain a NaN. " + k8VarO + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.g(k8VarO);
    }

    @Override // defpackage.a8
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.a8
    public final q31 d() {
        return this.b;
    }

    @Override // defpackage.a8
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.a8
    public final k8 f(long j) {
        if (!g(j)) {
            return this.a.l(j, this.e, this.f, this.g);
        }
        k8 k8Var = this.i;
        if (k8Var != null) {
            return k8Var;
        }
        k8 k8VarP = this.a.p(this.e, this.f, this.g);
        this.i = k8VarP;
        return k8VarP;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
