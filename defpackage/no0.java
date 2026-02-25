package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class no0 {
    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            qz.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = w11.c;
        return j;
    }

    public static final long b(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float c(defpackage.ni0 r6, boolean r7, defpackage.ly[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.d(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.c(ni0, boolean, ly[], float):float");
    }

    public static final boolean d(xl0 xl0Var, xl0 xl0Var2, xl0 xl0Var3, int i) {
        float f;
        float f2;
        boolean zE = e(i, xl0Var3, xl0Var);
        float f3 = xl0Var3.b;
        float f4 = xl0Var3.d;
        float f5 = xl0Var3.a;
        float f6 = xl0Var3.c;
        float f7 = xl0Var.d;
        float f8 = xl0Var.b;
        float f9 = xl0Var.c;
        float f10 = xl0Var.a;
        if (zE || !e(i, xl0Var2, xl0Var)) {
            return false;
        }
        if (i == 3) {
            if (f10 < f6) {
                return true;
            }
        } else if (i == 4) {
            if (f9 > f5) {
                return true;
            }
        } else if (i == 5) {
            if (f8 < f4) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f7 > f3) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f10 - xl0Var2.c;
        } else if (i == 4) {
            f = xl0Var2.a - f9;
        } else if (i == 5) {
            f = f8 - xl0Var2.d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = xl0Var2.b - f7;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (i == 3) {
            f2 = f10 - f5;
        } else if (i == 4) {
            f2 = f6 - f9;
        } else if (i == 5) {
            f2 = f8 - f3;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f2 = f4 - f7;
        }
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return f < f2;
    }

    public static final boolean e(int i, xl0 xl0Var, xl0 xl0Var2) {
        if (i == 3 || i == 4) {
            return xl0Var.d > xl0Var2.b && xl0Var.b < xl0Var2.d;
        }
        if (i == 5 || i == 6) {
            return xl0Var.c > xl0Var2.a && xl0Var.a < xl0Var2.c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final int f(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final long g(long j, int i) {
        int i2 = w11.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : a(i4, i);
    }

    public static final void h(av avVar, eb0 eb0Var) {
        if (!avVar.d.q) {
            pz.b("visitChildren called on an unattached node");
        }
        eb0 eb0Var2 = new eb0(new d90[16]);
        d90 d90Var = avVar.d;
        d90 d90Var2 = d90Var.i;
        if (d90Var2 == null) {
            d80.h(eb0Var2, d90Var);
        } else {
            eb0Var2.b(d90Var2);
        }
        while (true) {
            int i = eb0Var2.f;
            if (i == 0) {
                return;
            }
            d90 d90VarI = (d90) eb0Var2.k(i - 1);
            if ((d90VarI.g & 1024) == 0) {
                d80.h(eb0Var2, d90VarI);
            } else {
                while (true) {
                    if (d90VarI == null) {
                        break;
                    }
                    if ((d90VarI.f & 1024) != 0) {
                        eb0 eb0Var3 = null;
                        while (d90VarI != null) {
                            if (d90VarI instanceof av) {
                                av avVar2 = (av) d90VarI;
                                if (avVar2.q && !d80.z(avVar2).P) {
                                    if (avVar2.B0().a) {
                                        eb0Var.b(avVar2);
                                    } else {
                                        h(avVar2, eb0Var);
                                    }
                                }
                            } else if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                int i2 = 0;
                                for (d90 d90Var3 = ((mn) d90VarI).s; d90Var3 != null; d90Var3 = d90Var3.i) {
                                    if ((d90Var3.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            d90VarI = d90Var3;
                                        } else {
                                            if (eb0Var3 == null) {
                                                eb0Var3 = new eb0(new d90[16]);
                                            }
                                            if (d90VarI != null) {
                                                eb0Var3.b(d90VarI);
                                                d90VarI = null;
                                            }
                                            eb0Var3.b(d90Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            d90VarI = d80.i(eb0Var3);
                        }
                    } else {
                        d90VarI = d90VarI.i;
                    }
                }
            }
        }
    }

    public static final av i(eb0 eb0Var, xl0 xl0Var, int i) {
        xl0 xl0VarG;
        if (i == 3) {
            xl0VarG = xl0Var.g((xl0Var.c - xl0Var.a) + 1, 0.0f);
        } else if (i == 4) {
            xl0VarG = xl0Var.g(-((xl0Var.c - xl0Var.a) + 1), 0.0f);
        } else if (i == 5) {
            xl0VarG = xl0Var.g(0.0f, (xl0Var.d - xl0Var.b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            xl0VarG = xl0Var.g(0.0f, -((xl0Var.d - xl0Var.b) + 1));
        }
        Object[] objArr = eb0Var.d;
        int i2 = eb0Var.f;
        av avVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            av avVar2 = (av) objArr[i3];
            if (m20.H(avVar2)) {
                xl0 xl0VarT = m20.t(avVar2);
                if (p(xl0VarT, xl0VarG, xl0Var, i)) {
                    avVar = avVar2;
                    xl0VarG = xl0VarT;
                }
            }
        }
        return avVar;
    }

    public static final boolean j(av avVar, int i, iw iwVar) {
        xl0 xl0Var;
        eb0 eb0Var = new eb0(new av[16]);
        h(avVar, eb0Var);
        int i2 = eb0Var.f;
        if (i2 <= 1) {
            av avVar2 = (av) (i2 == 0 ? null : eb0Var.d[0]);
            if (avVar2 != null) {
                return ((Boolean) iwVar.g(avVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                xl0 xl0VarT = m20.t(avVar);
                float f = xl0VarT.a;
                float f2 = xl0VarT.b;
                xl0Var = new xl0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                xl0 xl0VarT2 = m20.t(avVar);
                float f3 = xl0VarT2.c;
                float f4 = xl0VarT2.d;
                xl0Var = new xl0(f3, f4, f3, f4);
            }
            av avVarI = i(eb0Var, xl0Var, i);
            if (avVarI != null) {
                return ((Boolean) iwVar.g(avVarI)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean k(int i, u7 u7Var, av avVar, xl0 xl0Var) {
        if (u(i, u7Var, avVar, xl0Var)) {
            return true;
        }
        av avVar2 = ((qu) ((p3) d80.A(avVar)).getFocusOwner()).h;
        d80.C(avVar);
        return false;
    }

    public static final or0 l(Object obj) {
        if (obj != c4.c) {
            return (or0) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final o11 m(ct0 ct0Var) {
        iw iwVar;
        ArrayList arrayList = new ArrayList();
        Object objG = ct0Var.d.g(bt0.a);
        if (objG == null) {
            objG = null;
        }
        j0 j0Var = (j0) objG;
        if (j0Var == null || (iwVar = (iw) j0Var.b) == null || !((Boolean) iwVar.g(arrayList)).booleanValue()) {
            return null;
        }
        return (o11) arrayList.get(0);
    }

    public static final boolean n(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static int o(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
    }

    public static final boolean p(xl0 xl0Var, xl0 xl0Var2, xl0 xl0Var3, int i) {
        if (!q(i, xl0Var, xl0Var3)) {
            return false;
        }
        if (q(i, xl0Var2, xl0Var3) && !d(xl0Var3, xl0Var, xl0Var2, i)) {
            return !d(xl0Var3, xl0Var2, xl0Var, i) && r(i, xl0Var3, xl0Var) < r(i, xl0Var3, xl0Var2);
        }
        return true;
    }

    public static final boolean q(int i, xl0 xl0Var, xl0 xl0Var2) {
        float f = xl0Var.b;
        float f2 = xl0Var.d;
        float f3 = xl0Var.a;
        float f4 = xl0Var.c;
        if (i == 3) {
            float f5 = xl0Var2.c;
            float f6 = xl0Var2.a;
            return (f5 > f4 || f6 >= f4) && f6 > f3;
        }
        if (i == 4) {
            float f7 = xl0Var2.a;
            float f8 = xl0Var2.c;
            return (f7 < f3 || f8 <= f3) && f8 < f4;
        }
        if (i == 5) {
            float f9 = xl0Var2.d;
            float f10 = xl0Var2.b;
            return (f9 > f2 || f10 >= f2) && f10 > f;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f11 = xl0Var2.b;
        float f12 = xl0Var2.d;
        return (f11 < f || f12 <= f) && f12 < f2;
    }

    public static final long r(int i, xl0 xl0Var, xl0 xl0Var2) {
        float f;
        float f2;
        float f3 = xl0Var2.b;
        float f4 = xl0Var2.d;
        float f5 = xl0Var2.a;
        float f6 = xl0Var2.c;
        if (i == 3) {
            f = xl0Var.a - f6;
        } else if (i == 4) {
            f = f5 - xl0Var.c;
        } else if (i == 5) {
            f = xl0Var.b - f4;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = f3 - xl0Var.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = xl0Var.b;
            float f8 = 2;
            f2 = (((xl0Var.d - f7) / f8) + f7) - (((f4 - f3) / f8) + f3);
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = xl0Var.a;
            float f10 = 2;
            f2 = (((xl0Var.c - f9) / f10) + f9) - (((f6 - f5) / f10) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean s(Object obj) {
        return obj == c4.c;
    }

    public static final long t(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : bf.b(j, bf.d(j) * f);
    }

    public static final boolean u(int i, u7 u7Var, av avVar, xl0 xl0Var) {
        av avVarI;
        eb0 eb0Var = new eb0(new av[16]);
        if (!avVar.d.q) {
            pz.b("visitChildren called on an unattached node");
        }
        eb0 eb0Var2 = new eb0(new d90[16]);
        d90 d90Var = avVar.d;
        d90 d90Var2 = d90Var.i;
        if (d90Var2 == null) {
            d80.h(eb0Var2, d90Var);
        } else {
            eb0Var2.b(d90Var2);
        }
        while (true) {
            int i2 = eb0Var2.f;
            if (i2 == 0) {
                break;
            }
            d90 d90VarI = (d90) eb0Var2.k(i2 - 1);
            if ((d90VarI.g & 1024) == 0) {
                d80.h(eb0Var2, d90VarI);
            } else {
                while (true) {
                    if (d90VarI == null) {
                        break;
                    }
                    if ((d90VarI.f & 1024) != 0) {
                        eb0 eb0Var3 = null;
                        while (d90VarI != null) {
                            if (d90VarI instanceof av) {
                                av avVar2 = (av) d90VarI;
                                if (avVar2.q) {
                                    eb0Var.b(avVar2);
                                }
                            } else if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                int i3 = 0;
                                for (d90 d90Var3 = ((mn) d90VarI).s; d90Var3 != null; d90Var3 = d90Var3.i) {
                                    if ((d90Var3.f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            d90VarI = d90Var3;
                                        } else {
                                            if (eb0Var3 == null) {
                                                eb0Var3 = new eb0(new d90[16]);
                                            }
                                            if (d90VarI != null) {
                                                eb0Var3.b(d90VarI);
                                                d90VarI = null;
                                            }
                                            eb0Var3.b(d90Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            d90VarI = d80.i(eb0Var3);
                        }
                    } else {
                        d90VarI = d90VarI.i;
                    }
                }
            }
        }
        while (eb0Var.f != 0 && (avVarI = i(eb0Var, xl0Var, i)) != null) {
            if (avVarI.B0().a) {
                return ((Boolean) u7Var.g(avVarI)).booleanValue();
            }
            if (k(i, u7Var, avVarI, xl0Var)) {
                return true;
            }
            eb0Var.j(avVarI);
        }
        return false;
    }

    public static final void v(s7 s7Var, int i) {
        Object next;
        Iterator<T> it = s7Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((t30) ((Map.Entry) next).getKey()).e == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String w(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final Boolean x(int i, u7 u7Var, av avVar, xl0 xl0Var) {
        int iOrdinal = avVar.C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                av avVarU = m20.u(avVar);
                if (avVarU == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = avVarU.C0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolX = x(i, u7Var, avVarU, xl0Var);
                        if (!c10.i(boolX, Boolean.FALSE)) {
                            return boolX;
                        }
                        if (xl0Var == null) {
                            if (avVarU.C0() != yu.e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            av avVarR = m20.r(avVarU);
                            if (avVarR == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            xl0Var = m20.t(avVarR);
                        }
                        return Boolean.valueOf(k(i, u7Var, avVar, xl0Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new fg();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (xl0Var == null) {
                    xl0Var = m20.t(avVarU);
                }
                return Boolean.valueOf(k(i, u7Var, avVar, xl0Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return avVar.B0().a ? (Boolean) u7Var.g(avVar) : xl0Var == null ? Boolean.valueOf(j(avVar, i, u7Var)) : Boolean.valueOf(u(i, u7Var, avVar, xl0Var));
                }
                throw new fg();
            }
        }
        return Boolean.valueOf(j(avVar, i, u7Var));
    }
}
