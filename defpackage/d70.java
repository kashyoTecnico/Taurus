package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d70 {
    public final int a;
    public final r1 b;
    public final v71 c;
    public int d;
    public int e;
    public int f;

    public d70(int i) {
        this.a = i;
        if (i <= 0) {
            qo0.r("maxSize <= 0");
            throw null;
        }
        this.b = new r1(13);
        this.c = new v71(25);
    }

    public final Object a(Object obj) {
        c10.p(obj, "key");
        synchronized (this.c) {
            r1 r1Var = this.b;
            r1Var.getClass();
            Object obj2 = ((LinkedHashMap) r1Var.e).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            defpackage.c10.p(r6, r0)
            v71 r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + 1
            r5.d = r1     // Catch: java.lang.Throwable -> L24
            r1 r1 = r5.b     // Catch: java.lang.Throwable -> L24
            r1.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L24
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r1.put(r6, r7)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L27
            int r7 = r5.d     // Catch: java.lang.Throwable -> L24
            int r7 = r7 + (-1)
            r5.d = r7     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r5 = move-exception
            goto Lc3
        L27:
            monitor-exit(r0)
            int r7 = r5.a
        L2a:
            v71 r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L42
            if (r1 < 0) goto Lb9
            r1 r1 = r5.b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L45
            int r1 = r5.d     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lb9
            goto L45
        L42:
            r5 = move-exception
            goto Lc1
        L45:
            int r1 = r5.d     // Catch: java.lang.Throwable -> L42
            if (r1 <= r7) goto Lb7
            r1 r1 = r5.b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L56
            goto Lb7
        L56:
            r1 r1 = r5.b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "<get-entries>(...)"
            defpackage.c10.o(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r2 == 0) goto L7b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L75
            goto L8a
        L75:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            goto L8a
        L7b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L86
            goto L8a
        L86:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L42
        L8a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L90
            monitor-exit(r0)
            return r6
        L90:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            r1 r3 = r5.b     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "key"
            defpackage.c10.p(r1, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.e     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L42
            r3.remove(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r5.d     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "value"
            defpackage.c10.p(r2, r3)     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r5.d = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L2a
        Lb7:
            monitor-exit(r0)
            return r6
        Lb9:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        Lc1:
            monitor-exit(r0)
            throw r5
        Lc3:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d70.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
