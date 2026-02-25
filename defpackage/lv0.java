package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lv0 implements Iterable, c20 {
    public static final lv0 h = new lv0(0, 0, 0, null);
    public final long d;
    public final long e;
    public final long f;
    public final long[] g;

    public lv0(long j, long j2, long j3, long[] jArr) {
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = jArr;
    }

    public final lv0 a(lv0 lv0Var) {
        long[] jArr;
        lv0 lv0VarB = this;
        lv0 lv0Var2 = h;
        if (lv0Var == lv0Var2) {
            return lv0VarB;
        }
        if (lv0VarB == lv0Var2) {
            return lv0Var2;
        }
        long j = lv0Var.f;
        long j2 = lv0Var.f;
        long[] jArr2 = lv0Var.g;
        long j3 = lv0Var.e;
        long j4 = lv0Var.d;
        long j5 = lv0VarB.f;
        if (j == j5 && jArr2 == (jArr = lv0VarB.g)) {
            return new lv0(lv0VarB.d & (~j4), lv0VarB.e & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                lv0VarB = lv0VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    lv0VarB = lv0VarB.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    lv0VarB = lv0VarB.b(i2 + j2 + 64);
                }
            }
        }
        return lv0VarB;
    }

    public final lv0 b(long j) {
        long[] jArr;
        int iF;
        long[] jArr2;
        long j2 = j - this.f;
        long j3 = 0;
        if (c10.x(j2, j3) >= 0 && c10.x(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.e;
            if ((j5 & j4) != 0) {
                return new lv0(this.d, j5 & (~j4), this.f, this.g);
            }
        } else if (c10.x(j2, 64) >= 0 && c10.x(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.d;
            if ((j7 & j6) != 0) {
                return new lv0(j7 & (~j6), this.e, this.f, this.g);
            }
        } else if (c10.x(j2, j3) < 0 && (jArr = this.g) != null && (iF = no0.f(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iF > 0) {
                    y9.q0(jArr, jArr3, 0, 0, iF);
                }
                if (iF < i) {
                    y9.q0(jArr, jArr3, iF, iF + 1, length);
                }
                jArr2 = jArr3;
            }
            return new lv0(this.d, this.e, this.f, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.f;
        long j3 = 0;
        return (c10.x(j2, j3) < 0 || c10.x(j2, (long) 64) >= 0) ? (c10.x(j2, (long) 64) < 0 || c10.x(j2, (long) 128) >= 0) ? c10.x(j2, j3) <= 0 && (jArr = this.g) != null && no0.f(jArr, j) >= 0 : ((1 << (((int) j2) - 64)) & this.d) != 0 : ((1 << ((int) j2)) & this.e) != 0;
    }

    public final lv0 d(lv0 lv0Var) {
        lv0 lv0VarE;
        long[] jArr;
        lv0 lv0VarE2 = this;
        lv0 lv0Var2 = h;
        if (lv0Var == lv0Var2) {
            return lv0VarE2;
        }
        if (lv0VarE2 == lv0Var2) {
            return lv0Var;
        }
        long j = lv0Var.f;
        long j2 = lv0Var.f;
        long[] jArr2 = lv0Var.g;
        long j3 = lv0Var.e;
        long j4 = lv0Var.d;
        long j5 = lv0VarE2.f;
        long j6 = lv0VarE2.e;
        long j7 = lv0VarE2.d;
        if (j == j5 && jArr2 == (jArr = lv0VarE2.g)) {
            return new lv0(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = lv0VarE2.g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    lv0VarE2 = lv0VarE2.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        lv0VarE2 = lv0VarE2.e(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        lv0VarE2 = lv0VarE2.e(i + j2 + 64);
                    }
                    i++;
                }
            }
            return lv0VarE2;
        }
        if (jArr3 != null) {
            lv0VarE = lv0Var;
            for (long j9 : jArr3) {
                lv0VarE = lv0VarE.e(j9);
            }
        } else {
            lv0VarE = lv0Var;
        }
        long j10 = lv0VarE2.f;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    lv0VarE = lv0VarE.e(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    lv0VarE = lv0VarE.e(i + j10 + 64);
                }
                i++;
            }
        }
        return lv0VarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lv0 e(long r30) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv0.e(long):lv0");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return qo0.l(new kv0(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(we.O(this));
        Iterator it = iterator();
        while (true) {
            yt0 yt0Var = (yt0) it;
            if (!yt0Var.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) yt0Var.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
