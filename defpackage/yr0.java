package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yr0 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ss0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr0(ss0 ss0Var, int i) {
        super(1);
        this.e = i;
        this.f = ss0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        rr0 rr0Var;
        rr0 rr0Var2;
        boolean z;
        switch (this.e) {
            case 0:
                return new f4(4, this.f);
            case 1:
                long jLongValue = ((Number) obj).longValue();
                ss0 ss0Var = this.f;
                if (ss0Var.a.a().a(jLongValue)) {
                    ss0Var.n();
                    ss0Var.p();
                }
                return j41.a;
            case 2:
                long jLongValue2 = ((Number) obj).longValue();
                ss0 ss0Var2 = this.f;
                if (ss0Var2.a.a().a(jLongValue2)) {
                    ss0Var2.i();
                    ss0Var2.m(null);
                }
                return j41.a;
            case 3:
                long jLongValue3 = ((Number) obj).longValue();
                ss0 ss0Var3 = this.f;
                sr0 sr0VarE = ss0Var3.e();
                if (sr0VarE != null && (rr0Var2 = sr0VarE.a) != null && jLongValue3 == rr0Var2.c) {
                    ss0Var3.n.setValue(null);
                }
                sr0 sr0VarE2 = ss0Var3.e();
                if (sr0VarE2 != null && (rr0Var = sr0VarE2.b) != null && jLongValue3 == rr0Var.c) {
                    ss0Var3.o.setValue(null);
                }
                if (ss0Var3.a.a().a(jLongValue3)) {
                    ss0Var3.p();
                }
                return j41.a;
            case 4:
                d30 d30Var = (d30) obj;
                ss0 ss0Var4 = this.f;
                ss0Var4.k = d30Var;
                if (ss0Var4.d() && ss0Var4.e() != null) {
                    ed0 ed0Var = d30Var != null ? new ed0(d30Var.i(0L)) : null;
                    if (!c10.i(ss0Var4.j, ed0Var)) {
                        ss0Var4.j = ed0Var;
                        ss0Var4.n();
                        ss0Var4.p();
                    }
                }
                return j41.a;
            case 5:
                yu yuVar = (yu) obj;
                boolean zA = yuVar.a();
                ss0 ss0Var5 = this.f;
                if (!zA && ss0Var5.d()) {
                    ss0Var5.i();
                }
                ss0Var5.i.setValue(Boolean.valueOf(yuVar.a()));
                return j41.a;
            case 6:
                this.f.l(((Boolean) obj).booleanValue());
                return j41.a;
            case 7:
                if (d80.c.j(((k20) obj).a) == 17) {
                    this.f.b();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                this.f.m((sr0) obj);
                return j41.a;
        }
    }
}
