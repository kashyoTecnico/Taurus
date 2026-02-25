package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class f0 implements Future {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(f0.class.getName());
    public static final r31 i;
    public static final Object j;
    public volatile Object d;
    public volatile b0 e;
    public volatile e0 f;

    static {
        r31 d0Var;
        try {
            d0Var = new c0(AtomicReferenceFieldUpdater.newUpdater(e0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e0.class, e0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f0.class, e0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(f0.class, b0.class, "e"), AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            d0Var = new d0();
        }
        i = d0Var;
        if (th != null) {
            h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    public static void b(f0 f0Var) {
        e0 e0Var;
        b0 b0Var;
        do {
            e0Var = f0Var.f;
        } while (!i.p(f0Var, e0Var, e0.c));
        while (e0Var != null) {
            Thread thread = e0Var.a;
            if (thread != null) {
                e0Var.a = null;
                LockSupport.unpark(thread);
            }
            e0Var = e0Var.b;
        }
        do {
            b0Var = f0Var.e;
        } while (!i.n(f0Var, b0Var));
        b0 b0Var2 = null;
        while (b0Var != null) {
            b0 b0Var3 = b0Var.a;
            b0Var.a = b0Var2;
            b0Var2 = b0Var;
            b0Var = b0Var3;
        }
        while (b0Var2 != null) {
            b0Var2 = b0Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof z) {
            Throwable th = ((z) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    public static Object d(f0 f0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = f0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.d;
        if (obj != null) {
            return false;
        }
        if (!i.o(this, obj, g ? new z(new CancellationException("Future.cancel() was called."), z) : z ? z.b : z.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(e0 e0Var) {
        e0Var.a = null;
        while (true) {
            e0 e0Var2 = this.f;
            if (e0Var2 == e0.c) {
                return;
            }
            e0 e0Var3 = null;
            while (e0Var2 != null) {
                e0 e0Var4 = e0Var2.b;
                if (e0Var2.a != null) {
                    e0Var3 = e0Var2;
                } else if (e0Var3 != null) {
                    e0Var3.b = e0Var4;
                    if (e0Var3.a == null) {
                        break;
                    }
                } else if (!i.p(this, e0Var2, e0Var4)) {
                    break;
                }
                e0Var2 = e0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        e0 e0Var = e0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            e0 e0Var2 = this.f;
            if (e0Var2 != e0Var) {
                e0 e0Var3 = new e0();
                do {
                    r31 r31Var = i;
                    r31Var.R(e0Var3, e0Var2);
                    if (r31Var.p(this, e0Var2, e0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(e0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(e0Var3);
                    } else {
                        e0Var2 = this.f;
                    }
                } while (e0Var2 != e0Var);
            }
            return c(this.d);
        }
        while (nanos > 0) {
            Object obj3 = this.d;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof z;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof z) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        e0 e0Var = e0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if (obj2 != null) {
                return c(obj2);
            }
            e0 e0Var2 = this.f;
            if (e0Var2 != e0Var) {
                e0 e0Var3 = new e0();
                do {
                    r31 r31Var = i;
                    r31Var.R(e0Var3, e0Var2);
                    if (r31Var.p(this, e0Var2, e0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                e(e0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    e0Var2 = this.f;
                } while (e0Var2 != e0Var);
            }
            return c(this.d);
        }
        throw new InterruptedException();
    }
}
