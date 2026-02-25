package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class eo extends fx0 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public la0 e;
    public Object f;
    public int g;

    public eo(long j) {
        super(j);
        la0 la0Var = zc0.a;
        c10.n(la0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.e = la0Var;
        this.f = h;
    }

    @Override // defpackage.fx0
    public final void a(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        eo eoVar = (eo) fx0Var;
        this.e = eoVar.e;
        this.f = eoVar.f;
        this.g = eoVar.g;
    }

    @Override // defpackage.fx0
    public final fx0 b(long j) {
        return new eo(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.fo r7, defpackage.gv0 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = defpackage.ov0.c
            monitor-enter(r0)
            long r1 = r6.c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r6 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f
            java.lang.Object r5 = defpackage.eo.h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.c(fo, gv0):boolean");
    }

    public final int d(fo foVar, gv0 gv0Var) {
        la0 la0Var;
        int iIdentityHashCode;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        fx0 fx0VarJ;
        synchronized (ov0.c) {
            la0Var = this.e;
        }
        int i6 = 7;
        if (la0Var.e == 0) {
            return 7;
        }
        eb0 eb0VarF = qo0.f();
        Object[] objArr = eb0VarF.d;
        int i7 = eb0VarF.f;
        boolean z = false;
        for (int i8 = 0; i8 < i7; i8++) {
            ((bi) objArr[i8]).b();
        }
        try {
            Object[] objArr2 = la0Var.b;
            int[] iArr = la0Var.c;
            long[] jArr = la0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i9 = 0;
                while (true) {
                    long j = jArr[i9];
                    if ((((~j) << i6) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        int i12 = z ? 1 : 0;
                        while (i12 < i11) {
                            if ((255 & j) < 128) {
                                int i13 = (i9 << 3) + i12;
                                i3 = i6;
                                dx0 dx0Var = (dx0) objArr2[i13];
                                i5 = i10;
                                if (iArr[i13] != 1) {
                                    i4 = length;
                                } else {
                                    if (dx0Var instanceof fo) {
                                        fo foVar2 = (fo) dx0Var;
                                        fx0VarJ = foVar2.g((eo) ov0.j(foVar2.g, gv0Var), gv0Var, z, foVar2.e);
                                    } else {
                                        fx0VarJ = ov0.j(dx0Var.a(), gv0Var);
                                    }
                                    i4 = length;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(fx0VarJ)) * 31) + Long.hashCode(fx0VarJ.a);
                                }
                            } else {
                                i3 = i6;
                                i4 = length;
                                i5 = i10;
                            }
                            j >>= i5;
                            i12++;
                            i6 = i3;
                            i10 = i5;
                            length = i4;
                            z = false;
                        }
                        i = i6;
                        i2 = length;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        i = i6;
                        i2 = length;
                    }
                    if (i9 == i2) {
                        i6 = iIdentityHashCode;
                        break;
                    }
                    i9++;
                    i6 = i;
                    length = i2;
                    z = false;
                }
            }
            iIdentityHashCode = i6;
            Object[] objArr3 = eb0VarF.d;
            int i14 = eb0VarF.f;
            for (int i15 = 0; i15 < i14; i15++) {
                ((bi) objArr3[i15]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr4 = eb0VarF.d;
            int i16 = eb0VarF.f;
            for (int i17 = 0; i17 < i16; i17++) {
                ((bi) objArr4[i17]).a();
            }
            throw th;
        }
    }
}
