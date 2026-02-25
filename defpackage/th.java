package defpackage;

import com.taurus.dgmobilemx.MainActivity;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class th extends k {
    public final zg0 l;
    public boolean m;

    public th(MainActivity mainActivity) {
        super(mainActivity);
        this.l = qo0.n(null);
    }

    @Override // defpackage.k
    public final void b(int i, ci ciVar) {
        ciVar.W(420213850);
        int i2 = (ciVar.h(this) ? 4 : 2) | i;
        if (ciVar.N(i2 & 1, (i2 & 3) != 2)) {
            kw kwVar = (kw) this.l.getValue();
            if (kwVar == null) {
                ciVar.V(-1238798753);
            } else {
                ciVar.V(98586082);
                kwVar.e(ciVar, 0);
            }
            ciVar.p(false);
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new j(i, 4, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return th.class.getName();
    }

    @Override // defpackage.k
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m;
    }

    public final void setContent(kw kwVar) {
        this.m = true;
        this.l.setValue(kwVar);
        if (isAttachedToWindow()) {
            if (this.g == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
