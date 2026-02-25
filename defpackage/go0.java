package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class go0 implements ju0 {
    public final jl a;
    public final jl b;
    public final jl c;
    public final jl d;

    public go0(jl jlVar, jl jlVar2, jl jlVar3, jl jlVar4) {
        this.a = jlVar;
        this.b = jlVar2;
        this.c = jlVar3;
        this.d = jlVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [jl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [jl] */
    public static go0 b(go0 go0Var, lp lpVar, lp lpVar2, lp lpVar3, int i) {
        lp lpVar4 = lpVar;
        if ((i & 1) != 0) {
            lpVar4 = go0Var.a;
        }
        jl jlVar = go0Var.b;
        lp lpVar5 = lpVar2;
        if ((i & 4) != 0) {
            lpVar5 = go0Var.c;
        }
        go0Var.getClass();
        return new go0(lpVar4, jlVar, lpVar5, lpVar3);
    }

    @Override // defpackage.ju0
    public final nf0 a(long j, e30 e30Var, xn xnVar) {
        float fA = this.a.a(j, xnVar);
        float fA2 = this.b.a(j, xnVar);
        float fA3 = this.c.a(j, xnVar);
        float fA4 = this.d.a(j, xnVar);
        float fC = yu0.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new lf0(c4.f(0L, j));
        }
        xl0 xl0VarF = c4.f(0L, j);
        e30 e30Var2 = e30.d;
        long jB = m20.b(e30Var == e30Var2 ? fA : fA2);
        if (e30Var == e30Var2) {
            fA = fA2;
        }
        long jB2 = m20.b(fA);
        long jB3 = m20.b(e30Var == e30Var2 ? fA3 : fA4);
        if (e30Var != e30Var2) {
            fA4 = fA3;
        }
        return new mf0(new fo0(xl0VarF.a, xl0VarF.b, xl0VarF.c, xl0VarF.d, jB, jB2, jB3, m20.b(fA4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go0)) {
            return false;
        }
        go0 go0Var = (go0) obj;
        return c10.i(this.a, go0Var.a) && c10.i(this.b, go0Var.b) && c10.i(this.c, go0Var.c) && c10.i(this.d, go0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
