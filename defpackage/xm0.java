package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class xm0 extends wm0 implements qw {
    public final int e;

    public xm0(lk lkVar) {
        super(lkVar);
        this.e = 2;
    }

    @Override // defpackage.qw
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ia
    public final String toString() {
        if (this.d != null) {
            return super.toString();
        }
        em0.a.getClass();
        String strA = fm0.a(this);
        c10.o(strA, "renderLambdaToString(...)");
        return strA;
    }
}
