package defpackage;

import androidx.compose.foundation.gestures.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cr0 extends jy0 implements kw {
    public int h;
    public final /* synthetic */ dr0 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(dr0 dr0Var, float f, float f2, lk lkVar) {
        super(2, lkVar);
        this.i = dr0Var;
        this.j = f;
        this.k = f2;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((cr0) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        return new cr0(this.i, this.j, this.k, lkVar);
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.h;
        if (i == 0) {
            c10.X(obj);
            mr0 mr0Var = this.i.F;
            long jF = nm.f(this.j, this.k);
            this.h = 1;
            Object objA = a.a(mr0Var, jF, this);
            xl xlVar = xl.d;
            if (objA == xlVar) {
                return xlVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10.X(obj);
        }
        return j41.a;
    }
}
