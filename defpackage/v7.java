package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v7 extends jy0 implements iw {
    public f8 h;
    public zl0 i;
    public int j;
    public final /* synthetic */ x7 k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ jz0 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(x7 x7Var, Object obj, jz0 jz0Var, long j, lk lkVar) {
        super(1, lkVar);
        this.k = x7Var;
        this.l = obj;
        this.m = jz0Var;
        this.n = j;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        jz0 jz0Var = this.m;
        long j = this.n;
        return new v7(this.k, this.l, jz0Var, j, (lk) obj).o(j41.a);
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        f8 f8Var;
        zl0 zl0Var;
        jz0 jz0Var = this.m;
        int i = this.j;
        int i2 = 1;
        x7 x7Var = this.k;
        try {
            if (i == 0) {
                c10.X(obj);
                x7Var.c.f = (k8) x7Var.a.a.g(this.l);
                x7Var.e.setValue(jz0Var.c);
                x7Var.d.setValue(Boolean.TRUE);
                f8 f8Var2 = x7Var.c;
                f8 f8Var3 = new f8(f8Var2.d, f8Var2.e.getValue(), l81.w(f8Var2.f), f8Var2.g, Long.MIN_VALUE, f8Var2.i);
                zl0 zl0Var2 = new zl0();
                long j = this.n;
                u7 u7Var = new u7(x7Var, f8Var3, zl0Var2, 0);
                this.h = f8Var3;
                this.i = zl0Var2;
                this.j = 1;
                Object objC = dq0.c(f8Var3, jz0Var, j, u7Var, this);
                xl xlVar = xl.d;
                if (objC == xlVar) {
                    return xlVar;
                }
                f8Var = f8Var3;
                zl0Var = zl0Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zl0Var = this.i;
                f8Var = this.h;
                c10.X(obj);
            }
            if (!zl0Var.d) {
                i2 = 2;
            }
            f8 f8Var4 = x7Var.c;
            f8Var4.f.d();
            f8Var4.g = Long.MIN_VALUE;
            x7Var.d.setValue(Boolean.FALSE);
            return new c8(i2, 0, f8Var);
        } catch (CancellationException e) {
            f8 f8Var5 = x7Var.c;
            f8Var5.f.d();
            f8Var5.g = Long.MIN_VALUE;
            x7Var.d.setValue(Boolean.FALSE);
            throw e;
        }
    }
}
