package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zf implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (iw iwVar : (iw[]) obj3) {
                    int iM = c4.m((Comparable) iwVar.g(obj), (Comparable) iwVar.g(obj2));
                    if (iM != 0) {
                        return iM;
                    }
                }
                return 0;
            case 1:
                return ((Number) ((j) obj3).e(obj, obj2)).intValue();
            default:
                return ((Number) ((kw) obj3).e(obj, obj2)).intValue();
        }
    }
}
