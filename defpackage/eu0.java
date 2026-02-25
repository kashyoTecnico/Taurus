package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class eu0 implements hr {
    public final q8 a;
    public final int b;

    public eu0(String str, int i) {
        this.a = new q8(str);
        this.b = i;
    }

    @Override // defpackage.hr
    public final void a(jr jrVar) {
        int i = jrVar.d;
        q8 q8Var = this.a;
        if (i != -1) {
            int i2 = jrVar.e;
            String str = q8Var.e;
            String str2 = q8Var.e;
            jrVar.d(i, i2, str);
            if (str2.length() > 0) {
                jrVar.e(i, str2.length() + i);
            }
        } else {
            int i3 = jrVar.b;
            int i4 = jrVar.c;
            String str3 = q8Var.e;
            String str4 = q8Var.e;
            jrVar.d(i3, i4, str3);
            if (str4.length() > 0) {
                jrVar.e(i3, str4.length() + i3);
            }
        }
        int i5 = jrVar.b;
        int i6 = jrVar.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iU = c10.u(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - q8Var.e.length(), 0, jrVar.a.b());
        jrVar.f(iU, iU);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        return c10.i(this.a.e, eu0Var.a.e) && this.b == eu0Var.b;
    }

    public final int hashCode() {
        return (this.a.e.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.e);
        sb.append("', newCursorPosition=");
        return b8.h(sb, this.b, ')');
    }
}
