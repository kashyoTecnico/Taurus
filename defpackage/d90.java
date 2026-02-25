package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class d90 implements ln {
    public kk e;
    public int f;
    public d90 h;
    public d90 i;
    public dd0 j;
    public nc0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public g3 p;
    public boolean q;
    public d90 d = this;
    public int g = -1;

    public final wl o0() {
        kk kkVar = this.e;
        if (kkVar != null) {
            return kkVar;
        }
        kk kkVarD = nm.d(((p3) d80.A(this)).getCoroutineContext().k(new t10((r10) ((p3) d80.A(this)).getCoroutineContext().n(g2.E))));
        this.e = kkVarD;
        return kkVarD;
    }

    public boolean p0() {
        return !(this instanceof cv);
    }

    public void q0() {
        if (this.q) {
            pz.b("node attached multiple times");
        }
        if (this.k == null) {
            pz.b("attach invoked on a node without a coordinator");
        }
        this.q = true;
        this.n = true;
    }

    public void r0() {
        if (!this.q) {
            pz.b("Cannot detach a node that is not attached");
        }
        if (this.n) {
            pz.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.o) {
            pz.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.q = false;
        kk kkVar = this.e;
        if (kkVar != null) {
            nm.l(kkVar, new h90("The Modifier.Node was detached", 0));
            this.e = null;
        }
    }

    public void v0() {
        if (!this.q) {
            pz.b("reset() called on an unattached node");
        }
        u0();
    }

    public void w0() {
        if (!this.q) {
            pz.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.n) {
            pz.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.n = false;
        s0();
        this.o = true;
    }

    public void x0() {
        if (!this.q) {
            pz.b("node detached multiple times");
        }
        if (this.k == null) {
            pz.b("detach invoked on a node without a coordinator");
        }
        if (!this.o) {
            pz.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.o = false;
        g3 g3Var = this.p;
        if (g3Var != null) {
            g3Var.a();
        }
        t0();
    }

    public void y0(d90 d90Var) {
        this.d = d90Var;
    }

    public void z0(nc0 nc0Var) {
        this.k = nc0Var;
    }

    public void s0() {
    }

    public void t0() {
    }

    public void u0() {
    }
}
