package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j6 {
    public final PathMeasure a;

    public j6(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, i6 i6Var) {
        if (i6Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.getSegment(f, f2, i6Var.a, true);
    }
}
