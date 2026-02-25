package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ng0 implements Serializable {
    public final Object d;
    public final Object e;

    public ng0(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        return c10.i(this.d, ng0Var.d) && c10.i(this.e, ng0Var.e);
    }

    public final int hashCode() {
        Object obj = this.d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.e;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.d + ", " + this.e + ')';
    }
}
