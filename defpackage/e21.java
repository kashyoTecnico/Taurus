package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e21 {
    public static final e21 d;
    public static final e21 e;
    public static final /* synthetic */ e21[] f;

    static {
        e21 e21Var = new e21("Shown", 0);
        d = e21Var;
        e21 e21Var2 = new e21("Hidden", 1);
        e = e21Var2;
        f = new e21[]{e21Var, e21Var2};
    }

    public static e21 valueOf(String str) {
        return (e21) Enum.valueOf(e21.class, str);
    }

    public static e21[] values() {
        return (e21[]) f.clone();
    }
}
