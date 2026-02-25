package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class yn0 {
    public static final boolean a = c10.i(Build.DEVICE, "layoutlib");

    public static final pn0 a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof pn0) {
                return (pn0) childAt;
            }
        }
        pn0 pn0Var = new pn0(viewGroup.getContext());
        viewGroup.addView(pn0Var);
        return pn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
