package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n6 implements kj0 {
    public final int b;

    public n6(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n6.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        c10.n(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.b == ((n6) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return b8.h(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
