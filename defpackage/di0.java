package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class di0 extends g0 {
    public final /* synthetic */ int d;
    public final xh0 e;

    public /* synthetic */ di0(xh0 xh0Var, int i) {
        this.d = i;
        this.e = xh0Var;
    }

    @Override // defpackage.i
    public final int a() {
        switch (this.d) {
            case 0:
                xh0 xh0Var = this.e;
                xh0Var.getClass();
                return xh0Var.e;
            default:
                xh0 xh0Var2 = this.e;
                xh0Var2.getClass();
                return xh0Var2.e;
        }
    }

    @Override // defpackage.i, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                xh0 xh0Var = this.e;
                Object obj2 = xh0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && xh0Var.containsKey(entry.getKey());
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                l31 l31Var = this.e.d;
                m31[] m31VarArr = new m31[8];
                for (int i = 0; i < 8; i++) {
                    m31VarArr[i] = new n31(0);
                }
                return new ei0(l31Var, m31VarArr);
            default:
                l31 l31Var2 = this.e.d;
                m31[] m31VarArr2 = new m31[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    m31VarArr2[i2] = new n31(1);
                }
                return new ei0(l31Var2, m31VarArr2);
        }
    }
}
