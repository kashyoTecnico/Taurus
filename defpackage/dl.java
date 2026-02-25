package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dl extends y20 implements lw {
    public final /* synthetic */ hd0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ a11 g;
    public final /* synthetic */ u01 h;
    public final /* synthetic */ r40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(hd0 hd0Var, boolean z, a11 a11Var, u01 u01Var, r40 r40Var) {
        super(3);
        this.e = hd0Var;
        this.f = z;
        this.g = a11Var;
        this.h = u01Var;
        this.i = r40Var;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        a11 a11Var = this.g;
        q8 q8Var = a11Var.a;
        hd0 hd0Var = this.e;
        if (!zBooleanValue) {
            iIntValue = hd0Var.a(iIntValue);
        }
        if (!zBooleanValue) {
            iIntValue2 = hd0Var.a(iIntValue2);
        }
        boolean z = false;
        if (this.f) {
            long j = a11Var.b;
            int i = w11.c;
            if (iIntValue != ((int) (j >> 32)) || iIntValue2 != ((int) (j & 4294967295L))) {
                int iMin = Math.min(iIntValue, iIntValue2);
                px pxVar = px.d;
                u01 u01Var = this.h;
                if (iMin < 0 || Math.max(iIntValue, iIntValue2) > q8Var.e.length()) {
                    u01Var.p(false);
                    u01Var.n(pxVar);
                } else {
                    if (zBooleanValue || iIntValue == iIntValue2) {
                        u01Var.p(false);
                        u01Var.n(pxVar);
                    } else {
                        u01Var.f(true);
                    }
                    this.i.t.g(new a11(q8Var, no0.a(iIntValue, iIntValue2), (w11) null));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
