package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class l31 {
    public static final l31 e = new l31(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final v71 c;
    public Object[] d;

    public l31(int i, int i2, Object[] objArr, v71 v71Var) {
        this.a = i;
        this.b = i2;
        this.c = v71Var;
        this.d = objArr;
    }

    public static l31 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, v71 v71Var) {
        if (i3 > 30) {
            return new l31(0, 0, new Object[]{obj, obj2, obj3, obj4}, v71Var);
        }
        int iG = mq0.g(i, i3);
        int iG2 = mq0.g(i2, i3);
        if (iG != iG2) {
            return new l31((1 << iG) | (1 << iG2), 0, iG < iG2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, v71Var);
        }
        return new l31(0, 1 << iG, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, v71Var)}, v71Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, v71 v71Var) {
        Object obj3 = this.d[i];
        l31 l31VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, v71Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        y9.t0(objArr, objArr2, 0, i, 6);
        y9.r0(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = l31VarJ;
        y9.r0(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        n00 n00VarW = c10.W(c10.a0(0, this.d.length));
        int i = n00VarW.d;
        int i2 = n00VarW.e;
        int i3 = n00VarW.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!c10.i(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iG = 1 << mq0.g(i, i2);
        if (h(iG)) {
            return c10.i(obj, this.d[f(iG)]);
        }
        if (!i(iG)) {
            return false;
        }
        l31 l31VarS = s(t(iG));
        return i2 == 30 ? l31VarS.c(obj) : l31VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(l31 l31Var) {
        if (this == l31Var) {
            return true;
        }
        if (this.b == l31Var.b && this.a == l31Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == l31Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iG = 1 << mq0.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            if (c10.i(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iG)) {
            return null;
        }
        l31 l31VarS = s(t(iG));
        if (i2 != 30) {
            return l31VarS.g(i, i2 + 5, obj);
        }
        n00 n00VarW = c10.W(c10.a0(0, l31VarS.d.length));
        int i3 = n00VarW.d;
        int i4 = n00VarW.e;
        int i5 = n00VarW.f;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!c10.i(obj, l31VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return l31VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final l31 k(int i, uh0 uh0Var) {
        uh0Var.e(uh0Var.h - 1);
        uh0Var.f = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != uh0Var.d) {
            return new l31(0, 0, mq0.c(i, objArr), uh0Var.d);
        }
        this.d = mq0.c(i, objArr);
        return this;
    }

    public final l31 l(int i, Object obj, Object obj2, int i2, uh0 uh0Var) {
        uh0 uh0Var2;
        l31 l31VarL;
        int iG = 1 << mq0.g(i, i2);
        boolean zH = h(iG);
        v71 v71Var = this.c;
        if (zH) {
            int iF = f(iG);
            if (!c10.i(obj, this.d[iF])) {
                uh0Var.e(uh0Var.h + 1);
                v71 v71Var2 = uh0Var.d;
                if (v71Var != v71Var2) {
                    return new l31(this.a ^ iG, this.b | iG, a(iF, iG, i, obj, obj2, i2, v71Var2), v71Var2);
                }
                this.d = a(iF, iG, i, obj, obj2, i2, v71Var2);
                this.a ^= iG;
                this.b |= iG;
                return this;
            }
            uh0Var.f = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (v71Var == uh0Var.d) {
                this.d[iF + 1] = obj2;
                return this;
            }
            uh0Var.g++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            c10.o(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new l31(this.a, this.b, objArrCopyOf, uh0Var.d);
        }
        if (!i(iG)) {
            uh0Var.e(uh0Var.h + 1);
            v71 v71Var3 = uh0Var.d;
            int iF2 = f(iG);
            if (v71Var != v71Var3) {
                return new l31(this.a | iG, this.b, mq0.b(this.d, iF2, obj, obj2), v71Var3);
            }
            this.d = mq0.b(this.d, iF2, obj, obj2);
            this.a |= iG;
            return this;
        }
        int iT = t(iG);
        l31 l31VarS = s(iT);
        if (i2 == 30) {
            n00 n00VarW = c10.W(c10.a0(0, l31VarS.d.length));
            int i3 = n00VarW.d;
            int i4 = n00VarW.e;
            int i5 = n00VarW.f;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                uh0Var.e(uh0Var.h + 1);
                l31VarL = new l31(0, 0, mq0.b(l31VarS.d, 0, obj, obj2), uh0Var.d);
                uh0Var2 = uh0Var;
            } else {
                while (!c10.i(obj, l31VarS.d[i3])) {
                    if (i3 == i4) {
                        uh0Var.e(uh0Var.h + 1);
                        l31VarL = new l31(0, 0, mq0.b(l31VarS.d, 0, obj, obj2), uh0Var.d);
                        break;
                    }
                    i3 += i5;
                }
                uh0Var.f = l31VarS.x(i3);
                if (l31VarS.c == uh0Var.d) {
                    l31VarS.d[i3 + 1] = obj2;
                    l31VarL = l31VarS;
                } else {
                    uh0Var.g++;
                    Object[] objArr2 = l31VarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    c10.o(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i3 + 1] = obj2;
                    l31VarL = new l31(0, 0, objArrCopyOf2, uh0Var.d);
                }
                uh0Var2 = uh0Var;
            }
        } else {
            uh0Var2 = uh0Var;
            l31VarL = l31VarS.l(i, obj, obj2, i2 + 5, uh0Var2);
        }
        return l31VarS == l31VarL ? this : r(iT, l31VarL, uh0Var2.d);
    }

    public final l31 m(l31 l31Var, int i, wn wnVar, uh0 uh0Var) {
        Object[] objArr;
        l31 l31VarJ;
        if (this == l31Var) {
            wnVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            v71 v71Var = uh0Var.d;
            int i3 = l31Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + l31Var.d.length);
            c10.o(objArrCopyOf, "copyOf(...)");
            int length = this.d.length;
            n00 n00VarW = c10.W(c10.a0(0, l31Var.d.length));
            int i4 = n00VarW.d;
            int i5 = n00VarW.e;
            int i6 = n00VarW.f;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(l31Var.d[i4])) {
                        wnVar.a++;
                    } else {
                        Object[] objArr3 = l31Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == l31Var.d.length) {
                    return l31Var;
                }
                if (length == objArrCopyOf.length) {
                    return new l31(0, 0, objArrCopyOf, v71Var);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                c10.o(objArrCopyOf2, "copyOf(...)");
                return new l31(0, 0, objArrCopyOf2, v71Var);
            }
        } else {
            int i7 = this.b | l31Var.b;
            int i8 = this.a;
            int i9 = l31Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (c10.i(this.d[f(iLowestOneBit)], l31Var.d[l31Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                zj0.b("Check failed.");
            }
            l31 l31Var2 = (c10.i(this.c, uh0Var.d) && this.a == i12 && this.b == i7) ? this : new l31(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = l31Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    l31VarJ = s(t(iLowestOneBit2));
                    if (l31Var.i(iLowestOneBit2)) {
                        l31VarJ = l31VarJ.m(l31Var.s(l31Var.t(iLowestOneBit2)), i + 5, wnVar, uh0Var);
                        objArr = objArr4;
                    } else if (l31Var.h(iLowestOneBit2)) {
                        int iF = l31Var.f(iLowestOneBit2);
                        Object obj = l31Var.d[iF];
                        Object objX = l31Var.x(iF);
                        int i15 = uh0Var.h;
                        objArr = objArr4;
                        l31VarJ = l31VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, uh0Var);
                        if (uh0Var.h == i15) {
                            wnVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (l31Var.i(iLowestOneBit2)) {
                        l31 l31VarS = l31Var.s(l31Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (l31VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                wnVar.a++;
                                l31VarJ = l31VarS;
                            } else {
                                l31VarJ = l31VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, uh0Var);
                            }
                        } else {
                            l31VarJ = l31VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = l31Var.f(iLowestOneBit2);
                        Object obj4 = l31Var.d[iF4];
                        l31VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, l31Var.x(iF4), i + 5, uh0Var.d);
                    }
                }
                objArr[length2] = l31VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (l31Var.h(iLowestOneBit3)) {
                    int iF5 = l31Var.f(iLowestOneBit3);
                    Object[] objArr5 = l31Var2.d;
                    objArr5[i18] = l31Var.d[iF5];
                    objArr5[i18 + 1] = l31Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        wnVar.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = l31Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(l31Var2)) {
                return l31Var.e(l31Var2) ? l31Var : l31Var2;
            }
        }
        return this;
    }

    public final l31 n(int i, Object obj, int i2, uh0 uh0Var) {
        l31 l31VarN;
        int iG = 1 << mq0.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            if (c10.i(obj, this.d[iF])) {
                return p(iF, iG, uh0Var);
            }
        } else if (i(iG)) {
            int iT = t(iG);
            l31 l31VarS = s(iT);
            if (i2 == 30) {
                n00 n00VarW = c10.W(c10.a0(0, l31VarS.d.length));
                int i3 = n00VarW.d;
                int i4 = n00VarW.e;
                int i5 = n00VarW.f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    l31VarN = l31VarS;
                    break;
                }
                while (!c10.i(obj, l31VarS.d[i3])) {
                    if (i3 == i4) {
                        l31VarN = l31VarS;
                        break;
                    }
                    i3 += i5;
                }
                l31VarN = l31VarS.k(i3, uh0Var);
            } else {
                l31VarN = l31VarS.n(i, obj, i2 + 5, uh0Var);
            }
            return q(l31VarS, l31VarN, iT, iG, uh0Var.d);
        }
        return this;
    }

    public final l31 o(int i, Object obj, Object obj2, int i2, uh0 uh0Var) {
        uh0 uh0Var2;
        l31 l31VarO;
        int iG = 1 << mq0.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            return (c10.i(obj, this.d[iF]) && c10.i(obj2, x(iF))) ? p(iF, iG, uh0Var) : this;
        }
        if (!i(iG)) {
            return this;
        }
        int iT = t(iG);
        l31 l31VarS = s(iT);
        if (i2 == 30) {
            n00 n00VarW = c10.W(c10.a0(0, l31VarS.d.length));
            int i3 = n00VarW.d;
            int i4 = n00VarW.e;
            int i5 = n00VarW.f;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                l31VarO = l31VarS;
                uh0Var2 = uh0Var;
            } else {
                while (true) {
                    if (!c10.i(obj, l31VarS.d[i3]) || !c10.i(obj2, l31VarS.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        l31VarO = l31VarS.k(i3, uh0Var);
                        break;
                    }
                }
                l31VarO = l31VarS;
                uh0Var2 = uh0Var;
            }
        } else {
            uh0Var2 = uh0Var;
            l31VarO = l31VarS.o(i, obj, obj2, i2 + 5, uh0Var2);
        }
        return q(l31VarS, l31VarO, iT, iG, uh0Var2.d);
    }

    public final l31 p(int i, int i2, uh0 uh0Var) {
        uh0Var.e(uh0Var.h - 1);
        uh0Var.f = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != uh0Var.d) {
            return new l31(i2 ^ this.a, this.b, mq0.c(i, objArr), uh0Var.d);
        }
        this.d = mq0.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final l31 q(l31 l31Var, l31 l31Var2, int i, int i2, v71 v71Var) {
        v71 v71Var2 = this.c;
        if (l31Var2 != null) {
            return (v71Var2 == v71Var || l31Var != l31Var2) ? r(i, l31Var2, v71Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (v71Var2 != v71Var) {
            return new l31(this.a, this.b ^ i2, mq0.d(i, objArr), v71Var);
        }
        this.d = mq0.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final l31 r(int i, l31 l31Var, v71 v71Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && l31Var.d.length == 2 && l31Var.b == 0) {
            l31Var.a = this.b;
            return l31Var;
        }
        if (this.c == v71Var) {
            objArr[i] = l31Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        c10.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = l31Var;
        return new l31(this.a, this.b, objArrCopyOf, v71Var);
    }

    public final l31 s(int i) {
        Object obj = this.d[i];
        c10.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (l31) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        r13.c = w(r11, r4, (defpackage.l31) r13.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c8 u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l31.u(int, int, java.lang.Object, java.lang.Object):c8");
    }

    public final l31 v(int i, int i2, Object obj) {
        l31 l31VarV;
        int iG = 1 << mq0.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            if (!c10.i(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new l31(this.a ^ iG, this.b, mq0.c(iF, objArr), null);
            }
        } else {
            if (!i(iG)) {
                return this;
            }
            int iT = t(iG);
            l31 l31VarS = s(iT);
            if (i2 == 30) {
                n00 n00VarW = c10.W(c10.a0(0, l31VarS.d.length));
                int i3 = n00VarW.d;
                int i4 = n00VarW.e;
                int i5 = n00VarW.f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    l31VarV = l31VarS;
                    break;
                }
                while (!c10.i(obj, l31VarS.d[i3])) {
                    if (i3 == i4) {
                        l31VarV = l31VarS;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = l31VarS.d;
                l31VarV = objArr2.length == 2 ? null : new l31(0, 0, mq0.c(i3, objArr2), null);
            } else {
                l31VarV = l31VarS.v(i, i2 + 5, obj);
            }
            if (l31VarV != null) {
                return l31VarS != l31VarV ? w(iT, iG, l31VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new l31(this.a, this.b ^ iG, mq0.d(iT, objArr3), null);
            }
        }
        return null;
    }

    public final l31 w(int i, int i2, l31 l31Var) {
        Object[] objArr = l31Var.d;
        if (objArr.length != 2 || l31Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            c10.o(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i] = l31Var;
            return new l31(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            l31Var.a = this.b;
            return l31Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        c10.o(objArrCopyOf2, "copyOf(...)");
        y9.r0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        y9.r0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new l31(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
