package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zw implements iw {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zw(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        long j;
        switch (this.d) {
            case 0:
                lv0 lv0Var = (lv0) obj;
                synchronized (ov0.c) {
                    j = ov0.e;
                    ov0.e = 1 + j;
                }
                return new ya0(j, lv0Var, (iw) this.e, (iw) this.f);
            default:
                q5 q5Var = (q5) this.e;
                Object obj2 = q5Var.a;
                ad adVar = (ad) this.f;
                synchronized (obj2) {
                    ((ArrayList) q5Var.c).remove(adVar);
                }
                return j41.a;
        }
    }
}
