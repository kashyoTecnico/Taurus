package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yu {
    public static final yu d;
    public static final yu e;
    public static final yu f;
    public static final yu g;
    public static final /* synthetic */ yu[] h;

    static {
        yu yuVar = new yu("Active", 0);
        d = yuVar;
        yu yuVar2 = new yu("ActiveParent", 1);
        e = yuVar2;
        yu yuVar3 = new yu("Captured", 2);
        f = yuVar3;
        yu yuVar4 = new yu("Inactive", 3);
        g = yuVar4;
        h = new yu[]{yuVar, yuVar2, yuVar3, yuVar4};
    }

    public static yu valueOf(String str) {
        return (yu) Enum.valueOf(yu.class, str);
    }

    public static yu[] values() {
        return (yu[]) h.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new fg();
            }
        }
        return true;
    }
}
