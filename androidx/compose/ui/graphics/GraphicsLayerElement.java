package androidx.compose.ui.graphics;

import defpackage.b8;
import defpackage.bf;
import defpackage.c10;
import defpackage.d80;
import defpackage.d90;
import defpackage.h;
import defpackage.i90;
import defpackage.ju0;
import defpackage.l81;
import defpackage.nc0;
import defpackage.vu0;
import defpackage.x21;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends i90 {
    public final float a;
    public final float b;
    public final long c;
    public final ju0 d;
    public final boolean e;
    public final long f;
    public final long g;

    public GraphicsLayerElement(float f, float f2, long j, ju0 ju0Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = ju0Var;
        this.e = z;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphicsLayerElement) {
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.a, graphicsLayerElement.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.b, graphicsLayerElement.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = graphicsLayerElement.c;
                int i = x21.b;
                if (this.c == j && c10.i(this.d, graphicsLayerElement.d) && this.e == graphicsLayerElement.e && bf.c(this.f, graphicsLayerElement.f) && bf.c(this.g, graphicsLayerElement.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.i90
    public final d90 f() {
        vu0 vu0Var = new vu0();
        vu0Var.r = 1.0f;
        vu0Var.s = 1.0f;
        vu0Var.t = this.a;
        vu0Var.u = this.b;
        vu0Var.v = 8.0f;
        vu0Var.w = this.c;
        vu0Var.x = this.d;
        vu0Var.y = this.e;
        vu0Var.z = this.f;
        vu0Var.A = this.g;
        vu0Var.B = 3;
        vu0Var.C = new h(28, vu0Var);
        return vu0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        vu0 vu0Var = (vu0) d90Var;
        vu0Var.r = 1.0f;
        vu0Var.s = 1.0f;
        vu0Var.t = this.a;
        vu0Var.u = this.b;
        vu0Var.v = 8.0f;
        vu0Var.w = this.c;
        vu0Var.x = this.d;
        vu0Var.y = this.e;
        vu0Var.z = this.f;
        vu0Var.A = this.g;
        vu0Var.B = 3;
        nc0 nc0Var = d80.x(vu0Var, 2).s;
        if (nc0Var != null) {
            nc0Var.n1(vu0Var.C, true);
        }
    }

    public final int hashCode() {
        int iB = b8.b(8.0f, b8.b(0.0f, b8.b(0.0f, b8.b(0.0f, b8.b(this.b, b8.b(0.0f, b8.b(0.0f, b8.b(this.a, b8.b(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = x21.b;
        int iD = b8.d((this.d.hashCode() + b8.e(this.c, iB, 31)) * 31, 961, this.e);
        int i2 = bf.h;
        return b8.c(3, b8.c(0, b8.e(this.g, b8.e(this.f, iD, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        int i = x21.b;
        sb.append((Object) ("TransformOrigin(packedValue=" + this.c + ')'));
        sb.append(", shape=");
        sb.append(this.d);
        sb.append(", clip=");
        sb.append(this.e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        b8.l(this.f, sb, ", spotShadowColor=");
        sb.append((Object) bf.i(this.g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) l81.e0(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
