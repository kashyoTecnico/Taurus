package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class su0 {
    public static final su0 d;
    public static final su0 e;
    public static final su0 f;
    public static final /* synthetic */ su0[] g;

    static {
        su0 su0Var = new su0("START", 0);
        d = su0Var;
        su0 su0Var2 = new su0("STOP", 1);
        e = su0Var2;
        su0 su0Var3 = new su0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f = su0Var3;
        g = new su0[]{su0Var, su0Var2, su0Var3};
    }

    public static su0 valueOf(String str) {
        return (su0) Enum.valueOf(su0.class, str);
    }

    public static su0[] values() {
        return (su0[]) g.clone();
    }
}
