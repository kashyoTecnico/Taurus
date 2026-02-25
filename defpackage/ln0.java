package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ln0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln0(Object obj, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = obj;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((ln0) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                ln0 ln0Var = new ln0((mn0) this.j, lkVar, 0);
                ln0Var.i = obj;
                return ln0Var;
            case 1:
                ln0 ln0Var2 = new ln0((mn0) this.j, lkVar, 1);
                ln0Var2.i = obj;
                return ln0Var2;
            default:
                ln0 ln0Var3 = new ln0((im) this.j, lkVar, 2);
                ln0Var3.i = obj;
                return ln0Var3;
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        boolean z;
        switch (this.h) {
            case 0:
                c10.X(obj);
                wl wlVar = (wl) this.i;
                mn0 mn0Var = (mn0) this.j;
                lk lkVar = null;
                nm.z(wlVar, null, new kn0(mn0Var, lkVar, 0), 3);
                nm.z(wlVar, null, new kn0(mn0Var, lkVar, 1), 3);
                return nm.z(wlVar, null, new kn0(mn0Var, lkVar, 2), 3);
            case 1:
                c10.X(obj);
                return nm.z((wl) this.i, null, new kn0((mn0) this.j, null, 3), 3);
            default:
                c10.X(obj);
                wl wlVar2 = (wl) this.i;
                im imVar = (im) this.j;
                r10 r10Var = (r10) imVar.a.getAndSet(null);
                AtomicReference atomicReference = imVar.a;
                rw0 rw0VarZ = nm.z(wlVar2, null, new c(r10Var, imVar, null, 12), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, rw0VarZ)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
