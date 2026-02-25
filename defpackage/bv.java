package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bv implements Comparator {
    public static final bv b = new bv(0);
    public static final bv c = new bv(1);
    public static final bv d = new bv(2);
    public static final bv e = new bv(3);
    public static final bv f = new bv(4);
    public final /* synthetic */ int a;

    public /* synthetic */ bv(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                av avVar = (av) obj;
                av avVar2 = (av) obj2;
                int i = 0;
                if (!m20.H(avVar) || !m20.H(avVar2)) {
                    if (m20.H(avVar)) {
                        return -1;
                    }
                    return m20.H(avVar2) ? 1 : 0;
                }
                t30 t30VarZ = d80.z(avVar);
                t30 t30VarZ2 = d80.z(avVar2);
                if (c10.i(t30VarZ, t30VarZ2)) {
                    return 0;
                }
                t30[] t30VarArr = new t30[16];
                int i2 = 0;
                while (t30VarZ != null) {
                    int i3 = i2 + 1;
                    if (t30VarArr.length < i3) {
                        int length = t30VarArr.length;
                        ?? r4 = new Object[Math.max(i3, length * 2)];
                        System.arraycopy(t30VarArr, 0, r4, 0, length);
                        t30VarArr = r4;
                    }
                    if (i2 != 0) {
                        System.arraycopy(t30VarArr, 0, t30VarArr, 0 + 1, i2 + 0);
                    }
                    t30VarArr[0] = t30VarZ;
                    i2++;
                    t30VarZ = t30VarZ.t();
                }
                t30[] t30VarArr2 = new t30[16];
                int i4 = 0;
                while (t30VarZ2 != null) {
                    int i5 = i4 + 1;
                    if (t30VarArr2.length < i5) {
                        int length2 = t30VarArr2.length;
                        ?? r42 = new Object[Math.max(i5, length2 * 2)];
                        System.arraycopy(t30VarArr2, 0, r42, 0, length2);
                        t30VarArr2 = r42;
                    }
                    if (i4 != 0) {
                        System.arraycopy(t30VarArr2, 0, t30VarArr2, 0 + 1, i4 + 0);
                    }
                    t30VarArr2[0] = t30VarZ2;
                    i4++;
                    t30VarZ2 = t30VarZ2.t();
                }
                int iMin = Math.min(i2 - 1, i4 - 1);
                if (iMin >= 0) {
                    while (c10.i(t30VarArr[i], t30VarArr2[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return c10.w(t30VarArr[i].u(), t30VarArr2[i].u());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            case 1:
                xl0 xl0VarH = ((gt0) obj).h();
                xl0 xl0VarH2 = ((gt0) obj2).h();
                int iCompare = Float.compare(xl0VarH.a, xl0VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(xl0VarH.b, xl0VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(xl0VarH.d, xl0VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(xl0VarH.c, xl0VarH2.c);
            case 2:
                t30 t30Var = (t30) obj;
                t30 t30Var2 = (t30) obj2;
                int iW = c10.w(t30Var2.q, t30Var.q);
                return iW != 0 ? iW : c10.w(t30Var.hashCode(), t30Var2.hashCode());
            case 3:
                xl0 xl0VarH3 = ((gt0) obj).h();
                xl0 xl0VarH4 = ((gt0) obj2).h();
                int iCompare4 = Float.compare(xl0VarH4.c, xl0VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(xl0VarH3.b, xl0VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(xl0VarH3.d, xl0VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(xl0VarH4.a, xl0VarH3.a);
            case 4:
                ng0 ng0Var = (ng0) obj;
                ng0 ng0Var2 = (ng0) obj2;
                int iCompare7 = Float.compare(((xl0) ng0Var.d).b, ((xl0) ng0Var2.d).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((xl0) ng0Var.d).d, ((xl0) ng0Var2.d).d);
            case 5:
                return c4.m(Integer.valueOf(((p8) obj).b), Integer.valueOf(((p8) obj2).b));
            case 6:
                return c4.m(Integer.valueOf(((p8) obj).b), Integer.valueOf(((p8) obj2).b));
            default:
                t30 t30Var3 = (t30) obj;
                t30 t30Var4 = (t30) obj2;
                int iW2 = c10.w(t30Var3.q, t30Var4.q);
                return iW2 != 0 ? iW2 : c10.w(t30Var3.hashCode(), t30Var4.hashCode());
        }
    }
}
