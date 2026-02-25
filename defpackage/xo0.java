package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xo0 extends yo0 implements Iterator {
    public wo0 d;
    public boolean e = true;
    public final /* synthetic */ ct f;

    public xo0(ct ctVar) {
        this.f = ctVar;
    }

    @Override // defpackage.yo0
    public final void a(wo0 wo0Var) {
        wo0 wo0Var2 = this.d;
        if (wo0Var == wo0Var2) {
            wo0 wo0Var3 = wo0Var2.g;
            this.d = wo0Var3;
            this.e = wo0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return this.f.d != null;
        }
        wo0 wo0Var = this.d;
        return (wo0Var == null || wo0Var.f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            this.d = this.f.d;
        } else {
            wo0 wo0Var = this.d;
            this.d = wo0Var != null ? wo0Var.f : null;
        }
        return this.d;
    }
}
