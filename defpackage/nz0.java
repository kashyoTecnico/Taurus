package defpackage;

import android.R;
import android.view.Menu;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nz0 {
    public final b a;
    public xl0 b = xl0.e;
    public gw c = null;
    public gw d = null;
    public gw e = null;
    public gw f = null;

    public nz0(b bVar) {
        this.a = bVar;
    }

    public static void a(Menu menu, s80 s80Var) {
        int i;
        int i2 = s80Var.d;
        int i3 = s80Var.e;
        int iOrdinal = s80Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.copy;
        } else if (iOrdinal == 1) {
            i = R.string.paste;
        } else if (iOrdinal == 2) {
            i = R.string.cut;
        } else if (iOrdinal == 3) {
            i = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new fg();
            }
            i = R.string.autofill;
        }
        menu.add(0, i2, i3, i).setShowAsAction(1);
    }

    public static void b(Menu menu, s80 s80Var, gw gwVar) {
        int i = s80Var.d;
        if (gwVar != null && menu.findItem(i) == null) {
            a(menu, s80Var);
        } else {
            if (gwVar != null || menu.findItem(i) == null) {
                return;
            }
            menu.removeItem(i);
        }
    }
}
