package defpackage;

import android.view.View;
import com.taurus.dgmobilemx.R;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h81 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ i81 f;
    public final /* synthetic */ kw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h81(i81 i81Var, kw kwVar, int i) {
        super(2);
        this.e = i;
        this.f = i81Var;
        this.g = kwVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ci ciVar = (ci) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (ciVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m4.a(this.f.d, this.g, ciVar, 0);
                } else {
                    ciVar.Q();
                }
                break;
            default:
                ci ciVar2 = (ci) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (ciVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i81 i81Var = this.f;
                    p3 p3Var = i81Var.d;
                    Object tag = p3Var.getTag(R.id.inspection_slot_table_set);
                    lk lkVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof c20) && !(tag instanceof f20))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = p3Var.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof c20) && !(tag2 instanceof f20))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        ji jiVar = ciVar2.U;
                        if (jiVar == null) {
                            jiVar = new ji(ciVar2.h);
                            ciVar2.U = jiVar;
                        }
                        set.add(jiVar);
                        ciVar2.q = true;
                        ciVar2.C = true;
                        ciVar2.c.b();
                        ciVar2.H.b();
                        ev0 ev0Var = ciVar2.I;
                        bv0 bv0Var = ev0Var.a;
                        ev0Var.e = bv0Var.m;
                        ev0Var.f = bv0Var.n;
                    }
                    boolean zH = ciVar2.h(i81Var);
                    Object objK = ciVar2.K();
                    v71 v71Var = vh.a;
                    if (zH || objK == v71Var) {
                        objK = new g81(i81Var, lkVar, 0);
                        ciVar2.e0(objK);
                    }
                    l81.d(ciVar2, (kw) objK, p3Var);
                    boolean zH2 = ciVar2.h(i81Var);
                    Object objK2 = ciVar2.K();
                    if (zH2 || objK2 == v71Var) {
                        objK2 = new g81(i81Var, lkVar, 1);
                        ciVar2.e0(objK2);
                    }
                    l81.d(ciVar2, (kw) objK2, p3Var);
                    c4.b(h00.a.a(set), b10.b0(-280240369, new h81(i81Var, this.g, 0), ciVar2), ciVar2, 56);
                } else {
                    ciVar2.Q();
                }
                break;
        }
        return j41.a;
    }
}
