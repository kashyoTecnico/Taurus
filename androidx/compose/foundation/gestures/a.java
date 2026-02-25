package androidx.compose.foundation.gestures;

import defpackage.cg0;
import defpackage.e90;
import defpackage.er0;
import defpackage.fa0;
import defpackage.if0;
import defpackage.so;
import defpackage.vq0;
import defpackage.wq0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a {
    public static final vq0 a = new vq0();
    public static final so b = new so(1);
    public static final wq0 c = new wq0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.mr0 r10, long r11, defpackage.mk r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof defpackage.xq0
            if (r0 == 0) goto L13
            r0 = r13
            xq0 r0 = (defpackage.xq0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            xq0 r0 = new xq0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.i
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            am0 r10 = r0.h
            mr0 r11 = r0.g
            defpackage.c10.X(r13)
            r7 = r10
            r10 = r11
            goto L54
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.c10.X(r13)
            am0 r7 = new am0
            r7.<init>()
            d r3 = new d
            r8 = 0
            r9 = 1
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r0.g = r4
            r0.h = r7
            r0.j = r2
            java.lang.Object r10 = r4.e(r2, r3, r0)
            xl r11 = defpackage.xl.d
            if (r10 != r11) goto L53
            return r11
        L53:
            r10 = r4
        L54:
            float r11 = r7.d
            long r10 = r10.g(r11)
            ed0 r12 = new ed0
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(mr0, long, mk):java.lang.Object");
    }

    public static final e90 b(e90 e90Var, er0 er0Var, if0 if0Var, cg0 cg0Var, boolean z, boolean z2, fa0 fa0Var) {
        return e90Var.c(new ScrollableElement(fa0Var, if0Var, cg0Var, er0Var, z, z2));
    }
}
