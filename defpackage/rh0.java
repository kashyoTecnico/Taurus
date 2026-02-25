package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rh0 implements gw {
    public final /* synthetic */ sh0 d;

    public rh0(sh0 sh0Var) {
        this.d = sh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gw
    public final Object a() {
        ArrayList arrayList = this.d.a;
        ta0 ta0Var = new ta0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n20 n20Var = (n20) arrayList.get(i);
            Object obj = n20Var.b;
            int i2 = n20Var.a;
            Object z10Var = obj != null ? new z10(Integer.valueOf(i2), n20Var.b) : Integer.valueOf(i2);
            int iF = ta0Var.f(z10Var);
            boolean z = iF < 0;
            Object obj2 = z ? null : ta0Var.c[iF];
            if (obj2 != null) {
                if (obj2 instanceof ma0) {
                    ma0 ma0Var = (ma0) obj2;
                    ma0Var.a(n20Var);
                    n20Var = ma0Var;
                } else {
                    Object[] objArr = ad0.a;
                    ma0 ma0Var2 = new ma0(2);
                    ma0Var2.a(obj2);
                    ma0Var2.a(n20Var);
                    n20Var = ma0Var2;
                }
            }
            if (z) {
                int i3 = ~iF;
                ta0Var.b[i3] = z10Var;
                ta0Var.c[i3] = n20Var;
            } else {
                ta0Var.c[iF] = n20Var;
            }
        }
        return new y90(ta0Var);
    }
}
