package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.taurus.dgmobilemx.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class m4 {
    public static final vi a = new vi(d4.f);
    public static final hx0 b = new hx0(d4.g);
    public static final vi c = new vi(e3.i);
    public static final hx0 d = new hx0(d4.h);
    public static final hx0 e = new hx0(d4.i);
    public static final hx0 f = new hx0(d4.j);

    public static final void a(p3 p3Var, kw kwVar, ci ciVar, int i) {
        za0 za0Var;
        LinkedHashMap linkedHashMap;
        boolean z;
        ciVar.W(-520299287);
        int i2 = (ciVar.h(p3Var) ? 4 : 2) | i | (ciVar.h(kwVar) ? 32 : 16);
        if (ciVar.N(i2 & 1, (i2 & 19) != 18)) {
            Context context = p3Var.getContext();
            Object objK = ciVar.K();
            Object obj = vh.a;
            if (objK == obj) {
                objK = qo0.n(new Configuration(context.getResources().getConfiguration()));
                ciVar.e0(objK);
            }
            za0 za0Var2 = (za0) objK;
            Object objK2 = ciVar.K();
            if (objK2 == obj) {
                objK2 = new e4(za0Var2, 0);
                ciVar.e0(objK2);
            }
            p3Var.setConfigurationChangeObserver((iw) objK2);
            Object objK3 = ciVar.K();
            if (objK3 == obj) {
                objK3 = new p7();
                ciVar.e0(objK3);
            }
            p7 p7Var = (p7) objK3;
            d3 viewTreeOwners = p3Var.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            op0 op0Var = viewTreeOwners.b;
            Object objK4 = ciVar.K();
            if (objK4 == obj) {
                Object parent = p3Var.getParent();
                c10.n(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = ap0.class.getSimpleName() + ':' + strValueOf;
                mp0 savedStateRegistry = op0Var.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        c10.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                        za0Var2 = za0Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                za0Var = za0Var2;
                hx0 hx0Var = cp0.a;
                bp0 bp0Var = new bp0(linkedHashMap);
                try {
                    savedStateRegistry.b(str, new lg(1, bp0Var));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object dpVar = new dp(bp0Var, new ep(z, savedStateRegistry, str));
                ciVar.e0(dpVar);
                objK4 = dpVar;
            } else {
                za0Var = za0Var2;
            }
            Object obj2 = (dp) objK4;
            boolean zH = ciVar.h(obj2);
            Object objK5 = ciVar.K();
            if (zH || objK5 == obj) {
                objK5 = new h(5, obj2);
                ciVar.e0(objK5);
            }
            l81.c(j41.a, (iw) objK5, ciVar);
            Object objK6 = ciVar.K();
            if (objK6 == obj) {
                objK6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new fc0() : new ym(p3Var.getView(), 0);
                ciVar.e0(objK6);
            }
            yx yxVar = (yx) objK6;
            Configuration configuration = (Configuration) za0Var.getValue();
            Object objK7 = ciVar.K();
            if (objK7 == obj) {
                objK7 = new vy();
                ciVar.e0(objK7);
            }
            vy vyVar = (vy) objK7;
            Object objK8 = ciVar.K();
            Object obj3 = objK8;
            if (objK8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                ciVar.e0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objK9 = ciVar.K();
            if (objK9 == obj) {
                objK9 = new k4(configuration3, vyVar);
                ciVar.e0(objK9);
            }
            k4 k4Var = (k4) objK9;
            boolean zH2 = ciVar.h(context);
            Object objK10 = ciVar.K();
            if (zH2 || objK10 == obj) {
                objK10 = new j4(0, context, k4Var);
                ciVar.e0(objK10);
            }
            l81.c(vyVar, (iw) objK10, ciVar);
            Object objK11 = ciVar.K();
            if (objK11 == obj) {
                objK11 = new vm0();
                ciVar.e0(objK11);
            }
            vm0 vm0Var = (vm0) objK11;
            Object objK12 = ciVar.K();
            if (objK12 == obj) {
                objK12 = new l4(vm0Var);
                ciVar.e0(objK12);
            }
            l4 l4Var = (l4) objK12;
            boolean zH3 = ciVar.h(context);
            Object objK13 = ciVar.K();
            if (zH3 || objK13 == obj) {
                objK13 = new j4(1, context, l4Var);
                ciVar.e0(objK13);
            }
            l81.c(vm0Var, (iw) objK13, ciVar);
            dl0 dl0Var = ti.v;
            c4.c(new fl0[]{a.a((Configuration) za0Var.getValue()), b.a(context), a60.a.a(viewTreeOwners.a), b60.a.a(op0Var), cp0.a.a(obj2), f.a(p3Var.getView()), d.a(vyVar), e.a(vm0Var), dl0Var.a(Boolean.valueOf(((Boolean) ciVar.j(dl0Var)).booleanValue() | p3Var.getScrollCaptureInProgress$ui_release())), ti.l.a(yxVar)}, b10.b0(1059770793, new g4(p3Var, p7Var, kwVar, 0), ciVar), ciVar, 56);
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new h4(i, 0, p3Var, kwVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
