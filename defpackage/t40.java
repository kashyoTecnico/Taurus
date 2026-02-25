package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t40 {
    public final View a;
    public final xz b;
    public r40 e;
    public u01 f;
    public c61 g;
    public Rect l;
    public final n40 m;
    public y20 c = s40.f;
    public iw d = s40.g;
    public a11 h = new a11("", w11.b, 4);
    public xy i = xy.f;
    public final ArrayList j = new ArrayList();
    public final Object k = m20.I(new b(15, this));

    public t40(View view, w5 w5Var, xz xzVar) {
        this.a = view;
        this.b = xzVar;
        this.m = new n40(w5Var, xzVar);
    }

    public final ul0 a(EditorInfo editorInfo) {
        int i;
        int i2;
        a11 a11Var = this.h;
        String str = a11Var.a.e;
        long j = a11Var.b;
        xy xyVar = this.i;
        int i3 = xyVar.d;
        int i4 = xyVar.c;
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        e60.a.a(editorInfo, xyVar.e);
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if ((i2 & 1) == 1) {
            editorInfo.inputType = i2 | 131072;
            if (xyVar.d == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = xyVar.a;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (xyVar.b) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = w11.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        editorInfo.setInitialSurroundingSubText(str, 0);
        editorInfo.imeOptions |= 33554432;
        if (!sx0.a || i4 == 7 || i4 == 8) {
            l81.X(editorInfo, false);
        } else {
            l81.X(editorInfo, true);
            kr.a.a(editorInfo);
        }
        o40 o40Var = p40.a;
        if (tr.d()) {
            tr.a().g(editorInfo);
        }
        ul0 ul0Var = new ul0(this.h, new r1(12, this), this.i.b, this.e, this.f, this.g);
        this.j.add(new WeakReference(ul0Var));
        return ul0Var;
    }
}
