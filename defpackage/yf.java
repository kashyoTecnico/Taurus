package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yf extends un0 {
    public final ta0 B;

    public yf(fa0 fa0Var, boolean z, float f, on onVar, pn pnVar) {
        super(fa0Var, z, f, onVar, pnVar);
        this.B = new ta0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // defpackage.un0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0(defpackage.fk0 r19, long r20, float r22) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r18 = this;
            r2 = r18
            r3 = r19
            ta0 r0 = r2.B
            java.lang.Object[] r1 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r5 = r0.a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5b
            r8 = 0
        L12:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L56
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L2c:
            if (r13 >= r11) goto L54
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L50
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r1[r14]
            r14 = r4[r14]
            mn0 r14 = (defpackage.mn0) r14
            fk0 r15 = (defpackage.fk0) r15
            zg0 r15 = r14.k
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r15.setValue(r7)
            bg r7 = r14.i
            j41 r14 = defpackage.j41.a
            r7.S(r14)
        L50:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L2c
        L54:
            if (r11 != r12) goto L5b
        L56:
            if (r8 == r6) goto L5b
            int r8 = r8 + 1
            goto L12
        L5b:
            r4 = 0
            boolean r1 = r2.s
            if (r1 == 0) goto L68
            long r5 = r3.a
            ed0 r7 = new ed0
            r7.<init>(r5)
            goto L69
        L68:
            r7 = r4
        L69:
            mn0 r5 = new mn0
            r6 = r22
            r5.<init>(r7, r6, r1)
            r0.l(r3, r5)
            wl r6 = r2.o0()
            ob r0 = new ob
            r1 = r5
            r5 = 2
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 3
            defpackage.nm.z(r6, r4, r0, r1)
            defpackage.m20.F(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf.A0(fk0, long, float):void");
    }

    @Override // defpackage.un0
    public final void B0(v30 v30Var) {
        fd fdVar;
        Object[] objArr;
        int i;
        int i2;
        fd fdVar2;
        Object[] objArr2;
        int i3;
        yf yfVar = this;
        fd fdVar3 = v30Var.d;
        yfVar.v.a();
        float f = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        ta0 ta0Var = yfVar.B;
        Object[] objArr3 = ta0Var.b;
        Object[] objArr4 = ta0Var.c;
        long[] jArr = ta0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                long j2 = j;
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr3[i8];
                        mn0 mn0Var = (mn0) objArr4[i8];
                        long jB = bf.b(yfVar.u.a(), f);
                        x7 x7Var = mn0Var.h;
                        if (mn0Var.d == null) {
                            long jC = fdVar3.c();
                            float f2 = nn0.a;
                            mn0Var.d = Float.valueOf(Math.max(yu0.d(jC), yu0.b(jC)) * 0.3f);
                        }
                        if (mn0Var.a == null) {
                            mn0Var.a = new ed0(fdVar3.T());
                        }
                        if (mn0Var.e == null) {
                            mn0Var.e = new ed0(nm.f(yu0.d(fdVar3.c()) / 2.0f, yu0.b(fdVar3.c()) / 2.0f));
                        }
                        float fFloatValue = (!((Boolean) mn0Var.k.getValue()).booleanValue() || ((Boolean) mn0Var.j.getValue()).booleanValue()) ? ((Number) mn0Var.f.c()).floatValue() : 1.0f;
                        Float f3 = mn0Var.d;
                        c10.m(f3);
                        float fK = r31.K(f3.floatValue(), mn0Var.b, ((Number) mn0Var.g.c()).floatValue());
                        ed0 ed0Var = mn0Var.a;
                        c10.m(ed0Var);
                        float f4 = fFloatValue;
                        float fD = ed0.d(ed0Var.a);
                        ed0 ed0Var2 = mn0Var.e;
                        c10.m(ed0Var2);
                        int i9 = i7;
                        float fK2 = r31.K(fD, ed0.d(ed0Var2.a), ((Number) x7Var.c()).floatValue());
                        ed0 ed0Var3 = mn0Var.a;
                        c10.m(ed0Var3);
                        float fE = ed0.e(ed0Var3.a);
                        ed0 ed0Var4 = mn0Var.e;
                        c10.m(ed0Var4);
                        int i10 = i6;
                        long jF = nm.f(fK2, r31.K(fE, ed0.e(ed0Var4.a), ((Number) x7Var.c()).floatValue()));
                        long jB2 = bf.b(jB, bf.d(jB) * f4);
                        if (mn0Var.c) {
                            float fD2 = yu0.d(fdVar3.c());
                            float fB = yu0.b(fdVar3.c());
                            e9 e9Var = fdVar3.e;
                            long jS = e9Var.s();
                            e9Var.o().l();
                            ((e9) ((r1) e9Var.a).e).o().e(0.0f, 0.0f, fD2, fB, 1);
                            fdVar2 = fdVar3;
                            i2 = i10;
                            objArr2 = objArr3;
                            i3 = 8;
                            i = i9;
                            sq.Y(v30Var, jB2, fK, jF, 120);
                            b8.m(e9Var, jS);
                        } else {
                            fdVar2 = fdVar3;
                            i = i9;
                            i2 = i10;
                            objArr2 = objArr3;
                            i3 = 8;
                            sq.Y(v30Var, jB2, fK, jF, 120);
                        }
                    } else {
                        i = i7;
                        i2 = i6;
                        fdVar2 = fdVar3;
                        objArr2 = objArr3;
                        i3 = i5;
                    }
                    j2 >>= i3;
                    i7 = i + 1;
                    i6 = i2;
                    i5 = i3;
                    fdVar3 = fdVar2;
                    objArr3 = objArr2;
                    f = 0.1f;
                    yfVar = this;
                }
                fdVar = fdVar3;
                objArr = objArr3;
                if (i6 != i5) {
                    return;
                }
            } else {
                fdVar = fdVar3;
                objArr = objArr3;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            yfVar = this;
            fdVar3 = fdVar;
            objArr3 = objArr;
            f = 0.1f;
        }
    }

    @Override // defpackage.un0
    public final void D0(fk0 fk0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mn0 mn0Var = (mn0) this.B.g(fk0Var);
        if (mn0Var != null) {
            mn0Var.k.setValue(Boolean.TRUE);
            mn0Var.i.S(j41.a);
        }
    }

    @Override // defpackage.d90
    public final void t0() {
        this.B.a();
    }
}
