package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jr {
    public final ch0 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public jr(q8 q8Var, long j) {
        String str = q8Var.e;
        ch0 ch0Var = new ch0();
        ch0Var.d = str;
        ch0Var.b = -1;
        ch0Var.c = -1;
        this.a = ch0Var;
        this.b = w11.e(j);
        this.c = w11.d(j);
        this.d = -1;
        this.e = -1;
        int iE = w11.e(j);
        int iD = w11.d(j);
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbI = b8.i("start (", iE, ") offset is outside of text region ");
            sbI.append(str.length());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (iD < 0 || iD > str.length()) {
            StringBuilder sbI2 = b8.i("end (", iD, ") offset is outside of text region ");
            sbI2.append(str.length());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(b8.g("Do not set reversed range: ", iE, " > ", iD));
        }
    }

    public final void a(int i, int i2) {
        long jA = no0.a(i, i2);
        this.a.k(i, i2, "");
        long jD0 = r31.d0(no0.a(this.b, this.c), jA);
        h(w11.e(jD0));
        g(w11.d(jD0));
        int i3 = this.d;
        if (i3 != -1) {
            long jD02 = r31.d0(no0.a(i3, this.e), jA);
            if (w11.b(jD02)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = w11.e(jD02);
                this.e = w11.d(jD02);
            }
        }
    }

    public final char b(int i) {
        ch0 ch0Var = this.a;
        tw twVar = (tw) ch0Var.e;
        if (twVar == null) {
            return ((String) ch0Var.d).charAt(i);
        }
        if (i < ch0Var.b) {
            return ((String) ch0Var.d).charAt(i);
        }
        int iA = twVar.b - twVar.a();
        int i2 = ch0Var.b;
        if (i >= iA + i2) {
            return ((String) ch0Var.d).charAt(i - ((iA - ch0Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = twVar.c;
        return i3 < i4 ? ((char[]) twVar.e)[i3] : ((char[]) twVar.e)[(i3 - i4) + twVar.d];
    }

    public final w11 c() {
        int i = this.d;
        if (i != -1) {
            return new w11(no0.a(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        ch0 ch0Var = this.a;
        if (i < 0 || i > ch0Var.b()) {
            StringBuilder sbI = b8.i("start (", i, ") offset is outside of text region ");
            sbI.append(ch0Var.b());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i2 < 0 || i2 > ch0Var.b()) {
            StringBuilder sbI2 = b8.i("end (", i2, ") offset is outside of text region ");
            sbI2.append(ch0Var.b());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(b8.g("Do not set reversed range: ", i, " > ", i2));
        }
        ch0Var.k(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        ch0 ch0Var = this.a;
        if (i < 0 || i > ch0Var.b()) {
            StringBuilder sbI = b8.i("start (", i, ") offset is outside of text region ");
            sbI.append(ch0Var.b());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i2 < 0 || i2 > ch0Var.b()) {
            StringBuilder sbI2 = b8.i("end (", i2, ") offset is outside of text region ");
            sbI2.append(ch0Var.b());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(b8.g("Do not set reversed or empty range: ", i, " > ", i2));
        }
        this.d = i;
        this.e = i2;
    }

    public final void f(int i, int i2) {
        ch0 ch0Var = this.a;
        if (i < 0 || i > ch0Var.b()) {
            StringBuilder sbI = b8.i("start (", i, ") offset is outside of text region ");
            sbI.append(ch0Var.b());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i2 < 0 || i2 > ch0Var.b()) {
            StringBuilder sbI2 = b8.i("end (", i2, ") offset is outside of text region ");
            sbI2.append(ch0Var.b());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(b8.g("Do not set reversed range: ", i, " > ", i2));
        }
        h(i);
        g(i2);
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            qz.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            qz.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
