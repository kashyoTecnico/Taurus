package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zd extends u10 {
    public final /* synthetic */ int h;
    public final ad i;

    public /* synthetic */ zd(ad adVar, int i) {
        this.h = i;
        this.i = adVar;
    }

    @Override // defpackage.u10
    public final boolean k() {
        switch (this.h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.u10
    public final void l(Throwable th) {
        switch (this.h) {
            case 0:
                y10 y10VarJ = j();
                ad adVar = this.i;
                Throwable thR = adVar.r(y10VarJ);
                if (adVar.x()) {
                    to toVar = (to) adVar.g;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = to.k;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(toVar);
                        cs csVar = m20.c;
                        if (c10.i(obj, csVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(toVar, csVar, thR)) {
                                if (atomicReferenceFieldUpdater.get(toVar) != csVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(toVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(toVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                adVar.m(thR);
                if (!adVar.x()) {
                    adVar.p();
                    break;
                }
                break;
            default:
                this.i.h(j41.a);
                break;
        }
    }
}
