package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pv {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        return Objects.equals(this.a, pvVar.a) && Objects.equals(this.b, pvVar.b) && Objects.equals(this.c, pvVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
