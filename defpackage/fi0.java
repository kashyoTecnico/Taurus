package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fi0 extends i {
    public final xh0 d;

    public fi0(xh0 xh0Var) {
        this.d = xh0Var;
    }

    @Override // defpackage.i
    public final int a() {
        xh0 xh0Var = this.d;
        xh0Var.getClass();
        return xh0Var.e;
    }

    @Override // defpackage.i, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        l31 l31Var = this.d.d;
        m31[] m31VarArr = new m31[8];
        for (int i = 0; i < 8; i++) {
            m31VarArr[i] = new n31(2);
        }
        return new ei0(l31Var, m31VarArr);
    }
}
