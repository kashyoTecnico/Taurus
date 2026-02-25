package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p30 {
    public static final p30 d;
    public static final p30 e;
    public static final p30 f;
    public static final p30 g;
    public static final p30 h;
    public static final /* synthetic */ p30[] i;

    static {
        p30 p30Var = new p30("Measuring", 0);
        d = p30Var;
        p30 p30Var2 = new p30("LookaheadMeasuring", 1);
        e = p30Var2;
        p30 p30Var3 = new p30("LayingOut", 2);
        f = p30Var3;
        p30 p30Var4 = new p30("LookaheadLayingOut", 3);
        g = p30Var4;
        p30 p30Var5 = new p30("Idle", 4);
        h = p30Var5;
        i = new p30[]{p30Var, p30Var2, p30Var3, p30Var4, p30Var5};
    }

    public static p30 valueOf(String str) {
        return (p30) Enum.valueOf(p30.class, str);
    }

    public static p30[] values() {
        return (p30[]) i.clone();
    }
}
