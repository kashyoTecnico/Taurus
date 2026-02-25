package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class om implements a8 {
    public final q2 a;
    public final q31 b;
    public final Object c;
    public final k8 d;
    public final k8 e;
    public final k8 f;
    public final Object g;
    public final long h;

    public om(r1 r1Var, q31 q31Var, Object obj, k8 k8Var) {
        q2 q2Var = new q2((r1) r1Var.e);
        this.a = q2Var;
        this.b = q31Var;
        this.c = obj;
        k8 k8Var2 = (k8) q31Var.a.g(obj);
        this.d = k8Var2;
        this.e = l81.w(k8Var);
        iw iwVar = q31Var.b;
        if (((k8) q2Var.d) == null) {
            q2Var.d = k8Var2.c();
        }
        k8 k8Var3 = (k8) q2Var.d;
        if (k8Var3 == null) {
            c10.Y("targetVector");
            throw null;
        }
        int iB = k8Var3.b();
        int i = 0;
        while (i < iB) {
            k8 k8Var4 = (k8) q2Var.d;
            if (k8Var4 == null) {
                c10.Y("targetVector");
                throw null;
            }
            r1 r1Var2 = (r1) q2Var.a;
            float fA = k8Var2.a(i);
            float fA2 = k8Var.a(i);
            double dB = ((ot) r1Var2.e).b(fA2);
            double d = pt.a;
            int i2 = i;
            k8Var4.e((Math.signum(fA2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * r13.a * r13.b))) + fA, i2);
            i = i2 + 1;
        }
        k8 k8Var5 = (k8) q2Var.d;
        if (k8Var5 == null) {
            c10.Y("targetVector");
            throw null;
        }
        this.g = iwVar.g(k8Var5);
        q2 q2Var2 = this.a;
        k8 k8Var6 = this.d;
        if (((k8) q2Var2.c) == null) {
            q2Var2.c = k8Var6.c();
        }
        k8 k8Var7 = (k8) q2Var2.c;
        if (k8Var7 == null) {
            c10.Y("velocityVector");
            throw null;
        }
        int iB2 = k8Var7.b();
        long jMax = 0;
        for (int i3 = 0; i3 < iB2; i3++) {
            r1 r1Var3 = (r1) q2Var2.a;
            k8Var6.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((ot) r1Var3.e).b(k8Var.a(i3)) / (pt.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = jMax;
        k8 k8VarW = l81.w(this.a.e(jMax, this.d, k8Var));
        this.f = k8VarW;
        int iB3 = k8VarW.b();
        for (int i4 = 0; i4 < iB3; i4++) {
            k8 k8Var8 = this.f;
            float fA3 = k8Var8.a(i4);
            this.a.getClass();
            this.a.getClass();
            k8Var8.e(c10.t(fA3, -0.0f, 0.0f), i4);
        }
    }

    @Override // defpackage.a8
    public final boolean a() {
        return false;
    }

    @Override // defpackage.a8
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        iw iwVar = this.b.b;
        q2 q2Var = this.a;
        k8 k8Var = (k8) q2Var.b;
        k8 k8Var2 = this.d;
        if (k8Var == null) {
            q2Var.b = k8Var2.c();
        }
        k8 k8Var3 = (k8) q2Var.b;
        if (k8Var3 == null) {
            c10.Y("valueVector");
            throw null;
        }
        int iB = k8Var3.b();
        for (int i = 0; i < iB; i++) {
            k8 k8Var4 = (k8) q2Var.b;
            if (k8Var4 == null) {
                c10.Y("valueVector");
                throw null;
            }
            r1 r1Var = (r1) q2Var.a;
            float fA = k8Var2.a(i);
            long j2 = j / 1000000;
            nt ntVarA = ((ot) r1Var.e).a(this.e.a(i));
            long j3 = ntVarA.c;
            k8Var4.e((Math.signum(ntVarA.a) * ntVarA.b * n5.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA, i);
        }
        k8 k8Var5 = (k8) q2Var.b;
        if (k8Var5 != null) {
            return iwVar.g(k8Var5);
        }
        c10.Y("valueVector");
        throw null;
    }

    @Override // defpackage.a8
    public final long c() {
        return this.h;
    }

    @Override // defpackage.a8
    public final q31 d() {
        return this.b;
    }

    @Override // defpackage.a8
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.a8
    public final k8 f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.e(j, this.d, this.e);
    }
}
