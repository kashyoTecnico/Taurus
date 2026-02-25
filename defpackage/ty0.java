package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ty0 {
    public final ry0 a;
    public final ArrayList b = new ArrayList();
    public d00 c;
    public d00 d;
    public int e;

    public ty0(ViewGroup viewGroup) {
        d00 d00Var = d00.e;
        this.c = d00Var;
        this.d = d00Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        ry0 ry0Var = new ry0(this, viewGroup.getContext(), viewGroup);
        this.a = ry0Var;
        ry0Var.setWillNotDraw(true);
        pd0 pd0Var = new pd0(this);
        int i = a61.a;
        w51.a(ry0Var, pd0Var);
        a61.a(ry0Var, new sy0(this));
        viewGroup.addView(ry0Var, 0);
    }
}
