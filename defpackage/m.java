package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class m implements kl {
    public final ll d;

    public m(ll llVar) {
        this.d = llVar;
    }

    @Override // defpackage.kl
    public final ll getKey() {
        return this.d;
    }

    @Override // defpackage.ml
    public final ml k(ml mlVar) {
        return d80.v(this, mlVar);
    }

    @Override // defpackage.ml
    public kl n(ll llVar) {
        return d80.r(this, llVar);
    }

    @Override // defpackage.ml
    public final Object r(kw kwVar, Object obj) {
        return kwVar.e(obj, this);
    }

    @Override // defpackage.ml
    public ml v(ll llVar) {
        return d80.u(this, llVar);
    }
}
