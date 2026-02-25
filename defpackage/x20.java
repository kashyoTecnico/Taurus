package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x20 extends mf {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x20(int i, int i2, long j, String str) {
        super(str, j, i);
        this.d = i2;
    }

    @Override // defpackage.mf
    public final float a(int i) {
        switch (this.d) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // defpackage.mf
    public final float b(int i) {
        switch (this.d) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // defpackage.mf
    public final long d(float f, float f2, float f3) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        switch (this.d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f4 = (f + 16.0f) / 116.0f;
                float f5 = (f2 * 0.002f) + f4;
                float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
                float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
                float[] fArr = c10.h;
                float f8 = f6 * fArr[0];
                float f9 = f7 * fArr[1];
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(f8);
                long jFloatToRawIntBits4 = Float.floatToRawIntBits(f9);
                jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
                jFloatToRawIntBits2 = 4294967295L & jFloatToRawIntBits4;
                break;
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                float f10 = f2 <= 2.0f ? f2 : 2.0f;
                jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
                jFloatToRawIntBits2 = Float.floatToRawIntBits(f10) & 4294967295L;
                break;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }

    @Override // defpackage.mf
    public final float e(float f, float f2, float f3) {
        switch (this.d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * c10.h[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // defpackage.mf
    public final long f(float f, float f2, float f3, float f4, mf mfVar) {
        switch (this.d) {
            case 0:
                float[] fArr = c10.h;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float fCbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
                float f8 = (116.0f * fCbrt2) - 16.0f;
                float f9 = (fCbrt - fCbrt2) * 500.0f;
                float f10 = (fCbrt2 - fCbrt3) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                return r31.b(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, mfVar);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                return r31.b(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, mfVar);
        }
    }
}
