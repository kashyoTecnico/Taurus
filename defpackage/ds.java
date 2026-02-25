package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ds {
    public int a = 1;
    public final w80 b;
    public w80 c;
    public w80 d;
    public int e;
    public int f;

    public ds(w80 w80Var) {
        this.b = w80Var;
        this.c = w80Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        u80 u80VarB = this.c.b.b();
        int iA = u80VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) u80VarB.g).get(iA + u80VarB.d) == 0) || this.e == 65039;
    }
}
