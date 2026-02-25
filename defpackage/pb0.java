package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pb0 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public pb0(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pb0.class == obj.getClass()) {
            pb0 pb0Var = (pb0) obj;
            return this.c == pb0Var.c && this.d == pb0Var.d && this.b == pb0Var.b && this.a == pb0Var.a && this.e == pb0Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + b8.c(this.a, b8.b(this.b, b8.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
