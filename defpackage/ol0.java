package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ol0 {
    public static final ol0 d;
    public static final ol0 e;
    public static final ol0 f;
    public static final ol0 g;
    public static final ol0 h;
    public static final ol0 i;
    public static final /* synthetic */ ol0[] j;

    static {
        ol0 ol0Var = new ol0("ShutDown", 0);
        d = ol0Var;
        ol0 ol0Var2 = new ol0("ShuttingDown", 1);
        e = ol0Var2;
        ol0 ol0Var3 = new ol0("Inactive", 2);
        f = ol0Var3;
        ol0 ol0Var4 = new ol0("InactivePendingWork", 3);
        g = ol0Var4;
        ol0 ol0Var5 = new ol0("Idle", 4);
        h = ol0Var5;
        ol0 ol0Var6 = new ol0("PendingWork", 5);
        i = ol0Var6;
        j = new ol0[]{ol0Var, ol0Var2, ol0Var3, ol0Var4, ol0Var5, ol0Var6};
    }

    public static ol0 valueOf(String str) {
        return (ol0) Enum.valueOf(ol0.class, str);
    }

    public static ol0[] values() {
        return (ol0[]) j.clone();
    }
}
