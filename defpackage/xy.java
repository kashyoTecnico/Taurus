package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xy {
    public static final xy f = new xy(0, true, 1, 1, d60.f);
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final d60 e;

    public xy(int i, boolean z, int i2, int i3, d60 d60Var) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = i3;
        this.e = d60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy)) {
            return false;
        }
        xy xyVar = (xy) obj;
        return this.a == xyVar.a && this.b == xyVar.b && this.c == xyVar.c && this.d == xyVar.d && c10.i(this.e, xyVar.e);
    }

    public final int hashCode() {
        return this.e.d.hashCode() + b8.c(this.d, b8.c(this.c, b8.d(b8.c(this.a, Boolean.hashCode(false) * 31, 31), 31, this.b), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=false, capitalization=" + ((Object) d80.G(this.a)) + ", autoCorrect=" + this.b + ", keyboardType=" + ((Object) u20.a(this.c)) + ", imeAction=" + ((Object) wy.a(this.d)) + ", platformImeOptions=null, hintLocales=" + this.e + ')';
    }
}
