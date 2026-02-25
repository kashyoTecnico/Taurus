package androidx.compose.foundation.text.modifiers;

import defpackage.b21;
import defpackage.b8;
import defpackage.c10;
import defpackage.c21;
import defpackage.d90;
import defpackage.i90;
import defpackage.jv;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends i90 {
    public final String a;
    public final c21 b;
    public final jv c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public TextStringSimpleElement(String str, c21 c21Var, jv jvVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = c21Var;
        this.c = jvVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return c10.i(this.a, textStringSimpleElement.a) && c10.i(this.b, textStringSimpleElement.b) && c10.i(this.c, textStringSimpleElement.c) && this.d == textStringSimpleElement.d && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g;
    }

    @Override // defpackage.i90
    public final d90 f() {
        b21 b21Var = new b21();
        b21Var.r = this.a;
        b21Var.s = this.b;
        b21Var.t = this.c;
        b21Var.u = this.d;
        b21Var.v = this.e;
        b21Var.w = this.f;
        b21Var.x = this.g;
        return b21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.i90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.d90 r11) {
        /*
            r10 = this;
            b21 r11 = (defpackage.b21) r11
            r11.getClass()
            c21 r0 = r11.s
            r1 = 0
            r2 = 1
            c21 r3 = r10.b
            if (r3 == r0) goto L1a
            iw0 r4 = r3.a
            iw0 r0 = r0.a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r11.r
            java.lang.String r5 = r10.a
            boolean r4 = defpackage.c10.i(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r11.r = r5
            r1 = 0
            r11.B = r1
            r1 = r2
        L2f:
            c21 r4 = r11.s
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r11.s = r3
            int r3 = r11.x
            int r5 = r10.g
            if (r3 == r5) goto L41
            r11.x = r5
            r4 = r2
        L41:
            int r3 = r11.w
            int r5 = r10.f
            if (r3 == r5) goto L4a
            r11.w = r5
            r4 = r2
        L4a:
            boolean r3 = r11.v
            boolean r5 = r10.e
            if (r3 == r5) goto L53
            r11.v = r5
            r4 = r2
        L53:
            jv r3 = r11.t
            jv r5 = r10.c
            boolean r3 = defpackage.c10.i(r3, r5)
            if (r3 != 0) goto L60
            r11.t = r5
            r4 = r2
        L60:
            int r3 = r11.u
            int r10 = r10.d
            if (r3 != r10) goto L68
            r2 = r4
            goto L6a
        L68:
            r11.u = r10
        L6a:
            if (r1 != 0) goto L6e
            if (r2 == 0) goto L91
        L6e:
            sg0 r10 = r11.A0()
            java.lang.String r3 = r11.r
            c21 r4 = r11.s
            jv r5 = r11.t
            int r6 = r11.u
            boolean r7 = r11.v
            int r8 = r11.w
            int r9 = r11.x
            r10.a = r3
            r10.b = r4
            r10.c = r5
            r10.d = r6
            r10.e = r7
            r10.f = r8
            r10.g = r9
            r10.c()
        L91:
            boolean r10 = r11.q
            if (r10 != 0) goto L96
            goto Lb0
        L96:
            if (r1 != 0) goto L9e
            if (r0 == 0) goto La1
            a21 r10 = r11.A
            if (r10 == 0) goto La1
        L9e:
            defpackage.h9.i(r11)
        La1:
            if (r1 != 0) goto La5
            if (r2 == 0) goto Lab
        La5:
            defpackage.nm.v(r11)
            defpackage.m20.F(r11)
        Lab:
            if (r0 == 0) goto Lb0
            defpackage.m20.F(r11)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.g(d90):void");
    }

    public final int hashCode() {
        return (((b8.d(b8.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
