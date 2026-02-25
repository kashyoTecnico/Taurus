package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class gm {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, o11 o11Var, xl0 xl0Var) {
        if (!xl0Var.e()) {
            float f = xl0Var.b;
            u90 u90Var = o11Var.b;
            int iC = u90Var.c(f);
            int iC2 = u90Var.c(xl0Var.d);
            if (iC <= iC2) {
                while (true) {
                    builder.addVisibleLineBounds(o11Var.g(iC), u90Var.d(iC), o11Var.h(iC), u90Var.b(iC));
                    if (iC == iC2) {
                        break;
                    }
                    iC++;
                }
            }
        }
        return builder;
    }
}
