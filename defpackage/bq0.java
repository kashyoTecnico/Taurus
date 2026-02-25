package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bq0 {
    public static final bq0 d;
    public static final bq0 e;
    public static final bq0 f;
    public static final bq0 g;
    public static final bq0 h;
    public static final /* synthetic */ bq0[] i;

    static {
        bq0 bq0Var = new bq0("TopBar", 0);
        d = bq0Var;
        bq0 bq0Var2 = new bq0("MainContent", 1);
        e = bq0Var2;
        bq0 bq0Var3 = new bq0("Snackbar", 2);
        f = bq0Var3;
        bq0 bq0Var4 = new bq0("Fab", 3);
        g = bq0Var4;
        bq0 bq0Var5 = new bq0("BottomBar", 4);
        h = bq0Var5;
        i = new bq0[]{bq0Var, bq0Var2, bq0Var3, bq0Var4, bq0Var5};
    }

    public static bq0 valueOf(String str) {
        return (bq0) Enum.valueOf(bq0.class, str);
    }

    public static bq0[] values() {
        return (bq0[]) i.clone();
    }
}
