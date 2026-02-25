package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pr0 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final o11 f;

    public pr0(long j, int i, int i2, int i3, int i4, o11 o11Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = o11Var;
    }

    public final rr0 a(int i) {
        return new rr0(dq0.i(this.f, i), i, this.a);
    }

    public final int b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        o11 o11Var = this.f;
        sb.append(dq0.i(o11Var, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(dq0.i(o11Var, i2));
        sb.append("), prevOffset=");
        return b8.h(sb, this.e, ')');
    }
}
