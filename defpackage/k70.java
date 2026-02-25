package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k70 implements lw {
    public final /* synthetic */ String d;

    public k70(String str) {
        this.d = str;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        ci ciVar = (ci) obj2;
        int iIntValue = ((Number) obj3).intValue();
        c10.p((uf) obj, "$this$Card");
        if ((iIntValue & 17) == 16 && ciVar.z()) {
            ciVar.Q();
        } else {
            dp0.a(null, b10.b0(1116274954, new j70(0, this.d), ciVar), ciVar, 48);
        }
        return j41.a;
    }
}
