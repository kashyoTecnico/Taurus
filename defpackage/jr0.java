package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jr0 extends jy0 implements kw {
    public mr0 h;
    public cm0 i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mr0 m;
    public final /* synthetic */ cm0 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(mr0 mr0Var, cm0 cm0Var, long j, lk lkVar) {
        super(2, lkVar);
        this.m = mr0Var;
        this.n = cm0Var;
        this.o = j;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((jr0) k((lk) obj2, (kr0) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        jr0 jr0Var = new jr0(this.m, this.n, this.o, lkVar);
        jr0Var.l = obj;
        return jr0Var;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        mr0 mr0Var;
        cm0 cm0Var;
        mr0 mr0Var2;
        long j;
        int i = this.k;
        if0 if0Var = if0.e;
        if (i == 0) {
            c10.X(obj);
            kr0 kr0Var = (kr0) this.l;
            mr0Var = this.m;
            ir0 ir0Var = new ir0(mr0Var, kr0Var);
            xz xzVar = mr0Var.c;
            cm0 cm0Var2 = this.n;
            long j2 = cm0Var2.d;
            if0 if0Var2 = mr0Var.d;
            long j3 = this.o;
            float fC = mr0Var.c(if0Var2 == if0Var ? l51.b(j3) : l51.c(j3));
            this.l = mr0Var;
            this.h = mr0Var;
            this.i = cm0Var2;
            this.j = j2;
            this.k = 1;
            xzVar.getClass();
            obj = nm.K((so) xzVar.f, new vm(fC, xzVar, ir0Var, null), this);
            xl xlVar = xl.d;
            if (obj == xlVar) {
                return xlVar;
            }
            cm0Var = cm0Var2;
            mr0Var2 = mr0Var;
            j = j2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.j;
            cm0Var = this.i;
            mr0Var = this.h;
            mr0Var2 = (mr0) this.l;
            c10.X(obj);
        }
        float fC2 = mr0Var2.c(((Number) obj).floatValue());
        cm0Var.d = mr0Var.d == if0Var ? l51.a(j, fC2, 0.0f, 2) : l51.a(j, 0.0f, fC2, 1);
        return j41.a;
    }
}
