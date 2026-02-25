package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vf implements ml, Serializable {
    public final ml d;
    public final kl e;

    public vf(kl klVar, ml mlVar) {
        c10.p(mlVar, "left");
        c10.p(klVar, "element");
        this.d = mlVar;
        this.e = klVar;
    }

    public final boolean equals(Object obj) {
        boolean zI;
        if (this == obj) {
            return true;
        }
        if (obj instanceof vf) {
            vf vfVar = (vf) obj;
            int i = 2;
            vf vfVar2 = vfVar;
            int i2 = 2;
            while (true) {
                ml mlVar = vfVar2.d;
                vfVar2 = mlVar instanceof vf ? (vf) mlVar : null;
                if (vfVar2 == null) {
                    break;
                }
                i2++;
            }
            vf vfVar3 = this;
            while (true) {
                ml mlVar2 = vfVar3.d;
                vfVar3 = mlVar2 instanceof vf ? (vf) mlVar2 : null;
                if (vfVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    kl klVar = this.e;
                    if (!c10.i(vfVar.n(klVar.getKey()), klVar)) {
                        zI = false;
                        break;
                    }
                    ml mlVar3 = this.d;
                    if (!(mlVar3 instanceof vf)) {
                        c10.n(mlVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        kl klVar2 = (kl) mlVar3;
                        zI = c10.i(vfVar.n(klVar2.getKey()), klVar2);
                        break;
                    }
                    this = (vf) mlVar3;
                }
                if (zI) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // defpackage.ml
    public final ml k(ml mlVar) {
        c10.p(mlVar, "context");
        return mlVar == is.d ? this : (ml) mlVar.r(n9.u, this);
    }

    @Override // defpackage.ml
    public final kl n(ll llVar) {
        c10.p(llVar, "key");
        while (true) {
            kl klVarN = this.e.n(llVar);
            if (klVarN != null) {
                return klVarN;
            }
            ml mlVar = this.d;
            if (!(mlVar instanceof vf)) {
                return mlVar.n(llVar);
            }
            this = (vf) mlVar;
        }
    }

    @Override // defpackage.ml
    public final Object r(kw kwVar, Object obj) {
        return kwVar.e(this.d.r(kwVar, obj), this.e);
    }

    public final String toString() {
        return "[" + ((String) r(n9.g, "")) + ']';
    }

    @Override // defpackage.ml
    public final ml v(ll llVar) {
        c10.p(llVar, "key");
        kl klVar = this.e;
        kl klVarN = klVar.n(llVar);
        ml mlVar = this.d;
        if (klVarN != null) {
            return mlVar;
        }
        ml mlVarV = mlVar.v(llVar);
        return mlVarV == mlVar ? this : mlVarV == is.d ? klVar : new vf(klVar, mlVarV);
    }
}
