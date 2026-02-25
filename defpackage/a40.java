package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a40 implements xx0 {
    public e30 d = e30.e;
    public float e;
    public float f;
    public final /* synthetic */ f40 g;

    public a40(f40 f40Var) {
        this.g = f40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // defpackage.xx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List G(defpackage.kw r11, java.lang.Object r12) {
        /*
            r10 = this;
            f40 r10 = r10.g
            r10.d()
            t30 r0 = r10.d
            w30 r1 = r0.H
            p30 r1 = r1.d
            p30 r2 = defpackage.p30.f
            p30 r3 = defpackage.p30.d
            if (r1 == r3) goto L21
            if (r1 == r2) goto L21
            p30 r4 = defpackage.p30.e
            if (r1 == r4) goto L21
            p30 r4 = defpackage.p30.g
            if (r1 != r4) goto L1c
            goto L21
        L1c:
            java.lang.String r4 = "subcompose can only be used inside the measure or layout blocks"
            defpackage.pz.b(r4)
        L21:
            ta0 r4 = r10.i
            java.lang.Object r5 = r4.g(r12)
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L62
            ta0 r5 = r10.l
            java.lang.Object r5 = r5.j(r12)
            t30 r5 = (defpackage.t30) r5
            if (r5 == 0) goto L46
            int r8 = r10.q
            if (r8 <= 0) goto L3a
            goto L3f
        L3a:
            java.lang.String r8 = "Check failed."
            defpackage.pz.b(r8)
        L3f:
            int r8 = r10.q
            int r8 = r8 + (-1)
            r10.q = r8
            goto L5f
        L46:
            r5 = r12
            bq0 r5 = (defpackage.bq0) r5
            t30 r5 = r10.h(r5)
            if (r5 != 0) goto L5f
            int r5 = r10.f
            t30 r8 = new t30
            r9 = 2
            r8.<init>(r9)
            r0.r = r7
            r0.z(r5, r8)
            r0.r = r6
            r5 = r8
        L5f:
            r4.l(r12, r5)
        L62:
            t30 r5 = (defpackage.t30) r5
            java.util.List r4 = r0.n()
            int r8 = r10.f
            if (r8 < 0) goto L79
            bb0 r4 = (defpackage.bb0) r4
            eb0 r9 = r4.d
            int r9 = r9.f
            if (r8 >= r9) goto L79
            java.lang.Object r4 = r4.get(r8)
            goto L7a
        L79:
            r4 = 0
        L7a:
            if (r4 == r5) goto Lae
            java.util.List r4 = r0.n()
            bb0 r4 = (defpackage.bb0) r4
            eb0 r4 = r4.d
            int r4 = r4.i(r5)
            int r8 = r10.f
            if (r4 < r8) goto L8d
            goto La3
        L8d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Key \""
            r8.<init>(r9)
            r8.append(r12)
            java.lang.String r9 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            defpackage.pz.a(r8)
        La3:
            int r8 = r10.f
            if (r8 == r4) goto Lae
            r0.r = r7
            r0.K(r4, r8, r7)
            r0.r = r6
        Lae:
            int r0 = r10.f
            int r0 = r0 + r7
            r10.f = r0
            bq0 r12 = (defpackage.bq0) r12
            r10.g(r5, r12, r11)
            if (r1 == r3) goto Lc2
            if (r1 != r2) goto Lbd
            goto Lc2
        Lbd:
            java.util.List r10 = r5.k()
            return r10
        Lc2:
            java.util.List r10 = r5.l()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a40.G(kw, java.lang.Object):java.util.List");
    }

    @Override // defpackage.n80
    public final m80 M(int i, int i2, Map map, iw iwVar, iw iwVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            pz.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new z30(i, i2, map, iwVar, this, this.g, iwVar2);
    }

    @Override // defpackage.xn
    public final float b() {
        return this.e;
    }

    @Override // defpackage.x00
    public final e30 getLayoutDirection() {
        return this.d;
    }

    @Override // defpackage.xn
    public final float k() {
        return this.f;
    }

    @Override // defpackage.x00
    public final boolean s() {
        p30 p30Var = this.g.d.H.d;
        return p30Var == p30.g || p30Var == p30.e;
    }
}
