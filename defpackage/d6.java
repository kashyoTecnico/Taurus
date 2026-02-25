package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d6 {
    public final h6 a;
    public final int b;
    public final long c;
    public final m11 d;
    public final CharSequence e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d6(defpackage.h6 r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.<init>(h6, int, int, long):void");
    }

    public final m11 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        vi0 vi0Var;
        float fD = d();
        h6 h6Var = this.a;
        h7 h7Var = h6Var.g;
        int i8 = h6Var.l;
        i30 i30Var = h6Var.i;
        c21 c21Var = h6Var.b;
        e6 e6Var = f6.a;
        ej0 ej0Var = c21Var.c;
        return new m11(charSequence, fD, h7Var, i, truncateAt, i8, (ej0Var == null || (vi0Var = ej0Var.b) == null) ? false : vi0Var.a, i3, i5, i6, i7, i4, i2, i30Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Type inference failed for: r10v23, types: [t5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.xl0 r11, int r12, defpackage.of r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.c(xl0, int, of):long");
    }

    public final float d() {
        return gj.h(this.c);
    }

    public final void e(dd ddVar) {
        Canvas canvasA = u2.a(ddVar);
        m11 m11Var = this.d;
        if (m11Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = m11Var.h;
        if (canvasA.getClipBounds(m11Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            qz0 qz0Var = r11.a;
            qz0Var.a = canvasA;
            m11Var.f.draw(qz0Var);
            if (i != 0) {
                canvasA.translate(0.0f, (-1) * i);
            }
        }
        if (m11Var.d) {
            canvasA.restore();
        }
    }

    public final void f(dd ddVar, long j, hu0 hu0Var, uz0 uz0Var, tq tqVar) {
        h7 h7Var = this.a.g;
        int i = h7Var.c;
        h7Var.d(j);
        h7Var.f(hu0Var);
        h7Var.g(uz0Var);
        h7Var.e(tqVar);
        h7Var.b(3);
        e(ddVar);
        h7Var.b(i);
    }

    public final void g(dd ddVar, ac acVar, float f, hu0 hu0Var, uz0 uz0Var, tq tqVar) {
        h7 h7Var = this.a.g;
        int i = h7Var.c;
        float fD = d();
        float fB = b();
        h7Var.c(acVar, (Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        h7Var.f(hu0Var);
        h7Var.g(uz0Var);
        h7Var.e(tqVar);
        h7Var.b(3);
        e(ddVar);
        h7Var.b(i);
    }
}
