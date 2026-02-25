package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nl0 {
    public oi a;
    public int b;
    public m2 c;
    public kw d;
    public int e;
    public la0 f;
    public ta0 g;

    public nl0(oi oiVar) {
        this.a = oiVar;
    }

    public static boolean a(fo foVar, ta0 ta0Var) {
        c10.n(foVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        uv0 uv0Var = foVar.f;
        if (uv0Var == null) {
            uv0Var = g2.V;
        }
        return !uv0Var.a(foVar.h().f, ta0Var.g(foVar));
    }

    public final boolean b() {
        if (this.a != null) {
            m2 m2Var = this.c;
            if (m2Var != null ? m2Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final m10 c(Object obj) {
        m10 m10VarR;
        oi oiVar = this.a;
        return (oiVar == null || (m10VarR = oiVar.r(this, obj)) == null) ? m10.d : m10VarR;
    }

    public final void d() {
        oi oiVar = this.a;
        if (oiVar != null) {
            oiVar.r = true;
            oiVar.u.k();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void e(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
