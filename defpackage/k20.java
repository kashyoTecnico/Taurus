package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k20 {
    public final KeyEvent a;

    public /* synthetic */ k20(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k20) {
            return c10.i(this.a, ((k20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
