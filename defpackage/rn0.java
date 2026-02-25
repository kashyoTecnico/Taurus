package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rn0 extends View {
    public static final int[] i = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] j = new int[0];
    public n41 d;
    public Boolean e;
    public Long f;
    public b3 g;
    public gw h;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? i : j;
            n41 n41Var = this.d;
            if (n41Var != null) {
                n41Var.setState(iArr);
            }
        } else {
            b3 b3Var = new b3(8, this);
            this.g = b3Var;
            postDelayed(b3Var, 50L);
        }
        this.f = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(rn0 rn0Var) {
        n41 n41Var = rn0Var.d;
        if (n41Var != null) {
            n41Var.setState(j);
        }
        rn0Var.g = null;
    }

    public final void b(fk0 fk0Var, boolean z, long j2, int i2, long j3, float f, gw gwVar) {
        if (this.d == null || !Boolean.valueOf(z).equals(this.e)) {
            n41 n41Var = new n41(z);
            setBackground(n41Var);
            this.d = n41Var;
            this.e = Boolean.valueOf(z);
        }
        n41 n41Var2 = this.d;
        c10.m(n41Var2);
        this.h = gwVar;
        Integer num = n41Var2.f;
        if (num == null || num.intValue() != i2) {
            n41Var2.f = Integer.valueOf(i2);
            m41.a.a(n41Var2, i2);
        }
        e(f, j2, j3);
        if (z) {
            n41Var2.setHotspot(ed0.d(fk0Var.a), ed0.e(fk0Var.a));
        } else {
            n41Var2.setHotspot(n41Var2.getBounds().centerX(), n41Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.h = null;
        b3 b3Var = this.g;
        if (b3Var != null) {
            removeCallbacks(b3Var);
            b3 b3Var2 = this.g;
            c10.m(b3Var2);
            b3Var2.run();
        } else {
            n41 n41Var = this.d;
            if (n41Var != null) {
                n41Var.setState(j);
            }
        }
        n41 n41Var2 = this.d;
        if (n41Var2 == null) {
            return;
        }
        n41Var2.setVisible(false, false);
        unscheduleDrawable(n41Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f, long j2, long j3) {
        n41 n41Var = this.d;
        if (n41Var == null) {
            return;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = bf.b(j3, f);
        bf bfVar = n41Var.e;
        if (!(bfVar == null ? false : bf.c(bfVar.a, jB))) {
            n41Var.e = new bf(jB);
            n41Var.setColor(ColorStateList.valueOf(r31.Z(jB)));
        }
        Rect rect = new Rect(0, 0, d80.B(yu0.d(j2)), d80.B(yu0.b(j2)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        n41Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        gw gwVar = this.h;
        if (gwVar != null) {
            gwVar.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
