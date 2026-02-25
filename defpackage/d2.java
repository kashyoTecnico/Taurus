package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.b;
import com.taurus.dgmobilemx.R;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d2 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ e90 f;
    public final /* synthetic */ zg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e90 e90Var, zg zgVar) {
        super(2);
        this.e = 0;
        this.f = e90Var;
        this.g = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Resources.NotFoundException {
        switch (this.e) {
            case 0:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    ciVar.j(m4.a);
                    String string = ((Context) ciVar.j(m4.b)).getResources().getString(R.string.m3c_dialog);
                    e90 e90VarG = b.g(this.f, f2.a, Float.NaN, f2.b, Float.NaN);
                    boolean zF = ciVar.f(string);
                    Object objK = ciVar.K();
                    if (zF || objK == vh.a) {
                        objK = new c2(string, 0);
                        ciVar.e0(objK);
                    }
                    e90 e90VarC = e90VarG.c(dt0.a(b90.a, false, (iw) objK));
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
                    this.g.e(ciVar, 0);
                    ciVar.p(true);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                int I = d80.I(49);
                dp0.a(this.f, this.g, (ci) obj, I);
                break;
            default:
                ((Number) obj2).intValue();
                int I2 = d80.I(49);
                jp0.a(this.f, this.g, (ci) obj, I2);
                break;
        }
        return j41.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(e90 e90Var, zg zgVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = e90Var;
        this.g = zgVar;
    }
}
