package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.window.BackEvent;
import androidx.compose.ui.draw.a;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class r31 {
    public static final Object[] a = new Object[0];
    public static final yn b = new yn(1.0f, 1.0f);
    public static final yn c = new yn(1.0f, 1.0f);
    public static final kc0 d = new kc0(6);
    public static final xl0 e = new xl0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final ml A(ml mlVar, ml mlVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) mlVar.r(new nl(2), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) mlVar2.r(new nl(2), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return mlVar.k(mlVar2);
        }
        nl nlVar = new nl(0);
        is isVar = is.d;
        ml mlVar3 = (ml) mlVar.r(nlVar, isVar);
        Object objR = mlVar2;
        if (zBooleanValue2) {
            objR = mlVar2.r(new nl(1), isVar);
        }
        return mlVar3.k((ml) objR);
    }

    public static final float B(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        qz0 qz0Var = r11.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : ez.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float C(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        qz0 qz0Var = r11.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? ez.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final int D(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long E(defpackage.ss0 r11, long r12, defpackage.rr0 r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r31.E(ss0, long, rr0):long");
    }

    public static final jo0 F(g80 g80Var) {
        Object objL = g80Var.l();
        if (objL instanceof jo0) {
            return (jo0) objL;
        }
        return null;
    }

    public static final float G(jo0 jo0Var) {
        if (jo0Var != null) {
            return jo0Var.a;
        }
        return 0.0f;
    }

    public static kz H(wq wqVar) {
        return new kz(wqVar, 0);
    }

    public static lk I(lk lkVar) {
        c10.p(lkVar, "<this>");
        mk mkVar = lkVar instanceof mk ? (mk) lkVar : null;
        if (mkVar == null || (lkVar = mkVar.f) != null) {
            return lkVar;
        }
        nk nkVar = (nk) mkVar.f().n(g2.v);
        lk toVar = nkVar != null ? new to((pl) nkVar, mkVar) : mkVar;
        mkVar.f = toVar;
        return toVar;
    }

    public static boolean J(int i, Object obj) {
        int iB;
        if (obj instanceof ow) {
            if (obj instanceof qw) {
                iB = ((qw) obj).b();
            } else if (obj instanceof gw) {
                iB = 0;
            } else if (obj instanceof iw) {
                iB = 1;
            } else if (obj instanceof kw) {
                iB = 2;
            } else if (obj instanceof lw) {
                iB = 3;
            } else if (obj instanceof mw) {
                iB = 4;
            } else {
                boolean z = obj instanceof vg;
                iB = z ? 5 : obj instanceof nw ? 6 : z ? 7 : z ? 8 : z ? 9 : z ? 10 : z ? 11 : z ? 13 : z ? 14 : z ? 15 : z ? 16 : z ? 17 : z ? 18 : z ? 19 : z ? 20 : z ? 21 : -1;
            }
            if (iB == i) {
                return true;
            }
        }
        return false;
    }

    public static final float K(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static final int L(float f, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final long M(float f, long j, long j2) {
        jd0 jd0Var = pf.x;
        long jA = bf.a(j, jd0Var);
        long jA2 = bf.a(j2, jd0Var);
        float fD = bf.d(jA);
        float fH = bf.h(jA);
        float fG = bf.g(jA);
        float fE = bf.e(jA);
        float fD2 = bf.d(jA2);
        float fH2 = bf.h(jA2);
        float fG2 = bf.g(jA2);
        float fE2 = bf.e(jA2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return bf.a(h(K(fH, fH2, f), K(fG, fG2, f), K(fE, fE2, f), K(fD, fD2, f), jd0Var), bf.f(j2));
    }

    public static final float N(long j) {
        mf mfVarF = bf.f(j);
        if (!ff.a(mfVarF.b, ff.a)) {
            sz.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ff.b(mfVarF.b)));
        }
        dn0 dn0Var = ((hn0) mfVarF).p;
        double dB = dn0Var.b(bf.h(j));
        float fB = (float) ((dn0Var.b(bf.e(j)) * 0.0722d) + (dn0Var.b(bf.g(j)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final e90 O(ci ciVar, e90 e90Var) {
        if (e90Var.b(e3.z)) {
            return e90Var;
        }
        ciVar.R(1219399079, null, 0, null);
        e90 e90Var2 = (e90) e90Var.a(new j(5, ciVar), b90.a);
        ciVar.p(false);
        return e90Var2;
    }

    public static final e90 P(ci ciVar, e90 e90Var) {
        ciVar.V(439770924);
        e90 e90VarO = O(ciVar, e90Var);
        ciVar.p(false);
        return e90VarO;
    }

    public static void Q(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static List T(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final eg0 U(t30 t30Var) {
        eg0 eg0Var = t30Var.p;
        if (eg0Var != null) {
            return eg0Var;
        }
        throw b8.f("LayoutNode should be attached to an owner");
    }

    public static final View V(ln lnVar) {
        if (!((d90) lnVar).d.q) {
            pz.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) U(d80.z(lnVar));
    }

    public static ow0 W(int i, Object obj) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return new ow0(1.0f, 1500.0f, obj);
    }

    public static final kl0 X(r1 r1Var, kk kkVar, vw0 vw0Var, Float f) {
        ld.a.getClass();
        kd kdVar = kd.a;
        xz xzVar = new xz(22, r1Var, is.d);
        zw0 zw0VarF = d80.f(f);
        ml mlVar = (ml) xzVar.f;
        vt vtVar = (vt) xzVar.e;
        zl zlVar = vw0Var.equals(tu0.a) ? zl.d : zl.g;
        y5 y5Var = new y5(vw0Var, vtVar, zw0VarF, f, null, 5);
        ml mlVarA = A(kkVar.g(), mlVar, true);
        fn fnVar = xo.a;
        if (mlVarA != fnVar && mlVarA.n(g2.v) == null) {
            mlVarA = mlVarA.k(fnVar);
        }
        l i40Var = zlVar == zl.e ? new i40(mlVarA, y5Var) : new rw0(mlVarA, true);
        i40Var.g0(zlVar, i40Var, y5Var);
        return new kl0(zw0VarF);
    }

    public static void Y(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        c10.V(classCastException, r31.class.getName());
        throw classCastException;
    }

    public static final int Z(long j) {
        float[] fArr = pf.a;
        return (int) (bf.a(j, pf.e) >>> 32);
    }

    public static final void a(e90 e90Var, iw iwVar, ci ciVar, int i) {
        ciVar.W(-932836462);
        if ((((ciVar.f(e90Var) ? 4 : 2) | i | (ciVar.h(iwVar) ? 32 : 16)) & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else {
            h9.a(ciVar, a.a(e90Var, iwVar));
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new h4(i, 4, e90Var, iwVar);
        }
    }

    public static final Object[] a0(Collection collection) {
        c10.p(collection, "collection");
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                c10.o(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                c10.o(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, defpackage.mf r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r31.b(float, float, float, float, mf):long");
    }

    public static final Object[] b0(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        c10.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    c10.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        c10.o(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        c10.o(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final long c(int i) {
        long j = i << 32;
        int i2 = bf.h;
        return j;
    }

    public static p31 c0(int i, int i2, yq yqVar) {
        if ((i2 & 4) != 0) {
            yqVar = zq.a;
        }
        return new p31(i, 0, yqVar);
    }

    public static final long d(long j) {
        long j2 = j << 32;
        int i = bf.h;
        return j2;
    }

    public static final long d0(long j, long j2) {
        int iC;
        int iE = w11.e(j);
        int iD = w11.d(j);
        if ((w11.e(j2) < w11.d(j)) && (w11.e(j) < w11.d(j2))) {
            if ((w11.e(j2) <= w11.e(j)) && (w11.d(j) <= w11.d(j2))) {
                iE = w11.e(j2);
                iD = iE;
            } else {
                if ((w11.e(j) <= w11.e(j2)) && (w11.d(j2) <= w11.d(j))) {
                    iC = w11.c(j2);
                } else {
                    int iE2 = w11.e(j2);
                    if (iE >= w11.d(j2) || iE2 > iE) {
                        iD = w11.e(j2);
                    } else {
                        iE = w11.e(j2);
                        iC = w11.c(j2);
                    }
                }
                iD -= iC;
            }
        } else if (iD > w11.e(j2)) {
            iE -= w11.c(j2);
            iC = w11.c(j2);
            iD -= iC;
        }
        return no0.a(iE, iD);
    }

    public static long e(int i, int i2, int i3) {
        return c(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final g41 e0(lk lkVar, ml mlVar, Object obj) {
        g41 g41Var = null;
        if ((lkVar instanceof yl) && mlVar.n(cd.f) != null) {
            yl ylVarD = (yl) lkVar;
            while (true) {
                if ((ylVarD instanceof uo) || (ylVarD = ylVarD.d()) == null) {
                    break;
                }
                if (ylVarD instanceof g41) {
                    g41Var = (g41) ylVarD;
                    break;
                }
            }
            if (g41Var != null) {
                g41Var.i0(mlVar, obj);
            }
        }
        return g41Var;
    }

    public static final zn f(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        uv uvVarA = vv.a(f);
        if (uvVarA == null) {
            uvVarA = new r50(f);
        }
        return new zn(f2, f, uvVarA);
    }

    public static final xl0 f0(d30 d30Var) {
        xl0 xl0VarS = l81.s(d30Var);
        float f = xl0VarS.a;
        float f2 = xl0VarS.b;
        long jH = d30Var.h((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float f3 = xl0VarS.c;
        float f4 = xl0VarS.d;
        long jH2 = d30Var.h((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        return new xl0(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & 4294967295L)), Float.intBitsToFloat((int) (jH2 >> 32)), Float.intBitsToFloat((int) (jH2 & 4294967295L)));
    }

    public static final pb0 g(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new pb0(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static Object g0(kw kwVar, Object obj, lk lkVar) {
        c10.p(kwVar, "<this>");
        ml mlVarF = lkVar.f();
        Object f10Var = mlVarF == is.d ? new f10(lkVar) : new g10(lkVar, mlVarF);
        m(2, kwVar);
        return kwVar.e(obj, f10Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long h(float r17, float r18, float r19, float r20, defpackage.mf r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r31.h(float, float, float, float, mf):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h0(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.nk0 r20, boolean r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r31.h0(android.content.Context, java.util.concurrent.Executor, nk0, boolean):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.oy0 r7, defpackage.ia r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.vj
            if (r0 == 0) goto L13
            r0 = r8
            vj r0 = (defpackage.vj) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            vj r0 = new vj
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            oy0 r7 = r0.g
            defpackage.c10.X(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.c10.X(r8)
        L32:
            r0.g = r7
            r0.i = r2
            hj0 r8 = defpackage.hj0.e
            java.lang.Object r8 = r7.a(r8, r0)
            xl r1 = defpackage.xl.d
            if (r8 != r1) goto L41
            return r1
        L41:
            gj0 r8 = (defpackage.gj0) r8
            int r1 = r8.b
            java.lang.Object r8 = r8.a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r8.size()
            r3 = 0
            r4 = r3
        L51:
            if (r4 >= r1) goto L6a
            java.lang.Object r5 = r8.get(r4)
            nj0 r5 = (defpackage.nj0) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L32
            boolean r6 = r5.h
            if (r6 != 0) goto L32
            boolean r5 = r5.d
            if (r5 == 0) goto L32
            int r4 = r4 + 1
            goto L51
        L6a:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r31.i(oy0, ia):java.lang.Object");
    }

    public static final int i0(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final ExtractedText j(a11 a11Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = a11Var.a.e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = a11Var.b;
        extractedText.selectionStart = w11.e(j);
        extractedText.selectionEnd = w11.d(j);
        extractedText.flags = !px0.o(a11Var.a.e, '\n') ? 1 : 0;
        return extractedText;
    }

    public static Map k(Object obj) {
        if ((obj instanceof c20) && !(obj instanceof e20)) {
            Y(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            c10.V(e2, r31.class.getName());
            throw e2;
        }
    }

    public static final void l(f61 f61Var, mp0 mp0Var, a50 a50Var) {
        AutoCloseable autoCloseable;
        c10.p(mp0Var, "registry");
        c10.p(a50Var, "lifecycle");
        g61 g61Var = f61Var.a;
        if (g61Var != null) {
            synchronized (g61Var.a) {
                autoCloseable = (AutoCloseable) g61Var.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        fp0 fp0Var = (fp0) autoCloseable;
        if (fp0Var == null || fp0Var.f) {
            return;
        }
        fp0Var.e(a50Var, mp0Var);
        z40 z40Var = ((h50) a50Var).c;
        if (z40Var == z40.e || z40Var.compareTo(z40.g) >= 0) {
            mp0Var.c();
        } else {
            a50Var.a(new en(a50Var, mp0Var));
        }
    }

    public static void m(int i, Object obj) {
        if (obj == null || J(i, obj)) {
            return;
        }
        Y(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final e90 r(e90 e90Var, lw lwVar) {
        return e90Var.c(new uh(lwVar));
    }

    public static final long s(long j, long j2) {
        float f;
        float f2;
        long jA = bf.a(j, bf.f(j2));
        float fD = bf.d(j2);
        float fD2 = bf.d(jA);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = bf.h(jA);
        float fH2 = bf.h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = bf.g(jA);
        float fG2 = bf.g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        float fE = bf.e(jA);
        float fE2 = bf.e(j2);
        if (f4 != 0.0f) {
            f5 = (((fE2 * fD) * f3) + (fE * fD2)) / f4;
        }
        return h(f, f2, f5, f4, bf.f(j2));
    }

    public static final boolean t(xl0 xl0Var, long j) {
        float f = xl0Var.a;
        float f2 = xl0Var.c;
        float fD = ed0.d(j);
        if (f > fD || fD > f2) {
            return false;
        }
        float f3 = xl0Var.b;
        float f4 = xl0Var.d;
        float fE = ed0.e(j);
        return f3 <= fE && fE <= f4;
    }

    public static StaticLayout u(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            qz.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            qz.a("invalid end value");
        }
        if (i3 < 0) {
            qz.a("invalid maxLines value");
        }
        if (i < 0) {
            qz.a("invalid width value");
        }
        if (i4 < 0) {
            qz.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(u0.a().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lk v(lk lkVar, lk lkVar2, kw kwVar) {
        c10.p(kwVar, "<this>");
        if (kwVar instanceof ia) {
            return ((ia) kwVar).k(lkVar2, lkVar);
        }
        ml mlVarF = lkVar2.f();
        return mlVarF == is.d ? new d10(lkVar2, lkVar, kwVar) : new e10(lkVar2, mlVarF, kwVar, lkVar);
    }

    public static final vt w(vt vtVar) {
        return ((vtVar instanceof xw0) || (vtVar instanceof hp)) ? vtVar : new hp(vtVar);
    }

    public static void x(sq sqVar, nf0 nf0Var, long j) {
        if (nf0Var instanceof lf0) {
            xl0 xl0Var = ((lf0) nf0Var).a;
            float f = xl0Var.a;
            float f2 = xl0Var.b;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
            float f3 = xl0Var.c - xl0Var.a;
            float f4 = xl0Var.d - xl0Var.b;
            sqVar.L(j, jFloatToRawIntBits, (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), 3);
            return;
        }
        if (!(nf0Var instanceof mf0)) {
            if (!(nf0Var instanceof kf0)) {
                throw new fg();
            }
            sqVar.V(((kf0) nf0Var).a, j);
            return;
        }
        mf0 mf0Var = (mf0) nf0Var;
        i6 i6Var = mf0Var.b;
        if (i6Var != null) {
            sqVar.V(i6Var, j);
            return;
        }
        fo0 fo0Var = mf0Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fo0Var.h >> 32));
        float f5 = fo0Var.a;
        float f6 = fo0Var.b;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        float fB = fo0Var.b();
        float fA = fo0Var.a();
        sqVar.w(j, jFloatToRawIntBits2, (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat)) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float y(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.vt r5, defpackage.kw r6, defpackage.mk r7) throws java.lang.Throwable {
        /*
            cs r0 = defpackage.b10.k
            boolean r1 = r7 instanceof defpackage.du
            if (r1 == 0) goto L15
            r1 = r7
            du r1 = (defpackage.du) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.k = r2
            goto L1a
        L15:
            du r1 = new du
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.j
            int r2 = r1.k
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            gp r5 = r1.i
            dm0 r6 = r1.h
            jy0 r1 = r1.g
            kw r1 = (defpackage.kw) r1
            defpackage.c10.X(r7)     // Catch: defpackage.a -> L2f
            goto L68
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.c10.X(r7)
            dm0 r7 = new dm0
            r7.<init>()
            r7.d = r0
            gp r2 = new gp
            r2.<init>(r6, r7)
            r4 = r6
            jy0 r4 = (defpackage.jy0) r4     // Catch: defpackage.a -> L5f
            r1.g = r4     // Catch: defpackage.a -> L5f
            r1.h = r7     // Catch: defpackage.a -> L5f
            r1.i = r2     // Catch: defpackage.a -> L5f
            r1.k = r3     // Catch: defpackage.a -> L5f
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: defpackage.a -> L5f
            xl r1 = defpackage.xl.d
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r1 = r6
            r6 = r7
            goto L68
        L5f:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L64:
            java.lang.Object r2 = r7.d
            if (r2 != r5) goto L81
        L68:
            java.lang.Object r5 = r6.d
            if (r5 == r0) goto L6d
            return r5
        L6d:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r31.z(vt, kw, mk):java.lang.Object");
    }

    public abstract void R(e0 e0Var, e0 e0Var2);

    public abstract void S(e0 e0Var, Thread thread);

    public abstract boolean n(f0 f0Var, b0 b0Var);

    public abstract boolean o(f0 f0Var, Object obj, Object obj2);

    public abstract boolean p(f0 f0Var, e0 e0Var, e0 e0Var2);
}
