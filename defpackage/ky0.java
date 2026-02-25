package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ky0 implements PointerInputEventHandler, pw {
    public final /* synthetic */ kw a;

    public ky0(kw kwVar) {
        this.a = kwVar;
    }

    @Override // defpackage.pw
    public final ow b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof pw)) {
            return false;
        }
        return c10.i(this.a, ((pw) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(rj0 rj0Var, lk lkVar) {
        return this.a.e(rj0Var, lkVar);
    }
}
