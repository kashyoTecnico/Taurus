package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class pk0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ pk0(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException, IOException {
        switch (this.d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new pk0(this.e, 1));
                break;
            default:
                r31.h0(this.e, new mk0(), r31.d, false);
                break;
        }
    }
}
