package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wf implements e90 {
    public final e90 a;
    public final e90 b;

    public wf(e90 e90Var, e90 e90Var2) {
        this.a = e90Var;
        this.b = e90Var2;
    }

    @Override // defpackage.e90
    public final Object a(kw kwVar, Object obj) {
        return this.b.a(kwVar, this.a.a(kwVar, obj));
    }

    @Override // defpackage.e90
    public final boolean b(iw iwVar) {
        return this.a.b(iwVar) && this.b.b(iwVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return c10.i(this.a, wfVar.a) && c10.i(this.b, wfVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) a(n9.h, "")) + ']';
    }
}
