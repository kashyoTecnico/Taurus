package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ss extends r implements rs, Serializable {
    public final Enum[] d;

    public ss(Enum[] enumArr) {
        this.d = enumArr;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // defpackage.i, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L1a
        L5:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            if (r0 < 0) goto L15
            java.lang.Enum[] r2 = r2.d
            int r1 = r2.length
            if (r0 >= r1) goto L15
            r2 = r2[r0]
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 != r3) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.contains(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.d;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", length));
        }
        return enumArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // defpackage.r, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int indexOf(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L19
        L5:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            if (r0 < 0) goto L15
            java.lang.Enum[] r2 = r2.d
            int r1 = r2.length
            if (r0 >= r1) goto L15
            r2 = r2[r0]
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 != r3) goto L19
            return r0
        L19:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.indexOf(java.lang.Object):int");
    }

    @Override // defpackage.r, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
