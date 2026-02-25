package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bf {
    public static final long b = r31.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        r31.d(4282664004L);
        r31.d(4287137928L);
        r31.d(4291611852L);
        c = r31.d(4294967295L);
        d = r31.d(4294901760L);
        r31.d(4278255360L);
        e = r31.d(4278190335L);
        r31.d(4294967040L);
        r31.d(4278255615L);
        r31.d(4294902015L);
        f = r31.c(0);
        g = r31.b(0.0f, 0.0f, 0.0f, 0.0f, pf.u);
    }

    public /* synthetic */ bf(long j) {
        this.a = j;
    }

    public static final long a(long j, mf mfVar) {
        dj djVarZ;
        mf mfVarF = f(j);
        int i = mfVarF.c;
        int i2 = mfVar.c;
        if ((i | i2) < 0) {
            djVarZ = l81.z(mfVarF, mfVar);
        } else {
            da0 da0Var = ej.a;
            int i3 = i | (i2 << 6);
            Object objB = da0Var.b(i3);
            if (objB == null) {
                objB = l81.z(mfVarF, mfVar);
                da0Var.g(i3, objB);
            }
            djVarZ = (dj) objB;
        }
        return djVarZ.a(j);
    }

    public static long b(long j, float f2) {
        return r31.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fM;
        float f2;
        if ((63 & j) == 0) {
            fM = (float) jp0.m((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fM = (float) jp0.m((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fM / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) jp0.m((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - qt.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final mf f(long j) {
        float[] fArr = pf.a;
        return pf.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) jp0.m((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - qt.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) jp0.m((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - qt.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        return "Color(" + h(j) + ", " + g(j) + ", " + e(j) + ", " + d(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bf) {
            return this.a == ((bf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
