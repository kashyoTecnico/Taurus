package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q7 implements c61 {
    public final ViewConfiguration a;

    public q7(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.c61
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.c61
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.c61
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.c61
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.c61
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // defpackage.c61
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
