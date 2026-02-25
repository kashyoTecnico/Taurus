package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fl0 {
    public final dl0 a;
    public final boolean b;
    public final uv0 c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public fl0(dl0 dl0Var, Object obj, boolean z, uv0 uv0Var, boolean z2) {
        this.a = dl0Var;
        this.b = z;
        this.c = uv0Var;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        fi.d("Unexpected form of a provided value");
        throw new fg();
    }
}
