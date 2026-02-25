package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class um0 {
    public static final um0 d;
    public static final um0 e;
    public static final /* synthetic */ um0[] f;

    static {
        um0 um0Var = new um0("Ltr", 0);
        d = um0Var;
        um0 um0Var2 = new um0("Rtl", 1);
        e = um0Var2;
        f = new um0[]{um0Var, um0Var2};
    }

    public static um0 valueOf(String str) {
        return (um0) Enum.valueOf(um0.class, str);
    }

    public static um0[] values() {
        return (um0[]) f.clone();
    }
}
