package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o41 implements h40, Serializable {
    public gw d;
    public Object e;

    @Override // defpackage.h40
    public final Object getValue() {
        if (this.e == g2.Y) {
            gw gwVar = this.d;
            c10.m(gwVar);
            this.e = gwVar.a();
            this.d = null;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != g2.Y ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
