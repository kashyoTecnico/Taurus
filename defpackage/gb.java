package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gb extends y20 implements iw {
    public final /* synthetic */ oi0[] e;
    public final /* synthetic */ List f;
    public final /* synthetic */ n80 g;
    public final /* synthetic */ bm0 h;
    public final /* synthetic */ bm0 i;
    public final /* synthetic */ hb j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(oi0[] oi0VarArr, List list, n80 n80Var, bm0 bm0Var, bm0 bm0Var2, hb hbVar) {
        super(1);
        this.e = oi0VarArr;
        this.f = list;
        this.g = n80Var;
        this.h = bm0Var;
        this.i = bm0Var2;
        this.j = hbVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        ni0 ni0Var = (ni0) obj;
        oi0[] oi0VarArr = this.e;
        int length = oi0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            oi0 oi0Var = oi0VarArr[i];
            int i3 = i2 + 1;
            c10.n(oi0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            g80 g80Var = (g80) this.f.get(i2);
            e30 layoutDirection = this.g.getLayoutDirection();
            int i4 = this.h.d;
            int i5 = this.i.d;
            sa saVar = this.j.a;
            HashMap map = eb.a;
            g80Var.l();
            ni0.i(ni0Var, oi0Var, saVar.a(d80.e(oi0Var.d, oi0Var.e), d80.e(i4, i5), layoutDirection));
            i++;
            i2 = i3;
        }
        return j41.a;
    }
}
