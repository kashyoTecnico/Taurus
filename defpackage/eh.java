package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class eh implements lw {
    public static final eh e = new eh(0);
    public static final eh f = new eh(1);
    public static final eh g = new eh(2);
    public final /* synthetic */ int d;

    public /* synthetic */ eh(int i) {
        this.d = i;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case 0:
                ci ciVar = (ci) obj2;
                int iIntValue = ((Number) obj3).intValue();
                c10.p((mo0) obj, "$this$Button");
                if ((iIntValue & 17) == 16 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    l11.b("Remover Restriccion de Restablecer ajustes de fábrica", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, ciVar, 6, 131070);
                }
                break;
            case 1:
                ci ciVar2 = (ci) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                c10.p((mo0) obj, "$this$Button");
                if ((iIntValue2 & 17) == 16 && ciVar2.z()) {
                    ciVar2.Q();
                } else {
                    l11.b("Confirmar", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, ciVar2, 6, 131070);
                }
                break;
            default:
                ci ciVar3 = (ci) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                c10.p((mo0) obj, "$this$TextButton");
                if ((iIntValue3 & 17) == 16 && ciVar3.z()) {
                    ciVar3.Q();
                } else {
                    l11.b("Cancelar", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, ciVar3, 6, 131070);
                }
                break;
        }
        return j41.a;
    }
}
