package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vo0 extends yo0 implements Iterator {
    public wo0 d;
    public wo0 e;
    public final /* synthetic */ int f;

    public vo0(wo0 wo0Var, wo0 wo0Var2, int i) {
        this.f = i;
        this.d = wo0Var2;
        this.e = wo0Var;
    }

    @Override // defpackage.yo0
    public final void a(wo0 wo0Var) {
        wo0 wo0Var2;
        wo0 wo0VarB = null;
        if (this.d == wo0Var && wo0Var == this.e) {
            this.e = null;
            this.d = null;
        }
        wo0 wo0Var3 = this.d;
        if (wo0Var3 == wo0Var) {
            switch (this.f) {
                case 0:
                    wo0Var2 = wo0Var3.g;
                    break;
                default:
                    wo0Var2 = wo0Var3.f;
                    break;
            }
            this.d = wo0Var2;
        }
        wo0 wo0Var4 = this.e;
        if (wo0Var4 == wo0Var) {
            wo0 wo0Var5 = this.d;
            if (wo0Var4 != wo0Var5 && wo0Var5 != null) {
                wo0VarB = b(wo0Var4);
            }
            this.e = wo0VarB;
        }
    }

    public final wo0 b(wo0 wo0Var) {
        switch (this.f) {
            case 0:
                return wo0Var.f;
            default:
                return wo0Var.g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        wo0 wo0Var = this.e;
        wo0 wo0Var2 = this.d;
        this.e = (wo0Var == wo0Var2 || wo0Var2 == null) ? null : b(wo0Var);
        return wo0Var;
    }
}
