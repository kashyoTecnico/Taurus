package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.taurus.dgmobilemx.MainActivity;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pp0 implements i61 {
    public final Application a;
    public final h61 b;
    public final Bundle c;
    public final a50 d;
    public final mp0 e;

    public pp0(Application application, MainActivity mainActivity, Bundle bundle) {
        h61 h61Var;
        this.e = mainActivity.getSavedStateRegistry();
        this.d = mainActivity.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (h61.c == null) {
                h61.c = new h61(application);
            }
            h61Var = h61.c;
            c10.m(h61Var);
        } else {
            h61Var = new h61(null);
        }
        this.b = h61Var;
    }

    @Override // defpackage.i61
    public final f61 a(Class cls) {
        ep0 ep0Var;
        AutoCloseable autoCloseable;
        Application application;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        a50 a50Var = this.d;
        if (a50Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = r7.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.a == null) ? qp0.a(cls, qp0.b) : qp0.a(cls, qp0.a);
        if (constructorA == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (j61.a == null) {
                j61.a = new j61();
            }
            c10.m(j61.a);
            return c10.A(cls);
        }
        mp0 mp0Var = this.e;
        c10.m(mp0Var);
        Bundle bundle = this.c;
        Bundle bundleA = mp0Var.a(canonicalName);
        if (bundleA != null) {
            bundle = bundleA;
        }
        if (bundle == null) {
            ep0Var = new ep0();
            new LinkedHashMap();
            ep0Var.a = new g30(ls.d);
        } else {
            ClassLoader classLoader = ep0.class.getClassLoader();
            c10.m(classLoader);
            bundle.setClassLoader(classLoader);
            v70 v70Var = new v70(bundle.size());
            for (String str : bundle.keySet()) {
                c10.m(str);
                v70Var.put(str, bundle.get(str));
            }
            v70Var.b();
            v70Var.p = true;
            if (v70Var.l <= 0) {
                v70Var = v70.q;
                c10.n(v70Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
            }
            ep0Var = new ep0();
            new LinkedHashMap();
            ep0Var.a = new g30(v70Var);
        }
        fp0 fp0Var = new fp0(canonicalName, ep0Var);
        fp0Var.e(a50Var, mp0Var);
        z40 z40Var = ((h50) a50Var).c;
        if (z40Var == z40.e || z40Var.compareTo(z40.g) >= 0) {
            mp0Var.c();
        } else {
            a50Var.a(new en(a50Var, mp0Var));
        }
        f61 f61VarB = (!zIsAssignableFrom || (application = this.a) == null) ? qp0.b(cls, constructorA, ep0Var) : qp0.b(cls, constructorA, application, ep0Var);
        f61VarB.getClass();
        g61 g61Var = f61VarB.a;
        if (g61Var == null) {
            return f61VarB;
        }
        if (g61Var.d) {
            g61.a(fp0Var);
            return f61VarB;
        }
        synchronized (g61Var.a) {
            autoCloseable = (AutoCloseable) g61Var.b.put("androidx.lifecycle.savedstate.vm.tag", fp0Var);
        }
        g61.a(autoCloseable);
        return f61VarB;
    }
}
