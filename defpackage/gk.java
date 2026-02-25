package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class gk {
    public static final yj0 a;
    public static final uj b;

    static {
        a = new yj0((14 & 1) == 0, nr0.d, true);
        long j = bf.c;
        long j2 = bf.b;
        b = new uj(j, j2, j2, bf.b(j2, 0.38f), bf.b(j2, 0.38f));
    }

    public static final void a(uj ujVar, zg zgVar, ci ciVar, int i) {
        ci ciVar2;
        ciVar.W(-921259293);
        int i2 = (ciVar.f(ujVar) ? 4 : 2) | i;
        e90 shadowGraphicsLayerElement = b90.a;
        if (((i2 | (ciVar.f(shadowGraphicsLayerElement) ? 32 : 16)) & 147) == 146 && ciVar.z()) {
            ciVar.Q();
            ciVar2 = ciVar;
        } else {
            float f = yj.d;
            go0 go0VarA = ho0.a(yj.e);
            float f2 = 0;
            boolean z = Float.compare(f, f2) > 0;
            long j = hx.a;
            if (Float.compare(f, f2) > 0 || z) {
                shadowGraphicsLayerElement = new ShadowGraphicsLayerElement(go0VarA, z, j, j);
            }
            e90 e90VarF = a.f(a.h(androidx.compose.foundation.a.a(shadowGraphicsLayerElement, ujVar.a, nm.h)), 0.0f, yj.i, 1);
            Object[] objArr = new Object[0];
            xz xzVar = tq0.i;
            boolean zD = ciVar.d(0);
            Object objK = ciVar.K();
            if (zD || objK == vh.a) {
                objK = new nq0(0, 0);
                ciVar.e0(objK);
            }
            ciVar2 = ciVar;
            e90 e90VarR = r31.r(e90VarF, new e((tq0) b10.c0(objArr, xzVar, (gw) objK, ciVar2, 0, 4)));
            tf tfVarA = rf.a(o9.c, g2.p, ciVar2, 0);
            int iHashCode = Long.hashCode(ciVar2.T);
            wh0 wh0VarL = ciVar2.l();
            e90 e90VarP = r31.P(ciVar2, e90VarR);
            sh.b.getClass();
            si siVar = rh.b;
            ciVar2.X();
            if (ciVar2.S) {
                ciVar2.k(siVar);
            } else {
                ciVar2.h0();
            }
            dq0.m(ciVar2, rh.e, tfVarA);
            dq0.m(ciVar2, rh.d, wh0VarL);
            n9 n9Var = rh.f;
            if (ciVar2.S || !c10.i(ciVar2.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar2, iHashCode, n9Var);
            }
            dq0.m(ciVar2, rh.c, e90VarP);
            zgVar.c(uf.a, ciVar2, 54);
            ciVar2.p(true);
        }
        nl0 nl0VarR = ciVar2.r();
        if (nl0VarR != null) {
            nl0VarR.d = new h4(i, 6, ujVar, zgVar);
        }
    }

    public static final void b(String str, boolean z, uj ujVar, e90 e90Var, gw gwVar, ci ciVar, int i) {
        int i2;
        ciVar.W(791018367);
        if ((i & 6) == 0) {
            i2 = (ciVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.f(ujVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ciVar.f(e90Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ciVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ciVar.h(gwVar) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && ciVar.z()) {
            ciVar.Q();
        } else {
            ra raVar = yj.f;
            v71 v71Var = o9.a;
            float f = yj.h;
            k9 k9Var = new k9(f);
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objK = ciVar.K();
            if (z2 || objK == vh.a) {
                objK = new dk(gwVar, z);
                ciVar.e0(objK);
            }
            e90 e90VarC = r31.r(e90Var, new ie(z, str, (gw) objK)).c(b.a);
            float f2 = yj.a;
            float f3 = yj.b;
            float f4 = yj.c;
            e90 e90VarF = a.f(b.g(e90VarC, f2, f4, f3, f4), f, 0.0f, 2);
            lo0 lo0VarA = ko0.a(k9Var, raVar, ciVar, 54);
            int iHashCode = Long.hashCode(ciVar.T);
            wh0 wh0VarL = ciVar.l();
            e90 e90VarP = r31.P(ciVar, e90VarF);
            sh.b.getClass();
            si siVar = rh.b;
            ciVar.X();
            if (ciVar.S) {
                ciVar.k(siVar);
            } else {
                ciVar.h0();
            }
            dq0.m(ciVar, rh.e, lo0VarA);
            dq0.m(ciVar, rh.d, wh0VarL);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            dq0.m(ciVar, rh.c, e90VarP);
            ciVar.V(554568909);
            ciVar.p(false);
            c21 c21Var = new c21(z ? ujVar.b : ujVar.d, yj.j, yj.k, yj.m, yj.g, yj.l, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            c10.a(str, new LayoutWeightElement(1.0f, true), c21Var, 0, false, 1, 0, ciVar, (i2 & 14) | 1572864, 440);
            ciVar.p(true);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new ek(str, z, ujVar, e90Var, gwVar, i);
        }
    }

    public static final void c(xj0 xj0Var, gw gwVar, uj ujVar, iw iwVar, ci ciVar, int i) {
        int i2;
        gw gwVar2;
        ci ciVar2;
        xj0 xj0Var2;
        ciVar.W(1447189339);
        if ((i & 6) == 0) {
            i2 = (ciVar.f(xj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.h(gwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.f(b90.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ciVar.f(ujVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ciVar.h(iwVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && ciVar.z()) {
            ciVar.Q();
            gwVar2 = gwVar;
            ciVar2 = ciVar;
            xj0Var2 = xj0Var;
        } else {
            gwVar2 = gwVar;
            ciVar2 = ciVar;
            u6.a(xj0Var, gwVar2, a, b10.b0(795909757, new h4(ujVar, iwVar), ciVar), ciVar2, (i2 & 14) | 3456 | (i2 & 112), 0);
            xj0Var2 = xj0Var;
        }
        nl0 nl0VarR = ciVar2.r();
        if (nl0VarR != null) {
            nl0VarR.d = new e2(xj0Var2, gwVar2, ujVar, iwVar, i);
        }
    }

    public static final void d(xj0 xj0Var, gw gwVar, iw iwVar, ci ciVar, int i) {
        int i2;
        ciVar.W(712057293);
        if ((i & 6) == 0) {
            i2 = (ciVar.f(xj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.h(gwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.f(b90.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ciVar.h(iwVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && ciVar.z()) {
            ciVar.Q();
        } else {
            Context context = (Context) ciVar.j(m4.b);
            boolean zF = ciVar.f((Configuration) ciVar.j(m4.a)) | ciVar.f(context);
            Object objK = ciVar.K();
            if (zF || objK == vh.a) {
                uj ujVar = b;
                long jC = ujVar.a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iZ = r31.Z(jC);
                int color = typedArrayObtainStyledAttributes.getColor(0, iZ);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iZ) {
                    jC = r31.c(color);
                }
                long j = jC;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jC2 = ujVar.b;
                int iZ2 = r31.Z(jC2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iZ2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iZ2) {
                    jC2 = r31.c(numValueOf.intValue());
                }
                long j2 = jC2;
                long jC3 = ujVar.d;
                int iZ3 = r31.Z(jC3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iZ3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iZ3) {
                    jC3 = r31.c(numValueOf2.intValue());
                }
                long j3 = jC3;
                Object ujVar2 = new uj(j, j2, j2, j3, j3);
                ciVar.e0(ujVar2);
                objK = ujVar2;
            }
            c(xj0Var, gwVar, (uj) objK, iwVar, ciVar, (i2 & 1022) | ((i2 << 3) & 57344));
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new c5(xj0Var, gwVar, iwVar, i);
        }
    }
}
