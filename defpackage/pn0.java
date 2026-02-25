package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.taurus.dgmobilemx.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pn0 extends ViewGroup {
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final xz g;
    public int h;

    public pn0(Context context) {
        super(context);
        this.d = 5;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.g = new xz(19);
        setClipChildren(false);
        rn0 rn0Var = new rn0(context);
        addView(rn0Var);
        arrayList.add(rn0Var);
        arrayList2.add(rn0Var);
        this.h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final rn0 a(qn0 qn0Var) {
        xz xzVar = this.g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) xzVar.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) xzVar.e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) xzVar.f;
        rn0 rn0Var = (rn0) linkedHashMap.get(qn0Var);
        if (rn0Var != null) {
            return rn0Var;
        }
        ArrayList arrayList = this.f;
        c10.p(arrayList, "<this>");
        rn0 rn0Var2 = (rn0) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (rn0Var2 == null) {
            int i = this.h;
            ArrayList arrayList2 = this.e;
            if (i > ve.L(arrayList2)) {
                rn0Var2 = new rn0(getContext());
                addView(rn0Var2);
                arrayList2.add(rn0Var2);
            } else {
                rn0Var2 = (rn0) arrayList2.get(this.h);
                qn0 qn0Var2 = (qn0) linkedHashMap3.get(rn0Var2);
                if (qn0Var2 != null) {
                    qn0Var2.d0();
                    rn0 rn0Var3 = (rn0) linkedHashMap2.get(qn0Var2);
                    if (rn0Var3 != null) {
                    }
                    linkedHashMap2.remove(qn0Var2);
                    rn0Var2.c();
                }
            }
            int i2 = this.h;
            if (i2 < this.d - 1) {
                this.h = i2 + 1;
            } else {
                this.h = 0;
            }
        }
        linkedHashMap2.put(qn0Var, rn0Var2);
        linkedHashMap3.put(rn0Var2, qn0Var);
        return rn0Var2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
