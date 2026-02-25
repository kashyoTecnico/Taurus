package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.taurus.dgmobilemx.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class k extends ViewGroup {
    public WeakReference d;
    public IBinder e;
    public i81 f;
    public hi g;
    public ea h;
    public boolean i;
    public boolean j;
    public boolean k;

    public k(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        s3 s3Var = new s3(2, this);
        addOnAttachStateChangeListener(s3Var);
        of ofVar = new of(12);
        m20.C(this).a.add(ofVar);
        this.h = new ea(this, s3Var, ofVar, 3);
    }

    private final void setParentContext(hi hiVar) {
        if (this.g != hiVar) {
            this.g = hiVar;
            if (hiVar != null) {
                this.d = null;
            }
            i81 i81Var = this.f;
            if (i81Var != null) {
                i81Var.e();
                this.f = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.e != iBinder) {
            this.e = iBinder;
            this.d = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(int i, ci ciVar);

    public final void c() {
        if (this.j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.f == null) {
            try {
                this.j = true;
                this.f = j81.a(this, g(), new zg(-656146368, true, new j(0, this)));
            } finally {
                this.j = false;
            }
        }
    }

    public void e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hi g() {
        sl0 sl0Var;
        ml mlVar;
        o7 o7Var;
        hi hiVarB = this.g;
        if (hiVarB == null) {
            hiVarB = b81.b(this);
            if (hiVarB == null) {
                Object parent = getParent();
                while (hiVarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    hiVarB = b81.b(view);
                    parent = view.getParent();
                }
            }
            if (hiVarB != null) {
                hi hiVar = (!(hiVarB instanceof sl0) || ((ol0) ((sl0) hiVarB).t.getValue()).compareTo(ol0.e) > 0) ? hiVarB : null;
                if (hiVar != null) {
                    this.d = new WeakReference(hiVar);
                }
            } else {
                hiVarB = null;
            }
            if (hiVarB == null) {
                WeakReference weakReference = this.d;
                if (weakReference == null || (hiVarB = (hi) weakReference.get()) == null || ((hiVarB instanceof sl0) && ((ol0) ((sl0) hiVarB).t.getValue()).compareTo(ol0.e) <= 0)) {
                    hiVarB = null;
                }
                if (hiVarB == null) {
                    if (!isAttachedToWindow()) {
                        pz.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    hi hiVarB2 = b81.b(view2);
                    if (hiVarB2 == null) {
                        ((u71) w71.a.get()).getClass();
                        is isVar = is.d;
                        qy0 qy0Var = m7.p;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            mlVar = (ml) m7.p.getValue();
                        } else {
                            mlVar = (ml) m7.q.get();
                            if (mlVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        ml mlVarK = mlVar.k(isVar);
                        j90 j90Var = (j90) mlVarK.n(g2.F);
                        if (j90Var != null) {
                            o7 o7Var2 = new o7(j90Var);
                            q5 q5Var = (q5) o7Var2.f;
                            synchronized (q5Var.a) {
                                q5Var.b = false;
                                o7Var = o7Var2;
                            }
                        } else {
                            o7Var = 0;
                        }
                        dm0 dm0Var = new dm0();
                        ml l90Var = (k90) mlVarK.n(g2.G);
                        if (l90Var == null) {
                            l90Var = new l90();
                            dm0Var.d = l90Var;
                        }
                        if (o7Var != 0) {
                            isVar = o7Var;
                        }
                        ml mlVarK2 = mlVarK.k(isVar).k(l90Var);
                        sl0 sl0Var2 = new sl0(mlVarK2);
                        synchronized (sl0Var2.b) {
                            sl0Var2.s = true;
                        }
                        kk kkVarD = nm.d(mlVarK2);
                        f50 f50VarF = dq0.f(view2);
                        a50 lifecycle = f50VarF != null ? f50VarF.getLifecycle() : null;
                        if (lifecycle == null) {
                            pz.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new fg();
                        }
                        view2.addOnAttachStateChangeListener(new x71(view2, sl0Var2));
                        lifecycle.a(new z71(kkVarD, o7Var, sl0Var2, dm0Var, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, sl0Var2);
                        Handler handler = view2.getHandler();
                        int i = tx.a;
                        ml mlVar2 = new sx(handler, "windowRecomposer cleanup", false).i;
                        c cVar = new c(sl0Var2, view2, lkVar, 21);
                        zl zlVar = zl.g;
                        if ((2 & 1) != 0) {
                            mlVar2 = is.d;
                        }
                        if ((2 & 2) != 0) {
                            zlVar = zl.d;
                        }
                        ml mlVarA = r31.A(is.d, mlVar2, true);
                        fn fnVar = xo.a;
                        if (mlVarA != fnVar && mlVarA.n(g2.v) == null) {
                            mlVarA = mlVarA.k(fnVar);
                        }
                        l i40Var = zlVar == zl.e ? new i40(mlVarA, cVar) : new rw0(mlVarA, true);
                        i40Var.g0(zlVar, i40Var, cVar);
                        view2.addOnAttachStateChangeListener(new s3(3, i40Var));
                        sl0Var = sl0Var2;
                    } else {
                        if (!(hiVarB2 instanceof sl0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        sl0Var = (sl0) hiVarB2;
                    }
                    lkVar = ((ol0) sl0Var.t.getValue()).compareTo(ol0.e) > 0 ? sl0Var : null;
                    if (lkVar != null) {
                        this.d = new WeakReference(lkVar);
                    }
                    return sl0Var;
                }
            }
        }
        return hiVarB;
    }

    public final boolean getHasComposition() {
        return this.f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d();
        f(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(hi hiVar) {
        setParentContext(hiVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.i = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((p3) ((eg0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.k = true;
    }

    public final void setViewCompositionStrategy(b61 b61Var) {
        ea eaVar = this.h;
        if (eaVar != null) {
            eaVar.a();
        }
        ((dp0) b61Var).getClass();
        s3 s3Var = new s3(2, this);
        addOnAttachStateChangeListener(s3Var);
        of ofVar = new of(12);
        m20.C(this).a.add(ofVar);
        this.h = new ea(this, s3Var, ofVar, 3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
