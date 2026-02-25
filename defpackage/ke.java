package defpackage;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ke extends mn implements qj0, o20, iu, et0, j31 {
    public static final v71 J = new v71(1);
    public py0 A;
    public ln B;
    public fk0 C;
    public ny D;
    public fa0 G;
    public boolean H;
    public final v71 I;
    public fa0 t;
    public jz u;
    public String v;
    public boolean w;
    public gw x;
    public final ev z;
    public final cv y = new cv();
    public final LinkedHashMap E = new LinkedHashMap();
    public long F = 0;

    public ke(fa0 fa0Var, jz jzVar, boolean z, String str, gw gwVar) {
        this.t = fa0Var;
        this.u = jzVar;
        this.v = str;
        this.w = z;
        this.x = gwVar;
        this.z = new ev(fa0Var);
        fa0 fa0Var2 = this.t;
        this.G = fa0Var2;
        this.H = fa0Var2 == null && this.u != null;
        this.I = J;
    }

    public final void D0() {
        fa0 fa0Var = this.t;
        LinkedHashMap linkedHashMap = this.E;
        if (fa0Var != null) {
            fk0 fk0Var = this.C;
            if (fk0Var != null) {
                fa0Var.b(new ek0(fk0Var));
            }
            ny nyVar = this.D;
            if (nyVar != null) {
                fa0Var.b(new oy(nyVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                fa0Var.b(new ek0((fk0) it.next()));
            }
        }
        this.C = null;
        this.D = null;
        linkedHashMap.clear();
    }

    public final void E0() {
        jz jzVar;
        if (this.B == null && (jzVar = this.u) != null) {
            if (this.t == null) {
                this.t = new fa0();
            }
            this.z.D0(this.t);
            fa0 fa0Var = this.t;
            c10.m(fa0Var);
            ln lnVarB = jzVar.b(fa0Var);
            A0(lnVarB);
            this.B = lnVarB;
        }
    }

    @Override // defpackage.qj0
    public final void H(gj0 gj0Var, hj0 hj0Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.F = nm.f((int) (j2 >> 32), (int) (j2 & 4294967295L));
        E0();
        lk lkVar = null;
        if (this.w && hj0Var == hj0.e) {
            int i = gj0Var.c;
            if (i == 4) {
                nm.z(o0(), null, new g(this, lkVar, 0), 3);
            } else if (i == 5) {
                nm.z(o0(), null, new g(this, lkVar, 1), 3);
            }
        }
        if (this.A == null) {
            c cVar = new c(this, lkVar, 2);
            gj0 gj0Var2 = ly0.a;
            py0 py0Var = new py0(null, null, my0.a);
            py0Var.t = cVar;
            A0(py0Var);
            this.A = py0Var;
        }
        py0 py0Var2 = this.A;
        if (py0Var2 != null) {
            py0Var2.H(gj0Var, hj0Var, j);
        }
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
        String str = this.v;
        b bVar = new b(0, this);
        h20[] h20VarArr = nt0.a;
        ct0Var.d(bt0.b, new j0(str, bVar));
        if (this.w) {
            this.z.K(ct0Var);
        } else {
            ct0Var.d(lt0.i, j41.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // defpackage.o20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R(android.view.KeyEvent r13) {
        /*
            r12 = this;
            r12.E0()
            boolean r0 = r12.w
            r1 = 3
            r2 = 160(0xa0, float:2.24E-43)
            r3 = 66
            r4 = 23
            r5 = 32
            r6 = 0
            r7 = 1
            r8 = 0
            java.util.LinkedHashMap r9 = r12.E
            if (r0 == 0) goto L66
            int r0 = defpackage.le.b
            int r0 = defpackage.m20.E(r13)
            r10 = 2
            if (r0 != r10) goto L66
            long r10 = defpackage.m20.z(r13)
            long r10 = r10 >> r5
            int r0 = (int) r10
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            goto L66
        L2b:
            int r0 = r13.getKeyCode()
            long r2 = defpackage.m20.e(r0)
            j20 r0 = new j20
            r0.<init>(r2)
            boolean r0 = r9.containsKey(r0)
            if (r0 != 0) goto Laa
            fk0 r0 = new fk0
            long r2 = r12.F
            r0.<init>(r2)
            int r13 = r13.getKeyCode()
            long r2 = defpackage.m20.e(r13)
            j20 r13 = new j20
            r13.<init>(r2)
            r9.put(r13, r0)
            fa0 r13 = r12.t
            if (r13 == 0) goto L65
            wl r13 = r12.o0()
            f r2 = new f
            r2.<init>(r12, r0, r8, r6)
            defpackage.nm.z(r13, r8, r2, r1)
        L65:
            return r7
        L66:
            boolean r0 = r12.w
            if (r0 == 0) goto Laa
            int r0 = defpackage.le.b
            int r0 = defpackage.m20.E(r13)
            if (r0 != r7) goto Laa
            long r10 = defpackage.m20.z(r13)
            long r10 = r10 >> r5
            int r0 = (int) r10
            if (r0 == r4) goto L7f
            if (r0 == r3) goto L7f
            if (r0 == r2) goto L7f
            return r6
        L7f:
            int r13 = r13.getKeyCode()
            long r2 = defpackage.m20.e(r13)
            j20 r13 = new j20
            r13.<init>(r2)
            java.lang.Object r13 = r9.remove(r13)
            fk0 r13 = (defpackage.fk0) r13
            if (r13 == 0) goto La4
            fa0 r0 = r12.t
            if (r0 == 0) goto La4
            wl r0 = r12.o0()
            f r2 = new f
            r2.<init>(r12, r13, r8, r7)
            defpackage.nm.z(r0, r8, r2, r1)
        La4:
            gw r12 = r12.x
            r12.a()
            return r7
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.R(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.iu
    public final void S(yu yuVar) {
        if (yuVar.a()) {
            E0();
        }
        if (this.w) {
            this.z.S(yuVar);
        }
    }

    @Override // defpackage.qj0
    public final void b0() {
        ny nyVar;
        fa0 fa0Var = this.t;
        if (fa0Var != null && (nyVar = this.D) != null) {
            fa0Var.b(new oy(nyVar));
        }
        this.D = null;
        py0 py0Var = this.A;
        if (py0Var != null) {
            py0Var.b0();
        }
    }

    @Override // defpackage.et0
    public final boolean e0() {
        return true;
    }

    @Override // defpackage.o20
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.j31
    public final Object o() {
        return this.I;
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.d90
    public final void s0() {
        if (!this.H) {
            E0();
        }
        if (this.w) {
            A0(this.y);
            A0(this.z);
        }
    }

    @Override // defpackage.d90
    public final void t0() {
        D0();
        if (this.G == null) {
            this.t = null;
        }
        ln lnVar = this.B;
        if (lnVar != null) {
            B0(lnVar);
        }
        this.B = null;
    }
}
