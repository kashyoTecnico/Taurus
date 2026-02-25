package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class is implements ml, Serializable {
    public static final is d = new is();

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.ml
    public final ml k(ml mlVar) {
        c10.p(mlVar, "context");
        return mlVar;
    }

    @Override // defpackage.ml
    public final kl n(ll llVar) {
        c10.p(llVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.ml
    public final ml v(ll llVar) {
        c10.p(llVar, "key");
        return this;
    }

    @Override // defpackage.ml
    public final Object r(kw kwVar, Object obj) {
        return obj;
    }
}
