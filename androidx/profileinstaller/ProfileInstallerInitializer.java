package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.kc0;
import defpackage.ok0;
import defpackage.oz;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements oz {
    @Override // defpackage.oz
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.oz
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new ok0(this, context.getApplicationContext()));
        return new kc0(8);
    }
}
