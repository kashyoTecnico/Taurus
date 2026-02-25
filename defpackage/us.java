package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class us implements Runnable, Comparable, cp {
    private volatile Object _heap;
    public long d;
    public int e;

    @Override // defpackage.cp
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                cs csVar = nm.e;
                if (obj == csVar) {
                    return;
                }
                vs vsVar = obj instanceof vs ? (vs) obj : null;
                if (vsVar != null) {
                    synchronized (vsVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof m21 ? (m21) obj2 : null) != null) {
                            vsVar.b(this.e);
                        }
                    }
                }
                this._heap = csVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, vs vsVar, ws wsVar) {
        synchronized (this) {
            if (this._heap == nm.e) {
                return 2;
            }
            synchronized (vsVar) {
                try {
                    us[] usVarArr = vsVar.a;
                    us usVar = usVarArr != null ? usVarArr[0] : null;
                    if (ws.l.get(wsVar) != 0) {
                        return 1;
                    }
                    if (usVar == null) {
                        vsVar.c = j;
                    } else {
                        long j2 = usVar.d;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - vsVar.c > 0) {
                            vsVar.c = j;
                        }
                    }
                    long j3 = this.d;
                    long j4 = vsVar.c;
                    if (j3 - j4 < 0) {
                        this.d = j4;
                    }
                    vsVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.d - ((us) obj).d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(vs vsVar) {
        if (this._heap == nm.e) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = vsVar;
    }

    public String toString() {
        return "Delayed[nanos=" + this.d + ']';
    }
}
