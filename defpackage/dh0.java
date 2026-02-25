package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dh0 implements l8 {
    public final ArrayList d;

    public dh0() {
        this.d = new ArrayList(32);
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.d.add(new jh0(f, f2, f3, f4, f5, f6));
    }

    public void b(float f, float f2) {
        this.d.add(new gh0(f, f2));
    }

    @Override // defpackage.l8
    public rt get(int i) {
        return (st) this.d.get(i);
    }

    public dh0(float f, float f2, k8 k8Var) {
        p00 p00VarA0 = c10.a0(0, k8Var.b());
        ArrayList arrayList = new ArrayList(we.O(p00VarA0));
        Iterator it = p00VarA0.iterator();
        while (true) {
            o00 o00Var = (o00) it;
            if (o00Var.f) {
                arrayList.add(new st(f, f2, k8Var.a(o00Var.nextInt())));
            } else {
                this.d = arrayList;
                return;
            }
        }
    }
}
