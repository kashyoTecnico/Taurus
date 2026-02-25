package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g2 implements ll, jc, uv0, gz, cg0, db {
    public final /* synthetic */ int d;
    public static final sa e = new sa(-1.0f, -1.0f);
    public static final sa f = new sa(0.0f, -1.0f);
    public static final sa g = new sa(1.0f, -1.0f);
    public static final sa h = new sa(-1.0f, 0.0f);
    public static final sa i = new sa(0.0f, 0.0f);
    public static final sa j = new sa(1.0f, 0.0f);
    public static final sa k = new sa(-1.0f, 1.0f);
    public static final sa l = new sa(0.0f, 1.0f);
    public static final sa m = new sa(1.0f, 1.0f);
    public static final ra n = new ra(-1.0f);
    public static final ra o = new ra(0.0f);
    public static final qa p = new qa(-1.0f);
    public static final qa q = new qa(0.0f);
    public static final qa r = new qa(1.0f);
    public static final g2 s = new g2(1);
    public static final r4 t = new r4();
    public static final g2 u = new g2(3);
    public static final /* synthetic */ g2 v = new g2(4);
    public static final /* synthetic */ g2 w = new g2(5);
    public static final g2 x = new g2(6);
    public static final g2 y = new g2(7);
    public static final e30 z = e30.d;
    public static final yn A = new yn(1.0f, 1.0f);
    public static final g2 B = new g2(8);
    public static final g2 C = new g2(9);
    public static final /* synthetic */ g2 D = new g2(10);
    public static final /* synthetic */ g2 E = new g2(11);
    public static final /* synthetic */ g2 F = new g2(12);
    public static final /* synthetic */ g2 G = new g2(13);
    public static final g2 H = new g2(14);
    public static final g2 I = new g2(15);
    public static final g2 J = new g2(16);
    public static final g2 K = new g2(17);
    public static final g2 L = new g2(18);
    public static final /* synthetic */ g2 M = new g2(19);
    public static final g2 N = new g2(20);
    public static final g2 O = new g2(21);
    public static final g2 P = new g2(22);
    public static final g2 Q = new g2(23);
    public static final tr0 R = new tr0(0);
    public static final tr0 S = new tr0(1);
    public static final tr0 T = new tr0(2);
    public static final tr0 U = new tr0(3);
    public static final g2 V = new g2(25);
    public static final of W = new of(10);
    public static final of X = new of(11);
    public static final g2 Y = new g2(28);
    public static final of Z = new of(13);

    public /* synthetic */ g2(int i2) {
        this.d = i2;
    }

    @Override // defpackage.uv0
    public boolean a(Object obj, Object obj2) {
        switch (this.d) {
            case 15:
                return false;
            case 20:
                return obj == obj2;
            default:
                return c10.i(obj, obj2);
        }
    }

    @Override // defpackage.jc
    public xn b() {
        return A;
    }

    @Override // defpackage.jc
    public long c() {
        return 9205357640488583168L;
    }

    @Override // defpackage.cg0
    public boolean d() {
        return false;
    }

    @Override // defpackage.gz
    public void e(v30 v30Var) {
        v30Var.a();
    }

    @Override // defpackage.cg0
    public e90 f() {
        return b90.a;
    }

    @Override // defpackage.cg0
    public Object g(long j2, lr0 lr0Var, lk lkVar) {
        lr0 lr0Var2 = new lr0(lr0Var.k, lkVar);
        lr0Var2.j = j2;
        j41 j41Var = j41.a;
        Object objO = lr0Var2.o(j41Var);
        return objO == xl.d ? objO : j41Var;
    }

    @Override // defpackage.jc
    public e30 getLayoutDirection() {
        return z;
    }

    @Override // defpackage.cg0
    public long h(long j2, int i2, h hVar) {
        hVar.getClass();
        mr0 mr0Var = (mr0) hVar.f;
        return new ed0(mr0.a(mr0Var, mr0Var.h, j2, mr0Var.g)).a;
    }

    @Override // defpackage.db
    public long i(pr0 pr0Var, int i2) {
        switch (this.d) {
            case 22:
                String str = pr0Var.f.a.a.e;
                return no0.a(qo0.j(str, i2), qo0.i(str, i2));
            default:
                return pr0Var.f.l(i2);
        }
    }

    public boolean j() {
        return false;
    }

    public Object k() {
        throw new IllegalStateException("");
    }

    public String toString() {
        switch (this.d) {
            case 15:
                return "NeverEqualPolicy";
            case 20:
                return "ReferentialEqualityPolicy";
            case 25:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
