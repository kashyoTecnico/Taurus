package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m10 {
    public static final m10 d;
    public static final m10 e;
    public static final m10 f;
    public static final m10 g;
    public static final /* synthetic */ m10[] h;

    static {
        m10 m10Var = new m10("IGNORED", 0);
        d = m10Var;
        m10 m10Var2 = new m10("SCHEDULED", 1);
        e = m10Var2;
        m10 m10Var3 = new m10("DEFERRED", 2);
        f = m10Var3;
        m10 m10Var4 = new m10("IMMINENT", 3);
        g = m10Var4;
        h = new m10[]{m10Var, m10Var2, m10Var3, m10Var4};
    }

    public static m10 valueOf(String str) {
        return (m10) Enum.valueOf(m10.class, str);
    }

    public static m10[] values() {
        return (m10[]) h.clone();
    }
}
