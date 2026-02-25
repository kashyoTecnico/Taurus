package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ry0 extends View {
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ty0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(ty0 ty0Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.e = ty0Var;
        this.d = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.d.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        ty0 ty0Var = this.e;
        if (ty0Var.e != color) {
            ty0Var.e = color;
            for (int size = ty0Var.b.size() - 1; size >= 0; size--) {
                ((bl0) ty0Var.b.get(size)).b(color);
            }
        }
    }
}
