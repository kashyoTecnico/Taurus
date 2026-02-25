package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class st0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(st0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(st0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(st0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(st0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(st0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final zc a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public st0() {
        ut0 ut0Var = new ut0(0L, null, 2);
        this.head$volatile = ut0Var;
        this.tail$volatile = ut0Var;
        this._availablePermits$volatile = 1;
        this.a = new zc(2, this);
    }

    public final void a(nb0 nb0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objP;
        ut0 ut0Var;
        ad adVar = nb0Var.d;
        ob0 ob0Var = nb0Var.e;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                j41 j41Var = j41.a;
                if (andDecrement > 0) {
                    ob0.g.set(ob0Var, null);
                    adVar.D(j41Var, adVar.f, new zc(0, new ir(4, ob0Var, nb0Var)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                ut0 ut0Var2 = (ut0) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                qt0 qt0Var = qt0.l;
                long j = andIncrement / tt0.f;
                while (true) {
                    objP = c4.p(ut0Var2, j, qt0Var);
                    if (!no0.s(objP)) {
                        or0 or0VarL = no0.l(objP);
                        while (true) {
                            or0 or0Var = (or0) atomicReferenceFieldUpdater.get(this);
                            ut0Var = ut0Var2;
                            if (or0Var.c >= or0VarL.c) {
                                break;
                            }
                            if (!or0VarL.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, or0Var, or0VarL)) {
                                if (atomicReferenceFieldUpdater.get(this) != or0Var) {
                                    if (or0VarL.e()) {
                                        or0VarL.d();
                                    }
                                    ut0Var2 = ut0Var;
                                }
                            }
                            if (or0Var.e()) {
                                or0Var.d();
                            }
                        }
                    } else {
                        break;
                    }
                    ut0Var2 = ut0Var;
                }
                ut0 ut0Var3 = (ut0) no0.l(objP);
                AtomicReferenceArray atomicReferenceArray = ut0Var3.e;
                int i = (int) (andIncrement % tt0.f);
                while (!atomicReferenceArray.compareAndSet(i, null, nb0Var)) {
                    if (atomicReferenceArray.get(i) != null) {
                        cs csVar = tt0.b;
                        cs csVar2 = tt0.c;
                        while (!atomicReferenceArray.compareAndSet(i, csVar, csVar2)) {
                            if (atomicReferenceArray.get(i) != csVar) {
                                break;
                            }
                        }
                        ob0.g.set(ob0Var, null);
                        adVar.D(j41Var, adVar.f, new zc(0, new ir(4, ob0Var, nb0Var)));
                        return;
                    }
                }
                nb0Var.a(ut0Var3, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st0.b():void");
    }
}
