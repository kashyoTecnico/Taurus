package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zv implements Comparable {
    public static final zv e;
    public static final zv f;
    public static final zv g;
    public final int d;

    static {
        zv zvVar = new zv(100);
        zv zvVar2 = new zv(200);
        zv zvVar3 = new zv(300);
        zv zvVar4 = new zv(400);
        zv zvVar5 = new zv(500);
        zv zvVar6 = new zv(600);
        e = zvVar6;
        zv zvVar7 = new zv(700);
        zv zvVar8 = new zv(800);
        zv zvVar9 = new zv(900);
        f = zvVar4;
        g = zvVar5;
        ve.M(zvVar, zvVar2, zvVar3, zvVar4, zvVar5, zvVar6, zvVar7, zvVar8, zvVar9);
    }

    public zv(int i) {
        this.d = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        qz.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c10.w(this.d, ((zv) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zv) {
            return this.d == ((zv) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return b8.h(new StringBuilder("FontWeight(weight="), this.d, ')');
    }
}
