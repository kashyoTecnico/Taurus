package defpackage;

import android.graphics.BlendModeColorFilter;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ta {
    public final BlendModeColorFilter a;
    public final long b;
    public final int c;

    public ta(long j, int i) {
        this.a = new BlendModeColorFilter(r31.Z(j), nm.F(i));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return bf.c(this.b, taVar.b) && this.c == taVar.c;
    }

    public final int hashCode() {
        int i = bf.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        b8.l(this.b, sb, ", blendMode=");
        sb.append((Object) l81.e0(this.c));
        sb.append(')');
        return sb.toString();
    }
}
