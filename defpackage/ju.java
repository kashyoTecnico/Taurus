package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ju implements Comparator {
    public final ta0 a;
    public final ua0 b;
    public final ta0 c;
    public final la0 d;

    public ju(of ofVar) {
        long[] jArr = eq0.a;
        this.a = new ta0();
        int i = fq0.a;
        this.b = new ua0();
        this.c = new ta0();
        la0 la0Var = zc0.a;
        this.d = new la0();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        la0 la0Var;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            la0Var = this.d;
            if (i >= size) {
                break;
            }
            la0Var.h(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        ua0 ua0Var = this.b;
        ta0 ta0Var = this.a;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View viewH = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : c4.h(view, viewGroup, 2);
                if (viewH != null && la0Var.d(viewH) >= 0) {
                    ta0Var.l(view, viewH);
                    ua0Var.a(viewH);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) ta0Var.g(view2)) != null && !ua0Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    ta0 ta0Var2 = this.c;
                    View view4 = (View) ta0Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    ta0Var2.l(view2, view3);
                    view2 = (View) ta0Var.g(view2);
                }
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        ta0 ta0Var = this.c;
        View view3 = (View) ta0Var.g(view);
        View view4 = (View) ta0Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        la0 la0Var = this.d;
        return la0Var.e(view) < la0Var.e(view2) ? -1 : 1;
    }
}
