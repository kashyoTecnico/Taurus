package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class dl0 {
    public final k40 a;

    public dl0(gw gwVar) {
        this.a = new k40(gwVar);
    }

    public abstract fl0 a(Object obj);

    public u41 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u41 c(fl0 fl0Var, u41 u41Var) {
        xq xqVar = null;
        if (u41Var instanceof xq) {
            if (fl0Var.d) {
                xqVar = (xq) u41Var;
                xqVar.a.setValue(fl0Var.a());
            }
        } else if (u41Var instanceof ix0) {
            if ((fl0Var.b || fl0Var.e != null) && !fl0Var.d) {
                ix0 ix0Var = (ix0) u41Var;
                if (c10.i(fl0Var.a(), ix0Var.a)) {
                    xqVar = ix0Var;
                }
            }
        } else if (u41Var instanceof wi) {
            fl0Var.getClass();
        }
        if (xqVar != null) {
            return xqVar;
        }
        if (!fl0Var.d) {
            return new ix0(fl0Var.a());
        }
        Object obj = fl0Var.e;
        uv0 uv0Var = fl0Var.c;
        if (uv0Var == null) {
            uv0Var = g2.V;
        }
        return new xq(new zg0(obj, uv0Var));
    }
}
