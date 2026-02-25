package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k5 implements cg0 {
    public ed0 d;
    public final ar e;
    public final zg0 f;
    public final boolean g;
    public boolean h;
    public long i;
    public mj0 j;
    public final e90 k;

    public k5(Context context, ag0 ag0Var) {
        ar arVar = new ar(context, r31.Z(ag0Var.a));
        this.e = arVar;
        g2 g2Var = g2.I;
        j41 j41Var = j41.a;
        this.f = new zg0(j41Var, g2Var);
        this.g = true;
        this.i = 0L;
        this.k = b90.a.c(new SuspendPointerInputElement(j41Var, null, new ky0(new c(this, null, 3)), 6)).c(Build.VERSION.SDK_INT >= 31 ? new oq(this, arVar) : new oq(this, arVar, ag0Var));
    }

    public final void a() {
        boolean zIsFinished;
        ar arVar = this.e;
        EdgeEffect edgeEffect = arVar.d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = arVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = arVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = arVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            c();
        }
    }

    public final long b() {
        ed0 ed0Var = this.d;
        long jG = ed0Var != null ? ed0Var.a : dq0.g(this.i);
        return nm.f(ed0.d(jG) / yu0.d(this.i), ed0.e(jG) / yu0.b(this.i));
    }

    public final void c() {
        if (this.g) {
            this.f.setValue(j41.a);
        }
    }

    @Override // defpackage.cg0
    public final boolean d() {
        ar arVar = this.e;
        EdgeEffect edgeEffect = arVar.d;
        x8 x8Var = x8.a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x8Var.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = arVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x8Var.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = arVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x8Var.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = arVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? x8Var.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float e(long j) {
        float fD = ed0.d(b());
        float fE = ed0.e(j) / yu0.b(this.i);
        EdgeEffect edgeEffectB = this.e.b();
        float fC = -fE;
        float f = 1 - fD;
        int i = Build.VERSION.SDK_INT;
        x8 x8Var = x8.a;
        if (i >= 31) {
            fC = x8Var.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i >= 31 ? x8Var.b(edgeEffectB) : 0.0f) == 0.0f ? yu0.b(this.i) * (-fC) : ed0.e(j);
    }

    @Override // defpackage.cg0
    public final e90 f() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0167, code lost:
    
        if (r4 == r6) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.cg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r19, defpackage.lr0 r21, defpackage.lk r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.g(long, lr0, lk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    @Override // defpackage.cg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r18, int r20, defpackage.h r21) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.h(long, int, h):long");
    }

    public final float i(long j) {
        float fE = ed0.e(b());
        float fD = ed0.d(j) / yu0.d(this.i);
        EdgeEffect edgeEffectC = this.e.c();
        float f = 1 - fE;
        int i = Build.VERSION.SDK_INT;
        x8 x8Var = x8.a;
        if (i >= 31) {
            fD = x8Var.c(edgeEffectC, fD, f);
        } else {
            edgeEffectC.onPull(fD, f);
        }
        return (i >= 31 ? x8Var.b(edgeEffectC) : 0.0f) == 0.0f ? yu0.d(this.i) * fD : ed0.d(j);
    }

    public final float j(long j) {
        float fE = ed0.e(b());
        float fD = ed0.d(j) / yu0.d(this.i);
        EdgeEffect edgeEffectD = this.e.d();
        float fC = -fD;
        int i = Build.VERSION.SDK_INT;
        x8 x8Var = x8.a;
        if (i >= 31) {
            fC = x8Var.c(edgeEffectD, fC, fE);
        } else {
            edgeEffectD.onPull(fC, fE);
        }
        return (i >= 31 ? x8Var.b(edgeEffectD) : 0.0f) == 0.0f ? yu0.d(this.i) * (-fC) : ed0.d(j);
    }

    public final float k(long j) {
        float fD = ed0.d(b());
        float fE = ed0.e(j) / yu0.b(this.i);
        EdgeEffect edgeEffectE = this.e.e();
        int i = Build.VERSION.SDK_INT;
        x8 x8Var = x8.a;
        if (i >= 31) {
            fE = x8Var.c(edgeEffectE, fE, fD);
        } else {
            edgeEffectE.onPull(fE, fD);
        }
        return (i >= 31 ? x8Var.b(edgeEffectE) : 0.0f) == 0.0f ? yu0.b(this.i) * fE : ed0.e(j);
    }

    public final void l(long j) {
        boolean zA = yu0.a(this.i, 0L);
        boolean zA2 = yu0.a(j, this.i);
        this.i = j;
        if (!zA2) {
            long jE = d80.e(d80.B(yu0.d(j)), d80.B(yu0.b(j)));
            ar arVar = this.e;
            arVar.c = jE;
            EdgeEffect edgeEffect = arVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jE >> 32), (int) (jE & 4294967295L));
            }
            EdgeEffect edgeEffect2 = arVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jE >> 32), (int) (jE & 4294967295L));
            }
            EdgeEffect edgeEffect3 = arVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jE & 4294967295L), (int) (jE >> 32));
            }
            EdgeEffect edgeEffect4 = arVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jE & 4294967295L), (int) (jE >> 32));
            }
            EdgeEffect edgeEffect5 = arVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jE >> 32), (int) (jE & 4294967295L));
            }
            EdgeEffect edgeEffect6 = arVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jE >> 32), (int) (jE & 4294967295L));
            }
            EdgeEffect edgeEffect7 = arVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jE & 4294967295L), (int) (jE >> 32));
            }
            EdgeEffect edgeEffect8 = arVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jE & 4294967295L), (int) (jE >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        c();
        a();
    }
}
