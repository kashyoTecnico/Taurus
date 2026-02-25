package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sl0 extends hi {
    public static final zw0 x = d80.f(gi0.g);
    public static final AtomicReference y = new AtomicReference(Boolean.FALSE);
    public final zb a;
    public final Object b;
    public r10 c;
    public Throwable d;
    public final ArrayList e;
    public Object f;
    public ua0 g;
    public final eb0 h;
    public final ArrayList i;
    public final ArrayList j;
    public final ta0 k;
    public final xz l;
    public final ta0 m;
    public final ta0 n;
    public ArrayList o;
    public LinkedHashSet p;
    public ad q;
    public r1 r;
    public boolean s;
    public final zw0 t;
    public final t10 u;
    public final ml v;
    public final kc0 w;

    public sl0(ml mlVar) {
        zb zbVar = new zb(new g7(1, this));
        this.a = zbVar;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new ua0();
        this.h = new eb0(new oi[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ta0();
        this.l = new xz(14);
        this.m = new ta0();
        this.n = new ta0();
        this.t = d80.f(ol0.f);
        new e9(10);
        t10 t10Var = new t10((r10) mlVar.n(g2.E));
        t10Var.t(new ir(6, this));
        this.u = t10Var;
        this.v = mlVar.k(zbVar).k(t10Var);
        this.w = new kc0(11);
    }

    public static void r(ya0 ya0Var) {
        try {
            if (ya0Var.w() instanceof hv0) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            ya0Var.c();
        }
    }

    public static final void x(ArrayList arrayList, sl0 sl0Var, oi oiVar) {
        arrayList.clear();
        synchronized (sl0Var.b) {
            Iterator it = sl0Var.j.iterator();
            if (it.hasNext()) {
                ((r90) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(Throwable th, oi oiVar) throws Throwable {
        if (!((Boolean) y.get()).booleanValue() || (th instanceof lh)) {
            synchronized (this.b) {
                r1 r1Var = this.r;
                if (r1Var != null) {
                    throw ((Throwable) r1Var.e);
                }
                this.r = new r1(19, th);
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.h.g();
                this.g = new ua0();
                this.j.clear();
                this.k.a();
                this.m.a();
                this.r = new r1(19, th);
                if (oiVar != null) {
                    C(oiVar);
                }
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean B() {
        synchronized (this.b) {
            boolean z = true;
            if (this.g.g()) {
                if (this.h.f == 0 && !u() && this.k.e == 0) {
                    z = false;
                }
                return z;
            }
            List listW = w();
            gq0 gq0Var = new gq0(this.g);
            this.g = new ua0();
            try {
                int size = listW.size();
                for (int i = 0; i < size; i++) {
                    ((oi) listW.get(i)).x(gq0Var);
                    if (((ol0) this.t.getValue()).compareTo(ol0.e) <= 0) {
                        break;
                    }
                }
                synchronized (this.b) {
                    if (t() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.h.f == 0 && !u() && this.k.e == 0) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                synchronized (this.b) {
                    ua0 ua0Var = this.g;
                    ua0Var.getClass();
                    Iterator<E> it = gq0Var.iterator();
                    while (it.hasNext()) {
                        ua0Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void C(oi oiVar) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(oiVar)) {
            arrayList.add(oiVar);
        }
        if (this.e.remove(oiVar)) {
            this.f = null;
        }
    }

    @Override // defpackage.hi
    public final void a(oi oiVar, kw kwVar) throws Throwable {
        ol0 ol0Var;
        boolean zContains;
        ya0 ya0VarC;
        boolean z = oiVar.w.F;
        synchronized (this.b) {
            ol0 ol0Var2 = (ol0) this.t.getValue();
            ol0Var = ol0.e;
            zContains = ol0Var2.compareTo(ol0Var) > 0 ? true ^ w().contains(oiVar) : true;
        }
        try {
            ir irVar = new ir(5, oiVar);
            qx qxVar = new qx(1, oiVar, null);
            gv0 gv0VarK = ov0.k();
            ya0 ya0Var = gv0VarK instanceof ya0 ? (ya0) gv0VarK : null;
            if (ya0Var == null || (ya0VarC = ya0Var.C(irVar, qxVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                gv0 gv0VarJ = ya0VarC.j();
                try {
                    oiVar.j(kwVar);
                    synchronized (this.b) {
                        if (((ol0) this.t.getValue()).compareTo(ol0Var) > 0 && !w().contains(oiVar)) {
                            this.e.add(oiVar);
                            this.f = null;
                        }
                    }
                    if (!z) {
                        ov0.k().m();
                    }
                    try {
                        synchronized (this.b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((r90) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            oiVar.d();
                            oiVar.f();
                            if (z) {
                                return;
                            }
                            ov0.k().m();
                        } catch (Throwable th) {
                            A(th, null);
                        }
                    } catch (Throwable th2) {
                        A(th2, oiVar);
                    }
                } finally {
                    gv0.q(gv0VarJ);
                }
            } finally {
                r(ya0VarC);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.b) {
                }
            }
            A(th3, oiVar);
        }
    }

    @Override // defpackage.hi
    public final boolean c() {
        return ((Boolean) y.get()).booleanValue();
    }

    @Override // defpackage.hi
    public final boolean d() {
        return false;
    }

    @Override // defpackage.hi
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hi
    public final long f() {
        return 1000;
    }

    @Override // defpackage.hi
    public final gi g() {
        return null;
    }

    @Override // defpackage.hi
    public final ml i() {
        return this.v;
    }

    @Override // defpackage.hi
    public final void j(oi oiVar) {
        yc ycVarT;
        synchronized (this.b) {
            if (this.h.h(oiVar)) {
                ycVarT = null;
            } else {
                this.h.b(oiVar);
                ycVarT = t();
            }
        }
        if (ycVarT != null) {
            ((ad) ycVarT).h(j41.a);
        }
    }

    @Override // defpackage.hi
    public final q90 k(r90 r90Var) {
        q90 q90Var;
        synchronized (this.b) {
            q90Var = (q90) this.m.j(r90Var);
        }
        return q90Var;
    }

    @Override // defpackage.hi
    public final void n(oi oiVar) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(oiVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hi
    public final void q(oi oiVar) {
        synchronized (this.b) {
            if (this.e.remove(oiVar)) {
                this.f = null;
            }
            this.h.j(oiVar);
            this.i.remove(oiVar);
        }
    }

    public final void s() {
        synchronized (this.b) {
            if (((ol0) this.t.getValue()).compareTo(ol0.h) >= 0) {
                zw0 zw0Var = this.t;
                ol0 ol0Var = ol0.e;
                zw0Var.getClass();
                zw0Var.h(null, ol0Var);
            }
        }
        this.u.a(null);
    }

    public final yc t() {
        zw0 zw0Var = this.t;
        int iCompareTo = ((ol0) zw0Var.getValue()).compareTo(ol0.e);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        eb0 eb0Var = this.h;
        if (iCompareTo <= 0) {
            for (oi oiVar : w()) {
            }
            this.e.clear();
            this.f = ks.d;
            this.g = new ua0();
            eb0Var.g();
            arrayList2.clear();
            arrayList.clear();
            this.o = null;
            ad adVar = this.q;
            if (adVar != null) {
                adVar.m(null);
            }
            this.q = null;
            this.r = null;
            return null;
        }
        r1 r1Var = this.r;
        ol0 ol0Var = ol0.i;
        ol0 ol0Var2 = ol0.f;
        if (r1Var == null) {
            if (this.c == null) {
                this.g = new ua0();
                eb0Var.g();
                if (u()) {
                    ol0Var2 = ol0.g;
                }
            } else {
                ol0Var2 = (eb0Var.f == 0 && !this.g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !u() && this.k.e == 0) ? ol0.h : ol0Var;
            }
        }
        zw0Var.getClass();
        zw0Var.h(null, ol0Var2);
        if (ol0Var2 != ol0Var) {
            return null;
        }
        ad adVar2 = this.q;
        this.q = null;
        return adVar2;
    }

    public final boolean u() {
        return !this.s && (this.a.g.get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            ua0 r1 = r2.g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            eb0 r1 = r2.h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r2 = r2.u()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L19
            goto L1d
        L19:
            r2 = 0
            goto L1e
        L1b:
            r2 = move-exception
            goto L20
        L1d:
            r2 = 1
        L1e:
            monitor-exit(r0)
            return r2
        L20:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl0.v():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List w() {
        ?? r0 = this.f;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.e;
        List arrayList2 = arrayList.isEmpty() ? ks.d : new ArrayList(arrayList);
        this.f = arrayList2;
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013e, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        if (((defpackage.ng0) r10.get(r4)).e == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015d, code lost:
    
        r11 = (defpackage.ng0) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0165, code lost:
    
        if (r11.e != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0167, code lost:
    
        r11 = (defpackage.r90) r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        r4 = r17.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0173, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        defpackage.af.Q(r17.j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0188, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
    
        if (((defpackage.ng0) r11).e == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y(java.util.List r18, defpackage.ua0 r19) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl0.y(java.util.List, ua0):java.util.List");
    }

    public final oi z(oi oiVar, ua0 ua0Var) {
        ya0 ya0VarC;
        if (oiVar.w.F || oiVar.x == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.p;
        if (linkedHashSet == null || !linkedHashSet.contains(oiVar)) {
            ir irVar = new ir(5, oiVar);
            qx qxVar = new qx(1, oiVar, ua0Var);
            gv0 gv0VarK = ov0.k();
            ya0 ya0Var = gv0VarK instanceof ya0 ? (ya0) gv0VarK : null;
            if (ya0Var == null || (ya0VarC = ya0Var.C(irVar, qxVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                gv0 gv0VarJ = ya0VarC.j();
                if (ua0Var != null) {
                    try {
                        if (ua0Var.h()) {
                            ki kiVar = new ki(1, ua0Var, oiVar);
                            ci ciVar = oiVar.w;
                            if (ciVar.F) {
                                fi.c("Preparing a composition while composing is not supported");
                            }
                            ciVar.F = true;
                            try {
                                kiVar.a();
                                ciVar.F = false;
                            } catch (Throwable th) {
                                ciVar.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        gv0.q(gv0VarJ);
                        throw th2;
                    }
                }
                boolean zW = oiVar.w();
                gv0.q(gv0VarJ);
                if (zW) {
                    return oiVar;
                }
            } finally {
                r(ya0VarC);
            }
        }
        return null;
    }

    @Override // defpackage.hi
    public final void l(Set set) {
    }
}
