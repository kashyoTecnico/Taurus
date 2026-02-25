package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.taurus.dgmobilemx.R;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s3(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.d) {
            case 0:
                w3 w3Var = (w3) this.e;
                AccessibilityManager accessibilityManager = w3Var.g;
                w3Var.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(w3Var.i);
                accessibilityManager.addTouchExplorationStateChangeListener(w3Var.j);
                break;
            case 1:
                q5 q5Var = (q5) this.e;
                Context context = view.getContext();
                if (!q5Var.b) {
                    context.getApplicationContext().registerComponentCallbacks((p5) q5Var.d);
                    q5Var.b = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        switch (this.d) {
            case 0:
                w3 w3Var = (w3) this.e;
                w3Var.l.removeCallbacks(w3Var.N);
                AccessibilityManager accessibilityManager = w3Var.g;
                accessibilityManager.removeAccessibilityStateChangeListener(w3Var.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(w3Var.j);
                break;
            case 1:
                q5 q5Var = (q5) this.e;
                Context context = view.getContext();
                if (q5Var.b) {
                    context.getApplicationContext().unregisterComponentCallbacks((p5) q5Var.d);
                    q5Var.b = false;
                    break;
                }
                break;
            case 2:
                k kVar = (k) this.e;
                ViewParent parent = kVar.getParent();
                Iterator it = (parent == null ? ns.a : new vn(new b(21, parent), d61.l, 1)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            c10.p(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    i81 i81Var = kVar.f;
                    if (i81Var != null) {
                        i81Var.e();
                    }
                    kVar.f = null;
                    kVar.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((rw0) this.e).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
