package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kr {
    public static final kr a = new kr();

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(ve.M(s5.l(), s5.z(), s5.v(), s5.x(), s5.B(), s5.C(), s5.D()));
        Class[] clsArr = {s5.l(), s5.z(), s5.v(), s5.x()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(b80.K(4));
        for (int i = 0; i < 4; i++) {
            linkedHashSet.add(clsArr[i]);
        }
        editorInfo.setSupportedHandwritingGesturePreviews(linkedHashSet);
    }
}
