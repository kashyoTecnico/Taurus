package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class li implements ff0, kl {
    public static final v71 e = new v71(13);
    public final ci d;

    public li(ci ciVar) {
        this.d = ciVar;
    }

    @Override // defpackage.ff0
    public final List c(Integer num) {
        return this.d.D();
    }

    @Override // defpackage.kl
    public final ll getKey() {
        return e;
    }

    @Override // defpackage.ml
    public final ml k(ml mlVar) {
        return d80.v(this, mlVar);
    }

    @Override // defpackage.ml
    public final kl n(ll llVar) {
        return d80.r(this, llVar);
    }

    @Override // defpackage.ml
    public final Object r(kw kwVar, Object obj) {
        return kwVar.e(obj, this);
    }

    @Override // defpackage.ml
    public final ml v(ll llVar) {
        return d80.u(this, llVar);
    }
}
