package defpackage;

import android.content.res.Configuration;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e4 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ za0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(za0 za0Var, int i) {
        super(1);
        this.e = i;
        this.f = za0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                this.f.setValue(new Configuration((Configuration) obj));
                break;
            case 1:
                break;
            case 2:
                this.f.setValue((sr0) obj);
                break;
            default:
                ((iw) this.f.getValue()).g(new ed0(((ed0) obj).a));
                break;
        }
        return j41.a;
    }
}
