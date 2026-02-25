package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hj0 {
    public static final hj0 d;
    public static final hj0 e;
    public static final hj0 f;
    public static final /* synthetic */ hj0[] g;

    static {
        hj0 hj0Var = new hj0("Initial", 0);
        d = hj0Var;
        hj0 hj0Var2 = new hj0("Main", 1);
        e = hj0Var2;
        hj0 hj0Var3 = new hj0("Final", 2);
        f = hj0Var3;
        g = new hj0[]{hj0Var, hj0Var2, hj0Var3};
    }

    public static hj0 valueOf(String str) {
        return (hj0) Enum.valueOf(hj0.class, str);
    }

    public static hj0[] values() {
        return (hj0[]) g.clone();
    }
}
