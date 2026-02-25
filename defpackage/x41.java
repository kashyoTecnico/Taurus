package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x41 extends t41 {
    public final jx b;
    public String c;
    public boolean d;
    public final nq e;
    public y20 f;
    public final zg0 g;
    public ta h;
    public final zg0 i;
    public long j;
    public float k;
    public float l;
    public final w41 m;

    public x41(jx jxVar) {
        this.b = jxVar;
        jxVar.i = new w41(this, 0);
        this.c = "";
        this.d = true;
        this.e = new nq();
        this.f = si.H;
        this.g = qo0.n(null);
        this.i = qo0.n(new yu0(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new w41(this, 1);
    }

    @Override // defpackage.t41
    public final void a(sq sqVar) {
        e(sqVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.sq r27, float r28, defpackage.ta r29) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x41.e(sq, float, ta):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        zg0 zg0Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((yu0) zg0Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((yu0) zg0Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }
}
