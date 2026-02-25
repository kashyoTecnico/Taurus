package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lz implements ww0 {
    public Number d;
    public Number e;
    public final q31 f;
    public final zg0 g;
    public jz0 h;
    public boolean i;
    public boolean j;
    public long k;
    public final /* synthetic */ nz l;

    public lz(nz nzVar, Number number, Number number2, q31 q31Var, kz kzVar) {
        this.l = nzVar;
        this.d = number;
        this.e = number2;
        this.f = q31Var;
        this.g = qo0.n(number);
        this.h = new jz0(kzVar, q31Var, this.d, this.e, null);
    }

    @Override // defpackage.ww0
    public final Object getValue() {
        return this.g.getValue();
    }
}
