package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z60 {
    public static final z60 d;
    public static final z60 e;
    public static final z60 f;
    public static final /* synthetic */ z60[] g;

    static {
        z60 z60Var = new z60("IsPlacedInLookahead", 0);
        d = z60Var;
        z60 z60Var2 = new z60("IsPlacedInApproach", 1);
        e = z60Var2;
        z60 z60Var3 = new z60("IsNotPlaced", 2);
        f = z60Var3;
        g = new z60[]{z60Var, z60Var2, z60Var3};
    }

    public static z60 valueOf(String str) {
        return (z60) Enum.valueOf(z60.class, str);
    }

    public static z60[] values() {
        return (z60[]) g.clone();
    }
}
