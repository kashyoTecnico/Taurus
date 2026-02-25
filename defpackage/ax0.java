package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ax0 extends i0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.i0
    public final boolean a(h0 h0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(d80.h);
        return true;
    }

    @Override // defpackage.i0
    public final lk[] b(h0 h0Var) {
        this.a.set(null);
        return nm.a;
    }
}
