package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tc0 extends m implements r10 {
    public static final tc0 e = new tc0(g2.E);

    @Override // defpackage.r10
    public final boolean b() {
        return true;
    }

    @Override // defpackage.r10
    public final cp i(boolean z, boolean z2, zu zuVar) {
        return uc0.d;
    }

    @Override // defpackage.r10
    public final ae j(y10 y10Var) {
        return uc0.d;
    }

    @Override // defpackage.r10
    public final CancellationException q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.r10
    public final boolean start() {
        return false;
    }

    @Override // defpackage.r10
    public final cp t(iw iwVar) {
        return uc0.d;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.r10
    public final Object x(mk mkVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.r10, defpackage.ll0
    public final void a(CancellationException cancellationException) {
    }
}
