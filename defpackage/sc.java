package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sc {
    public final Matrix a = new Matrix();
    public final int[] b = new int[2];

    public void a(View view, float[] fArr) {
        Matrix matrix = this.a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        nm.D(matrix, fArr);
    }
}
