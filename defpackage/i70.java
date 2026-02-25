package defpackage;

import androidx.compose.foundation.layout.a;
import com.taurus.dgmobilemx.MainActivity;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i70 implements lw {
    public final /* synthetic */ String d;
    public final /* synthetic */ MainActivity e;

    public i70(MainActivity mainActivity, String str) {
        this.d = str;
        this.e = mainActivity;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        jg0 jg0Var = (jg0) obj;
        ci ciVar = (ci) obj2;
        int iIntValue = ((Number) obj3).intValue();
        c10.p(jg0Var, "innerPadding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ciVar.f(jg0Var) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else {
            ciVar.V(393947246);
            MainActivity mainActivity = this.e;
            boolean zH = ciVar.h(mainActivity);
            Object objK = ciVar.K();
            if (zH || objK == vh.a) {
                objK = new ir(2, mainActivity);
                ciVar.e0(objK);
            }
            ciVar.p(false);
            q70.a(this.d, (iw) objK, a.c(b90.a, jg0Var), ciVar, 0);
        }
        return j41.a;
    }
}
