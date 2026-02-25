package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qf implements c11 {
    public final long a;

    public qf(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        qz.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.c11
    public final long a() {
        return this.a;
    }

    @Override // defpackage.c11
    public final ac b() {
        return null;
    }

    @Override // defpackage.c11
    public final float c() {
        return bf.d(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf) && bf.c(this.a, ((qf) obj).a);
    }

    public final int hashCode() {
        int i = bf.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) bf.i(this.a)) + ')';
    }
}
