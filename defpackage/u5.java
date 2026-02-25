package defpackage;

import android.graphics.Paint;
import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u5 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(im imVar, hd0 hd0Var, a11 a11Var, r40 r40Var, fw0 fw0Var) {
        super(1);
        this.e = 2;
        this.g = imVar;
        this.h = hd0Var;
        this.f = a11Var;
        this.i = r40Var;
        this.j = fw0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i = this.e;
        j41 j41Var = j41.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.f;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                t40 t40Var = (t40) obj;
                m40 m40Var = ((z5) obj6).a;
                t40Var.h = (a11) obj4;
                t40Var.i = (xy) obj5;
                t40Var.c = (u7) obj3;
                t40Var.d = (iw) obj2;
                t40Var.e = m40Var != null ? m40Var.s : null;
                t40Var.f = m40Var != null ? m40Var.t : null;
                t40Var.g = m40Var != null ? (c61) l81.A(m40Var, ti.s) : null;
                return j41Var;
            case 1:
                wj0 wj0Var = (wj0) obj4;
                wj0Var.q.addView(wj0Var, wj0Var.r);
                wj0Var.j((gw) obj6, (yj0) obj5, (String) obj3, (e30) obj2);
                return new f4(2, wj0Var);
            default:
                v30 v30Var = (v30) obj;
                v30Var.a();
                fd fdVar = v30Var.d;
                float fG = ((im) obj6).b.g();
                if (fG != 0.0f) {
                    long j = ((a11) obj4).b;
                    int i2 = w11.c;
                    int iD = ((hd0) obj5).d((int) (j >> 32));
                    p11 p11VarD = ((r40) obj3).d();
                    xl0 xl0VarC = p11VarD != null ? p11VarD.a.c(iD) : new xl0(0.0f, 0.0f, 0.0f, 0.0f);
                    float fA = v30Var.A(b01.a);
                    float f = fA / 2;
                    float f2 = xl0VarC.a + f;
                    float fD = yu0.d(fdVar.c()) - f;
                    if (f2 > fD) {
                        f2 = fD;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    long jF = nm.f(f, xl0VarC.b);
                    long jF2 = nm.f(f, xl0VarC.d);
                    fw0 fw0Var = (fw0) obj2;
                    dd ddVar = fdVar.d.c;
                    a6 a6VarD = fdVar.g;
                    if (a6VarD == null) {
                        a6VarD = c10.d();
                        a6VarD.i(1);
                        fdVar.g = a6VarD;
                    }
                    a6 a6Var = a6VarD;
                    Paint paint = a6Var.a;
                    fw0Var.a(fG, fdVar.c(), a6Var);
                    if (!c10.i(a6Var.d, null)) {
                        a6Var.f(null);
                    }
                    if (a6Var.b != 3) {
                        a6Var.d(3);
                    }
                    if (paint.getStrokeWidth() != fA) {
                        paint.setStrokeWidth(fA);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (a6Var.a() != 0) {
                        a6Var.g(0);
                    }
                    if (a6Var.b() != 0) {
                        a6Var.h(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        paint.setFilterBitmap(true);
                    }
                    ddVar.m(jF, jF2, a6Var);
                }
                return j41Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = serializable;
        this.j = obj4;
    }
}
