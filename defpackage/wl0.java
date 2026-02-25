package defpackage;

import android.os.Bundle;
import com.taurus.dgmobilemx.MainActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wl0 implements d50 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ wl0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [f50, java.lang.Object, op0] */
    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.d) {
            case 0:
                if (y40Var != y40.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                f50Var.getLifecycle().b(this);
                ?? r7 = this.e;
                Bundle bundleA = r7.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, wl0.class.getClassLoader()).asSubclass(kp0.class);
                        c10.m(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                c10.m(objNewInstance);
                                if (!(r7 instanceof l61)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + ((Object) r7)).toString());
                                }
                                k61 viewModelStore = ((l61) r7).getViewModelStore();
                                mp0 savedStateRegistry = r7.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    c10.p(str3, "key");
                                    f61 f61Var = (f61) linkedHashMap.get(str3);
                                    if (f61Var != null) {
                                        r31.l(f61Var, savedStateRegistry, r7.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.c();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str2, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Class " + str2 + " wasn't found", e3);
                    }
                }
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) this.e;
                sg.access$ensureViewModelStore(mainActivity);
                mainActivity.getLifecycle().b(this);
                return;
            case 2:
                new HashMap();
                uw[] uwVarArr = (uw[]) this.e;
                if (uwVarArr.length > 0) {
                    uw uwVar = uwVarArr[0];
                    throw null;
                }
                if (uwVarArr.length <= 0) {
                    return;
                }
                uw uwVar2 = uwVarArr[0];
                throw null;
            default:
                if (y40Var != y40.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + y40Var).toString());
                }
                f50Var.getLifecycle().b(this);
                hp0 hp0Var = (hp0) this.e;
                if (hp0Var.b) {
                    return;
                }
                Bundle bundleA2 = hp0Var.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundleV = b10.v((ng0[]) Arrays.copyOf(new ng0[0], 0));
                Bundle bundle = hp0Var.c;
                if (bundle != null) {
                    bundleV.putAll(bundle);
                }
                if (bundleA2 != null) {
                    bundleV.putAll(bundleA2);
                }
                hp0Var.c = bundleV;
                hp0Var.b = true;
                return;
        }
    }
}
