package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ef0 {
    public final int a;
    public final int b;

    public ef0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public abstract void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var);

    public m2 b(tw twVar) {
        return null;
    }

    public final String toString() {
        String strB = em0.a(getClass()).b();
        return strB == null ? "" : strB;
    }

    public /* synthetic */ ef0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
