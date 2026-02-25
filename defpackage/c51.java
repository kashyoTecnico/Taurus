package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c51 {
    public ta a;
    public float b = 1.0f;
    public e30 c = e30.d;
    public final zg0 d = qo0.n(new yu0(0));
    public final zg0 e = qo0.n(Boolean.FALSE);
    public final x41 f;
    public final wg0 g;
    public float h;
    public ta i;
    public int j;

    public c51(jx jxVar) {
        x41 x41Var = new x41(jxVar);
        x41Var.f = new b(27, this);
        this.f = x41Var;
        this.g = new wg0(0);
        this.h = 1.0f;
        this.j = -1;
    }

    public final void a(v30 v30Var, long j, float f, ta taVar) {
        fd fdVar = v30Var.d;
        if (this.b != f) {
            this.h = f;
            this.b = f;
        }
        if (!c10.i(this.a, taVar)) {
            this.i = taVar;
            this.a = taVar;
        }
        e30 layoutDirection = v30Var.getLayoutDirection();
        if (this.c != layoutDirection) {
            this.c = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fdVar.c() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fdVar.c() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((r1) fdVar.e.a).m(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    c(v30Var);
                }
            } finally {
                ((r1) fdVar.e.a).m(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public final long b() {
        return ((yu0) this.d.getValue()).a;
    }

    public final void c(v30 v30Var) {
        fd fdVar = v30Var.d;
        ta taVar = this.i;
        x41 x41Var = this.f;
        if (taVar == null) {
            taVar = (ta) x41Var.g.getValue();
        }
        if (((Boolean) this.e.getValue()).booleanValue() && v30Var.getLayoutDirection() == e30.e) {
            long jT = fdVar.T();
            e9 e9Var = fdVar.e;
            long jS = e9Var.s();
            e9Var.o().l();
            try {
                ((r1) e9Var.a).r(-1.0f, 1.0f, jT);
                x41Var.e(v30Var, this.h, taVar);
            } finally {
                b8.m(e9Var, jS);
            }
        } else {
            x41Var.e(v30Var, this.h, taVar);
        }
        this.j = this.g.g();
    }
}
