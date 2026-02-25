package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qh0 {
    public static final qh0 d;
    public static final qh0 e;
    public static final qh0 f;
    public static final /* synthetic */ qh0[] g;

    /* JADX INFO: Fake field, exist only in values array */
    qh0 EF0;

    static {
        qh0 qh0Var = new qh0("Invalid", 0);
        qh0 qh0Var2 = new qh0("Cancelled", 1);
        d = qh0Var2;
        qh0 qh0Var3 = new qh0("InitialPending", 2);
        qh0 qh0Var4 = new qh0("RecomposePending", 3);
        qh0 qh0Var5 = new qh0("Recomposing", 4);
        e = qh0Var5;
        qh0 qh0Var6 = new qh0("ApplyPending", 5);
        f = qh0Var6;
        g = new qh0[]{qh0Var, qh0Var2, qh0Var3, qh0Var4, qh0Var5, qh0Var6, new qh0("Applied", 6)};
    }

    public static qh0 valueOf(String str) {
        return (qh0) Enum.valueOf(qh0.class, str);
    }

    public static qh0[] values() {
        return (qh0[]) g.clone();
    }
}
