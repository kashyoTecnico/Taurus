package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jm {
    public static final jm d;
    public static final jm e;
    public static final jm f;
    public static final /* synthetic */ jm[] g;

    static {
        jm jmVar = new jm("None", 0);
        d = jmVar;
        jm jmVar2 = new jm("Cancelled", 1);
        e = jmVar2;
        jm jmVar3 = new jm("Redirected", 2);
        f = jmVar3;
        g = new jm[]{jmVar, jmVar2, jmVar3, new jm("RedirectCancelled", 3)};
    }

    public static jm valueOf(String str) {
        return (jm) Enum.valueOf(jm.class, str);
    }

    public static jm[] values() {
        return (jm[]) g.clone();
    }
}
