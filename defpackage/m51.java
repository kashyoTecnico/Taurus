package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m51 {
    public static final m51 d;
    public static final /* synthetic */ m51[] e;

    static {
        m51 m51Var = new m51("Lsq2", 0);
        d = m51Var;
        e = new m51[]{m51Var, new m51("Impulse", 1)};
    }

    public static m51 valueOf(String str) {
        return (m51) Enum.valueOf(m51.class, str);
    }

    public static m51[] values() {
        return (m51[]) e.clone();
    }
}
