package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q8 implements CharSequence {
    public final List d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;

    static {
        xz xzVar = up0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r0.a(r2.c);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q8(java.util.List r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.d = r8
            r7.e = r9
            r9 = 0
            if (r8 == 0) goto L3b
            int r0 = r8.size()
            r1 = 0
            r2 = r9
            r3 = r2
        L11:
            if (r1 >= r0) goto L3d
            java.lang.Object r4 = r8.get(r1)
            p8 r4 = (defpackage.p8) r4
            java.lang.Object r5 = r4.a
            boolean r6 = r5 instanceof defpackage.iw0
            if (r6 == 0) goto L2a
            if (r2 != 0) goto L26
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L26:
            r2.add(r4)
            goto L38
        L2a:
            boolean r5 = r5 instanceof defpackage.tg0
            if (r5 == 0) goto L38
            if (r3 != 0) goto L35
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L35:
            r3.add(r4)
        L38:
            int r1 = r1 + 1
            goto L11
        L3b:
            r2 = r9
            r3 = r2
        L3d:
            r7.f = r2
            r7.g = r3
            if (r3 == 0) goto L4e
            bv r7 = new bv
            r8 = 5
            r7.<init>(r8)
            java.util.List r7 = defpackage.ue.c0(r3, r7)
            goto L4f
        L4e:
            r7 = r9
        L4f:
            if (r7 == 0) goto Lba
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L58
            goto Lba
        L58:
            java.lang.Object r8 = defpackage.ue.S(r7)
            p8 r8 = (defpackage.p8) r8
            int r8 = r8.c
            int r0 = defpackage.j00.a
            ca0 r0 = new ca0
            r1 = 1
            r0.<init>(r1)
            r0.a(r8)
            int r8 = r7.size()
        L6f:
            if (r1 >= r8) goto Lba
            java.lang.Object r2 = r7.get(r1)
            p8 r2 = (defpackage.p8) r2
        L77:
            int r3 = r0.b
            if (r3 == 0) goto Lb2
            if (r3 == 0) goto Lac
            int[] r4 = r0.a
            int r5 = r3 + (-1)
            r4 = r4[r5]
            int r5 = r2.b
            int r6 = r2.c
            if (r5 < r4) goto L8f
            int r3 = r3 + (-1)
            r0.d(r3)
            goto L77
        L8f:
            if (r6 > r4) goto L92
            goto Lb2
        L92:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Paragraph overlap not allowed, end "
            r3.<init>(r5)
            r3.append(r6)
            java.lang.String r5 = " should be less than or equal to "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.qz.a(r3)
            goto Lb2
        Lac:
            java.lang.String r7 = "IntList is empty."
            defpackage.qo0.t(r7)
            throw r9
        Lb2:
            int r2 = r2.c
            r0.a(r2)
            int r1 = r1 + 1
            goto L6f
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8.<init>(java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q8 subSequence(int r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 > r11) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.qz.a(r1)
        L26:
            java.lang.String r1 = r9.e
            if (r10 != 0) goto L31
            int r4 = r1.length()
            if (r11 != r4) goto L31
            return r9
        L31:
            java.lang.String r1 = r1.substring(r10, r11)
            java.lang.String r4 = "substring(...)"
            defpackage.c10.o(r1, r4)
            q8 r4 = defpackage.s8.a
            if (r10 > r11) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.qz.a(r2)
        L59:
            java.util.List r9 = r9.d
            if (r9 != 0) goto L5e
            goto L9e
        L5e:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            int r3 = r9.size()
        L6b:
            if (r0 >= r3) goto L98
            java.lang.Object r4 = r9.get(r0)
            p8 r4 = (defpackage.p8) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.s8.b(r10, r11, r5, r6)
            if (r5 == 0) goto L95
            p8 r5 = new p8
            java.lang.Object r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r7, r8, r6, r4)
            r2.add(r5)
        L95:
            int r0 = r0 + 1
            goto L6b
        L98:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L9f
        L9e:
            r2 = 0
        L9f:
            q8 r9 = new q8
            r9.<init>(r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8.subSequence(int, int):q8");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return c10.i(this.e, q8Var.e) && c10.i(this.d, q8Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q8(String str, ArrayList arrayList, int i) {
        List list = (i & 2) != 0 ? ks.d : arrayList;
        q8 q8Var = s8.a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ q8(String str) {
        this(str, ks.d);
    }

    public q8(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
