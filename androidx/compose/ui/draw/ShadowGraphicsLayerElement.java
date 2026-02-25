package androidx.compose.ui.draw;

import defpackage.b8;
import defpackage.bf;
import defpackage.c10;
import defpackage.d80;
import defpackage.d90;
import defpackage.h;
import defpackage.i90;
import defpackage.ju0;
import defpackage.kp;
import defpackage.nc0;
import defpackage.ua;
import defpackage.yj;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends i90 {
    public final ju0 a;
    public final boolean b;
    public final long c;
    public final long d;

    public ShadowGraphicsLayerElement(ju0 ju0Var, boolean z, long j, long j2) {
        float f = yj.a;
        this.a = ju0Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        float f = yj.d;
        return kp.a(f, f) && c10.i(this.a, shadowGraphicsLayerElement.a) && this.b == shadowGraphicsLayerElement.b && bf.c(this.c, shadowGraphicsLayerElement.c) && bf.c(this.d, shadowGraphicsLayerElement.d);
    }

    @Override // defpackage.i90
    public final d90 f() {
        h hVar = new h(27, this);
        ua uaVar = new ua();
        uaVar.r = hVar;
        return uaVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ua uaVar = (ua) d90Var;
        uaVar.r = new h(27, this);
        nc0 nc0Var = d80.x(uaVar, 2).s;
        if (nc0Var != null) {
            nc0Var.n1(uaVar.r, true);
        }
    }

    public final int hashCode() {
        int iD = b8.d((this.a.hashCode() + (Float.hashCode(yj.d) * 31)) * 31, 31, this.b);
        int i = bf.h;
        return Long.hashCode(this.d) + b8.e(this.c, iD, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) kp.b(yj.d));
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        sb.append(this.b);
        sb.append(", ambientColor=");
        b8.l(this.c, sb, ", spotColor=");
        sb.append((Object) bf.i(this.d));
        sb.append(')');
        return sb.toString();
    }
}
