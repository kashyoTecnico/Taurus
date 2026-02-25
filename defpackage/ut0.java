package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ut0 extends or0 {
    public final /* synthetic */ AtomicReferenceArray e;

    public ut0(long j, ut0 ut0Var, int i) {
        super(j, ut0Var, i);
        this.e = new AtomicReferenceArray(tt0.f);
    }

    @Override // defpackage.or0
    public final int f() {
        return tt0.f;
    }

    @Override // defpackage.or0
    public final void g(int i, ml mlVar) {
        this.e.set(i, tt0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
