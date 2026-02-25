package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o8 implements Appendable {
    public final StringBuilder d;
    public final ArrayList e;

    public o8() {
        this.d = new StringBuilder(16);
        new ArrayList();
        this.e = new ArrayList();
        new ArrayList();
    }

    public final void a(q8 q8Var) {
        StringBuilder sb = this.d;
        int length = sb.length();
        sb.append(q8Var.e);
        List list = q8Var.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                p8 p8Var = (p8) list.get(i);
                this.e.add(new n8(p8Var.a, p8Var.b + length, p8Var.c + length, p8Var.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof q8) {
            a((q8) charSequence);
            return this;
        }
        this.d.append(charSequence);
        return this;
    }

    public final q8 b() {
        StringBuilder sb = this.d;
        String string = sb.toString();
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n8 n8Var = (n8) arrayList.get(i);
            int length = sb.length();
            int i2 = n8Var.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                qz.b("Item.end should be set first");
            }
            arrayList2.add(new p8(n8Var.a, n8Var.b, length, n8Var.d));
        }
        return new q8(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof q8;
        StringBuilder sb = this.d;
        if (z) {
            q8 q8Var = (q8) charSequence;
            int length = sb.length();
            sb.append((CharSequence) q8Var.e, i, i2);
            List listA = s8.a(q8Var, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    p8 p8Var = (p8) listA.get(i3);
                    this.e.add(new n8(p8Var.a, p8Var.b + length, p8Var.c + length, p8Var.d));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i2);
        return this;
    }

    public o8(q8 q8Var) {
        this();
        a(q8Var);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.d.append(c);
        return this;
    }
}
