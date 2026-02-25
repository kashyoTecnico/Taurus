package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements iw {
    public final /* synthetic */ int d;
    public final /* synthetic */ Collection e;

    public /* synthetic */ w(int i, Collection collection) {
        this.d = i;
        this.e = collection;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        boolean zContains;
        int i = this.d;
        Collection<?> collection = this.e;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
