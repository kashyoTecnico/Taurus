package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p80 {
    public static final p80 d;
    public static final p80 e;
    public static final /* synthetic */ p80[] f;

    static {
        p80 p80Var = new p80("Width", 0);
        d = p80Var;
        p80 p80Var2 = new p80("Height", 1);
        e = p80Var2;
        f = new p80[]{p80Var, p80Var2};
    }

    public static p80 valueOf(String str) {
        return (p80) Enum.valueOf(p80.class, str);
    }

    public static p80[] values() {
        return (p80[]) f.clone();
    }
}
