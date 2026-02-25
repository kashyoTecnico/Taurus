package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bo {
    public static final bo d;
    public static final /* synthetic */ bo[] e;

    static {
        bo boVar = new bo("WARNING", 0);
        d = boVar;
        e = new bo[]{boVar, new bo("ERROR", 1), new bo("HIDDEN", 2)};
    }

    public static bo valueOf(String str) {
        return (bo) Enum.valueOf(bo.class, str);
    }

    public static bo[] values() {
        return (bo[]) e.clone();
    }
}
