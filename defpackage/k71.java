package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class k71 {
    public static final n71 b;
    public final n71 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 34 ? new b71() : i >= 31 ? new a71() : new z61()).b().a.a().a.b().a.c();
    }

    public k71(n71 n71Var) {
        this.a = n71Var;
    }

    public n71 a() {
        return this.a;
    }

    public n71 b() {
        return this.a;
    }

    public n71 c() {
        return this.a;
    }

    public yo e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k71)) {
            return false;
        }
        k71 k71Var = (k71) obj;
        return l() == k71Var.l() && k() == k71Var.k() && Objects.equals(i(), k71Var.i()) && Objects.equals(h(), k71Var.h()) && Objects.equals(e(), k71Var.e());
    }

    public d00 f(int i) {
        return d00.e;
    }

    public d00 g(int i) {
        if ((i & 8) == 0) {
            return d00.e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public d00 h() {
        return d00.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), h(), e());
    }

    public d00 i() {
        return d00.e;
    }

    public n71 j(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void n(d00[] d00VarArr) {
    }

    public void o(n71 n71Var) {
    }

    public void p(int i) {
    }
}
