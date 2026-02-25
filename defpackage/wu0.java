package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wu0 implements ks0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final sr0 d;
    public final pr0 e;

    public wu0(boolean z, int i, int i2, sr0 sr0Var, pr0 pr0Var) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = sr0Var;
        this.e = pr0Var;
    }

    @Override // defpackage.ks0
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ks0
    public final pr0 b() {
        return this.e;
    }

    @Override // defpackage.ks0
    public final sr0 c() {
        return this.d;
    }

    @Override // defpackage.ks0
    public final pr0 d() {
        return this.e;
    }

    @Override // defpackage.ks0
    public final pr0 e() {
        return this.e;
    }

    @Override // defpackage.ks0
    public final int f() {
        return this.b;
    }

    @Override // defpackage.ks0
    public final boolean g(ks0 ks0Var) {
        if (this.d == null || ks0Var == null || !(ks0Var instanceof wu0)) {
            return true;
        }
        wu0 wu0Var = (wu0) ks0Var;
        if (this.b != wu0Var.b || this.c != wu0Var.c || this.a != wu0Var.a) {
            return true;
        }
        pr0 pr0Var = wu0Var.e;
        pr0 pr0Var2 = this.e;
        return (pr0Var2.a == pr0Var.a && pr0Var2.c == pr0Var.c && pr0Var2.d == pr0Var.d) ? false : true;
    }

    @Override // defpackage.ks0
    public final ia0 h(sr0 sr0Var) {
        boolean z = sr0Var.c;
        rr0 rr0Var = sr0Var.b;
        rr0 rr0Var2 = sr0Var.a;
        if ((!z && rr0Var2.b > rr0Var.b) || (z && rr0Var2.b <= rr0Var.b)) {
            sr0Var = sr0.a(sr0Var, null, null, !z, 3);
        }
        long j = this.e.a;
        ia0 ia0Var = m60.a;
        ia0 ia0Var2 = new ia0();
        int iB = ia0Var2.b(j);
        ia0Var2.b[iB] = j;
        ia0Var2.c[iB] = sr0Var;
        return ia0Var2;
    }

    @Override // defpackage.ks0
    public final int i() {
        return this.c;
    }

    @Override // defpackage.ks0
    public final pr0 j() {
        return this.e;
    }

    @Override // defpackage.ks0
    public final int k() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return this.e.b();
    }

    @Override // defpackage.ks0
    public final int m() {
        return 1;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + b8.q(k()) + ", info=\n\t" + this.e + ')';
    }

    @Override // defpackage.ks0
    public final void l(iw iwVar) {
    }
}
