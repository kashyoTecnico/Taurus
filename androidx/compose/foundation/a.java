package androidx.compose.foundation;

import defpackage.b90;
import defpackage.e90;
import defpackage.fa0;
import defpackage.fz;
import defpackage.gw;
import defpackage.ju0;
import defpackage.jz;
import defpackage.r31;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a {
    public static final e90 a(e90 e90Var, long j, ju0 ju0Var) {
        return e90Var.c(new BackgroundElement(j, ju0Var));
    }

    public static final e90 b(e90 e90Var, fa0 fa0Var, fz fzVar, boolean z, String str, gw gwVar) {
        e90 e90VarR;
        if (fzVar instanceof jz) {
            e90VarR = new ClickableElement(fa0Var, (jz) fzVar, z, str, gwVar);
        } else if (fzVar == null) {
            e90VarR = new ClickableElement(fa0Var, null, z, str, gwVar);
        } else if (fa0Var != null) {
            e90VarR = d.a(fa0Var, fzVar).c(new ClickableElement(fa0Var, null, z, str, gwVar));
        } else {
            e90VarR = r31.r(b90.a, new b(fzVar, z, str, gwVar));
        }
        return e90Var.c(e90VarR);
    }
}
