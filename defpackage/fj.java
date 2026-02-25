package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fj implements xt0 {
    public final AtomicReference a;

    public fj(xt0 xt0Var) {
        this.a = new AtomicReference(xt0Var);
    }

    @Override // defpackage.xt0
    public final Iterator iterator() {
        xt0 xt0Var = (xt0) this.a.getAndSet(null);
        if (xt0Var != null) {
            return xt0Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
