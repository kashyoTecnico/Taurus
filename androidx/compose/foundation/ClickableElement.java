package androidx.compose.foundation;

import defpackage.b8;
import defpackage.c10;
import defpackage.d90;
import defpackage.fa0;
import defpackage.gw;
import defpackage.i90;
import defpackage.jz;
import defpackage.ke;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class ClickableElement extends i90 {
    public final fa0 a;
    public final jz b;
    public final boolean c;
    public final String d;
    public final gw e;

    public ClickableElement(fa0 fa0Var, jz jzVar, boolean z, String str, gw gwVar) {
        this.a = fa0Var;
        this.b = jzVar;
        this.c = z;
        this.d = str;
        this.e = gwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return c10.i(this.a, clickableElement.a) && c10.i(this.b, clickableElement.b) && this.c == clickableElement.c && c10.i(this.d, clickableElement.d) && this.e == clickableElement.e;
    }

    @Override // defpackage.i90
    public final d90 f() {
        return new ke(this.a, this.b, this.c, this.d, this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    @Override // defpackage.i90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.d90 r8) {
        /*
            r7 = this;
            ke r8 = (defpackage.ke) r8
            cv r0 = r8.y
            ev r1 = r8.z
            fa0 r2 = r8.G
            fa0 r3 = r7.a
            boolean r2 = defpackage.c10.i(r2, r3)
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L1b
            r8.D0()
            r8.G = r3
            r8.t = r3
            r2 = r4
            goto L1c
        L1b:
            r2 = r5
        L1c:
            jz r3 = r8.u
            jz r6 = r7.b
            boolean r3 = defpackage.c10.i(r3, r6)
            if (r3 != 0) goto L29
            r8.u = r6
            r2 = r4
        L29:
            boolean r3 = r8.w
            boolean r6 = r7.c
            if (r3 == r6) goto L46
            if (r6 == 0) goto L38
            r8.A0(r0)
            r8.A0(r1)
            goto L41
        L38:
            r8.B0(r0)
            r8.B0(r1)
            r8.D0()
        L41:
            defpackage.h9.i(r8)
            r8.w = r6
        L46:
            java.lang.String r0 = r8.v
            java.lang.String r3 = r7.d
            boolean r0 = defpackage.c10.i(r0, r3)
            if (r0 != 0) goto L55
            r8.v = r3
            defpackage.h9.i(r8)
        L55:
            gw r7 = r7.e
            r8.x = r7
            boolean r7 = r8.H
            fa0 r0 = r8.G
            if (r0 != 0) goto L65
            jz r3 = r8.u
            if (r3 == 0) goto L65
            r3 = r4
            goto L66
        L65:
            r3 = r5
        L66:
            if (r7 == r3) goto L78
            if (r0 != 0) goto L6f
            jz r7 = r8.u
            if (r7 == 0) goto L6f
            r5 = r4
        L6f:
            r8.H = r5
            if (r5 != 0) goto L78
            ln r7 = r8.B
            if (r7 != 0) goto L78
            goto L79
        L78:
            r4 = r2
        L79:
            if (r4 == 0) goto L8e
            ln r7 = r8.B
            if (r7 != 0) goto L83
            boolean r0 = r8.H
            if (r0 != 0) goto L8e
        L83:
            if (r7 == 0) goto L88
            r8.B0(r7)
        L88:
            r7 = 0
            r8.B = r7
            r8.E0()
        L8e:
            fa0 r7 = r8.t
            r1.D0(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableElement.g(d90):void");
    }

    public final int hashCode() {
        fa0 fa0Var = this.a;
        int iHashCode = (fa0Var != null ? fa0Var.hashCode() : 0) * 31;
        jz jzVar = this.b;
        int iD = b8.d((iHashCode + (jzVar != null ? jzVar.hashCode() : 0)) * 31, 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 961);
    }
}
