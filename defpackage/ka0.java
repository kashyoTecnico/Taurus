package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ka0 extends y70 {
    public final bi0 g;
    public Object h;

    public ka0(bi0 bi0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.g = bi0Var;
        this.h = obj2;
    }

    @Override // defpackage.y70, java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // defpackage.y70, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.h;
        this.h = obj;
        zh0 zh0Var = (zh0) this.g.e;
        uh0 uh0Var = zh0Var.g;
        Object obj3 = this.e;
        if (!uh0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = zh0Var.f;
        if (!z) {
            uh0Var.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            m31 m31Var = zh0Var.d[zh0Var.e];
            Object obj4 = m31Var.d[m31Var.f];
            uh0Var.put(obj3, obj);
            zh0Var.c(obj4 != null ? obj4.hashCode() : 0, uh0Var.e, obj4, 0);
        }
        zh0Var.j = uh0Var.g;
        return obj2;
    }
}
