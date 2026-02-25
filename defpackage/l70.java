package defpackage;

import androidx.compose.foundation.layout.b;
import com.taurus.dgmobilemx.MainActivity;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class l70 implements kw {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ l70(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws NoSuchAlgorithmException, IOException {
        switch (this.d) {
            case 0:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    MainActivity mainActivity = this.e;
                    if (mainActivity.isAuthorizedByAdb()) {
                        ciVar.V(130463013);
                        aq0.a(b.b, null, null, null, null, 0, 0L, 0L, null, b10.b0(-63154700, new i70(mainActivity, mainActivity.obtenerDatosEquipo()), ciVar), ciVar, 805306374);
                        ciVar.p(false);
                    } else {
                        ciVar.V(131075077);
                        ciVar.V(835511132);
                        Object objK = ciVar.K();
                        v71 v71Var = vh.a;
                        if (objK == v71Var) {
                            objK = mainActivity.obtenerSerialLimpio();
                            ciVar.e0(objK);
                        }
                        String str = (String) objK;
                        ciVar.p(false);
                        ciVar.V(835513780);
                        Object objK2 = ciVar.K();
                        if (objK2 == v71Var) {
                            objK2 = mainActivity.generarHash(px0.z(str).toString() + q70.b);
                            ciVar.e0(objK2);
                        }
                        ciVar.p(false);
                        dy0.a(b.b, null, ((kf) ciVar.j(lf.a)).n, 0L, 0.0f, 0.0f, b10.b0(-1595074241, new j70(1, str), ciVar), ciVar, 12582918, 122);
                        ciVar.p(false);
                    }
                }
                break;
            default:
                ci ciVar2 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar2.z()) {
                    ciVar2.Q();
                } else {
                    i21.a(false, false, b10.b0(-1404171810, new l70(this.e, 0), ciVar2), ciVar2, 384);
                }
                break;
        }
        return j41.a;
    }
}
