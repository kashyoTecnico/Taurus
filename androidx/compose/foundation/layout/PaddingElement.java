package androidx.compose.foundation.layout;

import defpackage.b8;
import defpackage.d90;
import defpackage.i90;
import defpackage.ig0;
import defpackage.kp;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class PaddingElement extends i90 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if ((f < 0.0f && !kp.a(f, Float.NaN)) || ((f2 < 0.0f && !kp.a(f2, Float.NaN)) || ((f3 < 0.0f && !kp.a(f3, Float.NaN)) || (f4 < 0.0f && !kp.a(f4, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && kp.a(this.a, paddingElement.a) && kp.a(this.b, paddingElement.b) && kp.a(this.c, paddingElement.c) && kp.a(this.d, paddingElement.d);
    }

    @Override // defpackage.i90
    public final d90 f() {
        ig0 ig0Var = new ig0();
        ig0Var.r = this.a;
        ig0Var.s = this.b;
        ig0Var.t = this.c;
        ig0Var.u = this.d;
        ig0Var.v = true;
        return ig0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        ig0 ig0Var = (ig0) d90Var;
        ig0Var.r = this.a;
        ig0Var.s = this.b;
        ig0Var.t = this.c;
        ig0Var.u = this.d;
        ig0Var.v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + b8.b(this.d, b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
