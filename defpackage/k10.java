package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k10 {
    public static final k10 d;
    public static final k10 e;
    public static final k10 f;
    public static final k10 g;
    public static final /* synthetic */ k10[] h;

    static {
        k10 k10Var = new k10("LookaheadMeasurement", 0);
        d = k10Var;
        k10 k10Var2 = new k10("LookaheadPlacement", 1);
        e = k10Var2;
        k10 k10Var3 = new k10("Measurement", 2);
        f = k10Var3;
        k10 k10Var4 = new k10("Placement", 3);
        g = k10Var4;
        h = new k10[]{k10Var, k10Var2, k10Var3, k10Var4};
    }

    public static k10 valueOf(String str) {
        return (k10) Enum.valueOf(k10.class, str);
    }

    public static k10[] values() {
        return (k10[]) h.clone();
    }
}
