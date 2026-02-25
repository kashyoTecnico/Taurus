package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x90 implements ks0 {
    public final ga0 a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final sr0 f;

    public x90(ga0 ga0Var, List list, int i, int i2, boolean z, sr0 sr0Var) {
        this.a = ga0Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = sr0Var;
        if (list.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.').toString());
    }

    public static void n(ia0 ia0Var, sr0 sr0Var, pr0 pr0Var, int i, int i2) {
        sr0 sr0Var2;
        if (sr0Var.c) {
            sr0Var2 = new sr0(pr0Var.a(i2), pr0Var.a(i), i2 > i);
        } else {
            sr0Var2 = new sr0(pr0Var.a(i), pr0Var.a(i2), i > i2);
        }
        if (i > i2) {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + sr0Var2).toString());
        }
        long j = pr0Var.a;
        int iB = ia0Var.b(j);
        Object[] objArr = ia0Var.c;
        Object obj = objArr[iB];
        ia0Var.b[iB] = j;
        objArr[iB] = sr0Var2;
    }

    @Override // defpackage.ks0
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.ks0
    public final pr0 b() {
        return this.e ? e() : j();
    }

    @Override // defpackage.ks0
    public final sr0 c() {
        return this.f;
    }

    @Override // defpackage.ks0
    public final pr0 d() {
        return k() == 1 ? j() : e();
    }

    @Override // defpackage.ks0
    public final pr0 e() {
        return (pr0) this.b.get(p(this.c, true));
    }

    @Override // defpackage.ks0
    public final int f() {
        return this.c;
    }

    @Override // defpackage.ks0
    public final boolean g(ks0 ks0Var) {
        if (this.f != null && ks0Var != null && (ks0Var instanceof x90)) {
            x90 x90Var = (x90) ks0Var;
            List list = x90Var.b;
            if (this.e == x90Var.e && this.c == x90Var.c && this.d == x90Var.d) {
                List list2 = this.b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        pr0 pr0Var = (pr0) list2.get(i);
                        pr0 pr0Var2 = (pr0) list.get(i);
                        if (pr0Var.a != pr0Var2.a || pr0Var.c != pr0Var2.c || pr0Var.d != pr0Var2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ks0
    public final ia0 h(sr0 sr0Var) {
        rr0 rr0Var = sr0Var.a;
        boolean z = sr0Var.c;
        long j = rr0Var.c;
        int i = rr0Var.b;
        rr0 rr0Var2 = sr0Var.b;
        long j2 = rr0Var2.c;
        int i2 = rr0Var2.b;
        if (j != j2) {
            ia0 ia0Var = m60.a;
            ia0 ia0Var2 = new ia0();
            n(ia0Var2, sr0Var, d(), (z ? rr0Var2 : rr0Var).b, d().f.a.a.e.length());
            l(new j4(this, ia0Var2, sr0Var));
            if (!z) {
                rr0Var = rr0Var2;
            }
            n(ia0Var2, sr0Var, k() == 1 ? e() : j(), 0, rr0Var.b);
            return ia0Var2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + sr0Var).toString());
        }
        ia0 ia0Var3 = m60.a;
        ia0 ia0Var4 = new ia0();
        int iB = ia0Var4.b(j);
        ia0Var4.b[iB] = j;
        ia0Var4.c[iB] = sr0Var;
        return ia0Var4;
    }

    @Override // defpackage.ks0
    public final int i() {
        return this.d;
    }

    @Override // defpackage.ks0
    public final pr0 j() {
        return (pr0) this.b.get(p(this.d, false));
    }

    @Override // defpackage.ks0
    public final int k() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return ((pr0) this.b.get(i / 2)).b();
    }

    @Override // defpackage.ks0
    public final void l(iw iwVar) {
        int iO = o(d().a);
        int iO2 = o((k() == 1 ? e() : j()).a);
        int i = iO + 1;
        if (i >= iO2) {
            return;
        }
        while (i < iO2) {
            iwVar.g(this.b.get(i));
            i++;
        }
    }

    @Override // defpackage.ks0
    public final int m() {
        return this.b.size();
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Invalid selectableId: " + j, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int iP = b8.p(k());
        int i2 = z;
        if (iP == 0) {
            i2 = z == 0 ? 1 : 0;
        } else if (iP != 1) {
            if (iP != 2) {
                throw new fg();
            }
        }
        return (i - (i2 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        float f = 2;
        sb.append((this.c + 1) / f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / f);
        sb.append(", crossed=");
        sb.append(b8.q(k()));
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            pr0 pr0Var = (pr0) list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(pr0Var);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        c10.o(string, "StringBuilder().apply(builderAction).toString()");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }
}
