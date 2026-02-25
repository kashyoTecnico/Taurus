package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z00 {
    public static final z00 d;
    public static final z00 e;
    public static final /* synthetic */ z00[] f;

    static {
        z00 z00Var = new z00("Width", 0);
        d = z00Var;
        z00 z00Var2 = new z00("Height", 1);
        e = z00Var2;
        f = new z00[]{z00Var, z00Var2};
    }

    public static z00 valueOf(String str) {
        return (z00) Enum.valueOf(z00.class, str);
    }

    public static z00[] values() {
        return (z00[]) f.clone();
    }
}
