package defpackage;

import android.R;
import android.content.res.Resources;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jk extends y20 implements kw {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(int i) {
        super(2);
        this.e = i;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Resources.NotFoundException {
        int i;
        ci ciVar = (ci) obj;
        ((Number) obj2).intValue();
        ciVar.V(-1451087197);
        int i2 = this.e;
        if (i2 == 1) {
            i = R.string.cut;
        } else if (i2 == 2) {
            i = R.string.copy;
        } else if (i2 == 3) {
            i = R.string.paste;
        } else {
            if (i2 != 4) {
                throw null;
            }
            i = R.string.selectAll;
        }
        String string = ((Resources) ciVar.j(m4.c)).getString(i);
        ciVar.p(false);
        return string;
    }
}
