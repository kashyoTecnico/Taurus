package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lj {
    public static final lj d;
    public static final lj e;
    public static final /* synthetic */ lj[] f;

    static {
        lj ljVar = new lj("VIEW_APPEAR", 0);
        d = ljVar;
        lj ljVar2 = new lj("VIEW_DISAPPEAR", 1);
        e = ljVar2;
        f = new lj[]{ljVar, ljVar2};
    }

    public static lj valueOf(String str) {
        return (lj) Enum.valueOf(lj.class, str);
    }

    public static lj[] values() {
        return (lj[]) f.clone();
    }
}
