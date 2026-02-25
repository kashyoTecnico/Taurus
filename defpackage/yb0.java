package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yb0 extends ya0 {
    public final ya0 o;
    public boolean p;

    public yb0(long j, lv0 lv0Var, iw iwVar, iw iwVar2, ya0 ya0Var) {
        super(j, lv0Var, iwVar, iwVar2);
        this.o = ya0Var;
        ya0Var.k();
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.ya0
    public final mq0 w() {
        yb0 yb0Var;
        ya0 ya0Var = this.o;
        if (ya0Var.m || ya0Var.c) {
            return new hv0();
        }
        ua0 ua0Var = this.h;
        long j = this.b;
        HashMap mapC = ua0Var != null ? ov0.c(ya0Var.g(), this, this.o.d()) : null;
        Object obj = ov0.c;
        synchronized (obj) {
            try {
                ov0.d(this);
                if (ua0Var == null || ua0Var.d == 0) {
                    yb0Var = this;
                    yb0Var.a();
                } else {
                    yb0Var = this;
                    mq0 mq0VarZ = yb0Var.z(this.o.g(), ua0Var, mapC, this.o.d());
                    if (!mq0VarZ.equals(iv0.a)) {
                        return mq0VarZ;
                    }
                    ua0 ua0VarX = yb0Var.o.x();
                    if (ua0VarX != null) {
                        ua0VarX.i(ua0Var);
                    } else {
                        yb0Var.o.B(ua0Var);
                        yb0Var.h = null;
                    }
                }
                if (c10.x(yb0Var.o.g(), j) < 0) {
                    yb0Var.o.v();
                }
                ya0 ya0Var2 = yb0Var.o;
                ya0Var2.r(ya0Var2.d().b(j).a(yb0Var.j));
                yb0Var.o.A(j);
                ya0 ya0Var3 = yb0Var.o;
                int i = yb0Var.d;
                yb0Var.d = -1;
                if (i >= 0) {
                    int[] iArr = ya0Var3.k;
                    c10.p(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    ya0Var3.k = iArrCopyOf;
                } else {
                    ya0Var3.getClass();
                }
                ya0 ya0Var4 = yb0Var.o;
                lv0 lv0Var = yb0Var.j;
                ya0Var4.getClass();
                synchronized (obj) {
                    ya0Var4.j = ya0Var4.j.d(lv0Var);
                    ya0 ya0Var5 = yb0Var.o;
                    int[] iArr2 = yb0Var.k;
                    ya0Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = ya0Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            c10.m(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        ya0Var5.k = iArr2;
                    }
                }
                yb0Var.m = true;
                if (!yb0Var.p) {
                    yb0Var.p = true;
                    yb0Var.o.l();
                }
                return iv0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
