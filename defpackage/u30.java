package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u30 {
    public final oi0 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public l2 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public u30(l2 l2Var, int i) {
        this.h = i;
        this.a = (oi0) l2Var;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [kw, rw] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l2, oi0] */
    public static final void a(u30 u30Var, iy iyVar, int i, nc0 nc0Var) {
        HashMap map = u30Var.g;
        float f = i;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long jJ1 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (u30Var.h) {
                    case 0:
                        an0 an0Var = nc0.M;
                        jJ1 = nc0Var.j1(jJ1);
                        break;
                    default:
                        x60 x60VarM0 = nc0Var.M0();
                        c10.m(x60VarM0);
                        long j = x60VarM0.s;
                        jJ1 = ed0.g((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), jJ1);
                        break;
                }
                nc0Var = nc0Var.t;
                c10.m(nc0Var);
                if (nc0Var.equals(u30Var.a.o())) {
                    int iRound = Math.round(iyVar instanceof iy ? Float.intBitsToFloat((int) (jJ1 & 4294967295L)) : Float.intBitsToFloat((int) (jJ1 >> 32)));
                    if (map.containsKey(iyVar)) {
                        c10.p(map, "<this>");
                        Object obj = map.get(iyVar);
                        if (obj == null && !map.containsKey(iyVar)) {
                            throw new NoSuchElementException("Key " + iyVar + " is missing in the map.");
                        }
                        int iIntValue = ((Number) obj).intValue();
                        iy iyVar2 = k2.a;
                        iRound = ((Number) iyVar.a.e(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(iyVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!u30Var.b(nc0Var).containsKey(iyVar));
            float fC = u30Var.c(nc0Var, iyVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(nc0 nc0Var) {
        switch (this.h) {
            case 0:
                return nc0Var.w0().a();
            default:
                x60 x60VarM0 = nc0Var.M0();
                c10.m(x60VarM0);
                return x60VarM0.w0().a();
        }
    }

    public final int c(nc0 nc0Var, iy iyVar) {
        switch (this.h) {
            case 0:
                return nc0Var.r0(iyVar);
            default:
                x60 x60VarM0 = nc0Var.M0();
                c10.m(x60VarM0);
                return x60VarM0.r0(iyVar);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l2, oi0] */
    public final void f() {
        this.b = true;
        ?? r0 = this.a;
        l2 l2VarQ = r0.q();
        if (l2VarQ == null) {
            return;
        }
        if (this.c) {
            l2VarQ.requestLayout();
        }
        if (this.d) {
            r0.U();
        }
        if (this.e) {
            r0.requestLayout();
        }
        l2VarQ.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l2, oi0] */
    public final void g() {
        HashMap map = this.g;
        map.clear();
        h hVar = new h(2, this);
        ?? r2 = this.a;
        r2.j(hVar);
        map.putAll(b(r2.o()));
        this.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [l2, oi0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            oi0 r1 = r2.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            l2 r0 = r1.q()
            if (r0 != 0) goto L10
            goto L53
        L10:
            u30 r0 = r0.a()
            l2 r1 = r0.f
            if (r1 == 0) goto L23
            u30 r0 = r1.a()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            l2 r0 = r2.f
            if (r0 == 0) goto L53
            u30 r1 = r0.a()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            l2 r1 = r0.q()
            if (r1 == 0) goto L41
            u30 r1 = r1.a()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            l2 r0 = r0.q()
            if (r0 == 0) goto L50
            u30 r0 = r0.a()
            if (r0 == 0) goto L50
            l2 r1 = r0.f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u30.h():void");
    }
}
