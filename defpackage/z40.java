package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z40 {
    public static final z40 d;
    public static final z40 e;
    public static final z40 f;
    public static final z40 g;
    public static final z40 h;
    public static final /* synthetic */ z40[] i;

    static {
        z40 z40Var = new z40("DESTROYED", 0);
        d = z40Var;
        z40 z40Var2 = new z40("INITIALIZED", 1);
        e = z40Var2;
        z40 z40Var3 = new z40("CREATED", 2);
        f = z40Var3;
        z40 z40Var4 = new z40("STARTED", 3);
        g = z40Var4;
        z40 z40Var5 = new z40("RESUMED", 4);
        h = z40Var5;
        i = new z40[]{z40Var, z40Var2, z40Var3, z40Var4, z40Var5};
    }

    public static z40 valueOf(String str) {
        return (z40) Enum.valueOf(z40.class, str);
    }

    public static z40[] values() {
        return (z40[]) i.clone();
    }
}
