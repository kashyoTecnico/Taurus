package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n71 {
    public static final n71 b;
    public final k71 a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            b = j71.h;
        } else {
            b = h71.g;
        }
    }

    public n71(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new j71(this, windowInsets);
        } else if (i >= 31) {
            this.a = new i71(this, windowInsets);
        } else {
            this.a = new h71(this, windowInsets);
        }
    }

    public static d00 a(d00 d00Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, d00Var.a - i);
        int iMax2 = Math.max(0, d00Var.b - i2);
        int iMax3 = Math.max(0, d00Var.c - i3);
        int iMax4 = Math.max(0, d00Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? d00Var : d00.b(iMax, iMax2, iMax3, iMax4);
    }

    public static n71 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        n71 n71Var = new n71(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = a61.a;
            n71 n71VarA = x51.a(view);
            k71 k71Var = n71Var.a;
            k71Var.o(n71VarA);
            k71Var.d(view.getRootView());
            k71Var.p(view.getWindowSystemUiVisibility());
        }
        return n71Var;
    }

    public final WindowInsets b() {
        k71 k71Var = this.a;
        if (k71Var instanceof d71) {
            return ((d71) k71Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n71) {
            return Objects.equals(this.a, ((n71) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        k71 k71Var = this.a;
        if (k71Var == null) {
            return 0;
        }
        return k71Var.hashCode();
    }

    public n71() {
        this.a = new k71(this);
    }
}
