package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z90 {
    public final long a;
    public final as0 b;
    public final as0 c;
    public o11 d;
    public int e = -1;

    public z90(long j, as0 as0Var, as0 as0Var2) {
        this.a = j;
        this.b = as0Var;
        this.c = as0Var2;
    }

    public final long a(sr0 sr0Var, boolean z) {
        o11 o11Var;
        rr0 rr0Var = sr0Var.b;
        rr0 rr0Var2 = sr0Var.a;
        long j = this.a;
        if (z && rr0Var2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && rr0Var.c != j) || c() == null || (o11Var = (o11) this.c.a()) == null) {
            return 9205357640488583168L;
        }
        return qo0.k(o11Var, c10.u(z ? rr0Var2.b : rr0Var.b, 0, b(o11Var)), z, sr0Var.c);
    }

    public final synchronized int b(o11 o11Var) {
        try {
            if (this.d != o11Var) {
                u90 u90Var = o11Var.b;
                boolean z = u90Var.c;
                int i = 0;
                if (!(z || ((float) ((int) (o11Var.c & 4294967295L))) < u90Var.e) || z) {
                    i = u90Var.f - 1;
                } else {
                    int iC = u90Var.c((int) (o11Var.c & 4294967295L));
                    int i2 = o11Var.b.f - 1;
                    if (iC > i2) {
                        iC = i2;
                    }
                    while (iC >= 0 && o11Var.b.d(iC) >= ((int) (o11Var.c & 4294967295L))) {
                        iC--;
                    }
                    if (iC >= 0) {
                        i = iC;
                    }
                }
                this.e = o11Var.e(i, true);
                this.d = o11Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    public final d30 c() {
        d30 d30Var = (d30) this.b.a();
        if (d30Var == null || !d30Var.H()) {
            return null;
        }
        return d30Var;
    }

    public final q8 d() {
        o11 o11Var = (o11) this.c.a();
        return o11Var == null ? new q8("", null, 6) : o11Var.a.a;
    }
}
