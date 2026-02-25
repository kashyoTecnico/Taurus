package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class xh0 extends t {
    public static final xh0 f = new xh0(l31.e, 0);
    public final l31 d;
    public final int e;

    public xh0(l31 l31Var, int i) {
        this.d = l31Var;
        this.e = i;
    }

    public final xh0 a(Object obj, v50 v50Var) {
        c8 c8VarU = this.d.u(obj != null ? obj.hashCode() : 0, 0, obj, v50Var);
        return c8VarU == null ? this : new xh0((l31) c8VarU.c, this.e + c8VarU.b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
