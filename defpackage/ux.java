package defpackage;

import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ux {
    public static /* bridge */ /* synthetic */ HandwritingGesture l(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture n(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture o(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof SelectGesture;
    }
}
