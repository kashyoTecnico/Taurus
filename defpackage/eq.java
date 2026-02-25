package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class eq extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ dr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq(dr0 dr0Var, int i) {
        super(2);
        this.e = i;
        this.f = dr0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                nj0 nj0Var = (nj0) obj;
                long j = ((ed0) obj2).a;
                dr0 dr0Var = this.f;
                if (((Boolean) dr0Var.u.g(nj0Var)).booleanValue()) {
                    if (!dr0Var.z) {
                        if (dr0Var.x == null) {
                            dr0Var.x = nm.a(Integer.MAX_VALUE, 6, null);
                        }
                        dr0Var.z = true;
                        nm.z(dr0Var.o0(), null, new iq(dr0Var, null), 3);
                    }
                    long j2 = nj0Var.c;
                    long jF = ed0.f(j2, nm.f(ed0.d(j) * Math.signum(ed0.d(j2)), ed0.e(j) * Math.signum(ed0.e(j2))));
                    gc gcVar = dr0Var.x;
                    if (gcVar != null) {
                        gcVar.u(new tp(jF));
                    }
                }
                return j41.a;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                dr0 dr0Var2 = this.f;
                nm.z(dr0Var2.o0(), null, new cr0(dr0Var2, fFloatValue, fFloatValue2, null), 3);
                return Boolean.TRUE;
        }
    }
}
