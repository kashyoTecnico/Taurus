package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pf {
    public static final float[] a;
    public static final float[] b;
    public static final w21 c;
    public static final w21 d;
    public static final hn0 e;
    public static final hn0 f;
    public static final hn0 g;
    public static final hn0 h;
    public static final hn0 i;
    public static final hn0 j;
    public static final hn0 k;
    public static final hn0 l;
    public static final hn0 m;
    public static final hn0 n;
    public static final hn0 o;
    public static final hn0 p;
    public static final hn0 q;
    public static final hn0 r;
    public static final x20 s;
    public static final x20 t;
    public static final hn0 u;
    public static final hn0 v;
    public static final hn0 w;
    public static final jd0 x;
    public static final mf[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        w21 w21Var = new w21(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        w21 w21Var2 = new w21(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        w21 w21Var3 = new w21(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = w21Var3;
        w21 w21Var4 = new w21(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = w21Var4;
        r61 r61Var = c10.g;
        hn0 hn0Var = new hn0("sRGB IEC61966-2.1", fArr, r61Var, w21Var, 0);
        e = hn0Var;
        hn0 hn0Var2 = new hn0("sRGB IEC61966-2.1 (Linear)", fArr, r61Var, 1.0d, 0.0f, 1.0f, 1);
        f = hn0Var2;
        hn0 hn0Var3 = new hn0("scRGB-nl IEC 61966-2-2:2003", fArr, r61Var, null, new of(0), new of(1), -0.799f, 2.399f, w21Var, 2);
        g = hn0Var3;
        hn0 hn0Var4 = new hn0("scRGB IEC 61966-2-2:2003", fArr, r61Var, 1.0d, -0.5f, 7.499f, 3);
        h = hn0Var4;
        hn0 hn0Var5 = new hn0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, r61Var, new w21(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = hn0Var5;
        hn0 hn0Var6 = new hn0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, r61Var, new w21(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = hn0Var6;
        hn0 hn0Var7 = new hn0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new r61(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = hn0Var7;
        hn0 hn0Var8 = new hn0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, r61Var, w21Var, 7);
        l = hn0Var8;
        hn0 hn0Var9 = new hn0("NTSC (1953)", fArr2, c10.d, new w21(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = hn0Var9;
        hn0 hn0Var10 = new hn0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, r61Var, new w21(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = hn0Var10;
        hn0 hn0Var11 = new hn0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, r61Var, 2.2d, 0.0f, 1.0f, 10);
        o = hn0Var11;
        hn0 hn0Var12 = new hn0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, c10.e, new w21(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = hn0Var12;
        r61 r61Var2 = c10.f;
        hn0 hn0Var13 = new hn0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, r61Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = hn0Var13;
        hn0 hn0Var14 = new hn0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, r61Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = hn0Var14;
        x20 x20Var = new x20(14, 1, ff.b, "Generic XYZ");
        s = x20Var;
        long j2 = ff.c;
        x20 x20Var2 = new x20(15, 0, j2, "Generic L*a*b*");
        t = x20Var2;
        hn0 hn0Var15 = new hn0("None", fArr, r61Var, w21Var2, 16);
        u = hn0Var15;
        hn0 hn0Var16 = new hn0("Hybrid Log Gamma encoding", fArr3, r61Var, null, new of(2), new of(3), 0.0f, 1.0f, w21Var3, 17);
        v = hn0Var16;
        hn0 hn0Var17 = new hn0("Perceptual Quantizer encoding", fArr3, r61Var, null, new of(4), new of(5), 0.0f, 1.0f, w21Var4, 18);
        w = hn0Var17;
        jd0 jd0Var = new jd0("Oklab", j2, 19);
        x = jd0Var;
        y = new mf[]{hn0Var, hn0Var2, hn0Var3, hn0Var4, hn0Var5, hn0Var6, hn0Var7, hn0Var8, hn0Var9, hn0Var10, hn0Var11, hn0Var12, hn0Var13, hn0Var14, x20Var, x20Var2, hn0Var15, hn0Var16, hn0Var17, jd0Var};
    }

    public static double a(w21 w21Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = w21Var.b;
        double d6 = w21Var.c;
        double d7 = w21Var.d;
        double d8 = w21Var.e;
        double d9 = w21Var.f;
        double d10 = d5 * d4;
        return (w21Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(w21 w21Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / w21Var.b;
        double d5 = 1.0d / w21Var.c;
        double d6 = 1.0d / w21Var.d;
        double d7 = w21Var.e;
        double d8 = w21Var.f;
        double d9 = (d2 * d3) / (w21Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(w21 w21Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = w21Var.b;
        double d6 = w21Var.d;
        double dPow = (Math.pow(d4, d6) * w21Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * w21Var.f) + w21Var.e), w21Var.g) * d3;
    }

    public static double d(w21 w21Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -w21Var.b;
        double d6 = w21Var.e;
        double d7 = 1.0d / w21Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-w21Var.f)) + w21Var.c), 1.0d / w21Var.d) * d3;
    }
}
