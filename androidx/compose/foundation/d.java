package androidx.compose.foundation;

import defpackage.b90;
import defpackage.e90;
import defpackage.fa0;
import defpackage.fk;
import defpackage.fz;
import defpackage.hx0;
import defpackage.jz;
import defpackage.r31;
import defpackage.si;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class d {
    public static final hx0 a = new hx0(si.n);

    public static final e90 a(fa0 fa0Var, fz fzVar) {
        b90 b90Var = b90.a;
        return fzVar == null ? b90Var : fzVar instanceof jz ? new IndicationModifierElement(fa0Var, (jz) fzVar) : r31.r(b90Var, new fk(1, fzVar, fa0Var));
    }
}
