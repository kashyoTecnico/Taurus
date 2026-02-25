package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class pt0 {
    public static final Comparator[] a;
    public static final kt0 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new qs0(2, new qs0(i == 0 ? bv.e : bv.c));
            i++;
        }
        a = comparatorArr;
        b = kt0.p;
    }

    public static final void a(gt0 gt0Var, ArrayList arrayList, h hVar, h hVar2, da0 da0Var) {
        ct0 ct0Var = gt0Var.d;
        Object objG = ct0Var.d.g(lt0.m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) hVar2.g(gt0Var)).booleanValue()) && ((Boolean) hVar.g(gt0Var)).booleanValue()) {
            arrayList.add(gt0Var);
        }
        if (zBooleanValue) {
            da0Var.g(gt0Var.g, b(gt0Var, hVar, hVar2, gt0.j(7, gt0Var)));
            return;
        }
        List listJ = gt0.j(7, gt0Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((gt0) listJ.get(i), arrayList, hVar, hVar2, da0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[EDGE_INSN: B:53:0x00d1->B:32:0x00d1 BREAK  A[LOOP:2: B:21:0x0066->B:31:0x00cd]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[LOOP:1: B:12:0x0044->B:34:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3 A[EDGE_INSN: B:51:0x00f3->B:35:0x00f3 BREAK  A[LOOP:1: B:12:0x0044->B:34:0x00ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.gt0 r17, defpackage.h r18, defpackage.h r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt0.b(gt0, h, h, java.util.List):java.util.ArrayList");
    }
}
