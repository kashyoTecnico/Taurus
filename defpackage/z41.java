package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z41 extends b51 implements Iterable, c20 {
    public final List d;
    public final ArrayList e;

    public z41(List list, ArrayList arrayList) {
        this.d = list;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z41)) {
            return false;
        }
        z41 z41Var = (z41) obj;
        return c10.i(this.d, z41Var.d) && this.e.equals(z41Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + b8.b(0.0f, b8.b(0.0f, b8.b(1.0f, b8.b(1.0f, b8.b(0.0f, b8.b(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bi0(this);
    }
}
