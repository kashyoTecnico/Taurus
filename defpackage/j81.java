package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class j81 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.i81 a(defpackage.k r6, defpackage.hi r7, defpackage.zg r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.cx.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            gc r0 = defpackage.nm.a(r2, r0, r3)
            qy0 r2 = defpackage.m7.p
            java.lang.Object r2 = r2.getValue()
            ml r2 = (defpackage.ml) r2
            kk r2 = defpackage.nm.d(r2)
            ob r4 = new ob
            r4.<init>(r0, r3)
            r5 = 3
            defpackage.nm.z(r2, r3, r4, r5)
            h r2 = new h
            r4 = 15
            r2.<init>(r4, r0)
            java.lang.Object r0 = defpackage.ov0.c
            monitor-enter(r0)
            java.lang.Object r4 = defpackage.ov0.i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = defpackage.ue.Z(r4, r2)     // Catch: java.lang.Throwable -> L3c
            defpackage.ov0.i = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            defpackage.ov0.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.p3
            if (r1 == 0) goto L50
            p3 r0 = (defpackage.p3) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            p3 r0 = new p3
            android.content.Context r1 = r6.getContext()
            ml r2 = r7.i()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = defpackage.j81.a
            r6.addView(r1, r2)
        L6e:
            android.view.View r6 = r0.getView()
            r1 = 2131034203(0x7f05005b, float:1.7678917E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof defpackage.i81
            if (r2 == 0) goto L80
            r3 = r6
            i81 r3 = (defpackage.i81) r3
        L80:
            if (r3 != 0) goto L9c
            i81 r3 = new i81
            e9 r6 = new e9
            t30 r2 = r0.getRoot()
            r6.<init>(r2)
            oi r2 = new oi
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9c:
            r3.f(r8)
            ml r6 = r0.getCoroutineContext()
            ml r8 = r7.i()
            boolean r6 = defpackage.c10.i(r6, r8)
            if (r6 != 0) goto Lb4
            ml r6 = r7.i()
            r0.setCoroutineContext(r6)
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j81.a(k, hi, zg):i81");
    }
}
