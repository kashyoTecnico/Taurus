package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ne implements ju0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ne(int i) {
        this.a = i;
    }

    @Override // defpackage.ju0
    public final nf0 a(long j, e30 e30Var, xn xnVar) {
        switch (this.a) {
            case 0:
                float fN = xnVar.N(oe.a);
                return new lf0(new xl0(0.0f, -fN, yu0.d(j), yu0.b(j) + fN));
            case 1:
                float fN2 = xnVar.N(oe.a);
                return new lf0(new xl0(-fN2, 0.0f, yu0.d(j) + fN2, yu0.b(j)));
            default:
                return new lf0(c4.f(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
