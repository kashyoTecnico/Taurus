package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class vv {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile lw0 b = new lw0();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c((int) 115.0f, new wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c((int) 130.0f, new wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c((int) 150.0f, new wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c((int) 180.0f, new wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c((int) 200.0f, new wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        rz.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static uv a(float f) {
        float f2;
        uv wvVar;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        uv uvVar = (uv) b.b(i);
        if (uvVar != null) {
            return uvVar;
        }
        lw0 lw0Var = b;
        int iJ = nm.j(lw0Var.d, lw0Var.f, i);
        if (iJ >= 0) {
            return (uv) b.d(iJ);
        }
        int i2 = -(iJ + 1);
        int i3 = i2 - 1;
        if (i2 >= b.f) {
            wv wvVar2 = new wv(new float[]{1.0f}, new float[]{f});
            b(f, wvVar2);
            return wvVar2;
        }
        if (i3 < 0) {
            wvVar = new wv(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.d[i3] / 100.0f;
            wvVar = (uv) b.d(i3);
        }
        float f3 = b.d[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        uv uvVar2 = (uv) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fB = wvVar.b(f4);
            fArr2[i4] = ((uvVar2.b(f4) - fB) * fMax) + fB;
        }
        wv wvVar3 = new wv(fArr, fArr2);
        b(f, wvVar3);
        return wvVar3;
    }

    public static void b(float f, wv wvVar) {
        synchronized (c) {
            lw0 lw0VarA = b.clone();
            lw0VarA.c((int) (f * 100.0f), wvVar);
            b = lw0VarA;
        }
    }
}
