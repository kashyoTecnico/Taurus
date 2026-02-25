package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public nc(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return kp.a(this.a, ncVar.a) && kp.a(this.b, ncVar.b) && kp.a(this.c, ncVar.c) && kp.a(this.d, ncVar.d) && kp.a(this.e, ncVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + b8.b(this.d, b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
