package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class qo0 {
    public static final sr0 a(ks0 ks0Var, db dbVar) {
        boolean z = ks0Var.k() == 1;
        return new sr0(d(ks0Var.e(), z, true, ks0Var.f(), dbVar), d(ks0Var.j(), z, false, ks0Var.i(), dbVar), z);
    }

    public static final rr0 b(ks0 ks0Var, pr0 pr0Var, rr0 rr0Var) {
        int i = ks0Var.a() ? pr0Var.c : pr0Var.d;
        int iF = ks0Var.a() ? ks0Var.f() : ks0Var.i();
        int i2 = pr0Var.b;
        o11 o11Var = pr0Var.f;
        int i3 = pr0Var.e;
        if (iF != i2) {
            return pr0Var.a(i);
        }
        h40 h40VarI = m20.I(new vr0(pr0Var, i));
        h40 h40VarI2 = m20.I(new ur0(pr0Var, i, ks0Var.a() ? pr0Var.d : pr0Var.c, ks0Var, h40VarI));
        if (pr0Var.a != rr0Var.c) {
            return (rr0) ((o41) h40VarI2).getValue();
        }
        if (i == i3) {
            return rr0Var;
        }
        if (((Number) ((o41) h40VarI).getValue()).intValue() != o11Var.f(i3)) {
            return (rr0) ((o41) h40VarI2).getValue();
        }
        int i4 = rr0Var.b;
        long jL = o11Var.l(i4);
        boolean zA = ks0Var.a();
        if (i3 != -1) {
            if (i != i3) {
                if (!(zA ^ (pr0Var.b() == 1))) {
                }
            }
            return pr0Var.a(i);
        }
        int i5 = w11.c;
        return (i4 == ((int) (jL >> 32)) || i4 == ((int) (jL & 4294967295L))) ? (rr0) ((o41) h40VarI2).getValue() : pr0Var.a(i);
    }

    public static final void c(o51 o51Var, nj0 nj0Var) {
        n51 n51Var = o51Var.b;
        n51 n51Var2 = o51Var.a;
        boolean zJ = c10.j(nj0Var);
        long j = nj0Var.b;
        long j2 = 0;
        if (zJ) {
            km[] kmVarArr = n51Var2.c;
            y9.v0(kmVarArr, 0, kmVarArr.length);
            n51Var2.d = 0;
            km[] kmVarArr2 = n51Var.c;
            y9.v0(kmVarArr2, 0, kmVarArr2.length);
            n51Var.d = 0;
            o51Var.c = 0L;
        }
        if (!c10.l(nj0Var)) {
            List list = nj0Var.k;
            if (list == null) {
                list = ks.d;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                cy cyVar = (cy) list.get(i);
                long j3 = cyVar.a;
                long jG = ed0.g(cyVar.c, j2);
                n51Var2.a(j3, Float.intBitsToFloat((int) (jG >> 32)));
                n51Var.a(j3, Float.intBitsToFloat((int) (jG & 4294967295L)));
                i++;
                j2 = 0;
            }
            long jG2 = ed0.g(nj0Var.l, 0L);
            n51Var2.a(j, Float.intBitsToFloat((int) (jG2 >> 32)));
            n51Var.a(j, Float.intBitsToFloat((int) (jG2 & 4294967295L)));
        }
        if (c10.l(nj0Var) && j - o51Var.c > 40) {
            km[] kmVarArr3 = n51Var2.c;
            y9.v0(kmVarArr3, 0, kmVarArr3.length);
            n51Var2.d = 0;
            km[] kmVarArr4 = n51Var.c;
            y9.v0(kmVarArr4, 0, kmVarArr4.length);
            n51Var.d = 0;
            o51Var.c = 0L;
        }
        o51Var.c = j;
    }

    public static final rr0 d(pr0 pr0Var, boolean z, boolean z2, int i, db dbVar) {
        long j;
        int i2 = z2 ? pr0Var.c : pr0Var.d;
        if (i != pr0Var.b) {
            return pr0Var.a(i2);
        }
        long jI = dbVar.i(pr0Var, i2);
        if (z ^ z2) {
            int i3 = w11.c;
            j = jI >> 32;
        } else {
            int i4 = w11.c;
            j = 4294967295L & jI;
        }
        return pr0Var.a((int) j);
    }

    public static final rr0 e(rr0 rr0Var, pr0 pr0Var, int i) {
        return new rr0(pr0Var.f.a(i), i, rr0Var.c);
    }

    public static final eb0 f() {
        e9 e9Var = vv0.b;
        eb0 eb0Var = (eb0) e9Var.n();
        if (eb0Var != null) {
            return eb0Var;
        }
        eb0 eb0Var2 = new eb0(new bi[0]);
        e9Var.y(eb0Var2);
        return eb0Var2;
    }

    public static final fo g(gw gwVar) {
        e9 e9Var = vv0.a;
        return new fo(gwVar, null);
    }

    public static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final int i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int j(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final long k(o11 o11Var, int i, boolean z, boolean z2) {
        int iF = o11Var.f(i);
        long j = o11Var.c;
        u90 u90Var = o11Var.b;
        if (iF >= u90Var.f) {
            return 9205357640488583168L;
        }
        boolean z3 = o11Var.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == o11Var.j(i);
        ArrayList arrayList = u90Var.h;
        u90Var.j(i);
        pg0 pg0Var = (pg0) arrayList.get(i == ((q8) u90Var.a.b).e.length() ? ve.L(arrayList) : c10.F(i, arrayList));
        d6 d6Var = pg0Var.a;
        int iD = pg0Var.d(i);
        m11 m11Var = d6Var.d;
        return nm.f(c10.t(z3 ? m11Var.h(iD, false) : m11Var.i(iD, false), 0.0f, (int) (j >> 32)), c10.t(u90Var.b(iF), 0.0f, (int) (j & 4294967295L)));
    }

    public static yt0 l(kw kwVar) {
        yt0 yt0Var = new yt0();
        yt0Var.f = r31.v(yt0Var, yt0Var, kwVar);
        return yt0Var;
    }

    public static MappedByteBuffer m(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static zg0 n(Object obj) {
        return new zg0(obj, g2.V);
    }

    public static void o(a11 a11Var, wz0 wz0Var, o11 o11Var, d30 d30Var, j11 j11Var, boolean z, hd0 hd0Var) {
        if (z) {
            int iD = hd0Var.d(w11.d(a11Var.b));
            xl0 xl0VarB = iD < o11Var.a.a.e.length() ? o11Var.b(iD) : iD != 0 ? o11Var.b(iD - 1) : new xl0(0.0f, 0.0f, 1.0f, (int) (d01.a(wz0Var.b, wz0Var.g, wz0Var.h, d01.a, 1) & 4294967295L));
            float f = xl0VarB.b;
            float f2 = xl0VarB.a;
            long jR = d30Var.R(nm.f(f2, f));
            xl0 xl0VarF = c4.f(nm.f(ed0.d(jR), ed0.e(jR)), dq0.a(xl0VarB.c - f2, xl0VarB.d - f));
            if (c10.i((j11) j11Var.a.b.get(), j11Var)) {
                j11Var.b.g(xl0VarF);
            }
        }
    }

    public static final void p(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            pz.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            c10.p(fArr8, "<this>");
            c10.p(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fH = h(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fH);
                }
            }
            float fSqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : h(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fH2 = h(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fH2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fH2 / fArr11[i14];
        }
    }

    public static final za0 q(Object obj, ci ciVar) {
        Object objK = ciVar.K();
        if (objK == vh.a) {
            objK = n(obj);
            ciVar.e0(objK);
        }
        za0 za0Var = (za0) objK;
        za0Var.setValue(obj);
        return za0Var;
    }

    public static final void r(String str) {
        c10.p(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void s(String str) {
        c10.p(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void t(String str) {
        c10.p(str, "message");
        throw new NoSuchElementException(str);
    }

    public static final g00 u(d00 d00Var) {
        return new g00(d00Var.a, d00Var.b, d00Var.c, d00Var.d);
    }
}
