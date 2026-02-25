package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class by0 extends y20 implements kw {
    public final /* synthetic */ e90 e;
    public final /* synthetic */ ju0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ cb i;
    public final /* synthetic */ float j;
    public final /* synthetic */ zg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(e90 e90Var, ju0 ju0Var, long j, float f, cb cbVar, float f2, zg zgVar) {
        super(2);
        this.e = e90Var;
        this.f = ju0Var;
        this.g = j;
        this.h = f;
        this.i = cbVar;
        this.j = f2;
        this.k = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        j41 j41Var = j41.a;
        if (iIntValue == 2 && ciVar.z()) {
            ciVar.Q();
            return j41Var;
        }
        e90 e90VarC = dt0.a(dy0.b(this.e, this.f, dy0.c(this.g, this.h, ciVar), this.i, ((xn) ciVar.j(ti.h)).A(this.j)), false, s40.H).c(new SuspendPointerInputElement(j41Var, null, new ky0(new j7(2, null, 1)), 6));
        l80 l80VarD = eb.d(g2.e, true);
        int iHashCode = Long.hashCode(ciVar.T);
        wh0 wh0VarL = ciVar.l();
        e90 e90VarP = r31.P(ciVar, e90VarC);
        sh.b.getClass();
        si siVar = rh.b;
        ciVar.X();
        if (ciVar.S) {
            ciVar.k(siVar);
        } else {
            ciVar.h0();
        }
        dq0.m(ciVar, rh.e, l80VarD);
        dq0.m(ciVar, rh.d, wh0VarL);
        n9 n9Var = rh.f;
        if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
            b8.k(iHashCode, ciVar, iHashCode, n9Var);
        }
        dq0.m(ciVar, rh.c, e90VarP);
        this.k.e(ciVar, 0);
        ciVar.p(true);
        return j41Var;
    }
}
