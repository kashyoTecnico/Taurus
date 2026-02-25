package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s60 implements xn {
    public boolean d;
    public long e = 9223372034707292159L;
    public long f = 0;
    public final /* synthetic */ v60 g;

    public s60(v60 v60Var) {
        this.g = v60Var;
    }

    public final void a(ly lyVar, float f) {
        v60 v60Var = this.g;
        po0 po0Var = v60Var.p;
        if (po0Var == null) {
            po0Var = new po0();
            v60Var.p = po0Var;
        }
        int iY0 = y9.y0(po0Var.b, lyVar);
        if (iY0 >= 0) {
            float[] fArr = po0Var.c;
            if (fArr[iY0] != f) {
                fArr[iY0] = f;
                po0Var.d[iY0] = 1;
                return;
            } else {
                byte[] bArr = po0Var.d;
                if (bArr[iY0] == 2) {
                    bArr[iY0] = 0;
                    return;
                }
                return;
            }
        }
        int i = po0Var.a;
        ly[] lyVarArr = po0Var.b;
        if (i == lyVarArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(lyVarArr, i2);
            c10.o(objArrCopyOf, "copyOf(...)");
            po0Var.b = (ly[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(po0Var.c, i2);
            c10.o(fArrCopyOf, "copyOf(...)");
            po0Var.c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(po0Var.d, i2);
            c10.o(bArrCopyOf, "copyOf(...)");
            po0Var.d = bArrCopyOf;
        }
        po0Var.b[i] = lyVar;
        po0Var.d[i] = 3;
        po0Var.c[i] = f;
        po0Var.a++;
    }

    @Override // defpackage.xn
    public final float b() {
        return this.g.b();
    }

    @Override // defpackage.xn
    public final float k() {
        return this.g.k();
    }
}
