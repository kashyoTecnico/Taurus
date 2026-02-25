package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wh {
    public final ci a;
    public jd b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final u00 d = new u00();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public wh(ci ciVar, jd jdVar) {
        this.a = ciVar;
        this.b = jdVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            gf0 gf0Var = this.b.j;
            gf0Var.O(cf0.c);
            gf0Var.l[gf0Var.m - gf0Var.j[gf0Var.k - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        jd jdVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        jdVar.getClass();
        if (size != 0) {
            gf0 gf0Var2 = jdVar.j;
            gf0Var2.O(ge0.c);
            m20.O(gf0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                gf0 gf0Var = this.b.j;
                gf0Var.O(ue0.c);
                int i3 = gf0Var.m - gf0Var.j[gf0Var.k - 1].a;
                int[] iArr = gf0Var.l;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                gf0 gf0Var2 = this.b.j;
                gf0Var2.O(re0.c);
                int i6 = gf0Var2.m - gf0Var2.j[gf0Var2.k - 1].a;
                int[] iArr2 = gf0Var2.l;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        ci ciVar = this.a;
        int i = z ? ciVar.G.i : ciVar.G.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            fi.c("Tried to seek backward");
        }
        if (i2 > 0) {
            gf0 gf0Var = this.b.j;
            gf0Var.O(zd0.c);
            gf0Var.l[gf0Var.m - gf0Var.j[gf0Var.k - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                fi.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
