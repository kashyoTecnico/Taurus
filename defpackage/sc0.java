package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class sc0 {
    public final eb0 a = new eb0(new gc0[16]);
    public final ma0 b = new ma0(10);

    public boolean a(r60 r60Var, d30 d30Var, xz xzVar, boolean z) {
        eb0 eb0Var = this.a;
        Object[] objArr = eb0Var.d;
        int i = eb0Var.f;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((gc0) objArr[i2]).a(r60Var, d30Var, xzVar, z) || z2;
        }
        return z2;
    }

    public void b(xz xzVar) {
        eb0 eb0Var = this.a;
        int i = eb0Var.f;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((gc0) eb0Var.d[i]).d.b == 0) {
                eb0Var.k(i);
            }
        }
    }
}
