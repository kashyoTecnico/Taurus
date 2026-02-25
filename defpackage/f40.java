package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f40 implements kh {
    public final t30 d;
    public hi e;
    public int f;
    public int g;
    public final ta0 h;
    public final ta0 i;
    public final a40 j;
    public final x30 k;
    public final ta0 l;
    public final yx0 m;
    public final ta0 n;
    public final eb0 o;
    public int p;
    public int q;
    public final String r;

    public f40(t30 t30Var) {
        this.d = t30Var;
        long[] jArr = eq0.a;
        this.h = new ta0();
        this.i = new ta0();
        this.j = new a40(this);
        this.k = new x30(this);
        this.l = new ta0();
        this.m = new yx0();
        this.n = new ta0();
        this.o = new eb0(new Object[16]);
        this.r = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // defpackage.kh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            t30 r2 = r0.d
            r2.r = r1
            ta0 r1 = r0.h
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            y30 r13 = (defpackage.y30) r13
            oi r13 = r13.c
            if (r13 == 0) goto L47
            r13.l()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.P()
            r2.r = r6
            r1.a()
            ta0 r1 = r0.i
            r1.a()
            r0.q = r6
            r0.p = r6
            ta0 r1 = r0.l
            r1.a()
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.a():void");
    }

    @Override // defpackage.kh
    public final void b() {
        e(true);
    }

    public final void c(int i) {
        boolean z;
        boolean z2 = false;
        this.p = 0;
        List listN = this.d.n();
        bb0 bb0Var = (bb0) listN;
        int i2 = (bb0Var.d.f - this.q) - 1;
        if (i <= i2) {
            this.m.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.h.g((t30) bb0Var.get(i3));
                    c10.m(objG);
                    ((na0) this.m.e).a(((y30) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.m.clear();
            gv0 gv0VarG = h9.g();
            iw iwVarE = gv0VarG != null ? gv0VarG.e() : null;
            gv0 gv0VarJ = h9.j(gv0VarG);
            z = false;
            while (i2 >= i) {
                try {
                    t30 t30Var = (t30) ((bb0) listN).get(i2);
                    Object objG2 = this.h.g(t30Var);
                    c10.m(objG2);
                    y30 y30Var = (y30) objG2;
                    Object obj = y30Var.a;
                    if (((na0) this.m.e).c(obj)) {
                        this.p++;
                        if (((Boolean) y30Var.f.getValue()).booleanValue()) {
                            w30 w30Var = t30Var.H;
                            k80 k80Var = w30Var.p;
                            r30 r30Var = r30.f;
                            k80Var.o = r30Var;
                            c70 c70Var = w30Var.q;
                            if (c70Var != null) {
                                c70Var.m = r30Var;
                            }
                            f(y30Var, false);
                            if (y30Var.g) {
                                z = true;
                            }
                        }
                    } else {
                        t30 t30Var2 = this.d;
                        t30Var2.r = true;
                        this.h.j(t30Var);
                        oi oiVar = y30Var.c;
                        if (oiVar != null) {
                            oiVar.l();
                        }
                        this.d.Q(i2, 1);
                        t30Var2.r = false;
                    }
                    this.i.j(obj);
                    i2--;
                } catch (Throwable th) {
                    h9.l(gv0VarG, gv0VarJ, iwVarE);
                    throw th;
                }
            }
            h9.l(gv0VarG, gv0VarJ, iwVarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (ov0.c) {
                ua0 ua0Var = ov0.j.h;
                if (ua0Var != null) {
                    if (ua0Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ov0.a();
            }
        }
        d();
    }

    public final void d() {
        int i = ((bb0) this.d.n()).d.f;
        ta0 ta0Var = this.h;
        if (ta0Var.e != i) {
            pz.a("Inconsistency between the count of nodes tracked by the state (" + ta0Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.p) - this.q < 0) {
            StringBuilder sbI = b8.i("Incorrect state. Total children ", i, ". Reusable children ");
            sbI.append(this.p);
            sbI.append(". Precomposed children ");
            sbI.append(this.q);
            pz.a(sbI.toString());
        }
        ta0 ta0Var2 = this.l;
        if (ta0Var2.e == this.q) {
            return;
        }
        pz.a("Incorrect state. Precomposed children " + this.q + ". Map size " + ta0Var2.e);
    }

    public final void e(boolean z) {
        this.q = 0;
        this.l.a();
        List listN = this.d.n();
        int i = ((bb0) listN).d.f;
        if (this.p != i) {
            this.p = i;
            gv0 gv0VarG = h9.g();
            iw iwVarE = gv0VarG != null ? gv0VarG.e() : null;
            gv0 gv0VarJ = h9.j(gv0VarG);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    t30 t30Var = (t30) ((bb0) listN).get(i2);
                    y30 y30Var = (y30) this.h.g(t30Var);
                    if (y30Var != null && ((Boolean) y30Var.f.getValue()).booleanValue()) {
                        w30 w30Var = t30Var.H;
                        k80 k80Var = w30Var.p;
                        r30 r30Var = r30.f;
                        k80Var.o = r30Var;
                        c70 c70Var = w30Var.q;
                        if (c70Var != null) {
                            c70Var.m = r30Var;
                        }
                        f(y30Var, z);
                        y30Var.a = l81.g;
                    }
                } catch (Throwable th) {
                    h9.l(gv0VarG, gv0VarJ, iwVarE);
                    throw th;
                }
            }
            h9.l(gv0VarG, gv0VarJ, iwVarE);
            this.i.a();
        }
        d();
    }

    public final void f(y30 y30Var, boolean z) {
        oi oiVar;
        if (z || !y30Var.g) {
            y30Var.f = qo0.n(Boolean.FALSE);
        } else {
            y30Var.f.setValue(Boolean.FALSE);
        }
        y30Var.getClass();
        if (z) {
            oi oiVar2 = y30Var.c;
            if (oiVar2 != null) {
                oiVar2.k();
                return;
            }
            return;
        }
        jf0 outOfFrameExecutor = ((p3) r31.U(this.d)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (y30Var.g || (oiVar = y30Var.c) == null) {
                return;
            }
            oiVar.k();
            return;
        }
        b bVar = new b(14, y30Var);
        Handler handler = ((p3) outOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new b3(1, bVar));
    }

    public final void g(t30 t30Var, bq0 bq0Var, kw kwVar) {
        boolean z;
        ta0 ta0Var = this.h;
        Object objG = ta0Var.g(t30Var);
        Object obj = objG;
        if (objG == null) {
            zg zgVar = hh.a;
            y30 y30Var = new y30();
            y30Var.a = bq0Var;
            y30Var.b = zgVar;
            y30Var.c = null;
            y30Var.f = qo0.n(Boolean.TRUE);
            ta0Var.l(t30Var, y30Var);
            obj = y30Var;
        }
        y30 y30Var2 = (y30) obj;
        boolean z2 = y30Var2.b != kwVar;
        oi oiVar = y30Var2.c;
        if (oiVar != null) {
            synchronized (oiVar.g) {
                z = oiVar.q.e > 0;
            }
        } else {
            z = true;
        }
        if (z2 || z || y30Var2.d) {
            y30Var2.b = kwVar;
            gv0 gv0VarG = h9.g();
            iw iwVarE = gv0VarG != null ? gv0VarG.e() : null;
            gv0 gv0VarJ = h9.j(gv0VarG);
            try {
                t30 t30Var2 = this.d;
                t30Var2.r = true;
                oi oiVar2 = y30Var2.c;
                hi hiVar = this.e;
                if (hiVar == null) {
                    pz.c("parent composition reference not set");
                    throw new fg();
                }
                if (oiVar2 == null) {
                    ViewGroup.LayoutParams layoutParams = j81.a;
                    oiVar2 = new oi(hiVar, new e9(t30Var));
                } else {
                    if (oiVar2.x == 3) {
                        ViewGroup.LayoutParams layoutParams2 = j81.a;
                        oiVar2 = new oi(hiVar, new e9(t30Var));
                    }
                }
                y30Var2.c = oiVar2;
                kw zgVar2 = y30Var2.b;
                if (((p3) r31.U(this.d)).getOutOfFrameExecutor() != null) {
                    y30Var2.g = false;
                } else {
                    y30Var2.g = true;
                    zgVar2 = new zg(1524156494, true, new h4(9, y30Var2, zgVar2));
                }
                if (y30Var2.e) {
                    oiVar2.i();
                    oiVar2.p();
                    ci ciVar = oiVar2.w;
                    ciVar.z = 100;
                    ciVar.y = true;
                    oiVar2.d.a(oiVar2, zgVar2);
                    ciVar.s();
                } else {
                    oiVar2.A(zgVar2);
                }
                y30Var2.e = false;
                t30Var2.r = false;
                h9.l(gv0VarG, gv0VarJ, iwVarE);
                y30Var2.d = false;
            } catch (Throwable th) {
                h9.l(gv0VarG, gv0VarJ, iwVarE);
                throw th;
            }
        }
    }

    public final t30 h(bq0 bq0Var) {
        ta0 ta0Var;
        int i;
        if (this.p == 0) {
            return null;
        }
        t30 t30Var = this.d;
        bb0 bb0Var = (bb0) t30Var.n();
        int i2 = bb0Var.d.f - this.q;
        int i3 = i2 - this.p;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            ta0Var = this.h;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = ta0Var.g((t30) bb0Var.get(i5));
            c10.m(objG);
            if (((y30) objG).a.equals(bq0Var)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = ta0Var.g((t30) bb0Var.get(i4));
                c10.m(objG2);
                y30 y30Var = (y30) objG2;
                if (y30Var.a == l81.g) {
                    y30Var.a = bq0Var;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            t30Var.r = true;
            t30Var.K(i5, i3, 1);
            t30Var.r = false;
        }
        this.p--;
        t30 t30Var2 = (t30) bb0Var.get(i3);
        Object objG3 = ta0Var.g(t30Var2);
        c10.m(objG3);
        y30 y30Var2 = (y30) objG3;
        y30Var2.f = qo0.n(Boolean.TRUE);
        y30Var2.e = true;
        y30Var2.d = true;
        return t30Var2;
    }
}
