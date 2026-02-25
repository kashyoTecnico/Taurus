package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nh extends jy0 implements kw {
    public int h;
    public /* synthetic */ float i;
    public final /* synthetic */ oh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(oh ohVar, lk lkVar) {
        super(2, lkVar);
        this.j = ohVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((nh) k((lk) obj2, Float.valueOf(((Number) obj).floatValue()))).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        nh nhVar = new nh(this.j, lkVar);
        nhVar.i = ((Number) obj).floatValue();
        return nhVar;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.h;
        if (i == 0) {
            c10.X(obj);
            float f = this.i;
            oh ohVar = this.j;
            Object objG = ohVar.a.d.d.g(bt0.e);
            if (objG == null) {
                objG = null;
            }
            kw kwVar = (kw) objG;
            if (kwVar == null) {
                throw b8.f("Required value was null.");
            }
            ed0 ed0Var = new ed0((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.h = 1;
            obj = kwVar.e(ed0Var, this);
            xl xlVar = xl.d;
            if (obj == xlVar) {
                return xlVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10.X(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((ed0) obj).a & 4294967295L)));
    }
}
