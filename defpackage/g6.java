package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class g6 implements mw {
    public final /* synthetic */ h6 d;

    public /* synthetic */ g6(h6 h6Var) {
        this.d = h6Var;
    }

    @Override // defpackage.mw
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        h6 h6Var = this.d;
        z31 z31VarB = ((kv) h6Var.e).b((vy0) obj, (zv) obj2, ((xv) obj3).a, ((yv) obj4).a);
        if (z31VarB instanceof z31) {
            Object obj5 = z31VarB.d;
            c10.n(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) obj5;
        }
        e9 e9Var = new e9(z31VarB, h6Var.j);
        h6Var.j = e9Var;
        Object obj6 = e9Var.c;
        c10.n(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj6;
    }
}
