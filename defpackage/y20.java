package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class y20 implements qw, Serializable {
    public final int d;

    public y20(int i) {
        this.d = i;
    }

    @Override // defpackage.qw
    public final int b() {
        return this.d;
    }

    public final String toString() {
        em0.a.getClass();
        String strA = fm0.a(this);
        c10.o(strA, "renderLambdaToString(...)");
        return strA;
    }
}
