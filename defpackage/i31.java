package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i31 {
    public static final i31 d;
    public static final i31 e;
    public static final i31 f;
    public static final /* synthetic */ i31[] g;

    static {
        i31 i31Var = new i31("ContinueTraversal", 0);
        d = i31Var;
        i31 i31Var2 = new i31("SkipSubtreeAndContinueTraversal", 1);
        e = i31Var2;
        i31 i31Var3 = new i31("CancelTraversal", 2);
        f = i31Var3;
        g = new i31[]{i31Var, i31Var2, i31Var3};
    }

    public static i31 valueOf(String str) {
        return (i31) Enum.valueOf(i31.class, str);
    }

    public static i31[] values() {
        return (i31[]) g.clone();
    }
}
