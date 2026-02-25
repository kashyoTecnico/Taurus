package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y00 {
    public static final y00 d;
    public static final y00 e;
    public static final /* synthetic */ y00[] f;

    static {
        y00 y00Var = new y00("Min", 0);
        d = y00Var;
        y00 y00Var2 = new y00("Max", 1);
        e = y00Var2;
        f = new y00[]{y00Var, y00Var2};
    }

    public static y00 valueOf(String str) {
        return (y00) Enum.valueOf(y00.class, str);
    }

    public static y00[] values() {
        return (y00[]) f.clone();
    }
}
