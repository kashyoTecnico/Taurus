package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class xh implements gw {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xh(ci ciVar, jd jdVar, av0 av0Var, r90 r90Var) {
        this.d = 0;
        this.e = ciVar;
        this.f = jdVar;
        this.g = av0Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        List listT;
        int i = this.d;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ci ciVar = (ci) obj3;
                jd jdVar = (jd) obj2;
                av0 av0Var = (av0) obj;
                wh whVar = ciVar.M;
                jd jdVar2 = whVar.b;
                try {
                    whVar.b = jdVar;
                    av0 av0Var2 = ciVar.G;
                    int[] iArr = ciVar.o;
                    da0 da0Var = ciVar.v;
                    ciVar.o = null;
                    ciVar.v = null;
                    try {
                        ciVar.G = av0Var;
                        boolean z = whVar.e;
                        try {
                            whVar.e = false;
                            throw null;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    whVar.b = jdVar2;
                    throw th;
                }
            case 1:
                zg0 zg0Var = q70.a;
                ((iw) obj3).g((String) ((za0) obj2).getValue());
                ((za0) obj).setValue(Boolean.FALSE);
                return j41.a;
            default:
                m2 m2Var = (m2) obj3;
                ev0 ev0Var = (ev0) obj2;
                ff0 ff0Var = (ff0) obj;
                if (m2Var != null) {
                    ev0Var.a(ev0Var.c(m2Var) - ev0Var.t);
                }
                List listM = m20.m(ev0Var, null, ev0Var.t, null);
                qh qhVar = (qh) ue.Y(listM);
                Integer num = qhVar != null ? qhVar.a : null;
                List listC = ff0Var.c(num);
                if (num != null && !listC.isEmpty()) {
                    qh qhVar2 = (qh) ue.S(listC);
                    int size = listC.size() - 1;
                    if (size <= 0) {
                        listT = ks.d;
                    } else if (size == 1) {
                        listT = d80.t(ue.X(listC));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (listC instanceof RandomAccess) {
                            int size2 = listC.size();
                            for (int i2 = 1; i2 < size2; i2++) {
                                arrayList.add(listC.get(i2));
                            }
                        } else {
                            ListIterator listIterator = listC.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        listT = arrayList;
                    }
                    qhVar2.getClass();
                    listC = ue.a0(d80.t(new qh(null, num)), listT);
                }
                return ue.a0(listM, listC);
        }
    }

    public /* synthetic */ xh(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }
}
