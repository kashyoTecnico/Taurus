package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.taurus.dgmobilemx.R;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wj0 extends k {
    public y8 A;
    public final zg0 B;
    public boolean C;
    public final int[] D;
    public gw l;
    public yj0 m;
    public String n;
    public final View o;
    public final kc0 p;
    public final WindowManager q;
    public final WindowManager.LayoutParams r;
    public xj0 s;
    public e30 t;
    public final zg0 u;
    public final zg0 v;
    public q00 w;
    public final fo x;
    public final Rect y;
    public final bw0 z;

    public wj0(gw gwVar, yj0 yj0Var, String str, View view, xn xnVar, xj0 xj0Var, UUID uuid) {
        kc0 kc0Var = new kc0(5);
        super(view.getContext());
        this.l = gwVar;
        this.m = yj0Var;
        this.n = str;
        this.o = view;
        this.p = kc0Var;
        Object systemService = view.getContext().getSystemService("window");
        c10.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.q = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        yj0 yj0Var2 = this.m;
        boolean zB = u6.b(view);
        boolean z = yj0Var2.b;
        int i = yj0Var2.a;
        if (z && zB) {
            i |= 8192;
        } else if (z && !zB) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.r = layoutParams;
        this.s = xj0Var;
        this.t = e30.d;
        this.u = qo0.n(null);
        this.v = qo0.n(null);
        this.x = qo0.g(new b(19, this));
        this.y = new Rect();
        this.z = new bw0(new q6(this, 2));
        setId(android.R.id.content);
        dq0.l(this, dq0.f(view));
        setTag(R.id.view_tree_view_model_store_owner, h9.e(view));
        setTag(R.id.view_tree_saved_state_registry_owner, n2.d(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(xnVar.A((float) 8));
        setOutlineProvider(new po(1));
        this.B = qo0.n(bh.a);
        this.D = new int[2];
    }

    private final kw getContent() {
        return (kw) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d30 getParentLayoutCoordinates() {
        return (d30) this.v.getValue();
    }

    private final q00 getVisibleDisplayBounds() {
        this.p.getClass();
        View view = this.o;
        Rect rect = this.y;
        view.getWindowVisibleDisplayFrame(rect);
        return new q00(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(kw kwVar) {
        this.B.setValue(kwVar);
    }

    private final void setParentLayoutCoordinates(d30 d30Var) {
        this.v.setValue(d30Var);
    }

    @Override // defpackage.k
    public final void b(int i, ci ciVar) {
        ciVar.W(-857613600);
        int i2 = (ciVar.h(this) ? 4 : 2) | i;
        if (ciVar.N(i2 & 1, (i2 & 3) != 2)) {
            getContent().e(ciVar, 0);
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new j(i, 11, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.m.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                gw gwVar = this.l;
                if (gwVar != null) {
                    gwVar.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.k
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        super.e(z, i, i2, i3, i4);
        this.m.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.r;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.p.getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.k
    public final void f(int i, int i2) {
        this.m.getClass();
        q00 visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c - visibleDisplayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d - visibleDisplayBounds.b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.r;
    }

    public final e30 getParentLayoutDirection() {
        return this.t;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final t00 m6getPopupContentSizebOM6tXw() {
        return (t00) this.u.getValue();
    }

    public final xj0 getPositionProvider() {
        return this.s;
    }

    @Override // defpackage.k
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    public final String getTestTag() {
        return this.n;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(hi hiVar, kw kwVar) {
        setParentCompositionContext(hiVar);
        setContent(kwVar);
        this.C = true;
    }

    public final void j(gw gwVar, yj0 yj0Var, String str, e30 e30Var) {
        int i;
        this.l = gwVar;
        this.n = str;
        if (!c10.i(this.m, yj0Var)) {
            yj0Var.getClass();
            this.m = yj0Var;
            boolean zB = u6.b(this.o);
            boolean z = yj0Var.b;
            int i2 = yj0Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.r;
            layoutParams.flags = i2;
            this.p.getClass();
            this.q.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = e30Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new fg();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void k() {
        d30 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.H()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jQ = parentLayoutCoordinates.Q();
            long jI = parentLayoutCoordinates.i(0L);
            long jRound = (Math.round(Float.intBitsToFloat((int) (jI >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            q00 q00Var = new q00(i, i2, ((int) (jQ >> 32)) + i, ((int) (jQ & 4294967295L)) + i2);
            if (q00Var.equals(this.w)) {
                return;
            }
            this.w = q00Var;
            m();
        }
    }

    public final void l(d30 d30Var) {
        setParentLayoutCoordinates(d30Var);
        k();
    }

    public final void m() {
        t00 t00VarM6getPopupContentSizebOM6tXw;
        q00 q00Var = this.w;
        if (q00Var == null || (t00VarM6getPopupContentSizebOM6tXw = m6getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = t00VarM6getPopupContentSizebOM6tXw.a;
        q00 visibleDisplayBounds = getVisibleDisplayBounds();
        long j2 = ((visibleDisplayBounds.d - visibleDisplayBounds.b) & 4294967295L) | ((visibleDisplayBounds.c - visibleDisplayBounds.a) << 32);
        cm0 cm0Var = new cm0();
        cm0Var.d = 0L;
        this.z.c(this, s40.v, new vj0(cm0Var, this, q00Var, j2, j));
        long j3 = cm0Var.d;
        WindowManager.LayoutParams layoutParams = this.r;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.m.e;
        kc0 kc0Var = this.p;
        if (z) {
            kc0Var.getClass();
            setSystemGestureExclusionRects(new ArrayList(new p9(new Rect[]{new Rect(0, 0, (int) (j2 >> 32), (int) (j2 & 4294967295L))}, true)));
        }
        kc0Var.getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z.d();
        if (!this.m.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.A == null) {
            this.A = new y8(0, this.l);
        }
        w0.d(this, this.A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw0 bw0Var = this.z;
        pd0 pd0Var = bw0Var.h;
        if (pd0Var != null) {
            pd0Var.b();
        }
        bw0Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            w0.e(this, this.A);
        }
        this.A = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            gw gwVar = this.l;
            if (gwVar != null) {
                gwVar.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            gw gwVar2 = this.l;
            if (gwVar2 != null) {
                gwVar2.a();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(e30 e30Var) {
        this.t = e30Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7setPopupContentSizefhxjrPA(t00 t00Var) {
        this.u.setValue(t00Var);
    }

    public final void setPositionProvider(xj0 xj0Var) {
        this.s = xj0Var;
    }

    public final void setTestTag(String str) {
        this.n = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public k getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
