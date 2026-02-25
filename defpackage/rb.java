package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rb implements jb {
    public final /* synthetic */ ln d;

    public rb(ln lnVar) {
        this.d = lnVar;
    }

    @Override // defpackage.jb
    public final Object l(nc0 nc0Var, gw gwVar, mk mkVar) {
        View viewV = r31.V(this.d);
        long jR = nc0Var.R(0L);
        xl0 xl0Var = (xl0) gwVar.a();
        xl0 xl0VarH = xl0Var != null ? xl0Var.h(jR) : null;
        if (xl0VarH != null) {
            viewV.requestRectangleOnScreen(new Rect((int) xl0VarH.a, (int) xl0VarH.b, (int) xl0VarH.c, (int) xl0VarH.d), false);
        }
        return j41.a;
    }
}
