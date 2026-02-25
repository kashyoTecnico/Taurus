package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ge {
    public final int a;
    public final Method b;

    public ge(int i, Method method) throws SecurityException {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return this.a == geVar.a && this.b.getName().equals(geVar.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
