package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t8 {
    public static final t8 d;
    public static final t8 e;
    public static final t8 f;
    public static final t8 g;
    public static final t8 h;
    public static final t8 i;
    public static final t8 j;
    public static final /* synthetic */ t8[] k;

    static {
        t8 t8Var = new t8("Paragraph", 0);
        d = t8Var;
        t8 t8Var2 = new t8("Span", 1);
        e = t8Var2;
        t8 t8Var3 = new t8("VerbatimTts", 2);
        f = t8Var3;
        t8 t8Var4 = new t8("Url", 3);
        g = t8Var4;
        t8 t8Var5 = new t8("Link", 4);
        h = t8Var5;
        t8 t8Var6 = new t8("Clickable", 5);
        i = t8Var6;
        t8 t8Var7 = new t8("String", 6);
        j = t8Var7;
        k = new t8[]{t8Var, t8Var2, t8Var3, t8Var4, t8Var5, t8Var6, t8Var7};
    }

    public static t8 valueOf(String str) {
        return (t8) Enum.valueOf(t8.class, str);
    }

    public static t8[] values() {
        return (t8[]) k.clone();
    }
}
