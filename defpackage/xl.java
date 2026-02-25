package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xl {
    public static final xl d;
    public static final xl e;
    public static final xl f;
    public static final /* synthetic */ xl[] g;

    static {
        xl xlVar = new xl("COROUTINE_SUSPENDED", 0);
        d = xlVar;
        xl xlVar2 = new xl("UNDECIDED", 1);
        e = xlVar2;
        xl xlVar3 = new xl("RESUMED", 2);
        f = xlVar3;
        g = new xl[]{xlVar, xlVar2, xlVar3};
    }

    public static xl valueOf(String str) {
        return (xl) Enum.valueOf(xl.class, str);
    }

    public static xl[] values() {
        return (xl[]) g.clone();
    }
}
