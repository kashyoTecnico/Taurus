package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sd extends nd {
    public final jy0 h;

    /* JADX WARN: Multi-variable type inference failed */
    public sd(lw lwVar, vt vtVar, ml mlVar, int i, ec ecVar) {
        super(vtVar, mlVar, i, ecVar);
        this.h = (jy0) lwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [jy0, lw] */
    @Override // defpackage.nd
    public final nd a(ml mlVar, int i, ec ecVar) {
        return new sd(this.h, this.g, mlVar, i, ecVar);
    }

    @Override // defpackage.nd
    public final Object d(wt wtVar, mk mkVar) {
        Object objQ = nm.q(new pd(this, wtVar, null), mkVar);
        return objQ == xl.d ? objQ : j41.a;
    }
}
