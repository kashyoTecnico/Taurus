package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.taurus.dgmobilemx.R;
import java.util.UUID;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qo extends Dialog implements f50, op0 {
    public h50 d;
    public final xz e;
    public final qy0 f;
    public final qy0 g;
    public gw h;
    public no i;
    public final View j;
    public final mo k;
    public boolean l;

    public qo(gw gwVar, no noVar, View view, e30 e30Var, xn xnVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), noVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.e = new xz(new np0(this, new g7(3, this)));
        final int i = 0;
        this.f = m20.J(new gw(this) { // from class: ug
            public final /* synthetic */ qo e;

            {
                this.e = this;
            }

            @Override // defpackage.gw
            public final Object a() {
                switch (i) {
                    case 0:
                        ro roVar = new ro();
                        ((sd0) this.e.g.getValue()).b.a(roVar);
                        return roVar;
                    default:
                        return new sd0(new b3(5, this.e));
                }
            }
        });
        final int i2 = 1;
        qy0 qy0VarJ = m20.J(new gw(this) { // from class: ug
            public final /* synthetic */ qo e;

            {
                this.e = this;
            }

            @Override // defpackage.gw
            public final Object a() {
                switch (i2) {
                    case 0:
                        ro roVar = new ro();
                        ((sd0) this.e.g.getValue()).b.a(roVar);
                        return roVar;
                    default:
                        return new sd0(new b3(5, this.e));
                }
            }
        });
        this.g = qy0VarJ;
        this.h = gwVar;
        this.i = noVar;
        this.j = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        mq0.k(window, this.i.e);
        window.setGravity(17);
        if (!this.i.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            u8.a.a(attributes);
            v8 v8Var = v8.a;
            v8Var.a(attributes, 0);
            v8Var.b(attributes, 0);
            window.setAttributes(attributes);
        }
        mo moVar = new mo(getContext(), window);
        setTitle(this.i.f);
        moVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        moVar.setClipChildren(false);
        moVar.setElevation(xnVar.A(f));
        moVar.setOutlineProvider(new po(0));
        this.k = moVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(moVar);
        dq0.l(moVar, dq0.f(view));
        moVar.setTag(R.id.view_tree_view_model_store_owner, h9.e(view));
        moVar.setTag(R.id.view_tree_saved_state_registry_owner, n2.d(view));
        d(this.h, this.i, e30Var);
        sd0 sd0Var = (sd0) qy0VarJ.getValue();
        a5 a5Var = new a5(this, 1);
        c10.p(sd0Var, "<this>");
        qb0 qb0Var = sd0Var.b;
        td0 td0Var = new td0(a5Var);
        a50 lifecycle = getLifecycle();
        if (((h50) lifecycle).c == z40.d) {
            return;
        }
        nd0 nd0Var = new nd0(td0Var, new od0(td0Var, this));
        td0Var.a.add(nd0Var);
        nd0Var.a(false);
        qb0Var.getClass();
        if (qb0Var.c.add(nd0Var)) {
            tb0 tb0Var = qb0Var.b;
            tb0Var.getClass();
            if (nd0Var.c != null) {
                throw new IllegalArgumentException(("Handler '" + nd0Var + "' is already registered with a dispatcher").toString());
            }
            tb0Var.e.addFirst(nd0Var);
            nd0Var.c = qb0Var;
            tb0Var.b();
        }
        rd0 rd0Var = new rd0(nd0Var, sd0Var, lifecycle);
        lifecycle.a(rd0Var);
        td0Var.c.add(rd0Var);
    }

    public static void a(qo qoVar) {
        super.onBackPressed();
    }

    public static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof mo) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c10.p(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        c10.m(window);
        View decorView = window.getDecorView();
        c10.o(decorView, "getDecorView(...)");
        dq0.l(decorView, this);
        Window window2 = getWindow();
        c10.m(window2);
        View decorView2 = window2.getDecorView();
        c10.o(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        c10.m(window3);
        View decorView3 = window3.getDecorView();
        c10.o(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        c10.m(window4);
        View decorView4 = window4.getDecorView();
        c10.o(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void d(gw gwVar, no noVar, e30 e30Var) {
        int i;
        this.h = gwVar;
        this.i = noVar;
        nr0 nr0Var = noVar.c;
        boolean zB = u6.b(this.j);
        int iOrdinal = nr0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new fg();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        c10.m(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = e30Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new fg();
            }
            i = 1;
        }
        mo moVar = this.k;
        moVar.setLayoutDirection(i);
        boolean z = noVar.e;
        boolean z2 = noVar.d;
        Window window2 = moVar.l;
        boolean z3 = (moVar.p && z2 == moVar.n && z == moVar.o) ? false : true;
        moVar.n = z2;
        moVar.o = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !moVar.p) {
                window2.setLayout(i2, -2);
                moVar.p = true;
            }
        }
        setCanceledOnTouchOutside(noVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // defpackage.f50
    public final a50 getLifecycle() {
        h50 h50Var = this.d;
        if (h50Var != null) {
            return h50Var;
        }
        h50 h50Var2 = new h50(this);
        this.d = h50Var2;
        return h50Var2;
    }

    @Override // defpackage.op0
    public final mp0 getSavedStateRegistry() {
        return (mp0) this.e.f;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((ro) this.f.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            sd0 sd0Var = (sd0) this.g.getValue();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            c10.o(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            sd0Var.a(onBackInvokedDispatcher);
        }
        this.e.s(bundle);
        h50 h50Var = this.d;
        if (h50Var == null) {
            h50Var = new h50(this);
            this.d = h50Var;
        }
        h50Var.e(y40.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.i.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.h.a();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        c10.o(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.e.t(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        h50 h50Var = this.d;
        if (h50Var == null) {
            h50Var = new h50(this);
            this.d = h50Var;
        }
        h50Var.e(y40.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        h50 h50Var = this.d;
        if (h50Var == null) {
            h50Var = new h50(this);
            this.d = h50Var;
        }
        h50Var.e(y40.ON_DESTROY);
        this.d = null;
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            no r1 = r9.i
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            mo r1 = r9.k
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.d80.B(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = defpackage.d80.B(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.l = r3
            return r0
        L7c:
            boolean r10 = r9.l
            if (r10 == 0) goto L95
            gw r10 = r9.h
            r10.a()
            r9.l = r3
            return r4
        L88:
            r9.l = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.l = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        c10.p(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c10.p(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
