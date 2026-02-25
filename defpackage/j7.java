package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j7 extends jy0 implements kw {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7(int i, lk lkVar, int i2) {
        super(i, lkVar);
        this.h = i2;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Throwable {
        switch (this.h) {
            case 0:
                return ((j7) k((lk) obj2, (wl) obj)).o(j41.a);
            default:
                j7 j7Var = (j7) k((lk) obj2, (rj0) obj);
                j41 j41Var = j41.a;
                j7Var.o(j41Var);
                return j41Var;
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new j7(2, lkVar, 0);
            default:
                return new j7(2, lkVar, 1);
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                c10.X(obj);
                return Choreographer.getInstance();
            default:
                c10.X(obj);
                return j41.a;
        }
    }
}
