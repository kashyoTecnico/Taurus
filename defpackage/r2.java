package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r2 extends y20 implements mw {
    public final /* synthetic */ s2 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, int i) {
        super(4);
        this.e = s2Var;
        this.f = i;
    }

    @Override // defpackage.mw
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        s2 s2Var = this.e;
        r1 r1Var = s2Var.a;
        ((AutofillManager) r1Var.e).notifyViewEntered(s2Var.c, this.f, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return j41.a;
    }
}
