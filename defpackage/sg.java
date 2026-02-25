package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.taurus.dgmobilemx.MainActivity;
import com.taurus.dgmobilemx.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class sg extends rg implements l61, zx, op0 {
    public final sj f = new sj();
    public final e9 g;
    public final xz h;
    public k61 i;
    public final pg j;
    public final qy0 k;
    public final qg l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public boolean s;
    public boolean t;
    public final qy0 u;
    public final qy0 v;
    public final qy0 w;

    public sg() {
        lp0 lp0Var;
        final MainActivity mainActivity = (MainActivity) this;
        hg hgVar = new hg(mainActivity, 1);
        e9 e9Var = new e9();
        e9Var.c = new CopyOnWriteArrayList();
        e9Var.a = new HashMap();
        e9Var.b = hgVar;
        this.g = e9Var;
        np0 np0Var = new np0(this, new g7(3, this));
        this.h = new xz(np0Var);
        this.j = new pg(mainActivity);
        this.k = m20.J(new ig(mainActivity, 1));
        new AtomicInteger();
        this.l = new qg();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.u = m20.J(new ig(mainActivity, 2));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        getLifecycle().a(new d50() { // from class: kg
            @Override // defpackage.d50
            public final void d(f50 f50Var, y40 y40Var) {
                Window window;
                View viewPeekDecorView;
                int i2 = i;
                MainActivity mainActivity2 = mainActivity;
                switch (i2) {
                    case 0:
                        if (y40Var == y40.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (y40Var == y40.ON_DESTROY) {
                            mainActivity2.f.b = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                LinkedHashMap linkedHashMap = mainActivity2.getViewModelStore().a;
                                Iterator it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    ((f61) it.next()).a();
                                }
                                linkedHashMap.clear();
                            }
                            pg pgVar = mainActivity2.j;
                            MainActivity mainActivity3 = pgVar.g;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(pgVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(pgVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        getLifecycle().a(new d50() { // from class: kg
            @Override // defpackage.d50
            public final void d(f50 f50Var, y40 y40Var) {
                Window window;
                View viewPeekDecorView;
                int i22 = i2;
                MainActivity mainActivity2 = mainActivity;
                switch (i22) {
                    case 0:
                        if (y40Var == y40.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (y40Var == y40.ON_DESTROY) {
                            mainActivity2.f.b = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                LinkedHashMap linkedHashMap = mainActivity2.getViewModelStore().a;
                                Iterator it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    ((f61) it.next()).a();
                                }
                                linkedHashMap.clear();
                            }
                            pg pgVar = mainActivity2.j;
                            MainActivity mainActivity3 = pgVar.g;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(pgVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(pgVar);
                            break;
                        }
                        break;
                }
            }
        });
        getLifecycle().a(new wl0(i2, mainActivity));
        np0Var.a();
        z40 z40Var = ((h50) getLifecycle()).c;
        if (z40Var != z40.e && z40Var != z40.f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        np0 np0Var2 = getSavedStateRegistry().a;
        synchronized (np0Var2.c) {
            Iterator it = np0Var2.d.entrySet().iterator();
            do {
                lp0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                lp0 lp0Var2 = (lp0) entry.getValue();
                if (c10.i(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    lp0Var = lp0Var2;
                }
            } while (lp0Var == null);
        }
        if (lp0Var == null) {
            hp0 hp0Var = new hp0(getSavedStateRegistry(), mainActivity);
            getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", hp0Var);
            getLifecycle().a(new wl0(3, hp0Var));
        }
        getSavedStateRegistry().b("android:support:activity-result", new lg(0, mainActivity));
        addOnContextAvailableListener(new mg(mainActivity));
        this.v = m20.J(new ig(mainActivity, 3));
        this.w = m20.J(new ig(mainActivity, 4));
    }

    public static void a(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!c10.i(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!c10.i(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public static final void access$ensureViewModelStore(sg sgVar) {
        if (sgVar.i == null) {
            og ogVar = (og) sgVar.getLastNonConfigurationInstance();
            if (ogVar != null) {
                sgVar.i = ogVar.b;
            }
            if (sgVar.i == null) {
                sgVar.i = new k61();
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        c10.o(decorView, "getDecorView(...)");
        this.j.a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(t80 t80Var) {
        c10.p(t80Var, "provider");
        e9 e9Var = this.g;
        ((CopyOnWriteArrayList) e9Var.c).add(null);
        ((hg) e9Var.b).run();
    }

    public final void addOnConfigurationChangedListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.m.add(jjVar);
    }

    public final void addOnContextAvailableListener(ud0 ud0Var) {
        c10.p(ud0Var, "listener");
        sj sjVar = this.f;
        sjVar.getClass();
        sg sgVar = sjVar.b;
        if (sgVar != null) {
            ((mg) ud0Var).a(sgVar);
        }
        sjVar.a.add(ud0Var);
    }

    public final void addOnMultiWindowModeChangedListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.p.add(jjVar);
    }

    public final void addOnNewIntentListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.o.add(jjVar);
    }

    public final void addOnPictureInPictureModeChangedListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.q.add(jjVar);
    }

    public final void addOnTrimMemoryListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.n.add(jjVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        c10.p(runnable, "listener");
        this.r.add(runnable);
    }

    public final o1 getActivityResultRegistry() {
        return this.l;
    }

    @Override // defpackage.zx
    public cm getDefaultViewModelCreationExtras() {
        bm bmVar = bm.b;
        c10.p(bmVar, "initialExtras");
        LinkedHashMap linkedHashMap = bmVar.a;
        c10.p(linkedHashMap, "initialExtras");
        aa0 aa0Var = new aa0();
        aa0Var.a.putAll(linkedHashMap);
        Application application = getApplication();
        LinkedHashMap linkedHashMap2 = aa0Var.a;
        if (application != null) {
            linkedHashMap2.put(h61.d, getApplication());
        }
        linkedHashMap2.put(c10.j, this);
        linkedHashMap2.put(c10.k, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap2.put(c10.l, extras);
        }
        return aa0Var;
    }

    public i61 getDefaultViewModelProviderFactory() {
        return (i61) this.v.getValue();
    }

    public fw getFullyDrawnReporter() {
        return (fw) this.k.getValue();
    }

    @ao
    public Object getLastCustomNonConfigurationInstance() {
        og ogVar = (og) getLastNonConfigurationInstance();
        if (ogVar != null) {
            return ogVar.a;
        }
        return null;
    }

    @Override // defpackage.f50
    public a50 getLifecycle() {
        return this.e;
    }

    public qb0 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b;
    }

    public final sd0 getOnBackPressedDispatcher() {
        return (sd0) this.w.getValue();
    }

    @Override // defpackage.op0
    public final mp0 getSavedStateRegistry() {
        return (mp0) this.h.f;
    }

    @Override // defpackage.l61
    public k61 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.i == null) {
            og ogVar = (og) getLastNonConfigurationInstance();
            if (ogVar != null) {
                this.i = ogVar.b;
            }
            if (this.i == null) {
                this.i = new k61();
            }
        }
        k61 k61Var = this.i;
        c10.m(k61Var);
        return k61Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        c10.o(decorView, "getDecorView(...)");
        dq0.l(decorView, this);
        View decorView2 = getWindow().getDecorView();
        c10.o(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        c10.o(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        c10.o(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        c10.o(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        c10.o(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @ao
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.l.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @ao
    public void onBackPressed() {
        ((ro) this.u.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        c10.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.m.iterator();
        c10.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((jj) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.rg, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h.s(bundle);
        sj sjVar = this.f;
        sjVar.getClass();
        sjVar.b = this;
        Iterator it = sjVar.a.iterator();
        while (it.hasNext()) {
            ((mg) ((ud0) it.next())).a(this);
        }
        super.onCreate(bundle);
        int i = rm0.d;
        pm0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        c10.p(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.g.c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        c10.p(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.g.c).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    @ao
    public void onMultiWindowModeChanged(boolean z) {
        if (this.s) {
            return;
        }
        Iterator it = this.p.iterator();
        c10.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((jj) it.next()).accept(new v71(27));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        c10.p(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.o.iterator();
        c10.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((jj) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        c10.p(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.g.c).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @ao
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.q.iterator();
        c10.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((jj) it.next()).accept(new kc0(2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        c10.p(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.g.c).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    @ao
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        c10.p(strArr, "permissions");
        c10.p(iArr, "grantResults");
        if (this.l.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @ao
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        og ogVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        k61 k61Var = this.i;
        if (k61Var == null && (ogVar = (og) getLastNonConfigurationInstance()) != null) {
            k61Var = ogVar.b;
        }
        if (k61Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        og ogVar2 = new og();
        ogVar2.a = objOnRetainCustomNonConfigurationInstance;
        ogVar2.b = k61Var;
        return ogVar2;
    }

    @Override // defpackage.rg, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        c10.p(bundle, "outState");
        if (getLifecycle() instanceof h50) {
            a50 lifecycle = getLifecycle();
            c10.n(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            h50 h50Var = (h50) lifecycle;
            h50Var.d("setCurrentState");
            h50Var.f(z40.f);
        }
        super.onSaveInstanceState(bundle);
        this.h.t(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.n.iterator();
        c10.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((jj) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.r.iterator();
        c10.o(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public Context peekAvailableContext() {
        return this.f.b;
    }

    public final <I, O> n1 registerForActivityResult(m1 m1Var, l1 l1Var) {
        c10.p(m1Var, "contract");
        throw null;
    }

    public void removeMenuProvider(t80 t80Var) {
        c10.p(t80Var, "provider");
        this.g.x();
    }

    public final void removeOnConfigurationChangedListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.m.remove(jjVar);
    }

    public final void removeOnContextAvailableListener(ud0 ud0Var) {
        c10.p(ud0Var, "listener");
        sj sjVar = this.f;
        sjVar.getClass();
        sjVar.a.remove(ud0Var);
    }

    public final void removeOnMultiWindowModeChangedListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.p.remove(jjVar);
    }

    public final void removeOnNewIntentListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.o.remove(jjVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.q.remove(jjVar);
    }

    public final void removeOnTrimMemoryListener(jj jjVar) {
        c10.p(jjVar, "listener");
        this.n.remove(jjVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        c10.p(runnable, "listener");
        this.r.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (v21.a()) {
                n2.b("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            fw fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    ArrayList arrayList = fullyDrawnReporter.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((gw) obj).a();
                    }
                    fullyDrawnReporter.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        c10.o(decorView, "getDecorView(...)");
        this.j.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @ao
    public void startActivityForResult(Intent intent, int i) {
        c10.p(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @ao
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        c10.p(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> n1 registerForActivityResult(m1 m1Var, o1 o1Var, l1 l1Var) {
        c10.p(m1Var, "contract");
        throw null;
    }

    @Override // android.app.Activity
    @ao
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        c10.p(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @ao
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        c10.p(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void addMenuProvider(t80 t80Var, f50 f50Var) {
        c10.p(t80Var, "provider");
        c10.p(f50Var, "owner");
        e9 e9Var = this.g;
        ((CopyOnWriteArrayList) e9Var.c).add(null);
        ((hg) e9Var.b).run();
        a50 lifecycle = f50Var.getLifecycle();
        HashMap map = (HashMap) e9Var.a;
        r80 r80Var = (r80) map.remove(t80Var);
        if (r80Var != null) {
            r80Var.a.b(r80Var.b);
            r80Var.b = null;
        }
        map.put(t80Var, new r80(lifecycle, new q80(0, e9Var)));
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        c10.o(decorView, "getDecorView(...)");
        this.j.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        c10.p(configuration, "newConfig");
        this.s = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.s = false;
            Iterator it = this.p.iterator();
            c10.o(it, "iterator(...)");
            while (it.hasNext()) {
                ((jj) it.next()).accept(new v71(27));
            }
        } catch (Throwable th) {
            this.s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        c10.p(configuration, "newConfig");
        this.t = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.q.iterator();
            c10.o(it, "iterator(...)");
            while (it.hasNext()) {
                ((jj) it.next()).accept(new kc0(2));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        c10.o(decorView, "getDecorView(...)");
        this.j.a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(t80 t80Var, f50 f50Var, z40 z40Var) {
        c10.p(t80Var, "provider");
        c10.p(f50Var, "owner");
        c10.p(z40Var, "state");
        e9 e9Var = this.g;
        e9Var.getClass();
        a50 lifecycle = f50Var.getLifecycle();
        HashMap map = (HashMap) e9Var.a;
        r80 r80Var = (r80) map.remove(t80Var);
        if (r80Var != null) {
            r80Var.a.b(r80Var.b);
            r80Var.b = null;
        }
        map.put(t80Var, new r80(lifecycle, new jg(1, e9Var, z40Var)));
    }
}
