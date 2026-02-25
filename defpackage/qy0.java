package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qy0 implements h40, Serializable {
    public gw d;
    public volatile Object e;
    public final Object f;

    public qy0(gw gwVar) {
        c10.p(gwVar, "initializer");
        this.d = gwVar;
        this.e = g2.Y;
        this.f = this;
    }

    @Override // defpackage.h40
    public final Object getValue() {
        Object objA;
        Object obj = this.e;
        g2 g2Var = g2.Y;
        if (obj != g2Var) {
            return obj;
        }
        synchronized (this.f) {
            objA = this.e;
            if (objA == g2Var) {
                gw gwVar = this.d;
                c10.m(gwVar);
                objA = gwVar.a();
                this.e = objA;
                this.d = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.e != g2.Y ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
