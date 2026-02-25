package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f70 extends d90 implements xw, qq, et0, cd0 {
    public t00 A;
    public gc B;
    public y20 r;
    public y20 s;
    public g2 t;
    public View u;
    public xn v;
    public r1 w;
    public fo y;
    public final zg0 x = new zg0(null, g2.I);
    public long z = 9205357640488583168L;

    /* JADX WARN: Multi-variable type inference failed */
    public f70(iw iwVar, iw iwVar2, g2 g2Var) {
        this.r = (y20) iwVar;
        this.s = (y20) iwVar2;
        this.t = g2Var;
    }

    public final long A0() {
        if (this.y == null) {
            this.y = qo0.g(new e70(this, 0));
        }
        fo foVar = this.y;
        if (foVar != null) {
            return ((ed0) foVar.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void B0() {
        r1 r1Var = this.w;
        if (r1Var != null) {
            ((Magnifier) r1Var.e).dismiss();
        }
        View viewV = this.u;
        if (viewV == null) {
            viewV = r31.V(this);
        }
        this.u = viewV;
        xn xnVar = this.v;
        if (xnVar == null) {
            xnVar = d80.z(this).z;
        }
        this.v = xnVar;
        this.t.getClass();
        this.w = new r1(16, new Magnifier(viewV));
        D0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iw, y20] */
    public final void C0() {
        xn xnVar = this.v;
        if (xnVar == null) {
            xnVar = d80.z(this).z;
            this.v = xnVar;
        }
        long j = ((ed0) this.r.g(xnVar)).a;
        if (!nm.x(j) || !nm.x(A0())) {
            this.z = 9205357640488583168L;
            r1 r1Var = this.w;
            if (r1Var != null) {
                ((Magnifier) r1Var.e).dismiss();
                return;
            }
            return;
        }
        this.z = ed0.g(A0(), j);
        if (this.w == null) {
            B0();
        }
        r1 r1Var2 = this.w;
        if (r1Var2 != null) {
            long j2 = this.z;
            Magnifier magnifier = (Magnifier) r1Var2.e;
            if (!Float.isNaN(Float.NaN)) {
                magnifier.setZoom(Float.NaN);
            }
            if (nm.x(9205357640488583168L)) {
                magnifier.show(ed0.d(j2), ed0.e(j2), ed0.d(9205357640488583168L), ed0.e(9205357640488583168L));
            } else {
                magnifier.show(ed0.d(j2), ed0.e(j2));
            }
        }
        D0();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [iw, y20] */
    public final void D0() {
        xn xnVar;
        r1 r1Var = this.w;
        if (r1Var == null || (xnVar = this.v) == null) {
            return;
        }
        Magnifier magnifier = (Magnifier) r1Var.e;
        long jE = d80.e(magnifier.getWidth(), magnifier.getHeight());
        t00 t00Var = this.A;
        if (t00Var != null && jE == t00Var.a) {
            return;
        }
        this.s.g(new np(xnVar.y(d80.F(d80.e(magnifier.getWidth(), magnifier.getHeight())))));
        this.A = new t00(d80.e(magnifier.getWidth(), magnifier.getHeight()));
    }

    @Override // defpackage.cd0
    public final void J() {
        c4.A(this, new e70(this, 2));
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
        ct0Var.d(g70.a, new e70(this, 1));
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        v30Var.a();
        gc gcVar = this.B;
        if (gcVar != null) {
            gcVar.u(j41.a);
        }
    }

    @Override // defpackage.d90
    public final void s0() {
        J();
        this.B = nm.a(0, 7, null);
        nm.z(o0(), null, new qm(this, null, 2), 3);
    }

    @Override // defpackage.d90
    public final void t0() {
        r1 r1Var = this.w;
        if (r1Var != null) {
            ((Magnifier) r1Var.e).dismiss();
        }
        this.w = null;
    }

    @Override // defpackage.xw
    public final void u(nc0 nc0Var) {
        this.x.setValue(nc0Var);
    }
}
