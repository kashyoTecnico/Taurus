package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.taurus.dgmobilemx.MainActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pg implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long d = SystemClock.uptimeMillis() + 10000;
    public Runnable e;
    public boolean f;
    public final /* synthetic */ MainActivity g;

    public pg(MainActivity mainActivity) {
        this.g = mainActivity;
    }

    public final void a(View view) {
        if (this.f) {
            return;
        }
        this.f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c10.p(runnable, "runnable");
        this.e = runnable;
        View decorView = this.g.getWindow().getDecorView();
        c10.o(decorView, "getDecorView(...)");
        if (!this.f) {
            decorView.postOnAnimation(new b3(4, this));
        } else if (c10.i(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.d) {
                this.f = false;
                this.g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.e = null;
        fw fullyDrawnReporter = this.g.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            z = fullyDrawnReporter.b;
        }
        if (z) {
            this.f = false;
            this.g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
