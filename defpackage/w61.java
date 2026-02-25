package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w61 extends WindowInsetsAnimation.Callback {
    public final v61 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public w61(v61 v61Var) {
        super(v61Var.d);
        this.d = new HashMap();
        this.a = v61Var;
    }

    public final x61 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        x61 x61Var = (x61) map.get(windowInsetsAnimation);
        if (x61Var != null) {
            return x61Var;
        }
        x61 x61Var2 = new x61();
        x61Var2.a = new k51(new WindowInsetsAnimation(0, null, 0L));
        x61Var2.a = new k51(windowInsetsAnimation);
        map.put(windowInsetsAnimation, x61Var2);
        return x61Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            x61 x61VarA = a(windowInsetsAnimation);
            ((WindowInsetsAnimation) x61VarA.a.a).setFraction(windowInsetsAnimation.getFraction());
            this.c.add(x61VarA);
        }
        return this.a.d(n71.c(null, windowInsets), this.b).b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        xz xzVarE = this.a.e(a(windowInsetsAnimation), new xz(bounds));
        xzVarE.getClass();
        return new WindowInsetsAnimation.Bounds(((d00) xzVarE.e).d(), ((d00) xzVarE.f).d());
    }
}
