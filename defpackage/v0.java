package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v0 {
    public static final v0 c;
    public static final v0 d;
    public static final v0 e;
    public static final v0 f;
    public static final v0 g;
    public static final v0 h;
    public static final v0 i;
    public static final v0 j;
    public final Object a;
    public final int b;

    static {
        new v0(null, 1, null, null);
        new v0(null, 2, null, null);
        new v0(null, 4, null, null);
        new v0(null, 8, null, null);
        new v0(null, 16, null, null);
        new v0(null, 32, null, null);
        c = new v0(null, 64, null, null);
        d = new v0(null, 128, null, null);
        new v0(null, 256, null, b1.class);
        new v0(null, 512, null, b1.class);
        new v0(null, 1024, null, c1.class);
        new v0(null, 2048, null, c1.class);
        e = new v0(null, 4096, null, null);
        f = new v0(null, 8192, null, null);
        new v0(null, 16384, null, null);
        new v0(null, 32768, null, null);
        new v0(null, 65536, null, null);
        new v0(null, 131072, null, g1.class);
        new v0(null, 262144, null, null);
        new v0(null, 524288, null, null);
        new v0(null, 1048576, null, null);
        new v0(null, 2097152, null, h1.class);
        int i2 = Build.VERSION.SDK_INT;
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, e1.class);
        g = new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        h = new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        i = new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        j = new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, f1.class);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, d1.class);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null);
        new v0(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null);
        new v0(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new v0(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new v0(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new v0(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new v0(i2 >= 34 ? n0.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public v0(String str, int i2) {
        this(null, i2, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v0)) {
            return false;
        }
        Object obj2 = ((v0) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strC = z0.c(this.b);
        if (strC.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strC = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strC);
        return sb.toString();
    }

    public v0(Object obj, int i2, CharSequence charSequence, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
    }
}
