package androidx.compose.ui.draw;

import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.mq;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class DrawBehindElement extends i90 {
    public final iw a;

    public DrawBehindElement(iw iwVar) {
        this.a = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.a == ((DrawBehindElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        mq mqVar = new mq();
        mqVar.r = this.a;
        return mqVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ((mq) d90Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
