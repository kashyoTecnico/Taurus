package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class jw0 {
    public static final long a = jp0.j(14);
    public static final long b = jp0.j(0);
    public static final long c = bf.f;
    public static final c11 d;

    static {
        long j = bf.b;
        d = j != 16 ? new qf(j) : b11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.iw0 a(defpackage.iw0 r24, long r25, defpackage.ac r27, float r28, long r29, defpackage.zv r31, defpackage.xv r32, defpackage.yv r33, defpackage.vy0 r34, java.lang.String r35, long r36, defpackage.ja r38, defpackage.d11 r39, defpackage.d60 r40, long r41, defpackage.uz0 r43, defpackage.hu0 r44, defpackage.zi0 r45, defpackage.tq r46) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw0.a(iw0, long, ac, float, long, zv, xv, yv, vy0, java.lang.String, long, ja, d11, d60, long, uz0, hu0, zi0, tq):iw0");
    }

    public static final Object b(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(float f, long j, long j2) {
        g21[] g21VarArr = f21.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    rz.a("Cannot perform operation for Unspecified type.");
                }
                if (!g21.a(f21.b(j), f21.b(j2))) {
                    rz.a("Cannot perform operation for " + ((Object) g21.b(f21.b(j))) + " and " + ((Object) g21.b(f21.b(j2))));
                }
                return jp0.l(j3, r31.K(f21.c(j), f21.c(j2), f));
            }
        }
        return ((f21) b(new f21(j), new f21(j2), f)).a;
    }
}
