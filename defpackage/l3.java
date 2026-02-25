package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class l3 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(int i, int i2) {
        super(1);
        this.e = i2;
        this.f = i;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(((av) obj).E0(this.f));
            case 1:
                return Boolean.valueOf(((View) obj).getId() == this.f);
            default:
                return Boolean.valueOf(((av) obj).E0(this.f));
        }
    }
}
