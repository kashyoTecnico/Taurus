package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n51 {
    public final m51 a;
    public final int b;
    public final km[] c;
    public int d;
    public final float[] e;
    public final float[] f;
    public final float[] g;

    public n51() {
        int i;
        m51 m51Var = m51.d;
        this.a = m51Var;
        int iOrdinal = m51Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                throw new fg();
            }
            i = 2;
        }
        this.b = i;
        this.c = new km[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        km[] kmVarArr = this.c;
        km kmVar = kmVarArr[i];
        if (kmVar != null) {
            kmVar.a = j;
            kmVar.b = f;
        } else {
            km kmVar2 = new km();
            kmVar2.a = j;
            kmVar2.b = f;
            kmVarArr[i] = kmVar2;
        }
    }

    public final float b(float f) {
        float[] fArr;
        float[] fArr2;
        float f2;
        m51 m51Var;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            pz.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.d;
        km[] kmVarArr = this.c;
        km kmVar = kmVarArr[i2];
        if (kmVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            km kmVar2 = kmVar;
            while (true) {
                km kmVar3 = kmVarArr[i2];
                m51 m51Var2 = this.a;
                fArr = this.e;
                fArr2 = this.f;
                if (kmVar3 == null) {
                    f2 = f4;
                    m51Var = m51Var2;
                    i = 1;
                    break;
                }
                long j = kmVar.a;
                f2 = f4;
                int i4 = i2;
                long j2 = kmVar3.a;
                float f5 = j - j2;
                i = 1;
                float fAbs = Math.abs(j2 - kmVar2.a);
                m51Var = m51Var2;
                km kmVar4 = m51Var != m51.d ? kmVar : kmVar3;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = kmVar3.b;
                fArr2[i3] = -f5;
                if (i4 == 0) {
                    i4 = 20;
                }
                int i5 = i4 - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                kmVar2 = kmVar4;
                i2 = i5;
                f4 = f2;
            }
            if (i3 >= this.b) {
                int iOrdinal = m51Var.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.g;
                        qo0.p(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        throw new fg();
                    }
                    int i6 = i3 - i;
                    float f6 = fArr2[i6];
                    int i7 = i6;
                    float fAbs2 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f7 = fArr2[i8];
                        if (f6 != f7) {
                            float f8 = (fArr[i7] - fArr[i8]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i7 == i6) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i7--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f3 = fSignum * 1000;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }
}
