package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w80 {
    public final SparseArray a;
    public w31 b;

    public w80(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(w31 w31Var, int i, int i2) {
        int iA = w31Var.a(i);
        SparseArray sparseArray = this.a;
        w80 w80Var = sparseArray == null ? null : (w80) sparseArray.get(iA);
        if (w80Var == null) {
            w80Var = new w80(1);
            sparseArray.put(w31Var.a(i), w80Var);
        }
        if (i2 > i) {
            w80Var.a(w31Var, i + 1, i2);
        } else {
            w80Var.b = w31Var;
        }
    }
}
