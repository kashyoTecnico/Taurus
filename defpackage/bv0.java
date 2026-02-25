package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bv0 implements Iterable, c20 {
    public int e;
    public int g;
    public int h;
    public boolean j;
    public int k;
    public HashMap m;
    public da0 n;
    public int[] d = new int[0];
    public Object[] f = new Object[0];
    public final Object i = new Object();
    public ArrayList l = new ArrayList();

    public final int a(m2 m2Var) {
        if (this.j) {
            fi.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!m2Var.a()) {
            zj0.a("Anchor refers to a group that was removed");
        }
        return m2Var.a;
    }

    public final void b() {
        this.m = new HashMap();
    }

    public final av0 c() {
        if (this.j) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.h++;
        return new av0(this);
    }

    public final ev0 d() {
        if (this.j) {
            fi.c("Cannot start a writer when another writer is pending");
        }
        if (this.h > 0) {
            fi.c("Cannot start a writer when a reader is pending");
        }
        this.j = true;
        this.k++;
        return new ev0(this);
    }

    public final boolean e(m2 m2Var) {
        int iE;
        return m2Var.a() && (iE = dv0.e(this.l, m2Var.a, this.e)) >= 0 && c10.i(this.l.get(iE), m2Var);
    }

    public final mx f(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.m;
        if (map != null) {
            if (this.j) {
                fi.c("use active SlotWriter to crate an anchor for location instead");
            }
            m2 m2Var = (i < 0 || i >= (i2 = this.e) || (iE = dv0.e((arrayList = this.l), i, i2)) < 0) ? null : (m2) arrayList.get(iE);
            if (m2Var != null) {
                return (mx) map.get(m2Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lx(this, 0, this.e);
    }
}
