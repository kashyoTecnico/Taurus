package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xj {
    public final zv0 a = new zv0();

    public static void b(xj xjVar, jk jkVar, boolean z, gw gwVar) {
        xjVar.a.add(new zg(262103052, true, new ie(jkVar, z, gwVar)));
    }

    public final void a(uj ujVar, ci ciVar, int i) {
        ciVar.W(1320309496);
        int i2 = (ciVar.f(ujVar) ? 4 : 2) | i | (ciVar.f(this) ? 32 : 16);
        if ((i2 & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else {
            zv0 zv0Var = this.a;
            int size = zv0Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((lw) zv0Var.get(i3)).c(ujVar, ciVar, Integer.valueOf(i2 & 14));
            }
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new h4(i, 5, this, ujVar);
        }
    }
}
