package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b5 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    @Override // defpackage.gw
    public final Object a() {
        xa0 xa0VarI;
        switch (this.e) {
            case 0:
                ((qo) this.f).d((gw) this.g, (no) this.h, (e30) this.i);
                return j41.a;
            case 1:
                if (!((r40) this.f).b()) {
                    vu vuVar = (vu) this.g;
                    vuVar.getClass();
                    vuVar.a(new uu(1));
                }
                int i = ((xy) this.h).c;
                if (i != 7 && i != 8 && (xa0VarI = ((z5) this.i).i()) != null) {
                    ((qu0) xa0VarI).q(j41.a);
                }
                return Boolean.TRUE;
            default:
                Number number = (Number) this.h;
                Number number2 = (Number) this.f;
                lz lzVar = (lz) this.g;
                if (!number2.equals(lzVar.d) || !number.equals(lzVar.e)) {
                    kz kzVar = (kz) this.i;
                    lzVar.d = number2;
                    lzVar.e = number;
                    lzVar.h = new jz0(kzVar, lzVar.f, number2, number, null);
                    lzVar.l.b.setValue(Boolean.TRUE);
                    lzVar.i = false;
                    lzVar.j = true;
                }
                return j41.a;
        }
    }
}
