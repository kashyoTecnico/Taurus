package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface xn {
    default float A(float f) {
        return b() * f;
    }

    default float I(long j) {
        if (!g21.a(f21.b(j), 4294967296L)) {
            rz.b("Only Sp can convert to Px");
        }
        float[] fArr = vv.a;
        if (k() < 1.03f) {
            return k() * f21.c(j);
        }
        uv uvVarA = vv.a(k());
        if (uvVarA != null) {
            return uvVarA.b(f21.c(j));
        }
        return k() * f21.c(j);
    }

    default int N(float f) {
        float fA = A(f);
        if (Float.isInfinite(fA)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fA);
    }

    default long W(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fA = A(np.b(j));
        float fA2 = A(np.a(j));
        return (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA2) & 4294967295L);
    }

    default float Z(long j) {
        if (!g21.a(f21.b(j), 4294967296L)) {
            rz.b("Only Sp can convert to Px");
        }
        return A(I(j));
    }

    float b();

    default long f0(float f) {
        return x(l0(f));
    }

    default float j0(int i) {
        return i / b();
    }

    float k();

    default float l0(float f) {
        return f / b();
    }

    default long x(float f) {
        float[] fArr = vv.a;
        if (k() < 1.03f) {
            return jp0.l(4294967296L, f / k());
        }
        uv uvVarA = vv.a(k());
        return jp0.l(4294967296L, uvVarA != null ? uvVarA.a(f) : f / k());
    }

    default long y(long j) {
        if (j != 9205357640488583168L) {
            return nm.e(l0(Float.intBitsToFloat((int) (j >> 32))), l0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
