package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m6 implements wl {
    public final View d;
    public final f11 e;
    public final wl f;
    public final AtomicReference g = new AtomicReference(null);

    public m6(View view, f11 f11Var, wl wlVar) {
        this.d = view;
        this.e = f11Var;
        this.f = wlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.t40 r5, defpackage.mk r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.l6
            if (r0 == 0) goto L13
            r0 = r6
            l6 r0 = (defpackage.l6) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            l6 r0 = new l6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.g
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            defpackage.c10.X(r6)
            goto L4f
        L2d:
            defpackage.c10.X(r6)
            j4 r6 = new j4
            r1 = 2
            r6.<init>(r1, r5, r4)
            c r5 = new c
            r1 = 5
            r3 = 0
            r5.<init>(r4, r3, r1)
            r0.i = r2
            y5 r1 = new y5
            java.util.concurrent.atomic.AtomicReference r4 = r4.g
            r1.<init>(r6, r4, r5, r3)
            java.lang.Object r4 = defpackage.nm.q(r1, r0)
            xl r5 = defpackage.xl.d
            if (r4 != r5) goto L4f
            return
        L4f:
            fg r4 = new fg
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6.a(t40, mk):void");
    }

    @Override // defpackage.wl
    public final ml g() {
        return this.f.g();
    }
}
