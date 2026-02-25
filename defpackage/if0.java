package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class if0 {
    public static final if0 d;
    public static final if0 e;
    public static final /* synthetic */ if0[] f;

    static {
        if0 if0Var = new if0("Vertical", 0);
        d = if0Var;
        if0 if0Var2 = new if0("Horizontal", 1);
        e = if0Var2;
        f = new if0[]{if0Var, if0Var2};
    }

    public static if0 valueOf(String str) {
        return (if0) Enum.valueOf(if0.class, str);
    }

    public static if0[] values() {
        return (if0[]) f.clone();
    }
}
