package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class gv0 {
    public lv0 a;
    public long b;
    public boolean c;
    public int d;

    public gv0(long j, lv0 lv0Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = lv0Var;
        this.b = j;
        mv0 mv0Var = ov0.a;
        if (j != 0) {
            lv0 lv0VarD = d();
            long j2 = lv0VarD.f;
            long[] jArr = lv0VarD.g;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = lv0VarD.e;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = lv0VarD.d;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = iNumberOfTrailingZeros + j2;
            }
            synchronized (ov0.c) {
                iA = ov0.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(gv0 gv0Var) {
        ov0.b.y(gv0Var);
    }

    public final void a() {
        synchronized (ov0.c) {
            b();
            p();
        }
    }

    public void b() {
        ov0.d = ov0.d.b(g());
    }

    public abstract void c();

    public lv0 d() {
        return this.a;
    }

    public abstract iw e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract iw i();

    public final gv0 j() {
        e9 e9Var = ov0.b;
        gv0 gv0Var = (gv0) e9Var.n();
        e9Var.y(this);
        return gv0Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(dx0 dx0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ov0.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(lv0 lv0Var) {
        this.a = lv0Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract gv0 u(iw iwVar);
}
