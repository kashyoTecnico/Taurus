package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zs0 implements ys0 {
    public static final xz l = new xz(21, n9.A, s40.F);
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final ia0 c;
    public final AtomicLong d;
    public yr0 e;
    public uj0 f;
    public ps0 g;
    public xr0 h;
    public yr0 i;
    public yr0 j;
    public final zg0 k;

    public zs0(long j) {
        ia0 ia0Var = m60.a;
        this.c = new ia0();
        this.d = new AtomicLong(j);
        ia0 ia0Var2 = m60.a;
        c10.n(ia0Var2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.k = qo0.n(ia0Var2);
    }

    public final ia0 a() {
        return (ia0) this.k.getValue();
    }

    public final boolean b(d30 d30Var, long j, long j2, tr0 tr0Var, boolean z) {
        ps0 ps0Var = this.g;
        if (ps0Var == null) {
            return true;
        }
        ss0 ss0Var = ps0Var.e;
        long jA = ss0.a(ss0Var, d30Var, j);
        long jA2 = ss0.a(ss0Var, d30Var, j2);
        ss0Var.l(z);
        return ss0Var.o(jA, jA2, false, tr0Var);
    }

    public final ArrayList c(d30 d30Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            ze.P(arrayList, new zf(1, new j(12, d30Var)));
            this.a = true;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.z90 r18) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs0.d(z90):void");
    }
}
