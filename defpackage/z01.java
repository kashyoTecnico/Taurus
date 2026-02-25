package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z01 {
    public static final z01 d;
    public static final /* synthetic */ z01[] e;

    /* JADX INFO: Fake field, exist only in values array */
    z01 EF0;

    static {
        z01 z01Var = new z01("Filled", 0);
        z01 z01Var2 = new z01("Outlined", 1);
        d = z01Var2;
        e = new z01[]{z01Var, z01Var2};
    }

    public static z01 valueOf(String str) {
        return (z01) Enum.valueOf(z01.class, str);
    }

    public static z01[] values() {
        return (z01[]) e.clone();
    }
}
