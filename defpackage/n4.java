package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n4 {
    public static final n4 d;
    public static final n4 e;
    public static final /* synthetic */ n4[] f;

    static {
        n4 n4Var = new n4("SHOW_ORIGINAL", 0);
        d = n4Var;
        n4 n4Var2 = new n4("SHOW_TRANSLATED", 1);
        e = n4Var2;
        f = new n4[]{n4Var, n4Var2};
    }

    public static n4 valueOf(String str) {
        return (n4) Enum.valueOf(n4.class, str);
    }

    public static n4[] values() {
        return (n4[]) f.clone();
    }
}
