package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hm {
    public final p3 a;
    public final e9 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public a11 j;
    public o11 k;
    public hd0 l;
    public xl0 n;
    public xl0 o;
    public final Object c = new Object();
    public y20 m = e3.C;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = e80.a();
    public final Matrix r = new Matrix();

    public hm(p3 p3Var, e9 e9Var) {
        this.a = p3Var;
        this.b = e9Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [h40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [iw, y20] */
    public final void a() {
        View view;
        int iC;
        int iC2;
        e9 e9Var = this.b;
        ?? r2 = e9Var.b;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view2 = (View) e9Var.a;
        if (inputMethodManager.isActive(view2)) {
            ?? r3 = this.m;
            float[] fArr = this.q;
            r3.g(new e80(fArr));
            this.a.p(fArr);
            Matrix matrix = this.r;
            nm.C(matrix, fArr);
            a11 a11Var = this.j;
            c10.m(a11Var);
            long j = a11Var.b;
            hd0 hd0Var = this.l;
            c10.m(hd0Var);
            o11 o11Var = this.k;
            c10.m(o11Var);
            u90 u90Var = o11Var.b;
            xl0 xl0Var = this.n;
            c10.m(xl0Var);
            float f = xl0Var.d;
            float f2 = xl0Var.b;
            xl0 xl0Var2 = this.o;
            c10.m(xl0Var2);
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            w11 w11Var = a11Var.c;
            int iE = w11.e(j);
            builder.setSelectionRange(iE, w11.d(j));
            um0 um0Var = um0.e;
            if (!z || iE < 0) {
                view = view2;
            } else {
                int iD = hd0Var.d(iE);
                xl0 xl0VarC = o11Var.c(iD);
                view = view2;
                float fT = c10.t(xl0VarC.a, 0.0f, (int) (o11Var.c >> 32));
                boolean z5 = b10.z(xl0Var, fT, xl0VarC.b);
                boolean z6 = b10.z(xl0Var, fT, xl0VarC.d);
                boolean z7 = o11Var.a(iD) == um0Var;
                int i = (z5 || z6) ? 1 : 0;
                if (!z5 || !z6) {
                    i |= 2;
                }
                if (z7) {
                    i |= 4;
                }
                float f3 = xl0VarC.b;
                float f4 = xl0VarC.d;
                builder.setInsertionMarkerLocation(fT, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iE2 = w11Var != null ? w11.e(w11Var.a) : -1;
                int iD2 = w11Var != null ? w11.d(w11Var.a) : -1;
                if (iE2 >= 0 && iE2 < iD2) {
                    builder2.setComposingText(iE2, a11Var.a.e.subSequence(iE2, iD2));
                    int iD3 = hd0Var.d(iE2);
                    int iD4 = hd0Var.d(iD2);
                    float[] fArr2 = new float[(iD4 - iD3) * 4];
                    u90Var.a(no0.a(iD3, iD4), fArr2);
                    while (iE2 < iD2) {
                        int iD5 = hd0Var.d(iE2);
                        int i2 = (iD5 - iD3) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iD2;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iE2;
                        int i5 = (xl0Var.a < f7 ? 1 : 0) & (f5 < xl0Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!b10.z(xl0Var, f5, f6) || !b10.z(xl0Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (o11Var.a(iD5) == um0Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iE2 = i4 + 1;
                        iD2 = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder2.setEditorBoundsInfo(u0.h().setEditorBounds(l81.b0(xl0Var2)).setHandwritingBounds(l81.b0(xl0Var2)).build());
            }
            if (i6 >= 34 && z4 && !xl0Var.e() && (iC = u90Var.c(f2)) <= (iC2 = u90Var.c(f))) {
                while (true) {
                    builder2.addVisibleLineBounds(o11Var.g(iC), u90Var.d(iC), o11Var.h(iC), u90Var.b(iC));
                    if (iC == iC2) {
                        break;
                    } else {
                        iC++;
                    }
                }
            }
            ((InputMethodManager) r2.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
