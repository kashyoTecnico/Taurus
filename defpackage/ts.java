package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ts extends us {
    public final ad f;
    public final /* synthetic */ ws g;

    public ts(ws wsVar, long j, ad adVar) {
        this.g = wsVar;
        this.d = j;
        this.e = -1;
        this.f = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f.E(this.g);
    }

    @Override // defpackage.us
    public final String toString() {
        return super.toString() + this.f;
    }
}
