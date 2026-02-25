package defpackage;

import android.content.res.Resources;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class mv0 implements iw {
    public final /* synthetic */ int d;

    public /* synthetic */ mv0(int i) {
        this.d = i;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.d) {
            case 0:
                mv0 mv0Var = ov0.a;
                return j41.a;
            default:
                Resources resources = (Resources) obj;
                c10.p(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
        }
    }
}
