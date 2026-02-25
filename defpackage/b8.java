package defpackage;

import android.content.res.TypedArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b8 {
    public static /* synthetic */ int a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static int b(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int c(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int d(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int e(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static fg f(String str) {
        pz.c(str);
        return new fg();
    }

    public static String g(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String h(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder i(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void j(int i, int i2, int i3, int i4, int i5) {
        m20.e(i);
        m20.e(i2);
        m20.e(i3);
        m20.e(i4);
        m20.e(i5);
    }

    public static void k(int i, ci ciVar, int i2, n9 n9Var) {
        ciVar.e0(Integer.valueOf(i));
        ciVar.b(n9Var, Integer.valueOf(i2));
    }

    public static void l(long j, StringBuilder sb, String str) {
        sb.append((Object) bf.i(j));
        sb.append(str);
    }

    public static void m(e9 e9Var, long j) {
        e9Var.o().i();
        e9Var.C(j);
    }

    public static /* synthetic */ void n(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (!(autoCloseable instanceof TypedArray)) {
                throw new IllegalArgumentException();
            }
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void o(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ int p(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED";
    }
}
