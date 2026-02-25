package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wo0 implements Map.Entry {
    public final Object d;
    public final g50 e;
    public wo0 f;
    public wo0 g;

    public wo0(e50 e50Var, g50 g50Var) {
        this.d = e50Var;
        this.e = g50Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wo0)) {
            return false;
        }
        wo0 wo0Var = (wo0) obj;
        return this.d.equals(wo0Var.d) && this.e.equals(wo0Var.e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.e.hashCode() ^ this.d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.d + "=" + this.e;
    }
}
