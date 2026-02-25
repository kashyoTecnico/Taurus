package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y3 implements ViewTranslationCallback {
    public static final y3 a = new y3();

    public final boolean onClearTranslation(View view) {
        gw gwVar;
        c10.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        q4 contentCaptureManager$ui_release = ((p3) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = n4.d;
        k00 k00VarG = contentCaptureManager$ui_release.g();
        Object[] objArr = k00VarG.c;
        long[] jArr = k00VarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ta0 ta0Var = ((it0) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = ta0Var.g(lt0.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = ta0Var.g(bt0.l);
                            j0 j0Var = (j0) (objG2 != null ? objG2 : null);
                            if (j0Var != null && (gwVar = (gw) j0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        iw iwVar;
        c10.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        q4 contentCaptureManager$ui_release = ((p3) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = n4.d;
        k00 k00VarG = contentCaptureManager$ui_release.g();
        Object[] objArr = k00VarG.c;
        long[] jArr = k00VarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ta0 ta0Var = ((it0) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = ta0Var.g(lt0.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (c10.i(objG, Boolean.TRUE)) {
                            Object objG2 = ta0Var.g(bt0.k);
                            j0 j0Var = (j0) (objG2 != null ? objG2 : null);
                            if (j0Var != null && (iwVar = (iw) j0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        iw iwVar;
        c10.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        q4 contentCaptureManager$ui_release = ((p3) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = n4.e;
        k00 k00VarG = contentCaptureManager$ui_release.g();
        Object[] objArr = k00VarG.c;
        long[] jArr = k00VarG.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ta0 ta0Var = ((it0) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = ta0Var.g(lt0.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (c10.i(objG, Boolean.FALSE)) {
                            Object objG2 = ta0Var.g(bt0.k);
                            j0 j0Var = (j0) (objG2 != null ? objG2 : null);
                            if (j0Var != null && (iwVar = (iw) j0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
