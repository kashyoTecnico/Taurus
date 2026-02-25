package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tg0 implements m8 {
    public final int a;
    public final int b;
    public final long c;
    public final e11 d;
    public final vi0 e;
    public final p50 f;
    public final int g;
    public final int h;
    public final u11 i;

    public tg0(int i, int i2, long j, e11 e11Var, vi0 vi0Var, p50 p50Var, int i3, int i4, u11 u11Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = e11Var;
        this.e = vi0Var;
        this.f = p50Var;
        this.g = i3;
        this.h = i4;
        this.i = u11Var;
        if (f21.a(j, f21.c) || f21.c(j) >= 0.0f) {
            return;
        }
        qz.b("lineHeight can't be negative (" + f21.c(j) + ')');
    }

    public final tg0 a(tg0 tg0Var) {
        return tg0Var == null ? this : ug0.a(this, tg0Var.a, tg0Var.b, tg0Var.c, tg0Var.d, tg0Var.e, tg0Var.f, tg0Var.g, tg0Var.h, tg0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0)) {
            return false;
        }
        tg0 tg0Var = (tg0) obj;
        return this.a == tg0Var.a && this.b == tg0Var.b && f21.a(this.c, tg0Var.c) && c10.i(this.d, tg0Var.d) && c10.i(this.e, tg0Var.e) && c10.i(this.f, tg0Var.f) && this.g == tg0Var.g && this.h == tg0Var.h && c10.i(this.i, tg0Var.i);
    }

    public final int hashCode() {
        int iC = b8.c(this.b, Integer.hashCode(this.a) * 31, 31);
        g21[] g21VarArr = f21.b;
        int iE = b8.e(this.c, iC, 31);
        e11 e11Var = this.d;
        int iHashCode = (iE + (e11Var != null ? e11Var.hashCode() : 0)) * 31;
        vi0 vi0Var = this.e;
        int iHashCode2 = (iHashCode + (vi0Var != null ? vi0Var.hashCode() : 0)) * 31;
        p50 p50Var = this.f;
        int iC2 = b8.c(this.h, b8.c(this.g, (iHashCode2 + (p50Var != null ? p50Var.hashCode() : 0)) * 31, 31), 31);
        u11 u11Var = this.i;
        return iC2 + (u11Var != null ? u11Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) oz0.a(this.a)) + ", textDirection=" + ((Object) xz0.a(this.b)) + ", lineHeight=" + ((Object) f21.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) k50.a(this.g)) + ", hyphens=" + ((Object) py.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
