package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c00 {
    public static final c00 d;
    public static final c00 e;
    public static final c00 f;
    public static final /* synthetic */ c00[] g;

    static {
        c00 c00Var = new c00("Focused", 0);
        d = c00Var;
        c00 c00Var2 = new c00("UnfocusedEmpty", 1);
        e = c00Var2;
        c00 c00Var3 = new c00("UnfocusedNotEmpty", 2);
        f = c00Var3;
        g = new c00[]{c00Var, c00Var2, c00Var3};
    }

    public static c00 valueOf(String str) {
        return (c00) Enum.valueOf(c00.class, str);
    }

    public static c00[] values() {
        return (c00[]) g.clone();
    }
}
