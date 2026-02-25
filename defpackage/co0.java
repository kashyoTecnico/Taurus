package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class co0 extends q30 {
    public static final co0 c = new co0("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co0(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.l80
    public final m80 g(n80 n80Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                ls lsVar = ls.d;
                if (size == 0) {
                    return n80Var.a0(gj.j(j), gj.i(j), lsVar, s40.y);
                }
                if (size == 1) {
                    oi0 oi0VarE = ((g80) list.get(0)).e(j);
                    return n80Var.a0(hj.g(j, oi0VarE.d), hj.f(j, oi0VarE.e), lsVar, new t6(oi0VarE, 4));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    oi0 oi0VarE2 = ((g80) list.get(i)).e(j);
                    iMax = Math.max(oi0VarE2.d, iMax);
                    iMax2 = Math.max(oi0VarE2.e, iMax2);
                    arrayList.add(oi0VarE2);
                }
                return n80Var.a0(hj.g(j, iMax), hj.f(j, iMax2), lsVar, new d5(2, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
