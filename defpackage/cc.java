package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cc implements c11 {
    public final float a;

    public cc(bc bcVar, float f) {
        this.a = f;
    }

    @Override // defpackage.c11
    public final long a() {
        int i = bf.h;
        return bf.g;
    }

    @Override // defpackage.c11
    public final ac b() {
        return null;
    }

    @Override // defpackage.c11
    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cc) {
            return c10.i(null, null) && Float.compare(this.a, ((cc) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "BrushStyle(value=" + ((Object) null) + ", alpha=" + this.a + ')';
    }
}
