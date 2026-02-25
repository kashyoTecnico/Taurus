package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class mk extends ia {
    public final ml e;
    public transient lk f;

    public mk(lk lkVar, ml mlVar) {
        super(lkVar);
        this.e = mlVar;
    }

    @Override // defpackage.lk
    public ml f() {
        ml mlVar = this.e;
        c10.m(mlVar);
        return mlVar;
    }

    @Override // defpackage.ia
    public void p() {
        lk lkVar = this.f;
        if (lkVar != null && lkVar != this) {
            kl klVarN = f().n(g2.v);
            c10.m(klVarN);
            to toVar = (to) lkVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = to.k;
            while (atomicReferenceFieldUpdater.get(toVar) == m20.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(toVar);
            ad adVar = obj instanceof ad ? (ad) obj : null;
            if (adVar != null) {
                adVar.p();
            }
        }
        this.f = dg.e;
    }

    public mk(lk lkVar) {
        this(lkVar, lkVar != null ? lkVar.f() : null);
    }
}
