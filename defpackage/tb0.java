package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tb0 {
    public final zw0 a = d80.f(ub0.j);
    public final zw0 b;
    public final kl0 c;
    public final q9 d;
    public final q9 e;
    public nd0 f;
    public int g;
    public sb0 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public tb0() {
        zw0 zw0VarF = d80.f(new rb0());
        this.b = zw0VarF;
        this.c = new kl0(zw0VarF);
        this.d = new q9();
        this.e = new q9();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(qb0 qb0Var, sb0 sb0Var, int i) {
        c10.p(qb0Var, "dispatcher");
        if (sb0Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(sb0Var);
            sb0Var.a = qb0Var;
            c10.p((rb0) this.c.d.getValue(), "history");
            sb0Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + sb0Var + "' is already added to dispatcher " + sb0Var.a + '.').toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        rb0 rb0Var;
        q9 q9Var = this.d;
        if (q9Var == null || !q9Var.isEmpty()) {
            Iterator it = q9Var.iterator();
            while (it.hasNext()) {
                if (((nd0) it.next()).b) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        q9 q9Var2 = this.e;
        if (q9Var2 == null || !q9Var2.isEmpty()) {
            Iterator it2 = q9Var2.iterator();
            while (it2.hasNext()) {
                if (((nd0) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((sb0) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((sb0) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((sb0) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        nd0 nd0VarC = this.f;
        if (nd0VarC == null) {
            nd0VarC = c(0);
        }
        nd0 nd0VarC2 = this.f;
        if (nd0VarC2 == null) {
            nd0VarC2 = c(0);
        }
        if (c10.i(nd0VarC2, nd0VarC)) {
            if (nd0VarC2 == null) {
                rb0Var = new rb0();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = q9Var.iterator();
                while (it6.hasNext()) {
                    ((nd0) it6.next()).getClass();
                }
                Iterator<E> it7 = q9Var2.iterator();
                while (it7.hasNext()) {
                    ((nd0) it7.next()).getClass();
                }
                od0 od0Var = nd0VarC2.a;
                x50 x50Var = new x50(10);
                af.Q(x50Var, arrayList);
                x50Var.add(od0Var);
                af.Q(x50Var, ks.d);
                rb0Var = new rb0(arrayList.size(), d80.k(x50Var));
            }
            zw0 zw0Var = this.b;
            if (c10.i((rb0) zw0Var.getValue(), rb0Var)) {
                return;
            }
            zw0Var.h(null, rb0Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((sb0) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((sb0) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((sb0) it10.next()).getClass();
            }
        }
    }

    public final nd0 c(int i) {
        Object next;
        Object next2;
        q9 q9Var = this.e;
        q9 q9Var2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = q9Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((nd0) next).b) {
                    break;
                }
            }
            nd0 nd0Var = (nd0) next;
            if (nd0Var != null) {
                return nd0Var;
            }
            Iterator it2 = q9Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((nd0) next3).b) {
                    obj = next3;
                    break;
                }
            }
            return (nd0) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = q9Var2.iterator();
            while (it3.hasNext()) {
                ((nd0) it3.next()).getClass();
            }
            Iterator it4 = q9Var.iterator();
            while (it4.hasNext()) {
                ((nd0) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = q9Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((nd0) next2).b) {
                break;
            }
        }
        nd0 nd0Var2 = (nd0) next2;
        if (nd0Var2 != null) {
            return nd0Var2;
        }
        Iterator it6 = q9Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((nd0) next4).b) {
                obj = next4;
                break;
            }
        }
        return (nd0) obj;
    }
}
