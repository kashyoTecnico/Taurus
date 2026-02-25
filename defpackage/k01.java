package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k01 extends y20 implements iw {
    public static final k01 A;
    public static final k01 B;
    public static final k01 C;
    public static final k01 D;
    public static final k01 E;
    public static final k01 F;
    public static final k01 G;
    public static final k01 H;
    public static final k01 I;
    public static final k01 f;
    public static final k01 g;
    public static final k01 h;
    public static final k01 i;
    public static final k01 j;
    public static final k01 k;
    public static final k01 l;
    public static final k01 m;
    public static final k01 n;
    public static final k01 o;
    public static final k01 p;
    public static final k01 q;
    public static final k01 r;
    public static final k01 s;
    public static final k01 t;
    public static final k01 u;
    public static final k01 v;
    public static final k01 w;
    public static final k01 x;
    public static final k01 y;
    public static final k01 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 1;
        f = new k01(i2, 0);
        g = new k01(i2, 1);
        h = new k01(i2, 2);
        i = new k01(i2, 3);
        j = new k01(i2, 4);
        k = new k01(i2, 5);
        l = new k01(i2, 6);
        m = new k01(i2, 7);
        n = new k01(i2, 8);
        o = new k01(i2, 9);
        p = new k01(i2, 10);
        q = new k01(i2, 11);
        r = new k01(i2, 12);
        s = new k01(i2, 13);
        t = new k01(i2, 14);
        u = new k01(i2, 15);
        v = new k01(i2, 16);
        w = new k01(i2, 17);
        x = new k01(i2, 18);
        y = new k01(i2, 19);
        z = new k01(i2, 20);
        A = new k01(i2, 21);
        B = new k01(i2, 22);
        C = new k01(i2, 23);
        D = new k01(i2, 24);
        E = new k01(i2, 25);
        F = new k01(i2, 26);
        G = new k01(i2, 27);
        H = new k01(i2, 28);
        I = new k01(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k01(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i2 = this.e;
        j41 j41Var = j41.a;
        switch (i2) {
            case 0:
                n01 n01Var = (n01) obj;
                String str = n01Var.g.e;
                long j2 = n01Var.f;
                int i3 = w11.c;
                int iD = dp0.d(str, (int) (j2 & 4294967295L));
                if (iD != -1) {
                    return new sn(0, iD - ((int) (4294967295L & n01Var.f)));
                }
                return null;
            case 1:
                n01 n01Var2 = (n01) obj;
                Integer numD = n01Var2.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j3 = n01Var2.f;
                int i4 = w11.c;
                return new sn(((int) (4294967295L & j3)) - iIntValue, 0);
            case 2:
                n01 n01Var3 = (n01) obj;
                Integer numC = n01Var3.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue2 = numC.intValue();
                long j4 = n01Var3.f;
                int i5 = w11.c;
                return new sn(0, iIntValue2 - ((int) (4294967295L & j4)));
            case 3:
                n01 n01Var4 = (n01) obj;
                hd0 hd0Var = n01Var4.d;
                o11 o11Var = n01Var4.c;
                Integer numValueOf = o11Var != null ? Integer.valueOf(hd0Var.a(o11Var.i(o11Var.f(hd0Var.d(w11.e(n01Var4.f)))))) : null;
                if (numValueOf == null) {
                    return null;
                }
                int iIntValue3 = numValueOf.intValue();
                long j5 = n01Var4.f;
                int i6 = w11.c;
                return new sn(((int) (4294967295L & j5)) - iIntValue3, 0);
            case 4:
                n01 n01Var5 = (n01) obj;
                Integer numB = n01Var5.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = n01Var5.f;
                int i7 = w11.c;
                return new sn(0, iIntValue4 - ((int) (4294967295L & j6)));
            case 5:
                List list = (List) obj;
                Object obj2 = list.get(1);
                c10.n(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                if0 if0Var = ((Boolean) obj2).booleanValue() ? if0.d : if0.e;
                Object obj3 = list.get(0);
                c10.n(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new s01(if0Var, ((Float) obj3).floatValue());
            case 6:
                return j41Var;
            case 7:
                return j41Var;
            case 8:
                int i8 = ((wy) obj).a;
                return j41Var;
            case 9:
                return j41Var;
            case 10:
                int i9 = ((wy) obj).a;
                return j41Var;
            case 11:
                ((gw) obj).a();
                return j41Var;
            case 12:
                long j7 = ((mp) obj).a;
                return new h8(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
            case 13:
                float f2 = ((h8) obj).a;
                return new mp((Float.floatToRawIntBits(r9.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            case 14:
                return new g8(((kp) obj).d);
            case 15:
                return new kp(((g8) obj).a);
            case 16:
                return new g8(((Number) obj).floatValue());
            case 17:
                return Float.valueOf(((g8) obj).a);
            case 18:
                long j8 = ((m00) obj).a;
                return new h8((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case 19:
                h8 h8Var = (h8) obj;
                return new m00(c10.c(Math.round(h8Var.a), Math.round(h8Var.b)));
            case 20:
                long j9 = ((t00) obj).a;
                return new h8((int) (j9 >> 32), (int) (j9 & 4294967295L));
            case 21:
                h8 h8Var2 = (h8) obj;
                int iRound = Math.round(h8Var2.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(h8Var2.b);
                return new t00(d80.e(iRound, iRound2 >= 0 ? iRound2 : 0));
            case 22:
                return new g8(((Number) obj).intValue());
            case 23:
                return Integer.valueOf((int) ((g8) obj).a);
            case 24:
                long j10 = ((ed0) obj).a;
                return new h8(ed0.d(j10), ed0.e(j10));
            case 25:
                h8 h8Var3 = (h8) obj;
                return new ed0(nm.f(h8Var3.a, h8Var3.b));
            case 26:
                xl0 xl0Var = (xl0) obj;
                return new j8(xl0Var.a, xl0Var.b, xl0Var.c, xl0Var.d);
            case 27:
                j8 j8Var = (j8) obj;
                return new xl0(j8Var.a, j8Var.b, j8Var.c, j8Var.d);
            case 28:
                long j11 = ((yu0) obj).a;
                return new h8(yu0.d(j11), yu0.b(j11));
            default:
                h8 h8Var4 = (h8) obj;
                return new yu0(dq0.a(h8Var4.a, h8Var4.b));
        }
    }
}
