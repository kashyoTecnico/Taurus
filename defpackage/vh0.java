package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vh0 extends xh0 implements wh0 {
    public static final vh0 g = new vh0(l31.e, 0);

    public final vh0 b(dl0 dl0Var, u41 u41Var) {
        c8 c8VarU = this.d.u(dl0Var.hashCode(), 0, dl0Var, u41Var);
        return c8VarU == null ? this : new vh0((l31) c8VarU.c, this.e + c8VarU.b);
    }

    @Override // defpackage.xh0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof dl0) {
            return super.containsKey((dl0) obj);
        }
        return false;
    }

    @Override // defpackage.t, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof u41) {
            return super.containsValue((u41) obj);
        }
        return false;
    }

    @Override // defpackage.xh0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof dl0) {
            return (u41) super.get((dl0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof dl0) ? obj2 : (u41) super.getOrDefault((dl0) obj, (u41) obj2);
    }
}
