package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a81 extends ContentObserver {
    public final /* synthetic */ gc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a81(gc gcVar, Handler handler) {
        super(handler);
        this.a = gcVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.u(j41.a);
    }
}
