package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lo extends v61 {
    public final /* synthetic */ mo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(mo moVar) {
        super(1);
        this.e = moVar;
    }

    @Override // defpackage.v61
    public final n71 d(n71 n71Var, List list) {
        mo moVar = this.e;
        if (!moVar.o) {
            View childAt = moVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, moVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, moVar.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return n71Var.a.j(iMax, iMax2, iMax3, iMax4);
            }
        }
        return n71Var;
    }

    @Override // defpackage.v61
    public final xz e(x61 x61Var, xz xzVar) {
        mo moVar = this.e;
        if (!moVar.o) {
            View childAt = moVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, moVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, moVar.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                d00 d00VarB = d00.b(iMax, iMax2, iMax3, iMax4);
                int i = d00VarB.a;
                d00 d00Var = (d00) xzVar.e;
                int i2 = d00VarB.b;
                int i3 = d00VarB.c;
                int i4 = d00VarB.d;
                return new xz(26, n71.a(d00Var, i, i2, i3, i4), n71.a((d00) xzVar.f, i, i2, i3, i4));
            }
        }
        return xzVar;
    }
}
