package defpackage;

import androidx.compose.foundation.gestures.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mr0 {
    public er0 a;
    public cg0 b;
    public xz c;
    public if0 d;
    public boolean e;
    public q2 f;
    public int g = 1;
    public pq0 h = a.a;
    public final kr0 i = new kr0(this);
    public final h j = new h(24, this);

    public mr0(er0 er0Var, cg0 cg0Var, xz xzVar, if0 if0Var, boolean z, q2 q2Var) {
        this.a = er0Var;
        this.b = cg0Var;
        this.c = xzVar;
        this.d = if0Var;
        this.e = z;
        this.f = q2Var;
    }

    public static final long a(mr0 mr0Var, pq0 pq0Var, long j, int i) {
        ec0 ec0Var = (ec0) mr0Var.f.a;
        ec0 ec0Var2 = null;
        ec0 ec0Var3 = (ec0Var == null || !ec0Var.q) ? null : (ec0) h9.d(ec0Var);
        long jE0 = ec0Var3 != null ? ec0Var3.E0(j, i) : 0L;
        long jF = ed0.f(j, jE0);
        long jD = mr0Var.d(mr0Var.g(pq0Var.a(mr0Var.f(mr0Var.d(ed0.a(jF, 0.0f, mr0Var.d == if0.e ? 1 : 2))))));
        long jF2 = ed0.f(jF, jD);
        ec0 ec0Var4 = (ec0) mr0Var.f.a;
        if (ec0Var4 != null && ec0Var4.q) {
            ec0Var2 = (ec0) h9.d(ec0Var4);
        }
        ec0 ec0Var5 = ec0Var2;
        return ed0.g(ed0.g(jE0, jD), ec0Var5 != null ? ec0Var5.C0(jD, jF2, i) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, defpackage.mk r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.hr0
            if (r0 == 0) goto L13
            r0 = r12
            hr0 r0 = (defpackage.hr0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            hr0 r0 = new hr0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            cm0 r9 = r0.g
            defpackage.c10.X(r12)
            goto L4f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.c10.X(r12)
            cm0 r5 = new cm0
            r5.<init>()
            r5.d = r10
            jr0 r3 = new jr0
            r8 = 0
            r4 = r9
            r6 = r10
            r3.<init>(r4, r5, r6, r8)
            r0.g = r5
            r0.j = r2
            java.lang.Object r9 = r4.e(r2, r3, r0)
            xl r10 = defpackage.xl.d
            if (r9 != r10) goto L4e
            return r10
        L4e:
            r9 = r5
        L4f:
            long r9 = r9.d
            l51 r11 = new l51
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr0.b(long, mk):java.lang.Object");
    }

    public final float c(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long d(long j) {
        return this.e ? ed0.h(j, -1.0f) : j;
    }

    public final Object e(int i, kw kwVar, mk mkVar) {
        Object objE = this.a.e(i, new ob(this, kwVar, null), mkVar);
        return objE == xl.d ? objE : j41.a;
    }

    public final float f(long j) {
        return this.d == if0.e ? ed0.d(j) : ed0.e(j);
    }

    public final long g(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.d == if0.e ? nm.f(f, 0.0f) : nm.f(0.0f, f);
    }
}
