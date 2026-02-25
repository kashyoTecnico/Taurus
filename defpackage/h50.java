package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h50 extends a50 {
    public final boolean a;
    public ct b;
    public z40 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final zw0 i;

    public h50(f50 f50Var) {
        new AtomicReference(null);
        this.a = true;
        this.b = new ct();
        z40 z40Var = z40.e;
        this.c = z40Var;
        this.h = new ArrayList();
        this.d = new WeakReference(f50Var);
        this.i = d80.f(z40Var);
    }

    @Override // defpackage.a50
    public final void a(e50 e50Var) {
        d50 enVar;
        g50 g50Var;
        f50 f50Var;
        c10.p(e50Var, "observer");
        d("addObserver");
        z40 z40Var = this.c;
        z40 z40Var2 = z40.d;
        if (z40Var != z40Var2) {
            z40Var2 = z40.e;
        }
        g50 g50Var2 = new g50();
        HashMap map = i50.a;
        boolean z = e50Var instanceof d50;
        boolean z2 = e50Var instanceof cn;
        int i = 2;
        if (z && z2) {
            enVar = new en((cn) e50Var, (d50) e50Var);
        } else if (z2) {
            enVar = new en((cn) e50Var, (d50) null);
        } else if (z) {
            enVar = (d50) e50Var;
        } else {
            Class<?> cls = e50Var.getClass();
            if (i50.c(cls) == 2) {
                Object obj = i50.b.get(cls);
                c10.m(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    i50.a((Constructor) list.get(0), e50Var);
                    throw null;
                }
                int size = list.size();
                uw[] uwVarArr = new uw[size];
                if (size > 0) {
                    i50.a((Constructor) list.get(0), e50Var);
                    throw null;
                }
                enVar = new wl0(i, uwVarArr);
            } else {
                enVar = new en(e50Var);
            }
        }
        g50Var2.b = enVar;
        g50Var2.a = z40Var2;
        ct ctVar = this.b;
        wo0 wo0Var = (wo0) ctVar.h.get(e50Var);
        if (wo0Var != null) {
            g50Var = wo0Var.e;
        } else {
            HashMap map2 = ctVar.h;
            wo0 wo0Var2 = new wo0(e50Var, g50Var2);
            ctVar.g++;
            wo0 wo0Var3 = ctVar.e;
            if (wo0Var3 == null) {
                ctVar.d = wo0Var2;
                ctVar.e = wo0Var2;
            } else {
                wo0Var3.f = wo0Var2;
                wo0Var2.g = wo0Var3;
                ctVar.e = wo0Var2;
            }
            map2.put(e50Var, wo0Var2);
            g50Var = null;
        }
        if (g50Var == null && (f50Var = (f50) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            z40 z40VarC = c(e50Var);
            this.e++;
            while (g50Var2.a.compareTo(z40VarC) < 0 && this.b.h.containsKey(e50Var)) {
                z40 z40Var3 = g50Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(z40Var3);
                w40 w40Var = y40.Companion;
                z40 z40Var4 = g50Var2.a;
                w40Var.getClass();
                c10.p(z40Var4, "state");
                int iOrdinal = z40Var4.ordinal();
                y40 y40Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : y40.ON_RESUME : y40.ON_START : y40.ON_CREATE;
                if (y40Var == null) {
                    throw new IllegalStateException("no event up from " + g50Var2.a);
                }
                g50Var2.a(f50Var, y40Var);
                arrayList.remove(arrayList.size() - 1);
                z40VarC = c(e50Var);
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    @Override // defpackage.a50
    public final void b(e50 e50Var) {
        c10.p(e50Var, "observer");
        d("removeObserver");
        ct ctVar = this.b;
        WeakHashMap weakHashMap = ctVar.f;
        HashMap map = ctVar.h;
        wo0 wo0Var = (wo0) map.get(e50Var);
        if (wo0Var != null) {
            ctVar.g--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((yo0) it.next()).a(wo0Var);
                }
            }
            wo0 wo0Var2 = wo0Var.g;
            if (wo0Var2 != null) {
                wo0Var2.f = wo0Var.f;
            } else {
                ctVar.d = wo0Var.f;
            }
            wo0 wo0Var3 = wo0Var.f;
            if (wo0Var3 != null) {
                wo0Var3.g = wo0Var2;
            } else {
                ctVar.e = wo0Var2;
            }
            wo0Var.f = null;
            wo0Var.g = null;
        }
        map.remove(e50Var);
    }

    public final z40 c(e50 e50Var) {
        HashMap map = this.b.h;
        wo0 wo0Var = map.containsKey(e50Var) ? ((wo0) map.get(e50Var)).g : null;
        z40 z40Var = wo0Var != null ? wo0Var.e.a : null;
        ArrayList arrayList = this.h;
        z40 z40Var2 = arrayList.isEmpty() ? null : (z40) arrayList.get(arrayList.size() - 1);
        z40 z40Var3 = this.c;
        c10.p(z40Var3, "state1");
        if (z40Var == null || z40Var.compareTo(z40Var3) >= 0) {
            z40Var = z40Var3;
        }
        return (z40Var2 == null || z40Var2.compareTo(z40Var) >= 0) ? z40Var : z40Var2;
    }

    public final void d(String str) {
        h9 h9Var;
        if (this.a) {
            if (h9.b != null) {
                h9Var = h9.b;
            } else {
                synchronized (h9.class) {
                    try {
                        if (h9.b == null) {
                            h9.b = new h9(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                h9Var = h9.b;
            }
            ((h9) h9Var.a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void e(y40 y40Var) {
        c10.p(y40Var, "event");
        d("handleLifecycleEvent");
        f(y40Var.a());
    }

    public final void f(z40 z40Var) {
        if (this.c == z40Var) {
            return;
        }
        f50 f50Var = (f50) this.d.get();
        z40 z40Var2 = this.c;
        c10.p(z40Var2, "current");
        z40 z40Var3 = z40.e;
        z40 z40Var4 = z40.d;
        if (z40Var2 == z40Var3 && z40Var == z40Var4) {
            throw new IllegalStateException(("State must be at least '" + z40.f + "' to be moved to '" + z40Var + "' in component " + f50Var).toString());
        }
        if (z40Var2 == z40Var4 && z40Var2 != z40Var) {
            throw new IllegalStateException(("State is '" + z40Var4 + "' and cannot be moved to `" + z40Var + "` in component " + f50Var).toString());
        }
        this.c = z40Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == z40Var4) {
            this.b = new ct();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r12.g = false;
        r0 = r12.c;
        r12 = r12.i;
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r0 = defpackage.b10.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r12.h(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h50.g():void");
    }
}
