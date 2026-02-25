package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cl extends y20 implements iw {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ r40 f;
    public final /* synthetic */ a11 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(boolean z, r40 r40Var, ct0 ct0Var, a11 a11Var) {
        super(1);
        this.e = z;
        this.f = r40Var;
        this.g = a11Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        q8 q8Var = (q8) obj;
        if (!this.e) {
            return Boolean.FALSE;
        }
        r40 r40Var = this.f;
        j11 j11Var = r40Var.e;
        xk xkVar = r40Var.t;
        j41 j41Var = null;
        if (j11Var != null) {
            a11 a11VarI = r40Var.d.i(ve.M(new ht(), new xf(q8Var, 1)));
            j11Var.a(null, a11VarI);
            xkVar.g(a11VarI);
            j41Var = j41.a;
        }
        if (j41Var == null) {
            a11 a11Var = this.g;
            q8 q8Var2 = a11Var.a;
            long j = a11Var.b;
            String str = q8Var2.e;
            int i = w11.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            c10.p(str, "<this>");
            c10.p(q8Var, "replacement");
            if (i3 < i2) {
                throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) str, 0, i2);
            sb.append((CharSequence) q8Var);
            sb.append((CharSequence) str, i3, str.length());
            String string = sb.toString();
            int length = q8Var.e.length() + i2;
            xkVar.g(new a11(string, no0.a(length, length), 4));
        }
        return Boolean.TRUE;
    }
}
