package androidx.compose.foundation;

import android.view.View;
import defpackage.b8;
import defpackage.c10;
import defpackage.d80;
import defpackage.d90;
import defpackage.f70;
import defpackage.g2;
import defpackage.g70;
import defpackage.i90;
import defpackage.iw;
import defpackage.kp;
import defpackage.ot0;
import defpackage.r31;
import defpackage.xn;
import defpackage.y20;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class MagnifierElement extends i90 {
    public final y20 a;
    public final y20 b;
    public final g2 c;

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierElement(iw iwVar, iw iwVar2, g2 g2Var) {
        this.a = (y20) iwVar;
        this.b = (y20) iwVar2;
        this.c = g2Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iw, y20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [iw, y20] */
    @Override // defpackage.i90
    public final d90 f() {
        return new f70(this.a, this.b, this.c);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        f70 f70Var = (f70) d90Var;
        f70Var.getClass();
        g2 g2Var = f70Var.t;
        View view = f70Var.u;
        xn xnVar = f70Var.v;
        f70Var.r = this.a;
        f70Var.s = this.b;
        g2 g2Var2 = this.c;
        f70Var.t = g2Var2;
        View viewV = r31.V(f70Var);
        xn xnVar2 = d80.z(f70Var).z;
        if (f70Var.w != null) {
            ot0 ot0Var = g70.a;
            if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
                g2Var2.getClass();
            }
            if (!kp.a(Float.NaN, Float.NaN) || !kp.a(Float.NaN, Float.NaN) || !g2Var2.equals(g2Var) || !viewV.equals(view) || !c10.i(xnVar2, xnVar)) {
                f70Var.B0();
            }
        }
        f70Var.C0();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + b8.d(b8.b(Float.NaN, b8.b(Float.NaN, b8.e(9205357640488583168L, b8.d(b8.b(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31), 31), 31), 31, true)) * 31);
    }
}
