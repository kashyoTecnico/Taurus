package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z71 implements d50 {
    public final /* synthetic */ kk d;
    public final /* synthetic */ o7 e;
    public final /* synthetic */ sl0 f;
    public final /* synthetic */ dm0 g;
    public final /* synthetic */ View h;

    public z71(kk kkVar, o7 o7Var, sl0 sl0Var, dm0 dm0Var, View view) {
        this.d = kkVar;
        this.e = o7Var;
        this.f = sl0Var;
        this.g = dm0Var;
        this.h = view;
    }

    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) {
        boolean z;
        yc ycVarT = null;
        switch (y71.a[y40Var.ordinal()]) {
            case 1:
                nm.z(this.d, null, new y7(this.g, this.f, f50Var, this, this.h, null), 1);
                return;
            case 2:
                o7 o7Var = this.e;
                if (o7Var != null) {
                    q5 q5Var = (q5) o7Var.f;
                    synchronized (q5Var.a) {
                        try {
                            synchronized (q5Var.a) {
                                z = q5Var.b;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) q5Var.c;
                                q5Var.c = (ArrayList) q5Var.d;
                                q5Var.d = arrayList;
                                q5Var.b = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((lk) arrayList.get(i)).h(j41.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                sl0 sl0Var = this.f;
                synchronized (sl0Var.b) {
                    if (sl0Var.s) {
                        sl0Var.s = false;
                        ycVarT = sl0Var.t();
                    }
                }
                if (ycVarT != null) {
                    ((ad) ycVarT).h(j41.a);
                    return;
                }
                return;
            case 3:
                sl0 sl0Var2 = this.f;
                synchronized (sl0Var2.b) {
                    sl0Var2.s = true;
                }
                return;
            case 4:
                this.f.s();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new fg();
        }
    }
}
