package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nj0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final ArrayList k;
    public final long l;
    public boolean m;
    public boolean n;
    public nj0 o;

    public nj0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = 0L;
        this.m = z3;
        this.n = z3;
    }

    public final void a() {
        nj0 nj0Var = this.o;
        if (nj0Var == null) {
            this.m = true;
            this.n = true;
        } else if (nj0Var != null) {
            nj0Var.a();
        }
    }

    public final boolean b() {
        nj0 nj0Var = this.o;
        return nj0Var != null ? nj0Var.b() : this.m || this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) mj0.b(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) ed0.i(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) ed0.i(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = ks.d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) ed0.i(this.j));
        sb.append(')');
        return sb.toString();
    }

    public nj0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.k = arrayList;
        this.l = j7;
    }
}
