package androidx.compose.foundation;

import defpackage.c10;
import defpackage.d90;
import defpackage.fa0;
import defpackage.i90;
import defpackage.iz;
import defpackage.jz;
import defpackage.ln;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class IndicationModifierElement extends i90 {
    public final fa0 a;
    public final jz b;

    public IndicationModifierElement(fa0 fa0Var, jz jzVar) {
        this.a = fa0Var;
        this.b = jzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return c10.i(this.a, indicationModifierElement.a) && c10.i(this.b, indicationModifierElement.b);
    }

    @Override // defpackage.i90
    public final d90 f() {
        ln lnVarB = this.b.b(this.a);
        iz izVar = new iz();
        izVar.t = lnVarB;
        izVar.A0(lnVarB);
        return izVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        iz izVar = (iz) d90Var;
        ln lnVarB = this.b.b(this.a);
        izVar.B0(izVar.t);
        izVar.t = lnVarB;
        izVar.A0(lnVarB);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
