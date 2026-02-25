package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o80 {
    public static final o80 d;
    public static final o80 e;
    public static final /* synthetic */ o80[] f;

    static {
        o80 o80Var = new o80("Min", 0);
        d = o80Var;
        o80 o80Var2 = new o80("Max", 1);
        e = o80Var2;
        f = new o80[]{o80Var, o80Var2};
    }

    public static o80 valueOf(String str) {
        return (o80) Enum.valueOf(o80.class, str);
    }

    public static o80[] values() {
        return (o80[]) f.clone();
    }
}
