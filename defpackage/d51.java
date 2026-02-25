package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d51 extends b51 {
    public final List d;
    public final fw0 e;

    public d51(ArrayList arrayList, fw0 fw0Var) {
        this.d = arrayList;
        this.e = fw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d51.class != obj.getClass()) {
            return false;
        }
        d51 d51Var = (d51) obj;
        return this.e.equals(d51Var.e) && c10.i(this.d, d51Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + b8.b(0.0f, b8.b(1.0f, b8.b(0.0f, b8.b(1.0f, b8.c(2, b8.c(0, b8.b(1.0f, b8.b(1.0f, b8.b(1.0f, (this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 961), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
