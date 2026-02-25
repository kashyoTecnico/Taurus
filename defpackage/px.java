package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class px {
    public static final px d;
    public static final px e;
    public static final px f;
    public static final /* synthetic */ px[] g;

    static {
        px pxVar = new px("None", 0);
        d = pxVar;
        px pxVar2 = new px("Selection", 1);
        e = pxVar2;
        px pxVar3 = new px("Cursor", 2);
        f = pxVar3;
        g = new px[]{pxVar, pxVar2, pxVar3};
    }

    public static px valueOf(String str) {
        return (px) Enum.valueOf(px.class, str);
    }

    public static px[] values() {
        return (px[]) g.clone();
    }
}
