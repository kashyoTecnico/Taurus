package androidx.compose.foundation.layout;

import defpackage.d90;
import defpackage.i90;
import defpackage.kp;
import defpackage.p41;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends i90 {
    public final float a;
    public final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return kp.a(this.a, unspecifiedConstraintsElement.a) && kp.a(this.b, unspecifiedConstraintsElement.b);
    }

    @Override // defpackage.i90
    public final d90 f() {
        p41 p41Var = new p41();
        p41Var.r = this.a;
        p41Var.s = this.b;
        return p41Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        p41 p41Var = (p41) d90Var;
        p41Var.r = this.a;
        p41Var.s = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
