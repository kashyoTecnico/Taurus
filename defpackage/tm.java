package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tm extends ws implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final tm m;
    public static final long n;

    static {
        Long l;
        tm tmVar = new tm();
        m = tmVar;
        tmVar.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        n = timeUnit.toNanos(l.longValue());
    }

    public final synchronized void E() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            ws.j.set(this, null);
            ws.k.set(this, null);
            notifyAll();
        }
    }

    @Override // defpackage.xs
    public final Thread m() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        k21.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zC) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jS = s();
                    if (jS == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = n + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            E();
                            if (C()) {
                                return;
                            }
                            m();
                            return;
                        }
                        if (jS > j2) {
                            jS = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jS > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            E();
                            if (C()) {
                                return;
                            }
                            m();
                            return;
                        }
                        LockSupport.parkNanos(this, jS);
                    }
                }
            }
        } finally {
            _thread = null;
            E();
            if (!C()) {
                m();
            }
        }
    }

    @Override // defpackage.ws, defpackage.xs
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.pl
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.xs
    public final void y(long j, us usVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.ws
    public final void z(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.z(runnable);
    }
}
