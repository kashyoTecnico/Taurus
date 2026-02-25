package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c40 extends q30 {
    public final /* synthetic */ f40 b;
    public final /* synthetic */ kw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(f40 f40Var, kw kwVar, String str) {
        super(str);
        this.b = f40Var;
        this.c = kwVar;
    }

    @Override // defpackage.l80
    public final m80 g(n80 n80Var, List list, long j) {
        f40 f40Var = this.b;
        a40 a40Var = f40Var.j;
        a40Var.d = n80Var.getLayoutDirection();
        a40Var.e = n80Var.b();
        a40Var.f = n80Var.k();
        boolean zS = n80Var.s();
        kw kwVar = this.c;
        if (zS || f40Var.d.j == null) {
            f40Var.f = 0;
            m80 m80Var = (m80) kwVar.e(a40Var, new gj(j));
            return new b40(m80Var, f40Var, f40Var.f, m80Var, 1);
        }
        f40Var.g = 0;
        m80 m80Var2 = (m80) kwVar.e(f40Var.k, new gj(j));
        return new b40(m80Var2, f40Var, f40Var.g, m80Var2, 0);
    }
}
