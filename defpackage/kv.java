package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kv implements jv {
    public final v71 a;
    public final o5 b;
    public final xz c;
    public final ov d;
    public final r1 e;

    public kv(v71 v71Var, o5 o5Var) {
        xz xzVar = lv.a;
        xz xzVar2 = lv.a;
        ov ovVar = new ov();
        nv nvVar = ov.a;
        sx sxVar = wo.a;
        nvVar.getClass();
        nm.d(d80.v(nvVar, sxVar).k(is.d).k(new ay0(null)));
        r1 r1Var = new r1(15);
        this.a = v71Var;
        this.b = o5Var;
        this.c = xzVar;
        this.d = ovVar;
        this.e = r1Var;
        new ir(1, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: Exception -> 0x0099, TRY_ENTER, TryCatch #1 {Exception -> 0x0099, blocks: (B:25:0x0041, B:27:0x0053, B:30:0x0058, B:32:0x005c, B:34:0x0069, B:50:0x0091, B:51:0x0098, B:33:0x0065), top: B:59:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.z31 a(defpackage.y31 r7) {
        /*
            r6 = this;
            xz r0 = r6.c
            java.lang.Object r1 = r0.e
            kc0 r1 = (defpackage.kc0) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f     // Catch: java.lang.Throwable -> L3c
            d70 r2 = (defpackage.d70) r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L3c
            z31 r2 = (defpackage.z31) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L40
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f     // Catch: java.lang.Throwable -> L3c
            d70 r2 = (defpackage.d70) r2     // Catch: java.lang.Throwable -> L3c
            v71 r3 = r2.c     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            r1 r4 = r2.b     // Catch: java.lang.Throwable -> L36
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.remove(r7)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L38
            int r5 = r2.d     // Catch: java.lang.Throwable -> L36
            int r5 = r5 + (-1)
            r2.d = r5     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r6 = move-exception
            goto L3e
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            z31 r4 = (defpackage.z31) r4     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r6 = move-exception
            goto La2
        L3e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r6     // Catch: java.lang.Throwable -> L3c
        L40:
            monitor-exit(r1)
            ov r1 = r6.d     // Catch: java.lang.Exception -> L99
            r1.getClass()     // Catch: java.lang.Exception -> L99
            vy0 r1 = r7.a     // Catch: java.lang.Exception -> L99
            r1 r6 = r6.e     // Catch: java.lang.Exception -> L99
            java.lang.Object r6 = r6.e     // Catch: java.lang.Exception -> L99
            int r6 = r7.c     // Catch: java.lang.Exception -> L99
            zv r2 = r7.b     // Catch: java.lang.Exception -> L99
            r3 = 0
            if (r1 == 0) goto L65
            boolean r4 = r1 instanceof defpackage.wm     // Catch: java.lang.Exception -> L99
            if (r4 == 0) goto L58
            goto L65
        L58:
            boolean r4 = r1 instanceof defpackage.ww     // Catch: java.lang.Exception -> L99
            if (r4 == 0) goto L6e
            ww r1 = (defpackage.ww) r1     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = r1.d     // Catch: java.lang.Exception -> L99
            android.graphics.Typeface r6 = defpackage.kc0.m(r1, r2, r6)     // Catch: java.lang.Exception -> L99
            goto L69
        L65:
            android.graphics.Typeface r6 = defpackage.kc0.m(r3, r2, r6)     // Catch: java.lang.Exception -> L99
        L69:
            z31 r3 = new z31     // Catch: java.lang.Exception -> L99
            r3.<init>(r6)     // Catch: java.lang.Exception -> L99
        L6e:
            if (r3 == 0) goto L91
            java.lang.Object r6 = r0.e
            kc0 r6 = (defpackage.kc0) r6
            monitor-enter(r6)
            java.lang.Object r1 = r0.f     // Catch: java.lang.Throwable -> L8b
            d70 r1 = (defpackage.d70) r1     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r1.a(r7)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L8d
            boolean r1 = r3.e     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L8d
            java.lang.Object r0 = r0.f     // Catch: java.lang.Throwable -> L8b
            d70 r0 = (defpackage.d70) r0     // Catch: java.lang.Throwable -> L8b
            r0.b(r7, r3)     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r7 = move-exception
            goto L8f
        L8d:
            monitor-exit(r6)
            return r3
        L8f:
            monitor-exit(r6)
            throw r7
        L91:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L99
            java.lang.String r7 = "Could not load font"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L99
            throw r6     // Catch: java.lang.Exception -> L99
        L99:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0, r6)
            throw r7
        La2:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.a(y31):z31");
    }

    public final z31 b(vy0 vy0Var, zv zvVar, int i, int i2) {
        o5 o5Var = this.b;
        o5Var.getClass();
        int i3 = o5Var.d;
        zv zvVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? zvVar : new zv(c10.u(zvVar.d + i3, 1, 1000));
        this.a.getClass();
        return a(new y31(vy0Var, zvVar2, i, i2, null));
    }
}
