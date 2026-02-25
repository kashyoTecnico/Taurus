package defpackage;

import android.view.ActionMode;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i7 implements d21 {
    public final p3 a;
    public ActionMode b;
    public final nz0 c = new nz0(new b(4, this));
    public e21 d = e21.e;

    public i7(p3 p3Var) {
        this.a = p3Var;
    }

    public final void a(xl0 xl0Var, gw gwVar, bl blVar, bl blVar2, gw gwVar2) {
        nz0 nz0Var = this.c;
        nz0Var.b = xl0Var;
        nz0Var.c = gwVar;
        nz0Var.e = blVar2;
        nz0Var.d = blVar;
        nz0Var.f = gwVar2;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.d = e21.d;
        this.b = this.a.startActionMode(new ut(nz0Var), 1);
    }
}
