package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x1 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(n80 n80Var, j30 j30Var, oi0 oi0Var, int i, int i2) {
        super(1);
        this.e = i2;
        this.f = n80Var;
        this.h = j30Var;
        this.i = oi0Var;
        this.g = i;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                ni0 ni0Var = (ni0) obj;
                ArrayList arrayList = (ArrayList) this.h;
                n80 n80Var = (n80) this.f;
                float f = f2.c;
                ArrayList arrayList2 = (ArrayList) this.i;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    List list = (List) arrayList.get(i);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i2 = 0;
                    while (i2 < size2) {
                        iArr[i2] = ((oi0) list.get(i2)).d + (i2 < ve.L(list) ? n80Var.N(f) : 0);
                        i2++;
                    }
                    v71 v71Var = o9.b;
                    int[] iArr2 = new int[size2];
                    for (int i3 = 0; i3 < size2; i3++) {
                        iArr2[i3] = 0;
                    }
                    v71Var.d(n80Var, this.g, iArr, n80Var.getLayoutDirection(), iArr2);
                    int size3 = list.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ni0.h(ni0Var, (oi0) list.get(i4), iArr2[i4], ((Number) arrayList2.get(i)).intValue());
                    }
                }
                break;
            case 1:
                ni0 ni0Var2 = (ni0) obj;
                oi0 oi0Var = (oi0) this.i;
                n80 n80Var2 = (n80) this.f;
                my myVar = (my) this.h;
                int i5 = myVar.b;
                s01 s01Var = myVar.a;
                y21 y21Var = myVar.c;
                p11 p11Var = (p11) myVar.d.a();
                s01Var.a(if0.e, jp0.c(n80Var2, i5, y21Var, p11Var != null ? p11Var.a : null, n80Var2.getLayoutDirection() == e30.e, oi0Var.d), this.g, oi0Var.d);
                ni0.j(ni0Var2, oi0Var, Math.round(-s01Var.a.g()), 0);
                break;
            case 2:
                ni0 ni0Var3 = (ni0) obj;
                oi0[] oi0VarArr = (oi0[]) this.h;
                lo0 lo0Var = (lo0) this.i;
                int[] iArr3 = (int[]) this.f;
                int length = oi0VarArr.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    oi0 oi0Var2 = oi0VarArr[i6];
                    int i8 = i7 + 1;
                    c10.m(oi0Var2);
                    Object objL = oi0Var2.l();
                    jo0 jo0Var = objL instanceof jo0 ? (jo0) objL : null;
                    dm dmVar = jo0Var != null ? jo0Var.c : null;
                    ni0.h(ni0Var3, oi0Var2, iArr3[i7], dmVar != null ? dmVar.a(this.g - oi0Var2.e, e30.d) : Math.round((1 + lo0Var.b.a) * ((r8 - oi0Var2.e) / 2.0f)));
                    i6++;
                    i7 = i8;
                }
                break;
            default:
                ni0 ni0Var4 = (ni0) obj;
                oi0 oi0Var3 = (oi0) this.i;
                n80 n80Var3 = (n80) this.f;
                u51 u51Var = (u51) this.h;
                int i9 = u51Var.b;
                s01 s01Var2 = u51Var.a;
                y21 y21Var2 = u51Var.c;
                p11 p11Var2 = (p11) u51Var.d.a();
                s01Var2.a(if0.d, jp0.c(n80Var3, i9, y21Var2, p11Var2 != null ? p11Var2.a : null, false, oi0Var3.d), this.g, oi0Var3.e);
                ni0.j(ni0Var4, oi0Var3, 0, Math.round(-s01Var2.a.g()));
                break;
        }
        return j41.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(ArrayList arrayList, n80 n80Var, int i, ArrayList arrayList2) {
        super(1);
        this.e = 0;
        float f = f2.a;
        this.h = arrayList;
        this.f = n80Var;
        this.g = i;
        this.i = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(oi0[] oi0VarArr, lo0 lo0Var, int i, int[] iArr) {
        super(1);
        this.e = 2;
        this.h = oi0VarArr;
        this.i = lo0Var;
        this.g = i;
        this.f = iArr;
    }
}
