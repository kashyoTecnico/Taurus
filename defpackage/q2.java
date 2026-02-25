package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q2 implements aa, g51 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ q2(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.e51
    public long b(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        Iterator it = c10.a0(0, k8Var.b()).iterator();
        long jMax = 0;
        while (true) {
            o00 o00Var = (o00) it;
            if (!o00Var.f) {
                return jMax;
            }
            int iNextInt = o00Var.nextInt();
            jMax = Math.max(jMax, ((l8) this.a).get(iNextInt).d(k8Var.a(iNextInt), k8Var2.a(iNextInt), k8Var3.a(iNextInt)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r0 == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r0 == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r8, long r10, defpackage.mk r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.ac0
            if (r0 == 0) goto L14
            r0 = r12
            ac0 r0 = (defpackage.ac0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.i = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            ac0 r0 = new ac0
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.g
            int r1 = r12.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.c10.X(r0)
            goto L83
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.c10.X(r0)
            goto L61
        L36:
            defpackage.c10.X(r0)
            java.lang.Object r0 = r7.a
            ec0 r0 = (defpackage.ec0) r0
            r1 = 0
            if (r0 == 0) goto L4b
            boolean r4 = r0.q
            if (r4 == 0) goto L4b
            j31 r0 = defpackage.h9.d(r0)
            ec0 r0 = (defpackage.ec0) r0
            goto L4c
        L4b:
            r0 = r1
        L4c:
            r4 = 0
            xl r6 = defpackage.xl.d
            if (r0 != 0) goto L66
            java.lang.Object r7 = r7.b
            ec0 r7 = (defpackage.ec0) r7
            if (r7 == 0) goto L87
            r12.i = r3
            java.lang.Object r0 = r7.B0(r8, r10, r12)
            if (r0 != r6) goto L61
            goto L82
        L61:
            l51 r0 = (defpackage.l51) r0
            long r4 = r0.a
            goto L87
        L66:
            java.lang.Object r7 = r7.a
            ec0 r7 = (defpackage.ec0) r7
            if (r7 == 0) goto L77
            boolean r0 = r7.q
            if (r0 == 0) goto L77
            j31 r7 = defpackage.h9.d(r7)
            r1 = r7
            ec0 r1 = (defpackage.ec0) r1
        L77:
            r7 = r1
            if (r7 == 0) goto L87
            r12.i = r2
            java.lang.Object r0 = r7.B0(r8, r10, r12)
            if (r0 != r6) goto L83
        L82:
            return r6
        L83:
            l51 r0 = (defpackage.l51) r0
            long r4 = r0.a
        L87:
            l51 r7 = new l51
            r7.<init>(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q2.c(long, long, mk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r5, defpackage.mk r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bc0
            if (r0 == 0) goto L13
            r0 = r7
            bc0 r0 = (defpackage.bc0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            bc0 r0 = new bc0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.g
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.c10.X(r7)
            goto L4f
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.c10.X(r7)
            java.lang.Object r4 = r4.a
            ec0 r4 = (defpackage.ec0) r4
            r7 = 0
            if (r4 == 0) goto L42
            boolean r1 = r4.q
            if (r1 == 0) goto L42
            j31 r4 = defpackage.h9.d(r4)
            r7 = r4
            ec0 r7 = (defpackage.ec0) r7
        L42:
            if (r7 == 0) goto L54
            r0.i = r2
            java.lang.Object r7 = r7.D0(r5, r0)
            xl r4 = defpackage.xl.d
            if (r7 != r4) goto L4f
            return r4
        L4f:
            l51 r7 = (defpackage.l51) r7
            long r4 = r7.a
            goto L56
        L54:
            r4 = 0
        L56:
            l51 r6 = new l51
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q2.d(long, mk):java.lang.Object");
    }

    public k8 e(long j, k8 k8Var, k8 k8Var2) {
        if (((k8) this.c) == null) {
            this.c = k8Var.c();
        }
        k8 k8Var3 = (k8) this.c;
        if (k8Var3 == null) {
            c10.Y("velocityVector");
            throw null;
        }
        int iB = k8Var3.b();
        for (int i = 0; i < iB; i++) {
            k8 k8Var4 = (k8) this.c;
            if (k8Var4 == null) {
                c10.Y("velocityVector");
                throw null;
            }
            r1 r1Var = (r1) this.a;
            k8Var.getClass();
            long j2 = j / 1000000;
            nt ntVarA = ((ot) r1Var.e).a(k8Var2.a(i));
            long j3 = ntVarA.c;
            k8Var4.e((((Math.signum(ntVarA.a) * n5.a(j3 > 0 ? j2 / j3 : 1.0f).b) * ntVarA.b) / j3) * 1000.0f, i);
        }
        k8 k8Var5 = (k8) this.c;
        if (k8Var5 != null) {
            return k8Var5;
        }
        c10.Y("velocityVector");
        throw null;
    }

    @Override // defpackage.e51
    public k8 l(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        if (((k8) this.c) == null) {
            this.c = k8Var3.c();
        }
        k8 k8Var4 = (k8) this.c;
        if (k8Var4 == null) {
            c10.Y("velocityVector");
            throw null;
        }
        int iB = k8Var4.b();
        for (int i = 0; i < iB; i++) {
            k8 k8Var5 = (k8) this.c;
            if (k8Var5 == null) {
                c10.Y("velocityVector");
                throw null;
            }
            k8Var5.e(((l8) this.a).get(i).c(j, k8Var.a(i), k8Var2.a(i), k8Var3.a(i)), i);
        }
        k8 k8Var6 = (k8) this.c;
        if (k8Var6 != null) {
            return k8Var6;
        }
        c10.Y("velocityVector");
        throw null;
    }

    @Override // defpackage.e51
    public k8 o(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        if (((k8) this.b) == null) {
            this.b = k8Var.c();
        }
        k8 k8Var4 = (k8) this.b;
        if (k8Var4 == null) {
            c10.Y("valueVector");
            throw null;
        }
        int iB = k8Var4.b();
        for (int i = 0; i < iB; i++) {
            k8 k8Var5 = (k8) this.b;
            if (k8Var5 == null) {
                c10.Y("valueVector");
                throw null;
            }
            k8Var5.e(((l8) this.a).get(i).b(j, k8Var.a(i), k8Var2.a(i), k8Var3.a(i)), i);
        }
        k8 k8Var6 = (k8) this.b;
        if (k8Var6 != null) {
            return k8Var6;
        }
        c10.Y("valueVector");
        throw null;
    }

    @Override // defpackage.e51
    public k8 p(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        if (((k8) this.d) == null) {
            this.d = k8Var3.c();
        }
        k8 k8Var4 = (k8) this.d;
        if (k8Var4 == null) {
            c10.Y("endVelocityVector");
            throw null;
        }
        int iB = k8Var4.b();
        for (int i = 0; i < iB; i++) {
            k8 k8Var5 = (k8) this.d;
            if (k8Var5 == null) {
                c10.Y("endVelocityVector");
                throw null;
            }
            k8Var5.e(((l8) this.a).get(i).e(k8Var.a(i), k8Var2.a(i), k8Var3.a(i)), i);
        }
        k8 k8Var6 = (k8) this.d;
        if (k8Var6 != null) {
            return k8Var6;
        }
        c10.Y("endVelocityVector");
        throw null;
    }

    public q2(Typeface typeface, v80 v80Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = v80Var;
        this.c = new w80(1024);
        int iA = v80Var.a(6);
        if (iA != 0) {
            int i5 = iA + v80Var.d;
            i = ((ByteBuffer) v80Var.g).getInt(((ByteBuffer) v80Var.g).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = v80Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + v80Var.d;
            i2 = ((ByteBuffer) v80Var.g).getInt(((ByteBuffer) v80Var.g).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            w31 w31Var = new w31(this, i7);
            u80 u80VarB = w31Var.b();
            int iA3 = u80VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) u80VarB.g).getInt(iA3 + u80VarB.d) : 0, (char[]) this.b, i7 * 2);
            u80 u80VarB2 = w31Var.b();
            int iA4 = u80VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + u80VarB2.d;
                i3 = ((ByteBuffer) u80VarB2.g).getInt(((ByteBuffer) u80VarB2.g).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
            w80 w80Var = (w80) this.c;
            u80 u80VarB3 = w31Var.b();
            int iA5 = u80VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + u80VarB3.d;
                i4 = ((ByteBuffer) u80VarB3.g).getInt(((ByteBuffer) u80VarB3.g).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            w80Var.a(w31Var, 0, i4 - 1);
        }
    }

    public q2(rt rtVar) {
        this(new r1(29, rtVar));
    }
}
