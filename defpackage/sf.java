package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sf extends y20 implements iw {
    public final /* synthetic */ oi0[] e;
    public final /* synthetic */ tf f;
    public final /* synthetic */ int g;
    public final /* synthetic */ n80 h;
    public final /* synthetic */ int[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(oi0[] oi0VarArr, tf tfVar, int i, n80 n80Var, int[] iArr) {
        super(1);
        this.e = oi0VarArr;
        this.f = tfVar;
        this.g = i;
        this.h = n80Var;
        this.i = iArr;
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
            c10.m(oi0Var);
            Object objL = oi0Var.l();
            jo0 jo0Var = objL instanceof jo0 ? (jo0) objL : null;
            e30 layoutDirection = this.h.getLayoutDirection();
            dm dmVar = jo0Var != null ? jo0Var.c : null;
            int i4 = this.g;
            ni0.h(ni0Var, oi0Var, dmVar != null ? dmVar.a(i4 - oi0Var.d, layoutDirection) : this.f.b.a(i4 - oi0Var.d, layoutDirection), this.i[i2]);
            i++;
            i2 = i3;
        }
        return j41.a;
    }
}
