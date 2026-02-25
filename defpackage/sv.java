package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sv implements sr {
    public final Context d;
    public final rv e;
    public final v71 f;
    public final Object g = new Object();
    public Handler h;
    public ThreadPoolExecutor i;
    public ThreadPoolExecutor j;
    public c4 k;

    public sv(Context context, rv rvVar) {
        r31.q(context, "Context cannot be null");
        this.d = context.getApplicationContext();
        this.e = rvVar;
        this.f = tv.d;
    }

    @Override // defpackage.sr
    public final void a(c4 c4Var) {
        synchronized (this.g) {
            this.k = c4Var;
        }
        synchronized (this.g) {
            try {
                if (this.k == null) {
                    return;
                }
                if (this.i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new xi("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.j = threadPoolExecutor;
                    this.i = threadPoolExecutor;
                }
                this.i.execute(new b3(6, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                this.k = null;
                Handler handler = this.h;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.h = null;
                ThreadPoolExecutor threadPoolExecutor = this.j;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.i = null;
                this.j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final bw c() {
        try {
            v71 v71Var = this.f;
            Context context = this.d;
            rv rvVar = this.e;
            v71Var.getClass();
            c8 c8VarA = qv.a(context, List.of(rvVar));
            int i = c8VarA.b;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            bw[] bwVarArr = (bw[]) ((List) c8VarA.c).get(0);
            if (bwVarArr == null || bwVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return bwVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
