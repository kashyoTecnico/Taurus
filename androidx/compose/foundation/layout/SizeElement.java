package androidx.compose.foundation.layout;

import defpackage.b8;
import defpackage.d90;
import defpackage.i90;
import defpackage.kp;
import defpackage.zu0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class SizeElement extends i90 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return kp.a(this.a, sizeElement.a) && kp.a(this.b, sizeElement.b) && kp.a(this.c, sizeElement.c) && kp.a(this.d, sizeElement.d) && this.e == sizeElement.e;
    }

    @Override // defpackage.i90
    public final d90 f() {
        zu0 zu0Var = new zu0();
        zu0Var.r = this.a;
        zu0Var.s = this.b;
        zu0Var.t = this.c;
        zu0Var.u = this.d;
        zu0Var.v = this.e;
        return zu0Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        zu0 zu0Var = (zu0) d90Var;
        zu0Var.r = this.a;
        zu0Var.s = this.b;
        zu0Var.t = this.c;
        zu0Var.u = this.d;
        zu0Var.v = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b8.b(this.d, b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public /* synthetic */ SizeElement(float f, float f2) {
        this(Float.NaN, f, Float.NaN, f2, true);
    }
}
