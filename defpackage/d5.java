package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d5 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(int i, ArrayList arrayList) {
        super(1);
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                ni0 ni0Var = (ni0) obj;
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ni0.j(ni0Var, (oi0) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                ni0 ni0Var2 = (ni0) obj;
                ArrayList arrayList2 = this.f;
                int iL = ve.L(arrayList2);
                if (iL >= 0) {
                    int i2 = 0;
                    while (true) {
                        ni0.j(ni0Var2, (oi0) arrayList2.get(i2), 0, 0);
                        if (i2 != iL) {
                            i2++;
                        }
                    }
                }
                break;
            case 2:
                ni0 ni0Var3 = (ni0) obj;
                ArrayList arrayList3 = this.f;
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ni0.l(ni0Var3, (oi0) arrayList3.get(i3), 0, 0);
                }
                break;
            default:
                ni0 ni0Var4 = (ni0) obj;
                ArrayList arrayList4 = this.f;
                int size3 = arrayList4.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ni0.h(ni0Var4, (oi0) arrayList4.get(i4), 0, 0);
                }
                break;
        }
        return j41.a;
    }
}
