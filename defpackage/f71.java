package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class f71 extends e71 {
    public f71(n71 n71Var, WindowInsets windowInsets) {
        super(n71Var, windowInsets);
    }

    @Override // defpackage.k71
    public n71 a() {
        return n71.c(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.k71
    public yo e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new yo(displayCutout);
    }

    @Override // defpackage.k71
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f71)) {
            return false;
        }
        f71 f71Var = (f71) obj;
        return Objects.equals(this.c, f71Var.c) && Objects.equals(null, null) && d71.q(this.e, f71Var.e);
    }

    @Override // defpackage.k71
    public int hashCode() {
        return this.c.hashCode();
    }
}
