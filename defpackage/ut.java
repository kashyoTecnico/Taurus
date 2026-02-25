package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ut extends ActionMode.Callback2 {
    public final nz0 a;

    public ut(nz0 nz0Var) {
        this.a = nz0Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        nz0 nz0Var = this.a;
        nz0Var.getClass();
        c10.m(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            gw gwVar = nz0Var.c;
            if (gwVar != null) {
                gwVar.a();
            }
        } else if (itemId == 1) {
            gw gwVar2 = nz0Var.d;
            if (gwVar2 != null) {
                gwVar2.a();
            }
        } else if (itemId == 2) {
            gw gwVar3 = nz0Var.e;
            if (gwVar3 != null) {
                gwVar3.a();
            }
        } else if (itemId == 3) {
            gw gwVar4 = nz0Var.f;
            if (gwVar4 != null) {
                gwVar4.a();
            }
        } else if (itemId != 4) {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        nz0 nz0Var = this.a;
        nz0Var.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (nz0Var.c != null) {
            nz0.a(menu, s80.f);
        }
        if (nz0Var.d != null) {
            nz0.a(menu, s80.g);
        }
        if (nz0Var.e != null) {
            nz0.a(menu, s80.h);
        }
        if (nz0Var.f == null) {
            return true;
        }
        nz0.a(menu, s80.i);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.a();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        xl0 xl0Var = this.a.b;
        if (rect != null) {
            rect.set((int) xl0Var.a, (int) xl0Var.b, (int) xl0Var.c, (int) xl0Var.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        nz0 nz0Var = this.a;
        nz0Var.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        nz0.b(menu, s80.f, nz0Var.c);
        nz0.b(menu, s80.g, nz0Var.d);
        nz0.b(menu, s80.h, nz0Var.e);
        nz0.b(menu, s80.i, nz0Var.f);
        nz0.b(menu, s80.j, null);
        return true;
    }
}
