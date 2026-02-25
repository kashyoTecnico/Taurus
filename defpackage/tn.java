package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tn implements hr {
    public final int a;
    public final int b;

    public tn(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        qz.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.hr
    public final void a(jr jrVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = jrVar.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(jrVar.b((i5 - i4) + (-1))) && Character.isLowSurrogate(jrVar.b(jrVar.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iB = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iB + 1;
            int i7 = jrVar.c;
            ch0 ch0Var = jrVar.a;
            if (i7 + i6 >= ch0Var.b()) {
                iB = ch0Var.b() - jrVar.c;
                break;
            } else {
                iB = (Character.isHighSurrogate(jrVar.b((jrVar.c + i6) + (-1))) && Character.isLowSurrogate(jrVar.b(jrVar.c + i6))) ? iB + 2 : i6;
                i++;
            }
        }
        int i8 = jrVar.c;
        jrVar.a(i8, iB + i8);
        int i9 = jrVar.b;
        jrVar.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn)) {
            return false;
        }
        tn tnVar = (tn) obj;
        return this.a == tnVar.a && this.b == tnVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return b8.h(sb, this.b, ')');
    }
}
