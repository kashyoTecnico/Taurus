package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class t10 extends y10 {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(r10 r10Var) {
        super(true);
        boolean z = true;
        P(r10Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y10.e;
        ae aeVar = (ae) atomicReferenceFieldUpdater.get(this);
        be beVar = aeVar instanceof be ? (be) aeVar : null;
        if (beVar == null) {
            z = false;
            break;
        }
        y10 y10VarJ = beVar.j();
        while (!y10VarJ.K()) {
            ae aeVar2 = (ae) atomicReferenceFieldUpdater.get(y10VarJ);
            be beVar2 = aeVar2 instanceof be ? (be) aeVar2 : null;
            if (beVar2 == null) {
                z = false;
                break;
            }
            y10VarJ = beVar2.j();
        }
        this.f = z;
    }

    @Override // defpackage.y10
    public final boolean K() {
        return this.f;
    }

    @Override // defpackage.y10
    public final boolean L() {
        return true;
    }
}
