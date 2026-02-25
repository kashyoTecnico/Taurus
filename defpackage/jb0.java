package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jb0 extends jy0 implements kw {
    public mb0 h;
    public Object i;
    public hn j;
    public kb0 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ int n;
    public final /* synthetic */ kb0 o;
    public final /* synthetic */ ob p;
    public final /* synthetic */ hn q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(int i, kb0 kb0Var, ob obVar, hn hnVar, lk lkVar) {
        super(2, lkVar);
        this.n = i;
        this.o = kb0Var;
        this.p = obVar;
        this.q = hnVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((jb0) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        jb0 jb0Var = new jb0(this.n, this.o, this.p, this.q, lkVar);
        jb0Var.m = obj;
        return jb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [kw] */
    /* JADX WARN: Type inference failed for: r6v5, types: [mb0] */
    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        hb0 hb0Var;
        kb0 kb0Var;
        ob0 ob0Var;
        ob obVar;
        hn hnVar;
        Throwable th;
        hb0 hb0Var2;
        kb0 kb0Var2;
        mb0 mb0Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.l;
        xl xlVar = xl.d;
        try {
            try {
                if (i == 0) {
                    c10.X(obj);
                    kl klVarN = ((wl) this.m).g().n(g2.E);
                    c10.m(klVarN);
                    hb0Var = new hb0(this.n, (r10) klVarN);
                    kb0Var = this.o;
                    AtomicReference atomicReference3 = kb0Var.a;
                    while (true) {
                        hb0 hb0Var3 = (hb0) atomicReference3.get();
                        if (hb0Var3 != null && b8.a(hb0Var.a, hb0Var3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(hb0Var3, hb0Var)) {
                            if (atomicReference3.get() != hb0Var3) {
                                break;
                            }
                        }
                        if (hb0Var3 != null) {
                            hb0Var3.b.a(new yd("Mutation interrupted", 1));
                        }
                        ob0Var = kb0Var.b;
                        this.m = hb0Var;
                        this.h = ob0Var;
                        obVar = this.p;
                        this.i = obVar;
                        hn hnVar2 = this.q;
                        this.j = hnVar2;
                        this.k = kb0Var;
                        this.l = 1;
                        if (ob0Var.c(this) != xlVar) {
                            hnVar = hnVar2;
                        }
                    }
                    return xlVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kb0Var2 = (kb0) this.i;
                    mb0Var = this.h;
                    hb0Var2 = (hb0) this.m;
                    try {
                        c10.X(obj);
                        atomicReference2 = kb0Var2.a;
                        while (!atomicReference2.compareAndSet(hb0Var2, null) && atomicReference2.get() == hb0Var2) {
                        }
                        ((ob0) mb0Var).d(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = kb0Var2.a;
                        while (!atomicReference.compareAndSet(hb0Var2, null)) {
                        }
                        throw th;
                    }
                }
                kb0 kb0Var3 = this.k;
                hnVar = this.j;
                ?? r5 = (kw) this.i;
                ?? r6 = this.h;
                hb0 hb0Var4 = (hb0) this.m;
                c10.X(obj);
                obVar = r5;
                ob0Var = r6;
                kb0Var = kb0Var3;
                hb0Var = hb0Var4;
                this.m = hb0Var;
                this.h = ob0Var;
                this.i = kb0Var;
                this.j = null;
                this.k = null;
                this.l = 2;
                Object objE = obVar.e(hnVar, this);
                if (objE != xlVar) {
                    kb0 kb0Var4 = kb0Var;
                    obj = objE;
                    hb0Var2 = hb0Var;
                    kb0Var2 = kb0Var4;
                    mb0Var = ob0Var;
                    atomicReference2 = kb0Var2.a;
                    while (!atomicReference2.compareAndSet(hb0Var2, null)) {
                    }
                    ((ob0) mb0Var).d(null);
                    return obj;
                }
                return xlVar;
            } catch (Throwable th3) {
                kb0 kb0Var5 = kb0Var;
                th = th3;
                hb0Var2 = hb0Var;
                kb0Var2 = kb0Var5;
                atomicReference = kb0Var2.a;
                while (!atomicReference.compareAndSet(hb0Var2, null) && atomicReference.get() == hb0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((ob0) 2).d(null);
            throw th4;
        }
    }
}
