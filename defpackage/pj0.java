package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pj0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public pj0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj0)) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        return mj0.a(this.a, pj0Var.a) && this.b == pj0Var.b && ed0.b(this.c, pj0Var.c) && ed0.b(this.d, pj0Var.d) && this.e == pj0Var.e && Float.compare(this.f, pj0Var.f) == 0 && this.g == pj0Var.g && this.h == pj0Var.h && this.i.equals(pj0Var.i) && ed0.b(this.j, pj0Var.j) && ed0.b(this.k, pj0Var.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + b8.e(this.j, (this.i.hashCode() + b8.d(b8.c(this.g, b8.b(this.f, b8.d(b8.e(this.d, b8.e(this.c, b8.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31), 31, this.h)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) mj0.b(this.a));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) ed0.i(this.c));
        sb.append(", position=");
        sb.append((Object) ed0.i(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) ed0.i(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) ed0.i(this.k));
        sb.append(')');
        return sb.toString();
    }
}
