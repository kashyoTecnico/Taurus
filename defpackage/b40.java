package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b40 implements m80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m80 b;
    public final /* synthetic */ f40 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ m80 e;

    public /* synthetic */ b40(m80 m80Var, f40 f40Var, int i, m80 m80Var2, int i2) {
        this.a = i2;
        this.c = f40Var;
        this.d = i;
        this.e = m80Var2;
        this.b = m80Var;
    }

    @Override // defpackage.m80
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.m80
    public final void b() {
        switch (this.a) {
            case 0:
                int i = this.d;
                f40 f40Var = this.c;
                f40Var.g = i;
                this.e.b();
                ta0 ta0Var = f40Var.n;
                long[] jArr = ta0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = ta0Var.b[i5];
                                    ux0 ux0Var = (ux0) ta0Var.c[i5];
                                    int i6 = f40Var.o.i(obj);
                                    if (i6 < 0 || i6 >= f40Var.g) {
                                        ux0Var.a();
                                        ta0Var.k(i5);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                break;
            default:
                int i7 = this.d;
                f40 f40Var2 = this.c;
                f40Var2.f = i7;
                this.e.b();
                f40Var2.c(f40Var2.f);
                break;
        }
    }

    @Override // defpackage.m80
    public final int c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.m80
    public final iw d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    @Override // defpackage.m80
    public final int e() {
        switch (this.a) {
        }
        return this.b.e();
    }
}
