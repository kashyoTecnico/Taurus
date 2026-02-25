package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zg implements vg {
    public final int d;
    public final boolean e;
    public Object f;
    public nl0 g;
    public ArrayList h;

    public zg(int i, boolean z, Object obj) {
        this.d = i;
        this.e = z;
        this.f = obj;
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return f(obj, (ci) obj2, ((Number) obj3).intValue());
    }

    public final Object d(int i, ci ciVar) {
        ciVar.W(this.d);
        i(ciVar);
        int iU = i | (ciVar.f(this) ? b10.u(2, 0) : b10.u(1, 0));
        Object obj = this.f;
        c10.n(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        r31.m(2, obj);
        Object objE = ((kw) obj).e(ciVar, Integer.valueOf(iU));
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new yg(2, zg.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return objE;
    }

    @Override // defpackage.kw
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        return d(((Number) obj2).intValue(), (ci) obj);
    }

    public final Object f(Object obj, ci ciVar, int i) {
        ciVar.W(this.d);
        i(ciVar);
        int iU = ciVar.f(this) ? b10.u(2, 1) : b10.u(1, 1);
        Object obj2 = this.f;
        c10.n(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        r31.m(3, obj2);
        Object objC = ((lw) obj2).c(obj, ciVar, Integer.valueOf(iU | i));
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new xg(i, 0, this, obj);
        }
        return objC;
    }

    public final Object h(final Object obj, final Object obj2, ci ciVar, final int i) {
        ciVar.W(this.d);
        i(ciVar);
        int iU = ciVar.f(this) ? b10.u(2, 2) : b10.u(1, 2);
        Object obj3 = this.f;
        c10.n(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        r31.m(4, obj3);
        Object objJ = ((mw) obj3).j(obj, obj2, ciVar, Integer.valueOf(iU | i));
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new kw() { // from class: wg
                @Override // defpackage.kw
                public final Object e(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    int I = d80.I(i) | 1;
                    this.d.h(obj, obj2, (ci) obj4, I);
                    return j41.a;
                }
            };
        }
        return objJ;
    }

    public final void i(ci ciVar) {
        nl0 nl0VarW;
        if (!this.e || (nl0VarW = ciVar.w()) == null) {
            return;
        }
        ciVar.getClass();
        nl0VarW.b |= 1;
        if (b10.d0(this.g, nl0VarW)) {
            this.g = nl0VarW;
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.h = arrayList2;
            arrayList2.add(nl0VarW);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (b10.d0((nl0) arrayList.get(i), nl0VarW)) {
                arrayList.set(i, nl0VarW);
                return;
            }
        }
        arrayList.add(nl0VarW);
    }

    @Override // defpackage.mw
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (ci) obj3, ((Number) obj4).intValue());
    }
}
