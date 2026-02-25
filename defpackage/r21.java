package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r21 {
    public static final r21 d;
    public static final r21 e;
    public static final /* synthetic */ r21[] f;

    static {
        r21 r21Var = new r21("On", 0);
        d = r21Var;
        r21 r21Var2 = new r21("Off", 1);
        e = r21Var2;
        f = new r21[]{r21Var, r21Var2, new r21("Indeterminate", 2)};
    }

    public static r21 valueOf(String str) {
        return (r21) Enum.valueOf(r21.class, str);
    }

    public static r21[] values() {
        return (r21[]) f.clone();
    }
}
