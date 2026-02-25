package androidx.compose.foundation.text.modifiers;

import defpackage.b8;
import defpackage.bs0;
import defpackage.c10;
import defpackage.c21;
import defpackage.d90;
import defpackage.i90;
import defpackage.iw;
import defpackage.jv;
import defpackage.mq0;
import defpackage.nm;
import defpackage.q8;
import defpackage.qr0;
import defpackage.tz0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends i90 {
    public final q8 a;
    public final c21 b;
    public final jv c;
    public final iw d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final bs0 i;

    public SelectableTextAnnotatedStringElement(q8 q8Var, c21 c21Var, jv jvVar, iw iwVar, int i, boolean z, int i2, int i3, bs0 bs0Var) {
        this.a = q8Var;
        this.b = c21Var;
        this.c = jvVar;
        this.d = iwVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = bs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return this.a.equals(selectableTextAnnotatedStringElement.a) && c10.i(this.b, selectableTextAnnotatedStringElement.b) && c10.i(this.c, selectableTextAnnotatedStringElement.c) && this.d == selectableTextAnnotatedStringElement.d && this.e == selectableTextAnnotatedStringElement.e && this.f == selectableTextAnnotatedStringElement.f && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.i.equals(selectableTextAnnotatedStringElement.i);
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new qr0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        boolean z;
        qr0 qr0Var = (qr0) d90Var;
        tz0 tz0Var = qr0Var.u;
        c21 c21Var = tz0Var.s;
        c21 c21Var2 = this.b;
        if (c21Var2 != c21Var) {
            if (!c21Var2.a.b(c21Var.a)) {
                z = true;
            }
            boolean zF0 = tz0Var.F0(this.a);
            boolean zE0 = qr0Var.u.E0(c21Var2, this.h, this.g, this.f, this.c, this.e);
            iw iwVar = this.d;
            bs0 bs0Var = this.i;
            tz0Var.A0(z, zF0, zE0, tz0Var.D0(iwVar, bs0Var));
            qr0Var.t = bs0Var;
            nm.v(qr0Var);
        }
        c21Var2.getClass();
        z = false;
        boolean zF02 = tz0Var.F0(this.a);
        boolean zE02 = qr0Var.u.E0(c21Var2, this.h, this.g, this.f, this.c, this.e);
        iw iwVar2 = this.d;
        bs0 bs0Var2 = this.i;
        tz0Var.A0(z, zF02, zE02, tz0Var.D0(iwVar2, bs0Var2));
        qr0Var.t = bs0Var2;
        nm.v(qr0Var);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        iw iwVar = this.d;
        return (this.i.hashCode() + ((((b8.d(b8.c(this.e, (iHashCode + (iwVar != null ? iwVar.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 29791)) * 31;
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.a) + ", style=" + this.b + ", fontFamilyResolver=" + this.c + ", onTextLayout=" + this.d + ", overflow=" + ((Object) mq0.n(this.e)) + ", softWrap=" + this.f + ", maxLines=" + this.g + ", minLines=" + this.h + ", placeholders=null, onPlaceholderLayout=null, selectionController=" + this.i + ", color=null)";
    }
}
