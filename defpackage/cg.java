package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cg {
    public final Object a;
    public final wc b;
    public final lw c;
    public final Object d;
    public final Throwable e;

    public cg(Object obj, wc wcVar, lw lwVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = wcVar;
        this.c = lwVar;
        this.d = obj2;
        this.e = th;
    }

    public static cg a(cg cgVar, wc wcVar, Throwable th, int i) {
        Object obj = cgVar.a;
        if ((i & 2) != 0) {
            wcVar = cgVar.b;
        }
        wc wcVar2 = wcVar;
        lw lwVar = cgVar.c;
        Object obj2 = cgVar.d;
        if ((i & 16) != 0) {
            th = cgVar.e;
        }
        return new cg(obj, wcVar2, lwVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return c10.i(this.a, cgVar.a) && c10.i(this.b, cgVar.b) && c10.i(this.c, cgVar.c) && c10.i(this.d, cgVar.d) && c10.i(this.e, cgVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        wc wcVar = this.b;
        int iHashCode2 = (iHashCode + (wcVar == null ? 0 : wcVar.hashCode())) * 31;
        lw lwVar = this.c;
        int iHashCode3 = (iHashCode2 + (lwVar == null ? 0 : lwVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ cg(Object obj, wc wcVar, lw lwVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : wcVar, (i & 4) != 0 ? null : lwVar, (Object) null, (i & 16) != 0 ? null : th);
    }
}
