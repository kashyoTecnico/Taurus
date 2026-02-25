package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n41 extends RippleDrawable {
    public final boolean d;
    public bf e;
    public Integer f;
    public boolean g;

    public n41(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.d = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.d) {
            this.g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.g;
    }
}
