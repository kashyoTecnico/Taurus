package defpackage;

import android.text.SegmentFinder;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b9 extends SegmentFinder {
    public final /* synthetic */ xz a;

    public b9(xz xzVar) {
        this.a = xzVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.q(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.r(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.u(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.v(i);
    }
}
