package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ec {
    public static final ec d;
    public static final ec e;
    public static final ec f;
    public static final /* synthetic */ ec[] g;

    static {
        ec ecVar = new ec("SUSPEND", 0);
        d = ecVar;
        ec ecVar2 = new ec("DROP_OLDEST", 1);
        e = ecVar2;
        ec ecVar3 = new ec("DROP_LATEST", 2);
        f = ecVar3;
        g = new ec[]{ecVar, ecVar2, ecVar3};
    }

    public static ec valueOf(String str) {
        return (ec) Enum.valueOf(ec.class, str);
    }

    public static ec[] values() {
        return (ec[]) g.clone();
    }
}
