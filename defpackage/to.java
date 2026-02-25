package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class to extends vo implements yl, lk {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(to.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final pl g;
    public final mk h;
    public Object i;
    public final Object j;

    public to(pl plVar, mk mkVar) {
        super(-1);
        this.g = plVar;
        this.h = mkVar;
        this.i = m20.b;
        this.j = b10.h0(mkVar.f());
    }

    @Override // defpackage.yl
    public final yl d() {
        return this.h;
    }

    @Override // defpackage.lk
    public final ml f() {
        return this.h.f();
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        Throwable thA = zm0.a(obj);
        Object egVar = thA == null ? obj : new eg(thA, false);
        mk mkVar = this.h;
        ml mlVarF = mkVar.f();
        pl plVar = this.g;
        if (plVar.f(mlVarF)) {
            this.i = egVar;
            this.f = 0;
            plVar.d(mkVar.f(), this);
            return;
        }
        xs xsVarA = k21.a();
        if (xsVarA.f >= 4294967296L) {
            this.i = egVar;
            this.f = 0;
            xsVarA.l(this);
            return;
        }
        xsVarA.o(true);
        try {
            ml mlVarF2 = mkVar.f();
            Object objK0 = b10.k0(mlVarF2, this.j);
            try {
                mkVar.h(obj);
                while (xsVarA.u()) {
                }
            } finally {
                b10.f0(mlVarF2, objK0);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.vo
    public final Object j() {
        Object obj = this.i;
        this.i = m20.b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.g + ", " + nm.G(this.h) + ']';
    }

    @Override // defpackage.vo
    public final lk c() {
        return this;
    }
}
