package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vm extends jy0 implements kw {
    public am0 h;
    public f8 i;
    public int j;
    public final /* synthetic */ float k;
    public final /* synthetic */ xz l;
    public final /* synthetic */ ir0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(float f, xz xzVar, ir0 ir0Var, lk lkVar) {
        super(2, lkVar);
        this.k = f;
        this.l = xzVar;
        this.m = ir0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((vm) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        return new vm(this.k, this.l, this.m, lkVar);
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        float f;
        f8 f8Var;
        am0 am0Var;
        Object objC;
        Object obj2;
        int i = this.j;
        if (i == 0) {
            c10.X(obj);
            f = this.k;
            if (Math.abs(f) > 1.0f) {
                am0 am0Var2 = new am0();
                am0Var2.d = f;
                am0 am0Var3 = new am0();
                q31 q31Var = y41.a;
                f8Var = new f8(q31Var, Float.valueOf(0.0f), new g8(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    xz xzVar = this.l;
                    r1 r1Var = (r1) xzVar.e;
                    rk rkVar = new rk(am0Var3, this.m, am0Var2, xzVar, 1);
                    this.h = am0Var2;
                    this.i = f8Var;
                    this.j = 1;
                    objC = dq0.c(f8Var, new om(r1Var, q31Var, f8Var.e.getValue(), f8Var.f), Long.MIN_VALUE, rkVar, this);
                    obj2 = xl.d;
                    if (objC != obj2) {
                        objC = j41.a;
                    }
                } catch (CancellationException unused) {
                    am0Var = am0Var2;
                    am0Var.d = ((Number) f8Var.d.b.g(f8Var.f)).floatValue();
                    f = am0Var.d;
                    return new Float(f);
                }
                if (objC == obj2) {
                    return obj2;
                }
                am0Var = am0Var2;
                f = am0Var.d;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f8Var = this.i;
            am0Var = this.h;
            try {
                c10.X(obj);
            } catch (CancellationException unused2) {
                am0Var.d = ((Number) f8Var.d.b.g(f8Var.f)).floatValue();
                f = am0Var.d;
                return new Float(f);
            }
            f = am0Var.d;
        }
        return new Float(f);
    }
}
