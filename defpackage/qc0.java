package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qc0 {
    public static final qc0 d;
    public static final qc0 e;
    public static final /* synthetic */ qc0[] f;

    static {
        qc0 qc0Var = new qc0("Min", 0);
        d = qc0Var;
        qc0 qc0Var2 = new qc0("Max", 1);
        e = qc0Var2;
        f = new qc0[]{qc0Var, qc0Var2};
    }

    public static qc0 valueOf(String str) {
        return (qc0) Enum.valueOf(qc0.class, str);
    }

    public static qc0[] values() {
        return (qc0[]) f.clone();
    }
}
