package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class w0 {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void d(wj0 wj0Var, y8 y8Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (y8Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = wj0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, y8Var);
    }

    public static final void e(wj0 wj0Var, y8 y8Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (y8Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = wj0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(y8Var);
    }
}
