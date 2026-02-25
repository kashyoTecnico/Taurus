package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class i21 {
    public static final kf a = lf.c(df.a, 0, 0, 0, 0, df.b, 0, 0, 0, df.c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);
    public static final kf b = lf.f(df.d, 0, 0, 0, 0, df.e, 0, 0, 0, df.f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    public static final void a(boolean z, boolean z2, final zg zgVar, ci ciVar, final int i) {
        final boolean z3;
        final boolean z4;
        kf kfVarF;
        int i2;
        ciVar.W(-1604579374);
        if (((i | 50) & 147) == 146 && ciVar.z()) {
            ciVar.Q();
            z3 = z;
            z4 = z2;
        } else {
            ciVar.S();
            if ((i & 1) == 0 || ciVar.x()) {
                z3 = (((Configuration) ciVar.j(m4.a)).uiMode & 48) == 32;
                z4 = true;
            } else {
                ciVar.Q();
                z3 = z;
                z4 = z2;
            }
            ciVar.q();
            ciVar.V(1745834133);
            if (!z4 || (i2 = Build.VERSION.SDK_INT) < 31) {
                kfVarF = z3 ? a : b;
            } else {
                Context context = (Context) ciVar.j(m4.b);
                jf jfVar = jf.a;
                if (z3) {
                    if (i2 >= 34) {
                        kfVarF = lf.c(jfVar.a(context, R.color.system_primary_dark), jfVar.a(context, R.color.system_on_primary_dark), jfVar.a(context, R.color.system_primary_container_dark), jfVar.a(context, R.color.system_on_primary_container_dark), jfVar.a(context, R.color.system_primary_light), jfVar.a(context, R.color.system_secondary_dark), jfVar.a(context, R.color.system_on_secondary_dark), jfVar.a(context, R.color.system_secondary_container_dark), jfVar.a(context, R.color.system_on_secondary_container_dark), jfVar.a(context, R.color.system_tertiary_dark), jfVar.a(context, R.color.system_on_tertiary_dark), jfVar.a(context, R.color.system_tertiary_container_dark), jfVar.a(context, R.color.system_on_tertiary_container_dark), jfVar.a(context, R.color.system_background_dark), jfVar.a(context, R.color.system_on_background_dark), jfVar.a(context, R.color.system_surface_dark), jfVar.a(context, R.color.system_on_surface_dark), jfVar.a(context, R.color.system_surface_variant_dark), jfVar.a(context, R.color.system_on_surface_variant_dark), jfVar.a(context, R.color.system_primary_dark), jfVar.a(context, R.color.system_surface_light), jfVar.a(context, R.color.system_on_surface_light), jfVar.a(context, R.color.system_outline_dark), jfVar.a(context, R.color.system_outline_variant_dark), 0L, jfVar.a(context, R.color.system_surface_bright_dark), jfVar.a(context, R.color.system_surface_container_dark), jfVar.a(context, R.color.system_surface_container_high_dark), jfVar.a(context, R.color.system_surface_container_highest_dark), jfVar.a(context, R.color.system_surface_container_low_dark), jfVar.a(context, R.color.system_surface_container_lowest_dark), jfVar.a(context, R.color.system_surface_dim_dark), 331350016, 0);
                    } else {
                        s21 s21VarQ = d80.q(context);
                        long j = s21VarQ.x;
                        long j2 = s21VarQ.A;
                        long j3 = s21VarQ.z;
                        long j4 = s21VarQ.w;
                        long j5 = s21VarQ.y;
                        long j6 = s21VarQ.E;
                        long j7 = s21VarQ.H;
                        long j8 = s21VarQ.G;
                        long j9 = s21VarQ.D;
                        long j10 = s21VarQ.L;
                        long j11 = s21VarQ.O;
                        long j12 = s21VarQ.N;
                        long j13 = s21VarQ.K;
                        long j14 = s21VarQ.s;
                        long j15 = s21VarQ.g;
                        long j16 = s21VarQ.l;
                        kfVarF = lf.c(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, s21VarQ.i, j, j15, s21VarQ.o, s21VarQ.j, j16, s21VarQ.u, s21VarQ.m, s21VarQ.q, s21VarQ.p, s21VarQ.n, s21VarQ.r, s21VarQ.t, j14, 62914560, 0);
                    }
                } else if (i2 >= 34) {
                    kfVarF = lf.f(jfVar.a(context, R.color.system_primary_light), jfVar.a(context, R.color.system_on_primary_light), jfVar.a(context, R.color.system_primary_container_light), jfVar.a(context, R.color.system_on_primary_container_light), jfVar.a(context, R.color.system_primary_dark), jfVar.a(context, R.color.system_secondary_light), jfVar.a(context, R.color.system_on_secondary_light), jfVar.a(context, R.color.system_secondary_container_light), jfVar.a(context, R.color.system_on_secondary_container_light), jfVar.a(context, R.color.system_tertiary_light), jfVar.a(context, R.color.system_on_tertiary_light), jfVar.a(context, R.color.system_tertiary_container_light), jfVar.a(context, R.color.system_on_tertiary_container_light), jfVar.a(context, R.color.system_background_light), jfVar.a(context, R.color.system_on_background_light), jfVar.a(context, R.color.system_surface_light), jfVar.a(context, R.color.system_on_surface_light), jfVar.a(context, R.color.system_surface_variant_light), jfVar.a(context, R.color.system_on_surface_variant_light), jfVar.a(context, R.color.system_primary_light), jfVar.a(context, R.color.system_surface_dark), jfVar.a(context, R.color.system_on_surface_dark), jfVar.a(context, R.color.system_outline_light), jfVar.a(context, R.color.system_outline_variant_light), 0L, jfVar.a(context, R.color.system_surface_bright_light), jfVar.a(context, R.color.system_surface_container_light), jfVar.a(context, R.color.system_surface_container_high_light), jfVar.a(context, R.color.system_surface_container_highest_light), jfVar.a(context, R.color.system_surface_container_low_light), jfVar.a(context, R.color.system_surface_container_lowest_light), jfVar.a(context, R.color.system_surface_dim_light), 331350016, 0);
                } else {
                    s21 s21VarQ2 = d80.q(context);
                    long j17 = s21VarQ2.y;
                    long j18 = s21VarQ2.v;
                    long j19 = s21VarQ2.w;
                    long j20 = s21VarQ2.B;
                    long j21 = s21VarQ2.x;
                    long j22 = s21VarQ2.F;
                    long j23 = s21VarQ2.C;
                    long j24 = s21VarQ2.D;
                    long j25 = s21VarQ2.I;
                    long j26 = s21VarQ2.M;
                    long j27 = s21VarQ2.J;
                    long j28 = s21VarQ2.K;
                    long j29 = s21VarQ2.P;
                    long j30 = s21VarQ2.b;
                    long j31 = s21VarQ2.r;
                    long j32 = s21VarQ2.g;
                    kfVarF = lf.f(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j30, j31, j32, s21VarQ2.l, j17, s21VarQ2.o, s21VarQ2.d, s21VarQ2.k, s21VarQ2.i, s21VarQ2.u, j30, s21VarQ2.e, s21VarQ2.f, j32, s21VarQ2.c, s21VarQ2.a, s21VarQ2.h, 62914560, 0);
                }
            }
            ciVar.p(false);
            c80.a(kfVarF, null, s31.a, zgVar, ciVar, 3456);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new kw(z3, z4, zgVar, i) { // from class: h21
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ zg f;

                @Override // defpackage.kw
                public final Object e(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = d80.I(385);
                    i21.a(this.d, this.e, this.f, (ci) obj, I);
                    return j41.a;
                }
            };
        }
    }
}
