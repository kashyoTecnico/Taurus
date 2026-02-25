package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class y10 implements r10, bh0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(y10.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(y10.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public y10(boolean z) {
        this._state$volatile = z ? m20.j : m20.i;
    }

    public static be U(h60 h60Var) {
        while (h60Var.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h60.e;
            h60 h60VarF = h60Var.f();
            if (h60VarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(h60Var);
                while (true) {
                    h60Var = (h60) obj;
                    if (!h60Var.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(h60Var);
                }
            } else {
                h60Var = h60VarF;
            }
        }
        while (true) {
            h60Var = h60Var.h();
            if (!h60Var.i()) {
                if (h60Var instanceof be) {
                    return (be) h60Var;
                }
                if (h60Var instanceof pc0) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof x10)) {
            return obj instanceof bz ? ((bz) obj).b() ? "Active" : "New" : obj instanceof eg ? "Cancelled" : "Completed";
        }
        x10 x10Var = (x10) obj;
        return x10Var.e() ? "Cancelling" : x10.e.get(x10Var) != 0 ? "Completing" : "Active";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v11 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y10.A(java.lang.Object):boolean");
    }

    public void C(CancellationException cancellationException) {
        A(cancellationException);
    }

    public final boolean D(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ae aeVar = (ae) e.get(this);
        return (aeVar == null || aeVar == uc0.d) ? z : aeVar.c(th) || z;
    }

    public String E() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return A(th) && K();
    }

    public final void G(bz bzVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        ae aeVar = (ae) atomicReferenceFieldUpdater.get(this);
        if (aeVar != null) {
            aeVar.a();
            atomicReferenceFieldUpdater.set(this, uc0.d);
        }
        fg fgVar = null;
        eg egVar = obj instanceof eg ? (eg) obj : null;
        Throwable th = egVar != null ? egVar.a : null;
        if (bzVar instanceof u10) {
            try {
                ((u10) bzVar).l(th);
                return;
            } catch (Throwable th2) {
                O(new fg("Exception in completion handler " + bzVar + " for " + this, th2));
                return;
            }
        }
        pc0 pc0VarD = bzVar.d();
        if (pc0VarD != null) {
            pc0VarD.e(new y50(1), 1);
            Object obj2 = h60.d.get(pc0VarD);
            c10.n(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (h60 h60VarH = (h60) obj2; !h60VarH.equals(pc0VarD); h60VarH = h60VarH.h()) {
                if (h60VarH instanceof u10) {
                    try {
                        ((u10) h60VarH).l(th);
                    } catch (Throwable th3) {
                        if (fgVar != null) {
                            c10.h(fgVar, th3);
                        } else {
                            fgVar = new fg("Exception in completion handler " + h60VarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (fgVar != null) {
                O(fgVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    public final Throwable H(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        y10 y10Var = (y10) ((bh0) obj);
        Object obj2 = d.get(y10Var);
        if (obj2 instanceof x10) {
            cancellationExceptionC = ((x10) obj2).c();
        } else if (obj2 instanceof eg) {
            cancellationExceptionC = ((eg) obj2).a;
        } else {
            if (obj2 instanceof bz) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new s10("Parent job is ".concat(b0(obj2)), cancellationExceptionC, y10Var) : cancellationException;
    }

    public final Object I(x10 x10Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thJ;
        eg egVar = obj instanceof eg ? (eg) obj : null;
        Throwable th = egVar != null ? egVar.a : null;
        synchronized (x10Var) {
            x10Var.e();
            ArrayList arrayListF = x10Var.f(th);
            thJ = J(x10Var, arrayListF);
            if (thJ != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListF.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thJ && th2 != thJ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        c10.h(thJ, th2);
                    }
                }
            }
        }
        if (thJ != null && thJ != th) {
            obj = new eg(thJ, false);
        }
        if (thJ != null && (D(thJ) || N(thJ))) {
            c10.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            eg.b.compareAndSet((eg) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object czVar = obj instanceof bz ? new cz((bz) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x10Var, czVar) && atomicReferenceFieldUpdater.get(this) == x10Var) {
        }
        G(x10Var, obj);
        return obj;
    }

    public final Throwable J(x10 x10Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (x10Var.e()) {
                return new s10(E(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof q21) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof q21)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return this instanceof bg;
    }

    public final pc0 M(bz bzVar) {
        pc0 pc0VarD = bzVar.d();
        if (pc0VarD != null) {
            return pc0VarD;
        }
        if (bzVar instanceof fs) {
            return new pc0();
        }
        if (bzVar instanceof u10) {
            Z((u10) bzVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + bzVar).toString());
    }

    public boolean N(Throwable th) {
        return false;
    }

    public final void P(r10 r10Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        uc0 uc0Var = uc0.d;
        if (r10Var == null) {
            atomicReferenceFieldUpdater.set(this, uc0Var);
            return;
        }
        r10Var.start();
        ae aeVarJ = r10Var.j(this);
        atomicReferenceFieldUpdater.set(this, aeVarJ);
        if (d.get(this) instanceof bz) {
            return;
        }
        aeVarJ.a();
        atomicReferenceFieldUpdater.set(this, uc0Var);
    }

    public final cp Q(boolean z, u10 u10Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        uc0 uc0Var;
        boolean z2;
        boolean zE;
        u10Var.g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof fs;
            uc0Var = uc0.d;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof bz)) {
                    z2 = false;
                    break;
                }
                bz bzVar = (bz) obj;
                pc0 pc0VarD = bzVar.d();
                if (pc0VarD == null) {
                    Z((u10) obj);
                } else {
                    if (u10Var.k()) {
                        x10 x10Var = bzVar instanceof x10 ? (x10) bzVar : null;
                        Throwable thC = x10Var != null ? x10Var.c() : null;
                        if (thC == null) {
                            zE = pc0VarD.e(u10Var, 5);
                        } else if (z) {
                            u10Var.l(thC);
                            return uc0Var;
                        }
                    } else {
                        zE = pc0VarD.e(u10Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                fs fsVar = (fs) obj;
                if (fsVar.d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u10Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(fsVar);
            }
        }
        if (z2) {
            return u10Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            eg egVar = obj2 instanceof eg ? (eg) obj2 : null;
            u10Var.l(egVar != null ? egVar.a : null);
        }
        return uc0Var;
    }

    public boolean R() {
        return this instanceof va;
    }

    public final boolean S(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(d.get(this), obj);
            if (objC0 == m20.d) {
                return false;
            }
            if (objC0 == m20.e) {
                return true;
            }
        } while (objC0 == m20.f);
        y(objC0);
        return true;
    }

    public final Object T(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(d.get(this), obj);
            if (objC0 == m20.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                eg egVar = obj instanceof eg ? (eg) obj : null;
                throw new IllegalStateException(str, egVar != null ? egVar.a : null);
            }
        } while (objC0 == m20.f);
        return objC0;
    }

    public final void V(pc0 pc0Var, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        pc0Var.e(new y50(4), 4);
        Object obj = h60.d.get(pc0Var);
        c10.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        fg fgVar = null;
        for (h60 h60VarH = (h60) obj; !h60VarH.equals(pc0Var); h60VarH = h60VarH.h()) {
            if ((h60VarH instanceof u10) && ((u10) h60VarH).k()) {
                try {
                    ((u10) h60VarH).l(th);
                } catch (Throwable th2) {
                    if (fgVar != null) {
                        c10.h(fgVar, th2);
                    } else {
                        fgVar = new fg("Exception in completion handler " + h60VarH + " for " + this, th2);
                    }
                }
            }
        }
        if (fgVar != null) {
            O(fgVar);
        }
        D(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [az] */
    public final void Y(fs fsVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        pc0 pc0Var = new pc0();
        if (!fsVar.d) {
            pc0Var = new az(pc0Var);
        }
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, fsVar, pc0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == fsVar);
    }

    public final void Z(u10 u10Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        pc0 pc0Var = new pc0();
        u10Var.getClass();
        h60.e.set(pc0Var, u10Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h60.d;
        atomicReferenceFieldUpdater2.set(pc0Var, u10Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(u10Var) == u10Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u10Var, u10Var, pc0Var)) {
                    if (atomicReferenceFieldUpdater2.get(u10Var) != u10Var) {
                        break;
                    }
                }
                pc0Var.g(u10Var);
                break loop0;
            }
            break;
        }
        h60 h60VarH = u10Var.h();
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u10Var, h60VarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u10Var);
    }

    @Override // defpackage.r10, defpackage.ll0
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new s10(E(), null, this);
        }
        C(cancellationException);
    }

    public final int a0(Object obj) {
        boolean z = obj instanceof fs;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (z) {
            if (((fs) obj).d) {
                return 0;
            }
            fs fsVar = m20.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, fsVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            X();
            return 1;
        }
        if (!(obj instanceof az)) {
            return 0;
        }
        pc0 pc0Var = ((az) obj).d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pc0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        X();
        return 1;
    }

    @Override // defpackage.r10
    public boolean b() {
        Object obj = d.get(this);
        return (obj instanceof bz) && ((bz) obj).b();
    }

    public final Object c0(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!(obj instanceof bz)) {
            return m20.d;
        }
        if (((obj instanceof fs) || (obj instanceof u10)) && !(obj instanceof be) && !(obj2 instanceof eg)) {
            bz bzVar = (bz) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object czVar = obj2 instanceof bz ? new cz((bz) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, bzVar, czVar)) {
                if (atomicReferenceFieldUpdater.get(this) != bzVar) {
                    return m20.f;
                }
            }
            W(obj2);
            G(bzVar, obj2);
            return obj2;
        }
        bz bzVar2 = (bz) obj;
        pc0 pc0VarM = M(bzVar2);
        if (pc0VarM == null) {
            return m20.f;
        }
        x10 x10Var = bzVar2 instanceof x10 ? (x10) bzVar2 : null;
        if (x10Var == null) {
            x10Var = new x10(pc0VarM, null);
        }
        synchronized (x10Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x10.e;
            if (atomicIntegerFieldUpdater.get(x10Var) != 0) {
                return m20.d;
            }
            atomicIntegerFieldUpdater.set(x10Var, 1);
            if (x10Var != bzVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, bzVar2, x10Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != bzVar2) {
                        return m20.f;
                    }
                }
            }
            boolean zE = x10Var.e();
            eg egVar = obj2 instanceof eg ? (eg) obj2 : null;
            if (egVar != null) {
                x10Var.a(egVar.a);
            }
            Throwable thC = zE ? null : x10Var.c();
            if (thC != null) {
                V(pc0VarM, thC);
            }
            be beVarU = U(pc0VarM);
            if (beVarU != null && d0(x10Var, beVarU, obj2)) {
                return m20.e;
            }
            pc0VarM.e(new y50(2), 2);
            be beVarU2 = U(pc0VarM);
            return (beVarU2 == null || !d0(x10Var, beVarU2, obj2)) ? I(x10Var, obj2) : m20.e;
        }
    }

    public final boolean d0(x10 x10Var, be beVar, Object obj) {
        while (c4.v(beVar.h, false, new w10(this, x10Var, beVar, obj)) == uc0.d) {
            beVar = U(beVar);
            if (beVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.kl
    public final ll getKey() {
        return g2.E;
    }

    @Override // defpackage.r10
    public final cp i(boolean z, boolean z2, zu zuVar) {
        return Q(z2, z ? new n10(zuVar) : new o10(0, zuVar));
    }

    @Override // defpackage.r10
    public final ae j(y10 y10Var) {
        be beVar = new be(y10Var);
        beVar.g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof fs) {
                fs fsVar = (fs) obj;
                if (fsVar.d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, beVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(fsVar);
            } else {
                boolean z = obj instanceof bz;
                uc0 uc0Var = uc0.d;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    eg egVar = obj2 instanceof eg ? (eg) obj2 : null;
                    beVar.l(egVar != null ? egVar.a : null);
                    return uc0Var;
                }
                pc0 pc0VarD = ((bz) obj).d();
                if (pc0VarD == null) {
                    Z((u10) obj);
                } else if (!pc0VarD.e(beVar, 7)) {
                    boolean zE = pc0VarD.e(beVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof x10) {
                        thC = ((x10) obj3).c();
                    } else {
                        eg egVar2 = obj3 instanceof eg ? (eg) obj3 : null;
                        if (egVar2 != null) {
                            thC = egVar2.a;
                        }
                    }
                    beVar.l(thC);
                    if (zE) {
                        break loop0;
                    }
                    return uc0Var;
                }
            }
        }
        return beVar;
    }

    @Override // defpackage.ml
    public final ml k(ml mlVar) {
        return d80.v(this, mlVar);
    }

    @Override // defpackage.ml
    public final kl n(ll llVar) {
        return d80.r(this, llVar);
    }

    @Override // defpackage.r10
    public final CancellationException q() {
        CancellationException cancellationException;
        Object obj = d.get(this);
        if (!(obj instanceof x10)) {
            if (obj instanceof bz) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof eg)) {
                return new s10(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((eg) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new s10(E(), th, this) : cancellationException;
        }
        Throwable thC = ((x10) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = E();
        }
        return new s10(strConcat, thC, this);
    }

    @Override // defpackage.ml
    public final Object r(kw kwVar, Object obj) {
        return kwVar.e(obj, this);
    }

    @Override // defpackage.r10
    public final boolean start() {
        int iA0;
        do {
            iA0 = a0(d.get(this));
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    @Override // defpackage.r10
    public final cp t(iw iwVar) {
        return Q(true, new o10(0, iwVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + b0(d.get(this)) + '}');
        sb.append('@');
        sb.append(nm.t(this));
        return sb.toString();
    }

    @Override // defpackage.ml
    public final ml v(ll llVar) {
        return d80.u(this, llVar);
    }

    @Override // defpackage.r10
    public final Object x(mk mkVar) {
        Object obj;
        j41 j41Var;
        do {
            obj = d.get(this);
            boolean z = obj instanceof bz;
            j41Var = j41.a;
            if (!z) {
                c4.o(mkVar.f());
                return j41Var;
            }
        } while (a0(obj) < 0);
        ad adVar = new ad(1, r31.I(mkVar));
        adVar.t();
        adVar.w(new wc(1, c4.v(this, true, new zd(adVar, 1))));
        Object objS = adVar.s();
        xl xlVar = xl.d;
        if (objS != xlVar) {
            objS = j41Var;
        }
        return objS == xlVar ? objS : j41Var;
    }

    public void z(Object obj) {
        y(obj);
    }

    public void X() {
    }

    public void O(fg fgVar) {
        throw fgVar;
    }

    public void W(Object obj) {
    }

    public void y(Object obj) {
    }
}
