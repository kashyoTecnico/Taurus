package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sn implements hr {
    public final int a;
    public final int b;

    public sn(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        qz.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.hr
    public final void a(jr jrVar) {
        int i = jrVar.c;
        ch0 ch0Var = jrVar.a;
        int i2 = this.b;
        int iB = i + i2;
        if (((i ^ iB) & (i2 ^ iB)) < 0) {
            iB = ch0Var.b();
        }
        jrVar.a(jrVar.c, Math.min(iB, ch0Var.b()));
        int i3 = jrVar.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        jrVar.a(Math.max(0, i5), jrVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn)) {
            return false;
        }
        sn snVar = (sn) obj;
        return this.a == snVar.a && this.b == snVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return b8.h(sb, this.b, ')');
    }
}
