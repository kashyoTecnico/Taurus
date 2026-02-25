package defpackage;

import android.os.Trace;
import android.view.View;
import com.taurus.dgmobilemx.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n2 {
    public static final void a(ta0 ta0Var, Object obj, Object obj2) {
        int iF = ta0Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : ta0Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof ua0) {
                ((ua0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                ua0 ua0Var = new ua0();
                ua0Var.a(obj3);
                ua0Var.a(obj2);
                obj2 = ua0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            ta0Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        ta0Var.b[i] = obj;
        ta0Var.c[i] = obj2;
    }

    public static void b(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static ta0 c() {
        long[] jArr = eq0.a;
        return new ta0();
    }

    public static final op0 d(View view) {
        c10.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            op0 op0Var = tag instanceof op0 ? (op0) tag : null;
            if (op0Var != null) {
                return op0Var;
            }
            Object objG = jp0.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static final Object e(ct0 ct0Var, ot0 ot0Var) {
        Object objG = ct0Var.d.g(ot0Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final q8 f(a11 a11Var) {
        q8 q8Var = a11Var.a;
        long j = a11Var.b;
        q8Var.getClass();
        return q8Var.subSequence(w11.e(j), w11.d(j));
    }

    public static final q8 g(a11 a11Var, int i) {
        q8 q8Var = a11Var.a;
        long j = a11Var.b;
        return q8Var.subSequence(w11.d(j), Math.min(w11.d(j) + i, a11Var.a.e.length()));
    }

    public static final q8 h(a11 a11Var, int i) {
        q8 q8Var = a11Var.a;
        long j = a11Var.b;
        return q8Var.subSequence(Math.max(0, w11.e(j) - i), w11.e(j));
    }

    public static final int i(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List j(ev0 ev0Var, int i, ev0 ev0Var2, boolean z, boolean z2, boolean z3) {
        ks ksVar;
        boolean z4;
        int i2;
        int i3;
        int iT = ev0Var.t(i);
        int i4 = i + iT;
        int iF = ev0Var.f(i);
        int iF2 = ev0Var.f(i4);
        int i5 = iF2 - iF;
        boolean z5 = i >= 0 && (ev0Var.b[(ev0Var.r(i) * 5) + 1] & 201326592) != 0;
        ev0Var2.v(iT);
        ev0Var2.w(i5, ev0Var2.t);
        if (ev0Var.g < i4) {
            ev0Var.A(i4);
        }
        if (ev0Var.k < iF2) {
            ev0Var.B(iF2, i4);
        }
        int[] iArr = ev0Var2.b;
        int i6 = ev0Var2.t;
        int i7 = i6 * 5;
        y9.p0(ev0Var.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = ev0Var2.c;
        int i8 = ev0Var2.i;
        System.arraycopy(ev0Var.c, iF, objArr, i8, i5);
        int i9 = ev0Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iT;
        int iG = i8 - ev0Var2.g(iArr, i6);
        int i12 = ev0Var2.m;
        int i13 = ev0Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iG2 = ev0Var2.g(iArr, i15) + iG;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = ev0Var2.k;
            }
            iArr2[(i15 * 5) + 4] = ev0.i(iG2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        ev0Var2.m = i14;
        int iB = dv0.b(ev0Var.d, i, ev0Var.p());
        int iB2 = dv0.b(ev0Var.d, i4, ev0Var.p());
        if (iB < iB2) {
            ArrayList arrayList = ev0Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i17 = iB; i17 < iB2; i17++) {
                m2 m2Var = (m2) arrayList.get(i17);
                m2Var.a += i10;
                arrayList2.add(m2Var);
            }
            ev0Var2.d.addAll(dv0.b(ev0Var2.d, ev0Var2.t, ev0Var2.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            ksVar = arrayList2;
        } else {
            ksVar = ks.d;
        }
        if (!ksVar.isEmpty()) {
            HashMap map = ev0Var.e;
            HashMap map2 = ev0Var2.e;
            if (map != null && map2 != null) {
                int size = ksVar.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = ev0Var2.v;
        ev0Var2.N(i9);
        int iD = ev0Var.D(ev0Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                ev0Var.O();
                ev0Var.a(iD - ev0Var.t);
                ev0Var.O();
            }
            ev0Var.a(i - ev0Var.t);
            boolean zG = ev0Var.G();
            if (z7) {
                ev0Var.L();
                ev0Var.j();
                ev0Var.L();
                ev0Var.j();
            }
            z4 = zG;
        } else {
            boolean zH = ev0Var.H(i, iT);
            ev0Var.I(iF, i5, i - 1);
            z4 = zH;
        }
        if (z4) {
            fi.c("Unexpectedly removed anchors");
        }
        int i20 = ev0Var2.o;
        int i21 = iArr3[i7 + 1];
        ev0Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            ev0Var2.t = i11;
            ev0Var2.i = i8 + i5;
        }
        if (z6) {
            ev0Var2.S(i9);
        }
        return ksVar;
    }

    public static final boolean k(ta0 ta0Var, Object obj, Object obj2) {
        Object objG = ta0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof ua0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            ta0Var.j(obj);
            return true;
        }
        ua0 ua0Var = (ua0) objG;
        boolean zK = ua0Var.k(obj2);
        if (zK && ua0Var.g()) {
            ta0Var.j(obj);
        }
        return zK;
    }

    public static final void l(ta0 ta0Var, Object obj) {
        boolean zG;
        long[] jArr = ta0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = ta0Var.b[i4];
                        Object obj3 = ta0Var.c[i4];
                        if (obj3 instanceof ua0) {
                            ua0 ua0Var = (ua0) obj3;
                            ua0Var.k(obj);
                            zG = ua0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            ta0Var.k(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final long m(String str, long j, long j2, long j3) {
        String property;
        boolean z;
        String str2;
        Long lValueOf;
        int i = wy0.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        b10.x(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i2 = 0;
        char cCharAt = property.charAt(0);
        long j4 = -9223372036854775807L;
        if (c10.w(cCharAt, 48) < 0) {
            z = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z = false;
                    i2 = 1;
                } else if (cCharAt == '-') {
                    j4 = Long.MIN_VALUE;
                    i2 = 1;
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        z = false;
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) property.charAt(i2), 10);
            if (iDigit >= 0) {
                if (j5 >= j6) {
                    str2 = property;
                } else if (j6 == -256204778801521550L) {
                    str2 = property;
                    j6 = j4 / 10;
                    if (j5 < j6) {
                    }
                    lValueOf = null;
                    break;
                }
                long j7 = j5 * 10;
                long j8 = iDigit;
                if (j7 < j4 + j8) {
                    lValueOf = null;
                    break;
                }
                j5 = j7 - j8;
                i2++;
                property = str2;
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        str2 = property;
        lValueOf = z ? Long.valueOf(j5) : Long.valueOf(-j5);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int n(int i, int i2, String str) {
        return (int) m(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
