package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rr implements Runnable {
    public final ArrayList d;
    public final int e;

    public rr(List list, int i, Throwable th) {
        r31.q(list, "initCallbacks cannot be null");
        this.d = new ArrayList(list);
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        if (this.e != 1) {
            while (i < size) {
                ((zm) arrayList.get(i)).b.e = c4.d;
                i++;
            }
            return;
        }
        while (i < size) {
            zm zmVar = (zm) arrayList.get(i);
            zmVar.a.setValue(Boolean.TRUE);
            zmVar.b.e = new yy(true);
            i++;
        }
    }
}
