package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ul {
    public static final ul d;
    public static final ul e;
    public static final ul f;
    public static final ul g;
    public static final ul h;
    public static final /* synthetic */ ul[] i;

    static {
        ul ulVar = new ul("CPU_ACQUIRED", 0);
        d = ulVar;
        ul ulVar2 = new ul("BLOCKING", 1);
        e = ulVar2;
        ul ulVar3 = new ul("PARKING", 2);
        f = ulVar3;
        ul ulVar4 = new ul("DORMANT", 3);
        g = ulVar4;
        ul ulVar5 = new ul("TERMINATED", 4);
        h = ulVar5;
        i = new ul[]{ulVar, ulVar2, ulVar3, ulVar4, ulVar5};
    }

    public static ul valueOf(String str) {
        return (ul) Enum.valueOf(ul.class, str);
    }

    public static ul[] values() {
        return (ul[]) i.clone();
    }
}
