package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class u6 {
    public static final vi a = new vi(d4.l);

    /* JADX WARN: Removed duplicated region for block: B:109:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.xj0 r23, defpackage.gw r24, defpackage.yj0 r25, defpackage.zg r26, defpackage.ci r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6.a(xj0, gw, yj0, zg, ci, int, int):void");
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
