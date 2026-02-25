package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class pd0 implements kd0 {
    public final /* synthetic */ Object d;

    public /* synthetic */ pd0(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.kd0
    public n71 a(View view, n71 n71Var) {
        ty0 ty0Var = (ty0) this.d;
        ArrayList arrayList = ty0Var.b;
        k71 k71Var = n71Var.a;
        d00 d00VarA = d00.a(k71Var.f(519), k71Var.f(64));
        d00 d00VarA2 = d00.a(k71Var.g(519), k71Var.g(64));
        if (!d00VarA.equals(ty0Var.c) || !d00VarA2.equals(ty0Var.d)) {
            ty0Var.c = d00VarA;
            ty0Var.d = d00VarA2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bl0 bl0Var = (bl0) arrayList.get(size);
                bl0Var.c = d00VarA;
                bl0Var.d = d00VarA2;
                bl0Var.c();
            }
        }
        return n71Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public void b() {
        kw kwVar = (kw) this.d;
        synchronized (ov0.c) {
            ?? r1 = ov0.h;
            c10.p(r1, "<this>");
            ArrayList arrayList = new ArrayList(we.O(r1));
            boolean z = false;
            for (Object obj : r1) {
                boolean z2 = true;
                if (!z && c10.i(obj, kwVar)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            ov0.h = arrayList;
        }
    }
}
