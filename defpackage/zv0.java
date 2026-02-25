package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zv0 implements Parcelable, dx0, List, RandomAccess, d20 {
    public static final Parcelable.Creator<zv0> CREATOR = new yv0();
    public cx0 d;

    public zv0(x xVar) {
        gv0 gv0VarK = ov0.k();
        cx0 cx0Var = new cx0(gv0VarK.g(), xVar);
        if (!(gv0VarK instanceof bx)) {
            cx0Var.b = new cx0(1, xVar);
        }
        this.d = cx0Var;
    }

    @Override // defpackage.dx0
    public final fx0 a() {
        return this.d;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            x xVarC = xVar.c(obj);
            if (xVarC.equals(xVar)) {
                return false;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i, xVarC, true);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return b10.T(this, new iw() { // from class: xv0
            @Override // defpackage.iw
            public final Object g(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // defpackage.dx0
    public final void c(fx0 fx0Var) {
        fx0Var.b = this.d;
        this.d = (cx0) fx0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        gv0 gv0VarK;
        cx0 cx0Var = this.d;
        c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (ov0.c) {
            gv0VarK = ov0.k();
            cx0 cx0Var2 = (cx0) ov0.w(cx0Var, this, gv0VarK);
            synchronized (b10.m) {
                cx0Var2.c = fv0.e;
                cx0Var2.d++;
                cx0Var2.e++;
            }
        }
        ov0.n(gv0VarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return b10.L(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return b10.L(this).c.containsAll(collection);
    }

    public final void d(int i, int i2) {
        int i3;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i3 = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            ji0 ji0VarE = xVar.e();
            ji0VarE.subList(i, i2).clear();
            x xVarC = ji0VarE.c();
            if (c10.i(xVarC, xVar)) {
                return;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i3, xVarC, true);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return b10.L(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return b10.L(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return b10.L(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return b10.L(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ey(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        Object obj = get(i);
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i2 = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            x xVarG = xVar.g(i);
            if (xVarG.equals(xVar)) {
                break;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i2, xVarG, true);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            x xVarF = xVar.f(new w(0, collection));
            if (c10.i(xVarF, xVar)) {
                return false;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i, xVarF, true);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return b10.T(this, new w(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        Object obj2 = get(i);
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i2 = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            x xVarH = xVar.h(i, obj);
            if (xVarH.equals(xVar)) {
                break;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i2, xVarH, false);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return b10.L(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            zj0.a("fromIndex or toIndex are out of bounds");
        }
        return new tx0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r31.a0(this);
    }

    public final String toString() {
        cx0 cx0Var = this.d;
        c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((cx0) ov0.i(cx0Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        x xVar = b10.L(this).c;
        int iA = xVar.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(xVar.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            x xVarD = xVar.d(collection);
            if (c10.i(xVarD, xVar)) {
                return false;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i, xVarD, true);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ey(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r31.b0(this, objArr);
    }

    public zv0() {
        this(fv0.e);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i2 = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            x xVarB = xVar.b(i, obj);
            if (xVarB.equals(xVar)) {
                return;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i2, xVarB, true);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        do {
            synchronized (b10.m) {
                cx0 cx0Var = this.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            int iIndexOf = xVar.indexOf(obj);
            x xVarG = iIndexOf != -1 ? xVar.g(iIndexOf) : xVar;
            if (xVarG.equals(xVar)) {
                return false;
            }
            cx0 cx0Var3 = this.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, this, gv0VarK), i, xVarG, true);
            }
            ov0.n(gv0VarK, this);
        } while (!zS);
        return true;
    }
}
