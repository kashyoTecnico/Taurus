package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k51 implements g51 {
    public final Object a;

    @Override // defpackage.g51, defpackage.e51
    public boolean a() {
        ((q2) this.a).getClass();
        return false;
    }

    @Override // defpackage.e51
    public long b(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return ((q2) this.a).b(k8Var, k8Var2, k8Var3);
    }

    public void c(boolean z) {
        xz xzVar = (xz) this.a;
        WindowInsetsController windowInsetsController = (WindowInsetsController) xzVar.e;
        Window window = (Window) xzVar.f;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    public void d(boolean z) {
        xz xzVar = (xz) this.a;
        WindowInsetsController windowInsetsController = (WindowInsetsController) xzVar.e;
        Window window = (Window) xzVar.f;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.e51
    public k8 l(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return ((q2) this.a).l(j, k8Var, k8Var2, k8Var3);
    }

    @Override // defpackage.e51
    public k8 o(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return ((q2) this.a).o(j, k8Var, k8Var2, k8Var3);
    }

    @Override // defpackage.e51
    public k8 p(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return ((q2) this.a).p(k8Var, k8Var2, k8Var3);
    }

    public k51(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new o71(window);
        } else {
            this.a = new xz(window);
        }
    }

    public k51(float f, float f2, k8 k8Var) {
        Object r1Var;
        if (k8Var != null) {
            r1Var = new dh0(f, f2, k8Var);
        } else {
            r1Var = new r1(f, f2);
        }
        this.a = new q2(r1Var);
    }
}
