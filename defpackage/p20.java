package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p20 extends d90 implements o20 {
    public iw r;
    public iw s;

    @Override // defpackage.o20
    public final boolean R(KeyEvent keyEvent) {
        iw iwVar = this.r;
        if (iwVar != null) {
            return ((Boolean) iwVar.g(new k20(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.o20
    public final boolean j(KeyEvent keyEvent) {
        iw iwVar = this.s;
        if (iwVar != null) {
            return ((Boolean) iwVar.g(new k20(keyEvent))).booleanValue();
        }
        return false;
    }
}
