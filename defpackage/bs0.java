package defpackage;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bs0 implements im0 {
    public final long d;
    public final ys0 e;
    public final long f;
    public xz g = xz.g;
    public z90 h;
    public final e90 i;

    public bs0(long j, ys0 ys0Var, long j2) {
        this.d = j;
        this.e = ys0Var;
        this.f = j2;
        as0 as0Var = new as0(this, 0);
        cs0 cs0Var = new cs0(as0Var, ys0Var, j);
        ds0 ds0Var = new ds0(as0Var, ys0Var, j);
        ob obVar = new ob(ds0Var, cs0Var, (lk) null, 11);
        gj0 gj0Var = ly0.a;
        this.i = new SuspendPointerInputElement(ds0Var, cs0Var, new ky0(obVar), 4).c(new PointerHoverIconModifierElement());
    }

    @Override // defpackage.im0
    public final void c() {
        as0 as0Var = new as0(this, 1);
        as0 as0Var2 = new as0(this, 2);
        long j = this.d;
        z90 z90Var = new z90(j, as0Var, as0Var2);
        zs0 zs0Var = (zs0) this.e;
        ia0 ia0Var = zs0Var.c;
        if (j == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + j).toString());
        }
        if (ia0Var.a(j)) {
            throw new IllegalArgumentException(("Another selectable with the id: " + z90Var + ".selectableId has already subscribed.").toString());
        }
        int iB = ia0Var.b(j);
        ia0Var.b[iB] = j;
        ia0Var.c[iB] = z90Var;
        zs0Var.b.add(z90Var);
        zs0Var.a = false;
        this.h = z90Var;
    }

    @Override // defpackage.im0
    public final void d() {
        z90 z90Var = this.h;
        if (z90Var != null) {
            ((zs0) this.e).d(z90Var);
            this.h = null;
        }
    }

    @Override // defpackage.im0
    public final void f() {
        z90 z90Var = this.h;
        if (z90Var != null) {
            ((zs0) this.e).d(z90Var);
            this.h = null;
        }
    }
}
