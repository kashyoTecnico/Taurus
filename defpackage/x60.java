package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class x60 extends v60 implements g80 {
    public final nc0 r;
    public LinkedHashMap t;
    public m80 v;
    public final la0 w;
    public long s = 0;
    public final y60 u = new y60(this);

    public x60(nc0 nc0Var) {
        this.r = nc0Var;
        la0 la0Var = zc0.a;
        this.w = new la0();
    }

    public static final void D0(x60 x60Var, m80 m80Var) {
        LinkedHashMap linkedHashMap;
        if (m80Var != null) {
            x60Var.h0((m80Var.c() & 4294967295L) | (m80Var.e() << 32));
        } else {
            x60Var.h0(0L);
        }
        if (!c10.i(x60Var.v, m80Var) && m80Var != null && ((((linkedHashMap = x60Var.t) != null && !linkedHashMap.isEmpty()) || !m80Var.a().isEmpty()) && !c10.i(m80Var.a(), x60Var.t))) {
            c70 c70Var = x60Var.r.r.H.q;
            c10.m(c70Var);
            c70Var.t.f();
            LinkedHashMap linkedHashMap2 = x60Var.t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                x60Var.t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(m80Var.a());
        }
        x60Var.v = m80Var;
    }

    @Override // defpackage.v60
    public final void C0() {
        g0(this.s, 0.0f, null);
    }

    public void E0() {
        w0().b();
    }

    public final void F0(long j) {
        if (!m00.a(this.s, j)) {
            this.s = j;
            nc0 nc0Var = this.r;
            c70 c70Var = nc0Var.r.H.q;
            if (c70Var != null) {
                c70Var.p0();
            }
            v60.A0(nc0Var);
        }
        if (this.n) {
            return;
        }
        q0(w0());
    }

    public final long G0(x60 x60Var, boolean z) {
        long jC = 0;
        while (!this.equals(x60Var)) {
            if (!this.l || !z) {
                jC = m00.c(jC, this.s);
            }
            nc0 nc0Var = this.r.t;
            c10.m(nc0Var);
            this = nc0Var.M0();
            c10.m(this);
        }
        return jC;
    }

    @Override // defpackage.xn
    public final float b() {
        return this.r.b();
    }

    @Override // defpackage.oi0
    public final void g0(long j, float f, iw iwVar) {
        F0(j);
        if (this.m) {
            return;
        }
        E0();
    }

    @Override // defpackage.x00
    public final e30 getLayoutDirection() {
        return this.r.r.A;
    }

    @Override // defpackage.xn
    public final float k() {
        return this.r.k();
    }

    @Override // defpackage.oi0, defpackage.g80
    public final Object l() {
        return this.r.l();
    }

    @Override // defpackage.v60, defpackage.x00
    public final boolean s() {
        return true;
    }

    @Override // defpackage.v60
    public final v60 s0() {
        nc0 nc0Var = this.r.s;
        if (nc0Var != null) {
            return nc0Var.M0();
        }
        return null;
    }

    @Override // defpackage.v60
    public final d30 t0() {
        return this.u;
    }

    @Override // defpackage.v60
    public final boolean u0() {
        return this.v != null;
    }

    @Override // defpackage.v60
    public final t30 v0() {
        return this.r.r;
    }

    @Override // defpackage.v60
    public final m80 w0() {
        m80 m80Var = this.v;
        if (m80Var != null) {
            return m80Var;
        }
        throw b8.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.v60
    public final v60 x0() {
        nc0 nc0Var = this.r.t;
        if (nc0Var != null) {
            return nc0Var.M0();
        }
        return null;
    }

    @Override // defpackage.v60
    public final long y0() {
        return this.s;
    }
}
