package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bp0 implements ap0 {
    public final ta0 a;
    public ta0 b;

    public bp0(LinkedHashMap linkedHashMap) {
        ta0 ta0Var;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            ta0Var = null;
        } else {
            ta0Var = new ta0(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                ta0Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.a = ta0Var;
    }

    @Override // defpackage.ap0
    public final boolean a(Object obj) {
        return d80.l(obj);
    }

    @Override // defpackage.ap0
    public final Object b(String str) {
        ta0 ta0Var = this.a;
        List list = ta0Var != null ? (List) ta0Var.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && ta0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = ta0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = ta0Var.c;
            Object obj = objArr[iF];
            ta0Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // defpackage.ap0
    public final e9 c(String str, g7 g7Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!b10.P(str.charAt(i))) {
                ta0 ta0Var = this.b;
                if (ta0Var == null) {
                    long[] jArr = eq0.a;
                    ta0Var = new ta0();
                    this.b = ta0Var;
                }
                Object objG = ta0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    ta0Var.l(str, objG);
                }
                ((List) objG).add(g7Var);
                return new e9(ta0Var, str, g7Var);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
