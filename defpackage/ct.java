package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ct implements Iterable {
    public wo0 d;
    public wo0 e;
    public final WeakHashMap f = new WeakHashMap();
    public int g = 0;
    public final HashMap h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.vo0) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.ct
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ct r6 = (defpackage.ct) r6
            int r1 = r5.g
            int r3 = r6.g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            vo0 r1 = (defpackage.vo0) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            vo0 r3 = (defpackage.vo0) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            vo0 r6 = (defpackage.vo0) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            vo0 vo0Var = (vo0) it;
            if (!vo0Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) vo0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        vo0 vo0Var = new vo0(this.d, this.e, 0);
        this.f.put(vo0Var, Boolean.FALSE);
        return vo0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            vo0 vo0Var = (vo0) it;
            if (!vo0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) vo0Var.next()).toString());
            if (vo0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
