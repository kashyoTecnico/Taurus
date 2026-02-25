package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class eq0 {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        new ta0(0);
    }

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int b(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int c(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int d(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
