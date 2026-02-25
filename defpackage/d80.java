package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.LongSparseArray;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d80 {
    public static final ud a = new ud();
    public static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final v71 c = new v71(24);
    public static final n6 d = new n6(1000);
    public static final xz e;
    public static final xz f;
    public static final xz g;
    public static final cs h;
    public static final cs i;

    static {
        new n6(1007);
        new n6(1008);
        new n6(1002);
        int i2 = 21;
        e = new xz(i2, new nl(28), new r8(27));
        f = new xz(i2, new nl(29), new r8(28));
        g = new xz(i2, new vp0(0), new r8(29));
        h = new cs("NONE", 1);
        i = new cs("PENDING", 1);
    }

    public static final eg0 A(ln lnVar) {
        eg0 eg0Var = z(lnVar).p;
        if (eg0Var != null) {
            return eg0Var;
        }
        throw b8.f("This node does not have an owner.");
    }

    public static int B(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static final void C(av avVar) {
        d90 d90Var;
        jc0 jc0Var;
        if (!avVar.d.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var2 = avVar.d.h;
        t30 t30VarZ = z(avVar);
        loop0: while (true) {
            d90Var = null;
            if (t30VarZ == null) {
                break;
            }
            if ((t30VarZ.G.f.g & 1024) != 0) {
                while (d90Var2 != null) {
                    if ((d90Var2.f & 1024) != 0) {
                        d90 d90VarI = d90Var2;
                        eb0 eb0Var = null;
                        while (d90VarI != null) {
                            if (d90VarI instanceof av) {
                                d90Var = d90VarI;
                                break loop0;
                            }
                            if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                int i2 = 0;
                                for (d90 d90Var3 = ((mn) d90VarI).s; d90Var3 != null; d90Var3 = d90Var3.i) {
                                    if ((d90Var3.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            d90VarI = d90Var3;
                                        } else {
                                            if (eb0Var == null) {
                                                eb0Var = new eb0(new d90[16]);
                                            }
                                            if (d90VarI != null) {
                                                eb0Var.b(d90VarI);
                                                d90VarI = null;
                                            }
                                            eb0Var.b(d90Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            d90VarI = i(eb0Var);
                        }
                    }
                    d90Var2 = d90Var2.h;
                }
            }
            t30VarZ = t30VarZ.t();
            d90Var2 = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
        }
        av avVar2 = (av) d90Var;
        if (avVar2 == null) {
            if (avVar.v(oa.a) != null) {
                throw new ClassCastException();
            }
            return;
        }
        rq rqVar = oa.a;
        if (avVar2.v(rqVar) != null) {
            throw new ClassCastException();
        }
        if (avVar.v(rqVar) != null) {
            throw new ClassCastException();
        }
    }

    public static final void D(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255));
    }

    public static final long E(long j, float f2) {
        double d2 = f2;
        int i2 = 0;
        if (!(d2 < 1.0E-4d) && !(d2 > 99.9999d)) {
            x20 x20Var = pf.t;
            long jA = bf.a(j, x20Var);
            return bf.a(r31.b(f2, bf.g(jA), bf.e(jA), 1.0f, x20Var), pf.e);
        }
        float f3 = 100;
        float f4 = 16;
        float f5 = 116;
        float f6 = (f2 + f4) / f5;
        float f7 = f6 * f6 * f6;
        if (f7 <= 0.008856452f) {
            f7 = ((f5 * f6) - f4) / 903.2963f;
        }
        double d3 = (f7 * f3) / f3;
        double dPow = (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
        if (Double.isNaN(dPow)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        int iRound = dPow > 2.147483647E9d ? Integer.MAX_VALUE : dPow < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(dPow);
        if (iRound >= 0) {
            i2 = 255;
            if (iRound <= 255) {
                i2 = iRound;
            }
        }
        return r31.e(i2, i2, i2);
    }

    public static final long F(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static String G(int i2) {
        return i2 == -1 ? "Unspecified" : i2 == 0 ? "None" : i2 == 1 ? "Characters" : i2 == 2 ? "Words" : i2 == 3 ? "Sentences" : "Invalid";
    }

    public static final boolean H(Throwable th, gw gwVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Collection collectionAsList;
        Object objInvoke;
        c10.p(th, "<this>");
        Integer num = p10.a;
        jo joVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            c10.o(suppressed, "getSuppressed(...)");
            collectionAsList = Arrays.asList(suppressed);
            c10.o(collectionAsList, "asList(...)");
        } else {
            Method method = si0.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                collectionAsList = ks.d;
            } else {
                collectionAsList = Arrays.asList((Throwable[]) objInvoke);
                c10.o(collectionAsList, "asList(...)");
            }
        }
        boolean z = false;
        if (!collectionAsList.isEmpty()) {
            Iterator it = collectionAsList.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof jo) {
                    return false;
                }
            }
        }
        try {
            List list = (List) gwVar.a();
            boolean zIsEmpty = list.isEmpty();
            z = !zIsEmpty;
            if (!zIsEmpty) {
                joVar = new jo(list);
            }
        } catch (Throwable th2) {
            joVar = th2;
        }
        if (joVar != null) {
            c10.h(th, joVar);
        }
        return z;
    }

    public static final int I(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static final void J(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        c10.p(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            c10.o(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        c10.m(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        c10.o(byteBufferAllocate, "allocate(...)");
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int iMin = Math.min(8192 - i3, str.length() - i2);
            int i4 = i2 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            c10.o(cArrArray, "array(...)");
            str.getChars(i2, i4, cArrArray, i3);
            charBufferAllocate.limit(iMin + i3);
            i3 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i4 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i3 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i2 = i4;
        }
    }

    public static final t2 a(r5 r5Var) {
        Canvas canvas = u2.a;
        t2 t2Var = new t2();
        t2Var.a = new Canvas(r5Var.a);
        return t2Var;
    }

    public static final void b(ck ckVar, gw gwVar, e90 e90Var, iw iwVar, ci ciVar, int i2) {
        int i3;
        ciVar.W(645832757);
        if ((i2 & 6) == 0) {
            i3 = (ciVar.f(ckVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ciVar.h(gwVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= ciVar.h(iwVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && ciVar.z()) {
            ciVar.Q();
        } else {
            bk bkVar = (bk) ckVar.a.getValue();
            if (!(bkVar instanceof ak)) {
                nl0 nl0VarR = ciVar.r();
                if (nl0VarR != null) {
                    nl0VarR.d = new c5(ckVar, gwVar, iwVar, i2);
                    return;
                }
                return;
            }
            boolean zF = ciVar.f(bkVar);
            Object objK = ciVar.K();
            if (zF || objK == vh.a) {
                objK = new wj(c10.U(((ak) bkVar).a));
                ciVar.e0(objK);
            }
            gk.d((wj) objK, gwVar, iwVar, ciVar, i4 & 8176);
            e90Var = b90.a;
        }
        e90 e90Var2 = e90Var;
        nl0 nl0VarR2 = ciVar.r();
        if (nl0VarR2 != null) {
            nl0VarR2.d = new e2(ckVar, gwVar, e90Var2, iwVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ck r16, defpackage.gw r17, defpackage.iw r18, defpackage.e90 r19, boolean r20, defpackage.zg r21, defpackage.ci r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d80.c(ck, gw, iw, e90, boolean, zg, ci, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.r5 d(int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d80.d(int, int, int):r5");
    }

    public static final long e(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final zw0 f(Object obj) {
        if (obj == null) {
            obj = b10.k;
        }
        return new zw0(obj);
    }

    public static final fo0 g(float f2, float f3, float f4, float f5, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new fo0(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void h(eb0 eb0Var, d90 d90Var) {
        eb0 eb0VarX = z(d90Var).x();
        int i2 = eb0VarX.f - 1;
        Object[] objArr = eb0VarX.d;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                eb0Var.b(((t30) objArr[i2]).G.f);
                i2--;
            }
        }
    }

    public static final d90 i(eb0 eb0Var) {
        int i2;
        if (eb0Var == null || (i2 = eb0Var.f) == 0) {
            return null;
        }
        return (d90) eb0Var.k(i2 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l30 j(d90 d90Var) {
        if ((d90Var.f & 2) != 0) {
            if (d90Var instanceof l30) {
                return (l30) d90Var;
            }
            if (d90Var instanceof mn) {
                d90 d90Var2 = ((mn) d90Var).s;
                while (d90Var2 != 0) {
                    if (d90Var2 instanceof l30) {
                        return (l30) d90Var2;
                    }
                    d90Var2 = (!(d90Var2 instanceof mn) || (d90Var2.f & 2) == 0) ? d90Var2.i : ((mn) d90Var2).s;
                }
            }
        }
        return null;
    }

    public static x50 k(x50 x50Var) {
        x50Var.f();
        x50Var.f = true;
        return x50Var.e > 0 ? x50Var : x50.g;
    }

    public static final boolean l(Object obj) {
        if (obj instanceof sv0) {
            sv0 sv0Var = (sv0) obj;
            if (sv0Var.d() == g2.I || sv0Var.d() == g2.V || sv0Var.d() == g2.N) {
                Object value = sv0Var.getValue();
                if (value == null) {
                    return true;
                }
                return l(value);
            }
        } else {
            if ((obj instanceof ow) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i2 = 0; i2 < 7; i2++) {
                if (b[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void m(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(b8.g("fromIndex: ", i2, " > toIndex: ", i3));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static final boolean n(xl0 xl0Var, float f2, float f3) {
        float f4 = xl0Var.a;
        if (f2 > xl0Var.c || f4 > f2) {
            return false;
        }
        return f3 <= xl0Var.d && xl0Var.b <= f3;
    }

    public static final kv o(Context context) {
        v71 v71Var = new v71(2);
        context.getApplicationContext();
        return new kv(v71Var, new o5(Build.VERSION.SDK_INT >= 31 ? aw.a.a(context) : 0));
    }

    public static void p(q4 q4Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        it0 it0Var;
        gt0 gt0Var;
        iw iwVar;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse viewTranslationResponseL = x2.l(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseL != null && (value = viewTranslationResponseL.getValue("android:text")) != null && (text = value.getText()) != null && (it0Var = (it0) q4Var.g().b((int) jKeyAt)) != null && (gt0Var = it0Var.a) != null) {
                Object objG = gt0Var.d.d.g(bt0.j);
                if (objG == null) {
                    objG = null;
                }
                j0 j0Var = (j0) objG;
                if (j0Var != null && (iwVar = (iw) j0Var.b) != null) {
                }
            }
        }
    }

    public static final s21 q(Context context) {
        jf jfVar = jf.a;
        jfVar.a(context, R.color.system_neutral1_0);
        jfVar.a(context, R.color.system_neutral1_10);
        E(jfVar.a(context, R.color.system_neutral1_600), 98.0f);
        E(jfVar.a(context, R.color.system_neutral1_600), 96.0f);
        jfVar.a(context, R.color.system_neutral1_50);
        E(jfVar.a(context, R.color.system_neutral1_600), 94.0f);
        E(jfVar.a(context, R.color.system_neutral1_600), 92.0f);
        jfVar.a(context, R.color.system_neutral1_100);
        E(jfVar.a(context, R.color.system_neutral1_600), 87.0f);
        jfVar.a(context, R.color.system_neutral1_200);
        jfVar.a(context, R.color.system_neutral1_300);
        jfVar.a(context, R.color.system_neutral1_400);
        jfVar.a(context, R.color.system_neutral1_500);
        jfVar.a(context, R.color.system_neutral1_600);
        jfVar.a(context, R.color.system_neutral1_700);
        E(jfVar.a(context, R.color.system_neutral1_600), 24.0f);
        E(jfVar.a(context, R.color.system_neutral1_600), 22.0f);
        jfVar.a(context, R.color.system_neutral1_800);
        E(jfVar.a(context, R.color.system_neutral1_600), 17.0f);
        E(jfVar.a(context, R.color.system_neutral1_600), 12.0f);
        jfVar.a(context, R.color.system_neutral1_900);
        E(jfVar.a(context, R.color.system_neutral1_600), 6.0f);
        E(jfVar.a(context, R.color.system_neutral1_600), 4.0f);
        jfVar.a(context, R.color.system_neutral1_1000);
        long jA = jfVar.a(context, R.color.system_neutral2_0);
        jfVar.a(context, R.color.system_neutral2_10);
        long jE = E(jfVar.a(context, R.color.system_neutral2_600), 98.0f);
        long jE2 = E(jfVar.a(context, R.color.system_neutral2_600), 96.0f);
        long jA2 = jfVar.a(context, R.color.system_neutral2_50);
        long jE3 = E(jfVar.a(context, R.color.system_neutral2_600), 94.0f);
        long jE4 = E(jfVar.a(context, R.color.system_neutral2_600), 92.0f);
        long jA3 = jfVar.a(context, R.color.system_neutral2_100);
        long jE5 = E(jfVar.a(context, R.color.system_neutral2_600), 87.0f);
        long jA4 = jfVar.a(context, R.color.system_neutral2_200);
        jfVar.a(context, R.color.system_neutral2_300);
        long jA5 = jfVar.a(context, R.color.system_neutral2_400);
        long jA6 = jfVar.a(context, R.color.system_neutral2_500);
        jfVar.a(context, R.color.system_neutral2_600);
        long jA7 = jfVar.a(context, R.color.system_neutral2_700);
        long jE6 = E(jfVar.a(context, R.color.system_neutral2_600), 24.0f);
        long jE7 = E(jfVar.a(context, R.color.system_neutral2_600), 22.0f);
        long jA8 = jfVar.a(context, R.color.system_neutral2_800);
        long jE8 = E(jfVar.a(context, R.color.system_neutral2_600), 17.0f);
        long jE9 = E(jfVar.a(context, R.color.system_neutral2_600), 12.0f);
        long jA9 = jfVar.a(context, R.color.system_neutral2_900);
        long jE10 = E(jfVar.a(context, R.color.system_neutral2_600), 6.0f);
        long jE11 = E(jfVar.a(context, R.color.system_neutral2_600), 4.0f);
        long jA10 = jfVar.a(context, R.color.system_neutral2_1000);
        long jA11 = jfVar.a(context, R.color.system_accent1_0);
        jfVar.a(context, R.color.system_accent1_10);
        jfVar.a(context, R.color.system_accent1_50);
        long jA12 = jfVar.a(context, R.color.system_accent1_100);
        long jA13 = jfVar.a(context, R.color.system_accent1_200);
        jfVar.a(context, R.color.system_accent1_300);
        jfVar.a(context, R.color.system_accent1_400);
        jfVar.a(context, R.color.system_accent1_500);
        long jA14 = jfVar.a(context, R.color.system_accent1_600);
        long jA15 = jfVar.a(context, R.color.system_accent1_700);
        long jA16 = jfVar.a(context, R.color.system_accent1_800);
        long jA17 = jfVar.a(context, R.color.system_accent1_900);
        jfVar.a(context, R.color.system_accent1_1000);
        long jA18 = jfVar.a(context, R.color.system_accent2_0);
        jfVar.a(context, R.color.system_accent2_10);
        jfVar.a(context, R.color.system_accent2_50);
        long jA19 = jfVar.a(context, R.color.system_accent2_100);
        long jA20 = jfVar.a(context, R.color.system_accent2_200);
        jfVar.a(context, R.color.system_accent2_300);
        jfVar.a(context, R.color.system_accent2_400);
        jfVar.a(context, R.color.system_accent2_500);
        long jA21 = jfVar.a(context, R.color.system_accent2_600);
        long jA22 = jfVar.a(context, R.color.system_accent2_700);
        long jA23 = jfVar.a(context, R.color.system_accent2_800);
        long jA24 = jfVar.a(context, R.color.system_accent2_900);
        jfVar.a(context, R.color.system_accent2_1000);
        long jA25 = jfVar.a(context, R.color.system_accent3_0);
        jfVar.a(context, R.color.system_accent3_10);
        jfVar.a(context, R.color.system_accent3_50);
        long jA26 = jfVar.a(context, R.color.system_accent3_100);
        long jA27 = jfVar.a(context, R.color.system_accent3_200);
        jfVar.a(context, R.color.system_accent3_300);
        jfVar.a(context, R.color.system_accent3_400);
        jfVar.a(context, R.color.system_accent3_500);
        long jA28 = jfVar.a(context, R.color.system_accent3_600);
        long jA29 = jfVar.a(context, R.color.system_accent3_700);
        long jA30 = jfVar.a(context, R.color.system_accent3_800);
        long jA31 = jfVar.a(context, R.color.system_accent3_900);
        jfVar.a(context, R.color.system_accent3_1000);
        return new s21(jA, jE, jE2, jA2, jE3, jE4, jA3, jE5, jA4, jA5, jA6, jA7, jE6, jE7, jA8, jE8, jE9, jA9, jE10, jE11, jA10, jA11, jA12, jA13, jA14, jA15, jA16, jA17, jA18, jA19, jA20, jA21, jA22, jA23, jA24, jA25, jA26, jA27, jA28, jA29, jA30, jA31);
    }

    public static kl r(kl klVar, ll llVar) {
        c10.p(llVar, "key");
        if (c10.i(klVar.getKey(), llVar)) {
            return klVar;
        }
        return null;
    }

    public static final boolean s(fo0 fo0Var) {
        long j = fo0Var.e;
        return (j >>> 32) == (4294967295L & j) && j == fo0Var.f && j == fo0Var.g && j == fo0Var.h;
    }

    public static List t(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        c10.o(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static ml u(kl klVar, ll llVar) {
        c10.p(llVar, "key");
        return c10.i(klVar.getKey(), llVar) ? is.d : klVar;
    }

    public static ml v(kl klVar, ml mlVar) {
        c10.p(mlVar, "context");
        return mlVar == is.d ? klVar : (ml) mlVar.r(n9.u, klVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d A[PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
  0x016d: PHI (r20v6 r4) = (r20v5 r4), (r20v7 r4) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r22v13 r21) = (r22v12 r21), (r22v14 r21) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r23v6 rj) = (r23v5 rj), (r23v7 rj) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r25v11 zn0) = (r25v10 zn0), (r25v12 zn0) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r28v12 q8) = (r28v11 q8), (r28v13 q8) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(android.view.ViewStructure r38, defpackage.t30 r39, android.view.autofill.AutofillId r40, java.lang.String r41, defpackage.yl0 r42) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d80.w(android.view.ViewStructure, t30, android.view.autofill.AutofillId, java.lang.String, yl0):void");
    }

    public static final nc0 x(ln lnVar, int i2) {
        nc0 nc0Var = ((d90) lnVar).d.k;
        c10.m(nc0Var);
        if (nc0Var.O0() != lnVar || !oc0.g(i2)) {
            return nc0Var;
        }
        nc0 nc0Var2 = nc0Var.s;
        c10.m(nc0Var2);
        return nc0Var2;
    }

    public static final nc0 y(ln lnVar) {
        if (!((d90) lnVar).d.q) {
            pz.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        nc0 nc0VarX = x(lnVar, 2);
        if (!nc0VarX.O0().q) {
            pz.b("LayoutCoordinates is not attached.");
        }
        return nc0VarX;
    }

    public static final t30 z(ln lnVar) {
        nc0 nc0Var = ((d90) lnVar).d.k;
        if (nc0Var != null) {
            return nc0Var.r;
        }
        throw b8.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }
}
