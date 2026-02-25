package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rc0 {
    public static final rc0 d;
    public static final rc0 e;
    public static final /* synthetic */ rc0[] f;

    static {
        rc0 rc0Var = new rc0("Width", 0);
        d = rc0Var;
        rc0 rc0Var2 = new rc0("Height", 1);
        e = rc0Var2;
        f = new rc0[]{rc0Var, rc0Var2};
    }

    public static rc0 valueOf(String str) {
        return (rc0) Enum.valueOf(rc0.class, str);
    }

    public static rc0[] values() {
        return (rc0[]) f.clone();
    }
}
