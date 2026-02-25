package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nr0 {
    public static final nr0 d;
    public static final nr0 e;
    public static final /* synthetic */ nr0[] f;

    static {
        nr0 nr0Var = new nr0("Inherit", 0);
        d = nr0Var;
        nr0 nr0Var2 = new nr0("SecureOn", 1);
        e = nr0Var2;
        f = new nr0[]{nr0Var, nr0Var2, new nr0("SecureOff", 2)};
    }

    public static nr0 valueOf(String str) {
        return (nr0) Enum.valueOf(nr0.class, str);
    }

    public static nr0[] values() {
        return (nr0[]) f.clone();
    }
}
