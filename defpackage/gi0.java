package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gi0 extends g0 implements hi0 {
    public static final gi0 g;
    public final Object d;
    public final Object e;
    public final xh0 f;

    static {
        g2 g2Var = g2.C;
        g = new gi0(g2Var, g2Var, xh0.f);
    }

    public gi0(Object obj, Object obj2, xh0 xh0Var) {
        this.d = obj;
        this.e = obj2;
        this.f = xh0Var;
    }

    @Override // defpackage.i
    public final int a() {
        xh0 xh0Var = this.f;
        xh0Var.getClass();
        return xh0Var.e;
    }

    @Override // defpackage.i, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vw(this.d, this.f);
    }
}
