package androidx.compose.foundation.text.modifiers;

import defpackage.b8;
import defpackage.c10;
import defpackage.c21;
import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.jv;
import defpackage.q8;
import defpackage.tz0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends i90 {
    public final q8 a;
    public final c21 b;
    public final jv c;
    public final iw d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    public TextAnnotatedStringElement(q8 q8Var, c21 c21Var, jv jvVar, iw iwVar, int i, boolean z, int i2, int i3) {
        this.a = q8Var;
        this.b = c21Var;
        this.c = jvVar;
        this.d = iwVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return this.a.equals(textAnnotatedStringElement.a) && c10.i(this.b, textAnnotatedStringElement.b) && c10.i(this.c, textAnnotatedStringElement.c) && this.d == textAnnotatedStringElement.d && this.e == textAnnotatedStringElement.e && this.f == textAnnotatedStringElement.f && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h;
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new tz0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        boolean z;
        tz0 tz0Var = (tz0) d90Var;
        c21 c21Var = tz0Var.s;
        c21 c21Var2 = this.b;
        if (c21Var2 != c21Var) {
            if (!c21Var2.a.b(c21Var.a)) {
                z = true;
            }
            tz0Var.A0(z, tz0Var.F0(this.a), tz0Var.E0(this.b, this.h, this.g, this.f, this.c, this.e), tz0Var.D0(this.d, null));
        }
        c21Var2.getClass();
        z = false;
        tz0Var.A0(z, tz0Var.F0(this.a), tz0Var.E0(this.b, this.h, this.g, this.f, this.c, this.e), tz0Var.D0(this.d, null));
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        iw iwVar = this.d;
        return (((b8.d(b8.c(this.e, (iHashCode + (iwVar != null ? iwVar.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 28629151;
    }
}
