package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nx {
    public static final nx d;
    public static final nx e;
    public static final nx f;
    public static final /* synthetic */ nx[] g;

    static {
        nx nxVar = new nx("Cursor", 0);
        d = nxVar;
        nx nxVar2 = new nx("SelectionStart", 1);
        e = nxVar2;
        nx nxVar3 = new nx("SelectionEnd", 2);
        f = nxVar3;
        g = new nx[]{nxVar, nxVar2, nxVar3};
    }

    public static nx valueOf(String str) {
        return (nx) Enum.valueOf(nx.class, str);
    }

    public static nx[] values() {
        return (nx[]) g.clone();
    }
}
