package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class pl extends m implements nk {
    public static final ol e = new ol(g2.v, new r8(1));

    public pl() {
        super(g2.v);
    }

    public abstract void d(ml mlVar, Runnable runnable);

    public boolean f(ml mlVar) {
        return !(this instanceof f41);
    }

    public pl g(int i) {
        l81.t(i);
        return new j50(this, i);
    }

    @Override // defpackage.m, defpackage.ml
    public final kl n(ll llVar) {
        kl klVar;
        c10.p(llVar, "key");
        if (llVar instanceof ol) {
            ol olVar = (ol) llVar;
            ll llVar2 = this.d;
            if ((llVar2 == olVar || olVar.e == llVar2) && (klVar = (kl) olVar.d.g(this)) != null) {
                return klVar;
            }
        } else if (g2.v == llVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + nm.t(this);
    }

    @Override // defpackage.m, defpackage.ml
    public final ml v(ll llVar) {
        c10.p(llVar, "key");
        if (llVar instanceof ol) {
            ol olVar = (ol) llVar;
            ll llVar2 = this.d;
            if ((llVar2 != olVar && olVar.e != llVar2) || ((kl) olVar.d.g(this)) == null) {
                return this;
            }
        } else if (g2.v != llVar) {
            return this;
        }
        return is.d;
    }
}
