package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ku {
    public static final k7 f = new k7(2);
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final ju d = new ju(new of(this));
    public final ArrayList e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        ArrayList arrayList2;
        int iIndexOf;
        int iLastIndexOf;
        int i2;
        Rect rect2 = this.a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    d(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return c(i, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException("Unknown direction: " + i);
        }
        ju juVar = this.d;
        try {
            juVar.a(arrayList, viewGroup);
            Collections.sort(arrayList, juVar);
            juVar.c.a();
            juVar.b.b();
            juVar.d.a();
            juVar.a.a();
            int size = arrayList.size();
            View viewC = null;
            if (size < 2) {
                return null;
            }
            if (i == 1) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    viewC = (view == null || (iIndexOf = arrayList2.indexOf(view)) <= 0) ? (View) arrayList2.get(size - 1) : (View) arrayList2.get(iIndexOf - 1);
                }
            } else if (i == 2) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    viewC = (view == null || (iLastIndexOf = arrayList2.lastIndexOf(view)) < 0 || (i2 = iLastIndexOf + 1) >= size) ? (View) arrayList2.get(0) : (View) arrayList2.get(i2);
                }
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                arrayList2 = arrayList;
                viewC = c(i, this.a, view, viewGroup, arrayList2);
            } else {
                arrayList2 = arrayList;
            }
            return viewC == null ? (View) arrayList2.get(size - 1) : viewC;
        } catch (Throwable th) {
            juVar.c.a();
            juVar.b.b();
            juVar.d.a();
            juVar.a.a();
            throw th;
        }
    }

    public final View b(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroup2;
        View viewA = null;
        if (view == null || view == viewGroup) {
            viewGroup2 = viewGroup;
        } else {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else {
                    if (viewGroup3 == null) {
                        break;
                    }
                    viewGroup2 = viewGroup3;
                }
            }
            viewGroup2 = viewGroup;
        }
        View viewH = c4.h(view, viewGroup2, i);
        boolean z = true;
        View viewH2 = viewH;
        while (viewH != null) {
            if (viewH.isFocusable() && viewH.getVisibility() == 0 && (!viewH.isInTouchMode() || viewH.isFocusableInTouchMode())) {
                viewA = viewH;
                break;
            }
            viewH = c4.h(viewH, viewGroup2, i);
            boolean z2 = !z;
            if (!z) {
                viewH2 = viewH2 != null ? c4.h(viewH2, viewGroup2, i) : null;
                if (viewH2 == viewH) {
                    break;
                }
            }
            z = z2;
        }
        if (viewA != null) {
            return viewA;
        }
        ArrayList<View> arrayList = this.e;
        try {
            arrayList.clear();
            viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            if (!arrayList.isEmpty()) {
                viewA = a(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return viewA;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.b;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!c10.i(view3, view) && !c10.i(view3, viewGroup)) {
                Rect rect3 = this.c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                xl0 xl0VarC0 = l81.c0(rect3);
                xl0 xl0VarC02 = l81.c0(rect2);
                xl0 xl0VarC03 = l81.c0(rect);
                gu guVarJ0 = b10.j0(i);
                if (no0.p(xl0VarC0, xl0VarC02, xl0VarC03, guVarJ0 != null ? guVarJ0.a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
