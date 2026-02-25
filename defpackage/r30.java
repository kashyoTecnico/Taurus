package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r30 {
    public static final r30 d;
    public static final r30 e;
    public static final r30 f;
    public static final /* synthetic */ r30[] g;

    static {
        r30 r30Var = new r30("InMeasureBlock", 0);
        d = r30Var;
        r30 r30Var2 = new r30("InLayoutBlock", 1);
        e = r30Var2;
        r30 r30Var3 = new r30("NotUsed", 2);
        f = r30Var3;
        g = new r30[]{r30Var, r30Var2, r30Var3};
    }

    public static r30 valueOf(String str) {
        return (r30) Enum.valueOf(r30.class, str);
    }

    public static r30[] values() {
        return (r30[]) g.clone();
    }
}
