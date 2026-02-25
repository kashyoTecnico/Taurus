package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g11 {
    public static final g11 d;
    public static final g11 e;
    public static final g11 f;
    public static final g11 g;
    public static final /* synthetic */ g11[] h;

    static {
        g11 g11Var = new g11("StartInput", 0);
        d = g11Var;
        g11 g11Var2 = new g11("StopInput", 1);
        e = g11Var2;
        g11 g11Var3 = new g11("ShowKeyboard", 2);
        f = g11Var3;
        g11 g11Var4 = new g11("HideKeyboard", 3);
        g = g11Var4;
        h = new g11[]{g11Var, g11Var2, g11Var3, g11Var4};
    }

    public static g11 valueOf(String str) {
        return (g11) Enum.valueOf(g11.class, str);
    }

    public static g11[] values() {
        return (g11[]) h.clone();
    }
}
