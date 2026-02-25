package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class m21 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(m21.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public us[] a;

    public final void a(us usVar) {
        usVar.d((vs) this);
        us[] usVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (usVarArr == null) {
            usVarArr = new us[4];
            this.a = usVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= usVarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(usVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            c10.o(objArrCopyOf, "copyOf(...)");
            usVarArr = (us[]) objArrCopyOf;
            this.a = usVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        usVarArr[i] = usVar;
        usVar.e = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.us b(int r9) {
        /*
            r8 = this;
            us[] r0 = r8.a
            defpackage.c10.m(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.m21.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            defpackage.c10.m(r4)
            r5 = r0[r2]
            defpackage.c10.m(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            us[] r5 = r8.a
            defpackage.c10.m(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            defpackage.c10.m(r6)
            r7 = r5[r4]
            defpackage.c10.m(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            defpackage.c10.m(r4)
            r5 = r5[r2]
            defpackage.c10.m(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            defpackage.c10.m(r9)
            r2 = 0
            r9.d(r2)
            r9.e = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m21.b(int):us");
    }

    public final void c(int i) {
        while (i > 0) {
            us[] usVarArr = this.a;
            c10.m(usVarArr);
            int i2 = (i - 1) / 2;
            us usVar = usVarArr[i2];
            c10.m(usVar);
            us usVar2 = usVarArr[i];
            c10.m(usVar2);
            if (usVar.compareTo(usVar2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        us[] usVarArr = this.a;
        c10.m(usVarArr);
        us usVar = usVarArr[i2];
        c10.m(usVar);
        us usVar2 = usVarArr[i];
        c10.m(usVar2);
        usVarArr[i] = usVar;
        usVarArr[i2] = usVar2;
        usVar.e = i;
        usVar2.e = i2;
    }
}
