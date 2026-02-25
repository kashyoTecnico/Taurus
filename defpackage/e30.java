package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e30 {
    public static final e30 d;
    public static final e30 e;
    public static final /* synthetic */ e30[] f;

    static {
        e30 e30Var = new e30("Ltr", 0);
        d = e30Var;
        e30 e30Var2 = new e30("Rtl", 1);
        e = e30Var2;
        f = new e30[]{e30Var, e30Var2};
    }

    public static e30 valueOf(String str) {
        return (e30) Enum.valueOf(e30.class, str);
    }

    public static e30[] values() {
        return (e30[]) f.clone();
    }
}
