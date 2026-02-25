package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y40 {
    private static final /* synthetic */ rs $ENTRIES;
    private static final /* synthetic */ y40[] $VALUES;
    public static final w40 Companion;
    public static final y40 ON_ANY;
    public static final y40 ON_CREATE;
    public static final y40 ON_DESTROY;
    public static final y40 ON_PAUSE;
    public static final y40 ON_RESUME;
    public static final y40 ON_START;
    public static final y40 ON_STOP;

    static {
        y40 y40Var = new y40("ON_CREATE", 0);
        ON_CREATE = y40Var;
        y40 y40Var2 = new y40("ON_START", 1);
        ON_START = y40Var2;
        y40 y40Var3 = new y40("ON_RESUME", 2);
        ON_RESUME = y40Var3;
        y40 y40Var4 = new y40("ON_PAUSE", 3);
        ON_PAUSE = y40Var4;
        y40 y40Var5 = new y40("ON_STOP", 4);
        ON_STOP = y40Var5;
        y40 y40Var6 = new y40("ON_DESTROY", 5);
        ON_DESTROY = y40Var6;
        y40 y40Var7 = new y40("ON_ANY", 6);
        ON_ANY = y40Var7;
        y40[] y40VarArr = {y40Var, y40Var2, y40Var3, y40Var4, y40Var5, y40Var6, y40Var7};
        $VALUES = y40VarArr;
        $ENTRIES = new ss(y40VarArr);
        Companion = new w40();
    }

    public static y40 valueOf(String str) {
        return (y40) Enum.valueOf(y40.class, str);
    }

    public static y40[] values() {
        return (y40[]) $VALUES.clone();
    }

    public final z40 a() {
        switch (x40.a[ordinal()]) {
            case 1:
            case 2:
                return z40.f;
            case 3:
            case 4:
                return z40.g;
            case 5:
                return z40.h;
            case 6:
                return z40.d;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new fg();
        }
    }
}
