package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zl {
    public static final zl d;
    public static final zl e;
    public static final zl f;
    public static final zl g;
    public static final /* synthetic */ zl[] h;

    static {
        zl zlVar = new zl("DEFAULT", 0);
        d = zlVar;
        zl zlVar2 = new zl("LAZY", 1);
        e = zlVar2;
        zl zlVar3 = new zl("ATOMIC", 2);
        f = zlVar3;
        zl zlVar4 = new zl("UNDISPATCHED", 3);
        g = zlVar4;
        h = new zl[]{zlVar, zlVar2, zlVar3, zlVar4};
    }

    public static zl valueOf(String str) {
        return (zl) Enum.valueOf(zl.class, str);
    }

    public static zl[] values() {
        return (zl[]) h.clone();
    }
}
