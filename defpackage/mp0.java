package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mp0 {
    public final np0 a;
    public vl0 b;

    public mp0(np0 np0Var) {
        this.a = np0Var;
    }

    public final Bundle a(String str) {
        c10.p(str, "key");
        np0 np0Var = this.a;
        if (!np0Var.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = np0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleH = bundle.containsKey(str) ? jp0.h(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            np0Var.f = null;
        }
        return bundleH;
    }

    public final void b(String str, lp0 lp0Var) {
        c10.p(lp0Var, "provider");
        np0 np0Var = this.a;
        synchronized (np0Var.c) {
            if (np0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            np0Var.d.put(str, lp0Var);
        }
    }

    public final void c() {
        if (!this.a.h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        vl0 vl0Var = this.b;
        if (vl0Var == null) {
            vl0Var = new vl0(this);
        }
        this.b = vl0Var;
        try {
            q40.class.getDeclaredConstructor(null);
            vl0 vl0Var2 = this.b;
            if (vl0Var2 != null) {
                vl0Var2.a.add(q40.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + q40.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
