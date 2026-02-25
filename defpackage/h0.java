package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class h0 {
    public i0[] d;
    public int e;
    public int f;
    public zx0 g;

    public final i0 a() {
        i0 i0VarC;
        zx0 zx0Var;
        synchronized (this) {
            try {
                i0[] i0VarArrD = this.d;
                if (i0VarArrD == null) {
                    i0VarArrD = d();
                    this.d = i0VarArrD;
                } else if (this.e >= i0VarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(i0VarArrD, i0VarArrD.length * 2);
                    c10.o(objArrCopyOf, "copyOf(...)");
                    this.d = (i0[]) objArrCopyOf;
                    i0VarArrD = (i0[]) objArrCopyOf;
                }
                int i = this.f;
                do {
                    i0VarC = i0VarArrD[i];
                    if (i0VarC == null) {
                        i0VarC = c();
                        i0VarArrD[i] = i0VarC;
                    }
                    i++;
                    if (i >= i0VarArrD.length) {
                        i = 0;
                    }
                } while (!i0VarC.a(this));
                this.f = i;
                this.e++;
                zx0Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zx0Var != null) {
            zx0Var.w(1);
        }
        return i0VarC;
    }

    public abstract i0 c();

    public abstract i0[] d();

    public final void f(i0 i0Var) {
        zx0 zx0Var;
        int i;
        lk[] lkVarArrB;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                zx0Var = this.g;
                if (i2 == 0) {
                    this.f = 0;
                }
                c10.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                lkVarArrB = i0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (lk lkVar : lkVarArrB) {
            if (lkVar != null) {
                lkVar.h(j41.a);
            }
        }
        if (zx0Var != null) {
            zx0Var.w(-1);
        }
    }

    public final zx0 g() {
        zx0 zx0Var;
        synchronized (this) {
            zx0Var = this.g;
            if (zx0Var == null) {
                int i = this.e;
                zx0Var = new zx0(1, Integer.MAX_VALUE, ec.e);
                zx0Var.q(Integer.valueOf(i));
                this.g = zx0Var;
            }
        }
        return zx0Var;
    }
}
