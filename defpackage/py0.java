package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class py0 extends d90 implements rj0, xn, qj0 {
    public gj0 A;
    public long B;
    public Object r;
    public Object s;
    public jy0 t;
    public PointerInputEventHandler u;
    public rw0 v;
    public gj0 w = ly0.a;
    public final eb0 x;
    public final eb0 y;
    public final eb0 z;

    public py0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.r = obj;
        this.s = obj2;
        this.u = pointerInputEventHandler;
        eb0 eb0Var = new eb0(new oy0[16]);
        this.x = eb0Var;
        this.y = eb0Var;
        this.z = new eb0(new oy0[16]);
        this.B = 0L;
    }

    public final Object A0(kw kwVar, lk lkVar) {
        ad adVar = new ad(1, r31.I(lkVar));
        adVar.t();
        oy0 oy0Var = new oy0(this, adVar);
        synchronized (this.y) {
            this.x.b(oy0Var);
            new uo0(r31.I(r31.v(oy0Var, oy0Var, kwVar))).h(j41.a);
        }
        adVar.v(new ey0(2, oy0Var));
        return adVar.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(defpackage.gj0 r7, defpackage.hj0 r8) {
        /*
            r6 = this;
            eb0 r0 = r6.y
            monitor-enter(r0)
            eb0 r1 = r6.z     // Catch: java.lang.Throwable -> L6c
            eb0 r2 = r6.x     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            fg r7 = new fg     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            eb0 r0 = r6.z     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.d     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            oy0 r2 = (defpackage.oy0) r2     // Catch: java.lang.Throwable -> L21
            hj0 r4 = r2.g     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            ad r4 = r2.f     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f = r1     // Catch: java.lang.Throwable -> L21
            r4.h(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            eb0 r0 = r6.z     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.d     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            oy0 r4 = (defpackage.oy0) r4     // Catch: java.lang.Throwable -> L21
            hj0 r5 = r4.g     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            ad r5 = r4.f     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f = r1     // Catch: java.lang.Throwable -> L21
            r5.h(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            eb0 r6 = r6.z
            r6.g()
            return
        L66:
            eb0 r6 = r6.z
            r6.g()
            throw r7
        L6c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.B0(gj0, hj0):void");
    }

    public final void C0() {
        rw0 rw0Var = this.v;
        if (rw0Var != null) {
            rw0Var.C(new h90("Pointer input was reset", 0));
            this.v = null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.qj0
    public final void H(gj0 gj0Var, hj0 hj0Var, long j) {
        this.B = j;
        if (hj0Var == hj0.d) {
            this.w = gj0Var;
        }
        lk lkVar = null;
        if (this.v == null) {
            this.v = nm.z(o0(), null, new qm(this, lkVar, 3), 1);
        }
        B0(gj0Var, hj0Var);
        ?? r4 = gj0Var.a;
        int size = r4.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                gj0Var = null;
                break;
            } else if (!c10.l((nj0) r4.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.A = gj0Var;
    }

    @Override // defpackage.qj0
    public final void X() {
        C0();
    }

    @Override // defpackage.ln, defpackage.qj0
    public final void a() {
        C0();
    }

    @Override // defpackage.xn
    public final float b() {
        return d80.z(this).z.b();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.qj0
    public final void b0() {
        gj0 gj0Var = this.A;
        if (gj0Var == null) {
            return;
        }
        ?? r1 = gj0Var.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((nj0) r1.get(i)).d) {
                ArrayList arrayList = new ArrayList(r1.size());
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    nj0 nj0Var = (nj0) r1.get(i2);
                    long j = nj0Var.a;
                    long j2 = nj0Var.c;
                    long j3 = nj0Var.b;
                    float f = nj0Var.e;
                    boolean z = nj0Var.d;
                    arrayList.add(new nj0(j, j3, j2, false, f, j3, j2, z, z, nj0Var.i, 0L));
                }
                gj0 gj0Var2 = new gj0(arrayList, null);
                this.w = gj0Var2;
                B0(gj0Var2, hj0.d);
                B0(gj0Var2, hj0.e);
                B0(gj0Var2, hj0.f);
                this.A = null;
                return;
            }
        }
    }

    @Override // defpackage.xn
    public final float k() {
        return d80.z(this).z.k();
    }

    @Override // defpackage.d90
    public final void t0() {
        C0();
    }
}
