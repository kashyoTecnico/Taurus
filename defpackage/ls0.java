package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ls0 {
    public final long a;
    public final long b;
    public final d30 c;
    public final boolean d;
    public final sr0 e;
    public final qs0 f;
    public final ga0 g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public ls0(long j, long j2, d30 d30Var, boolean z, sr0 sr0Var, qs0 qs0Var) {
        this.a = j;
        this.b = j2;
        this.c = d30Var;
        this.d = z;
        this.e = sr0Var;
        this.f = qs0Var;
        int i = l60.a;
        this.g = new ga0(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, int i2, int i3) {
        if (i == -1) {
            int iP = b8.p(dq0.k(i2, i3));
            if (iP == 0) {
                return this.k - 1;
            }
            if (iP == 1) {
                return this.k;
            }
            if (iP != 2) {
                throw new fg();
            }
        }
        return i;
    }
}
