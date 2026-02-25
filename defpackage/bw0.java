package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bw0 {
    public final y20 a;
    public boolean c;
    public pd0 h;
    public aw0 i;
    public final AtomicReference b = new AtomicReference(null);
    public final c6 d = new c6(5, this);
    public final ir e = new ir(9, this);
    public final eb0 f = new eb0(new aw0[16]);
    public final Object g = new Object();
    public long j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public bw0(iw iwVar) {
        this.a = (y20) iwVar;
    }

    public final void a() {
        synchronized (this.g) {
            eb0 eb0Var = this.f;
            Object[] objArr = eb0Var.d;
            int i = eb0Var.f;
            for (int i2 = 0; i2 < i; i2++) {
                aw0 aw0Var = (aw0) objArr[i2];
                aw0Var.e.a();
                aw0Var.f.a();
                aw0Var.k.a();
                aw0Var.l.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List listSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        fi.d("Unexpected notification");
                        throw new fg();
                    }
                    List list2 = (List) obj;
                    Set set3 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        listSubList = list2.get(1);
                    } else if (list2.size() > 2) {
                        listSubList = list2.subList(1, list2.size());
                    }
                    set2 = set3;
                    list = listSubList;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                eb0 eb0Var = this.f;
                Object[] objArr = eb0Var.d;
                int i = eb0Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((aw0) objArr[i2]).b(set) || z2;
                }
            }
        }
    }

    public final void c(Object obj, iw iwVar, gw gwVar) {
        Object obj2;
        aw0 aw0Var;
        synchronized (this.g) {
            eb0 eb0Var = this.f;
            Object[] objArr = eb0Var.d;
            int i = eb0Var.f;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((aw0) obj2).a == iwVar) {
                    break;
                } else {
                    i2++;
                }
            }
            aw0Var = (aw0) obj2;
            if (aw0Var == null) {
                c10.n(iwVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                r31.m(1, iwVar);
                aw0Var = new aw0(iwVar);
                eb0Var.b(aw0Var);
            }
        }
        aw0 aw0Var2 = this.i;
        long j = this.j;
        if (j != -1 && j != dq0.d()) {
            zj0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + dq0.d() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = aw0Var;
            this.j = dq0.d();
            aw0Var.a(obj, this.e, gwVar);
        } finally {
            this.i = aw0Var2;
            this.j = j;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        c6 c6Var = this.d;
        ov0.f(ov0.a);
        synchronized (ov0.c) {
            ov0.h = ue.Z(ov0.h, c6Var);
        }
        this.h = new pd0(c6Var);
    }
}
