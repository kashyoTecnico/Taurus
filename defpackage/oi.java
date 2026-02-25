package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oi implements gi {
    public final hi d;
    public final e9 e;
    public final AtomicReference f = new AtomicReference(null);
    public final Object g = new Object();
    public final wa0 h;
    public final bv0 i;
    public final ta0 j;
    public final ua0 k;
    public final ua0 l;
    public final ta0 m;
    public final jd n;
    public final jd o;
    public final ta0 p;
    public ta0 q;
    public boolean r;
    public oi s;
    public int t;
    public final r1 u;
    public final hm0 v;
    public final ci w;
    public int x;

    public oi(hi hiVar, e9 e9Var) {
        this.d = hiVar;
        this.e = e9Var;
        wa0 wa0Var = new wa0(new ua0());
        this.h = wa0Var;
        bv0 bv0Var = new bv0();
        if (hiVar.c()) {
            bv0Var.n = new da0();
        }
        if (hiVar.e()) {
            bv0Var.b();
        }
        this.i = bv0Var;
        this.j = n2.c();
        this.k = new ua0();
        this.l = new ua0();
        this.m = n2.c();
        jd jdVar = new jd();
        this.n = jdVar;
        jd jdVar2 = new jd();
        this.o = jdVar2;
        this.p = n2.c();
        this.q = n2.c();
        r1 r1Var = new r1(5, hiVar);
        this.u = r1Var;
        this.v = new hm0();
        ci ciVar = new ci(e9Var, hiVar, bv0Var, wa0Var, jdVar, jdVar2, r1Var, this);
        hiVar.m(ciVar);
        this.w = ciVar;
        int i = dh.a;
    }

    public final void A(kw kwVar) {
        boolean zI = i();
        p();
        hi hiVar = this.d;
        if (!zI) {
            hiVar.a(this, kwVar);
            return;
        }
        ci ciVar = this.w;
        ciVar.z = 100;
        ciVar.y = true;
        hiVar.a(this, kwVar);
        ciVar.s();
    }

    public final void a() {
        this.f.set(null);
        this.n.j.K();
        this.o.j.K();
        wa0 wa0Var = this.h;
        if (wa0Var.d.g()) {
            return;
        }
        hm0 hm0Var = this.v;
        try {
            hm0Var.e(wa0Var, this.w.y());
            hm0Var.b();
        } finally {
            hm0Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.j.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof ua0;
        m10 m10Var = m10.d;
        ua0 ua0Var = this.k;
        ua0 ua0Var2 = this.l;
        ta0 ta0Var = this.p;
        if (!z2) {
            nl0 nl0Var = (nl0) objG;
            if (n2.k(ta0Var, obj, nl0Var) || nl0Var.c(obj) == m10Var) {
                return;
            }
            if (nl0Var.g == null || z) {
                ua0Var.a(nl0Var);
                return;
            } else {
                ua0Var2.a(nl0Var);
                return;
            }
        }
        ua0 ua0Var3 = (ua0) objG;
        Object[] objArr = ua0Var3.b;
        long[] jArr = ua0Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        nl0 nl0Var2 = (nl0) objArr[(i << 3) + i3];
                        if (!n2.k(ta0Var, obj, nl0Var2) && nl0Var2.c(obj) != m10Var) {
                            if (nl0Var2.g == null || z) {
                                ua0Var.a(nl0Var2);
                            } else {
                                ua0Var2.a(nl0Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.g) {
            try {
                e(this.n);
                n();
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        hm0 hm0Var = this.v;
                        try {
                            hm0Var.e(this.h, this.w.y());
                            hm0Var.b();
                            hm0Var.a();
                        } catch (Throwable th2) {
                            hm0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void e(jd jdVar) throws Throwable {
        hm0 hm0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        hm0 hm0Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        int i3;
        jd jdVar2 = this.o;
        ci ciVar = this.w;
        li liVarY = ciVar.y();
        hm0 hm0Var3 = this.v;
        hm0Var3.e(this.h, liVarY);
        try {
            if (jdVar.j.M()) {
                try {
                    if (jdVar2.j.M()) {
                        hm0Var3.b();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    e9 e9Var = this.e;
                    ev0 ev0VarD = this.i.d();
                    int i4 = 0;
                    try {
                        jdVar.K(e9Var, ev0VarD, hm0Var3, ciVar.y());
                        ev0VarD.e(true);
                        e9Var.g();
                        Trace.endSection();
                        hm0Var3.c();
                        eb0 eb0Var = hm0Var3.g;
                        if (eb0Var.f != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = eb0Var.d;
                                int i5 = eb0Var.f;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((gw) objArr[i6]).a();
                                }
                                eb0Var.g();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.r = false;
                                ta0 ta0Var = this.j;
                                long[] jArr3 = ta0Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j3 = jArr3[i7];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8;
                                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                                            int i10 = i4;
                                            while (i10 < i9) {
                                                if ((j3 & 255) < 128) {
                                                    c = c2;
                                                    int i11 = (i7 << 3) + i10;
                                                    j2 = j4;
                                                    Object obj = ta0Var.b[i11];
                                                    Object obj2 = ta0Var.c[i11];
                                                    if (obj2 instanceof ua0) {
                                                        ua0 ua0Var = (ua0) obj2;
                                                        Object[] objArr2 = ua0Var.b;
                                                        long[] jArr4 = ua0Var.a;
                                                        int i12 = i8;
                                                        int length2 = jArr4.length - 2;
                                                        if (length2 >= 0) {
                                                            jArr2 = jArr3;
                                                            hm0Var2 = hm0Var3;
                                                            int i13 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j5 = jArr4[i13];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                                        int i15 = 0;
                                                                        while (i15 < i14) {
                                                                            if ((j5 & 255) < 128) {
                                                                                i3 = i10;
                                                                                int i16 = (i13 << 3) + i15;
                                                                                if (!((nl0) objArr2[i16]).b()) {
                                                                                    ua0Var.l(i16);
                                                                                }
                                                                            } else {
                                                                                i3 = i10;
                                                                            }
                                                                            j5 >>= i12;
                                                                            i15++;
                                                                            i10 = i3;
                                                                        }
                                                                        i = i10;
                                                                        if (i14 != i12) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        i = i10;
                                                                    }
                                                                    if (i13 == length2) {
                                                                        break;
                                                                    }
                                                                    i13++;
                                                                    j3 = j;
                                                                    i10 = i;
                                                                    i12 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i = i10;
                                                            jArr2 = jArr3;
                                                            hm0Var2 = hm0Var3;
                                                            j = j3;
                                                        }
                                                        zG = ua0Var.g();
                                                    } else {
                                                        i = i10;
                                                        jArr2 = jArr3;
                                                        hm0Var2 = hm0Var3;
                                                        j = j3;
                                                        c10.n(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zG = !((nl0) obj2).b();
                                                    }
                                                    if (zG) {
                                                        ta0Var.k(i11);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i10;
                                                    jArr2 = jArr3;
                                                    hm0Var2 = hm0Var3;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i2 = i8;
                                                }
                                                j3 = j >> i2;
                                                i8 = i2;
                                                c2 = c;
                                                j4 = j2;
                                                hm0Var3 = hm0Var2;
                                                jArr3 = jArr2;
                                                i10 = i + 1;
                                            }
                                            jArr = jArr3;
                                            hm0Var = hm0Var3;
                                            if (i9 != i8) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            hm0Var = hm0Var3;
                                        }
                                        if (i7 == length) {
                                            break;
                                        }
                                        i7++;
                                        hm0Var3 = hm0Var;
                                        jArr3 = jArr;
                                        i4 = 0;
                                    }
                                } else {
                                    hm0Var = hm0Var3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            hm0Var = hm0Var3;
                        }
                        try {
                            if (jdVar2.j.M()) {
                                hm0Var.b();
                            }
                        } finally {
                            hm0Var.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            ev0VarD.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (jdVar2.j.M()) {
                        hm0Var3.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void f() {
        synchronized (this.g) {
            try {
                if (this.o.j.N()) {
                    e(this.o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        hm0 hm0Var = this.v;
                        try {
                            hm0Var.e(this.h, this.w.y());
                            hm0Var.b();
                            hm0Var.a();
                        } catch (Throwable th2) {
                            hm0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        hm0 hm0Var;
        synchronized (this.g) {
            try {
                this.w.v = null;
                if (!this.h.d.g()) {
                    hm0Var = this.v;
                    try {
                        hm0Var.e(this.h, this.w.y());
                        hm0Var.b();
                        hm0Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        hm0Var = this.v;
                        try {
                            hm0Var.e(this.h, this.w.y());
                            hm0Var.b();
                            hm0Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.h():void");
    }

    public final boolean i() {
        boolean z;
        synchronized (this.g) {
            z = true;
            if (this.x != 1) {
                z = false;
            }
            if (z) {
                this.x = 0;
            }
        }
        return z;
    }

    public final void j(kw kwVar) {
        try {
            synchronized (this.g) {
                m();
                ta0 ta0Var = this.q;
                this.q = n2.c();
                try {
                    ci ciVar = this.w;
                    if (!ciVar.e.j.M()) {
                        fi.c("Expected applyChanges() to have been called");
                    }
                    ciVar.P = null;
                    try {
                        ciVar.n(ta0Var, kwVar);
                    } finally {
                        ciVar.P = null;
                    }
                } catch (Throwable th) {
                    this.q = ta0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.h.d.g()) {
                    hm0 hm0Var = this.v;
                    try {
                        hm0Var.e(this.h, this.w.y());
                        hm0Var.b();
                        hm0Var.a();
                    } catch (Throwable th3) {
                        hm0Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final void k() {
        synchronized (this.g) {
            try {
                boolean z = this.i.e > 0;
                if (z || !this.h.d.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        hm0 hm0Var = this.v;
                        try {
                            hm0Var.e(this.h, this.w.y());
                            if (z) {
                                ev0 ev0VarD = this.i.d();
                                try {
                                    ev0VarD.n(ev0VarD.t, new ei(this.v, ev0VarD));
                                    ev0VarD.e(true);
                                    this.e.g();
                                    hm0Var.c();
                                } catch (Throwable th) {
                                    ev0VarD.e(false);
                                    throw th;
                                }
                            }
                            hm0Var.b();
                            hm0Var.a();
                        } catch (Throwable th2) {
                            hm0Var.a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.j.a();
                this.m.a();
                this.q.a();
                this.n.j.K();
                this.o.j.K();
                ci ciVar = this.w;
                ciVar.E.clear();
                ciVar.s.clear();
                ciVar.e.j.K();
                ciVar.v = null;
                this.x = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.g) {
            try {
                if (this.w.F) {
                    zj0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.x != 3) {
                    this.x = 3;
                    int i = dh.a;
                    jd jdVar = this.w.L;
                    if (jdVar != null) {
                        e(jdVar);
                    }
                    int i2 = 1;
                    boolean z = this.i.e > 0;
                    if (z || !this.h.d.g()) {
                        hm0 hm0Var = this.v;
                        try {
                            hm0Var.e(this.h, this.w.y());
                            if (z) {
                                ev0 ev0VarD = this.i.d();
                                try {
                                    ev0VarD.n(ev0VarD.t, new c6(i2, this.v));
                                    ev0VarD.G();
                                    ev0VarD.e(true);
                                    this.e.b();
                                    this.e.g();
                                    hm0Var.c();
                                } catch (Throwable th) {
                                    ev0VarD.e(false);
                                    throw th;
                                }
                            }
                            hm0Var.b();
                            hm0Var.a();
                        } catch (Throwable th2) {
                            hm0Var.a();
                            throw th2;
                        }
                    }
                    ci ciVar = this.w;
                    ciVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        ciVar.b.p(ciVar);
                        ciVar.E.clear();
                        ciVar.s.clear();
                        ciVar.e.j.K();
                        ciVar.v = null;
                        ciVar.a.b();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.d.q(this);
    }

    public final void m() {
        Object obj = l81.a;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                fi.d("pending composition has not been applied");
                throw new fg();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                fi.d("corrupt pendingModifications drain: " + atomicReference);
                throw new fg();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(null);
        if (c10.i(andSet, l81.a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            fi.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new fg();
        }
        fi.d("corrupt pendingModifications drain: " + atomicReference);
        throw new fg();
    }

    public final void o() {
        os osVar = os.d;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(osVar);
        if (c10.i(andSet, l81.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            fi.d("corrupt pendingModifications drain: " + atomicReference);
            throw new fg();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p() {
        int i = this.x;
        if (i == 0) {
            return;
        }
        zj0.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
    }

    public final void q(ArrayList arrayList) {
        wa0 wa0Var = this.h;
        ci ciVar = this.w;
        if (arrayList.size() > 0) {
            ((r90) ((ng0) arrayList.get(0)).d).getClass();
            throw null;
        }
        try {
            ciVar.getClass();
            try {
                ciVar.A(arrayList);
                ciVar.i();
            } catch (Throwable th) {
                ciVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!wa0Var.d.g()) {
                    hm0 hm0Var = this.v;
                    try {
                        hm0Var.e(wa0Var, ciVar.y());
                        hm0Var.b();
                        hm0Var.a();
                    } catch (Throwable th3) {
                        hm0Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final m10 r(nl0 nl0Var, Object obj) {
        oi oiVar;
        int i = nl0Var.b;
        if ((i & 2) != 0) {
            nl0Var.b = i | 4;
        }
        m2 m2Var = nl0Var.c;
        if (m2Var == null || !m2Var.a()) {
            return m10.d;
        }
        if (this.i.e(m2Var)) {
            if (nl0Var.d == null) {
                return m10.d;
            }
            m10 m10VarT = t(nl0Var, m2Var, obj);
            if (m10VarT != m10.d) {
                this.u.k();
            }
            return m10VarT;
        }
        synchronized (this.g) {
            oiVar = this.s;
        }
        if (oiVar != null) {
            ci ciVar = oiVar.w;
            if (ciVar.F && ciVar.Z(nl0Var, obj)) {
                return m10.g;
            }
        }
        return m10.d;
    }

    public final void s() {
        oi oiVar;
        synchronized (this.g) {
            try {
                for (Object obj : this.i.f) {
                    nl0 nl0Var = obj instanceof nl0 ? (nl0) obj : null;
                    if (nl0Var != null && (oiVar = nl0Var.a) != null) {
                        oiVar.r(nl0Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:80:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], EDGE_INSN: B:81:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.m10 t(defpackage.nl0 r21, defpackage.m2 r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.t(nl0, m2, java.lang.Object):m10");
    }

    public final void u(Object obj) {
        Object objG = this.j.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof ua0;
        ta0 ta0Var = this.p;
        if (!z) {
            nl0 nl0Var = (nl0) objG;
            if (nl0Var.c(obj) == m10.g) {
                n2.a(ta0Var, obj, nl0Var);
                return;
            }
            return;
        }
        ua0 ua0Var = (ua0) objG;
        Object[] objArr = ua0Var.b;
        long[] jArr = ua0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        nl0 nl0Var2 = (nl0) objArr[(i << 3) + i3];
                        if (nl0Var2.c(obj) == m10.g) {
                            n2.a(ta0Var, obj, nl0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.gq0
            ta0 r3 = r0.m
            ta0 r0 = r0.j
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            gq0 r1 = (defpackage.gq0) r1
            ua0 r1 = r1.d
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.v(java.util.Set):boolean");
    }

    public final boolean w() {
        boolean zN;
        synchronized (this.g) {
            m();
            try {
                ta0 ta0Var = this.q;
                this.q = n2.c();
                try {
                    ci ciVar = this.w;
                    gf0 gf0Var = ciVar.e.j;
                    if (!gf0Var.M()) {
                        fi.c("Expected applyChanges() to have been called");
                    }
                    if (ta0Var.e > 0 || !ciVar.s.isEmpty()) {
                        ciVar.P = null;
                        try {
                            ciVar.n(ta0Var, null);
                            ciVar.P = null;
                            zN = gf0Var.N();
                        } catch (Throwable th) {
                            ciVar.P = null;
                            throw th;
                        }
                    } else {
                        zN = false;
                    }
                    if (!zN) {
                        n();
                    }
                } catch (Throwable th2) {
                    this.q = ta0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.h.d.g()) {
                        hm0 hm0Var = this.v;
                        try {
                            hm0Var.e(this.h, this.w.y());
                            hm0Var.b();
                            hm0Var.a();
                        } catch (Throwable th4) {
                            hm0Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
        return zN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    public final void x(gq0 gq0Var) {
        gq0 gq0Var2;
        while (true) {
            Object obj = this.f.get();
            if (obj == null || obj.equals(l81.a)) {
                gq0Var2 = gq0Var;
            } else if (obj instanceof Set) {
                gq0Var2 = new Set[]{obj, gq0Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = gq0Var;
                gq0Var2 = CopyOf;
            }
            AtomicReference atomicReference = this.f;
            while (!atomicReference.compareAndSet(obj, gq0Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.g) {
                    n();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.y(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.g
            monitor-enter(r0)
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
            ta0 r1 = r14.m     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof defpackage.ua0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            ua0 r15 = (defpackage.ua0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            fo r10 = (defpackage.fo) r10     // Catch: java.lang.Throwable -> L4f
            r14.u(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            fo r15 = (defpackage.fo) r15     // Catch: java.lang.Throwable -> L4f
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.z(java.lang.Object):void");
    }
}
