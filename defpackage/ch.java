package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ch implements kw {
    public static final ch e = new ch(0);
    public static final ch f = new ch(1);
    public static final ch g = new ch(2);
    public static final ch h = new ch(3);
    public static final ch i = new ch(4);
    public final /* synthetic */ int d;

    public /* synthetic */ ch(int i2) {
        this.d = i2;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ci ciVar = (ci) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ciVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ciVar.Q();
                }
                return j41.a;
            case 1:
                ci ciVar2 = (ci) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ciVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ciVar2.Q();
                }
                return j41.a;
            case 2:
                ci ciVar3 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar3.z()) {
                    ciVar3.Q();
                } else {
                    l11.b("Seguridad", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, ciVar3, 6, 131070);
                }
                return j41.a;
            case 3:
                ci ciVar4 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar4.z()) {
                    ciVar4.Q();
                } else {
                    l11.b("PIN de Seguridad", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, ciVar4, 6, 131070);
                }
                return j41.a;
            default:
                long j = ((bf) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(r31.Z(j));
        }
    }
}
