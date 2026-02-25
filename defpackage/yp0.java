package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yp0 extends y20 implements iw {
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ at i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ u61 l;
    public final /* synthetic */ xx0 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Integer p;
    public final /* synthetic */ ArrayList q;
    public final /* synthetic */ Integer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, at atVar, int i, int i2, u61 u61Var, xx0 xx0Var, int i3, int i4, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = arrayList4;
        this.i = atVar;
        this.j = i;
        this.k = i2;
        this.l = u61Var;
        this.m = xx0Var;
        this.n = i3;
        this.o = i4;
        this.p = num;
        this.q = arrayList5;
        this.r = num2;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i;
        ni0 ni0Var = (ni0) obj;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ni0.h(ni0Var, (oi0) arrayList.get(i2), 0, 0);
        }
        ArrayList arrayList2 = this.f;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ni0.h(ni0Var, (oi0) arrayList2.get(i3), 0, 0);
        }
        ArrayList arrayList3 = this.g;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (true) {
            i = this.n;
            if (i4 >= size3) {
                break;
            }
            oi0 oi0Var = (oi0) arrayList3.get(i4);
            int i5 = (this.j - this.k) / 2;
            xx0 xx0Var = this.m;
            ni0.h(ni0Var, oi0Var, this.l.d(xx0Var, xx0Var.getLayoutDirection()) + i5, i - this.o);
            i4++;
        }
        ArrayList arrayList4 = this.h;
        int size4 = arrayList4.size();
        for (int i6 = 0; i6 < size4; i6++) {
            oi0 oi0Var2 = (oi0) arrayList4.get(i6);
            Integer num = this.p;
            ni0.h(ni0Var, oi0Var2, 0, i - (num != null ? num.intValue() : 0));
        }
        at atVar = this.i;
        if (atVar != null) {
            ArrayList arrayList5 = this.q;
            int size5 = arrayList5.size();
            for (int i7 = 0; i7 < size5; i7++) {
                oi0 oi0Var3 = (oi0) arrayList5.get(i7);
                int i8 = atVar.d;
                Integer num2 = this.r;
                c10.m(num2);
                ni0.h(ni0Var, oi0Var3, i8, i - num2.intValue());
            }
        }
        return j41.a;
    }
}
