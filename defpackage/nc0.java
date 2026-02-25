package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class nc0 extends v60 implements g80, d30, fg0 {
    public static final an0 M;
    public static final a30 N;
    public static final float[] O;
    public static final v71 P;
    public static final kc0 Q;
    public m80 A;
    public la0 B;
    public float D;
    public sa0 E;
    public a30 F;
    public fx G;
    public dd H;
    public h4 I;
    public boolean K;
    public dg0 L;
    public final t30 r;
    public nc0 s;
    public nc0 t;
    public boolean u;
    public boolean v;
    public iw w;
    public xn x;
    public e30 y;
    public float z = 0.8f;
    public long C = 0;
    public final mc0 J = new mc0(this, 1);

    static {
        an0 an0Var = new an0();
        an0Var.e = 1.0f;
        an0Var.f = 1.0f;
        an0Var.g = 1.0f;
        long j = hx.a;
        an0Var.i = j;
        an0Var.j = j;
        an0Var.k = 8.0f;
        an0Var.l = x21.a;
        an0Var.m = nm.h;
        an0Var.o = 9205357640488583168L;
        an0Var.p = new yn(1.0f, 1.0f);
        an0Var.q = e30.d;
        an0Var.r = 3;
        M = an0Var;
        N = new a30();
        O = e80.a();
        P = new v71(29);
        Q = new kc0(0);
    }

    public nc0(t30 t30Var) {
        this.r = t30Var;
        this.x = t30Var.z;
        this.y = t30Var.A;
    }

    public static nc0 i1(d30 d30Var) {
        nc0 nc0Var;
        y60 y60Var = d30Var instanceof y60 ? (y60) d30Var : null;
        if (y60Var != null && (nc0Var = y60Var.d.r) != null) {
            return nc0Var;
        }
        c10.n(d30Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (nc0) d30Var;
    }

    @Override // defpackage.fg0
    public final boolean B() {
        return (this.L == null || this.u || !this.r.H()) ? false : true;
    }

    @Override // defpackage.d30
    public final long C(long j) {
        if (!O0().q) {
            pz.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return X0(l81.C(this), ((p3) r31.U(this.r)).C(j));
    }

    @Override // defpackage.v60
    public final void C0() {
        g0(this.C, this.D, this.w);
    }

    public final void D0(nc0 nc0Var, sa0 sa0Var, boolean z) {
        if (nc0Var == this) {
            return;
        }
        nc0 nc0Var2 = this.t;
        if (nc0Var2 != null) {
            nc0Var2.D0(nc0Var, sa0Var, z);
        }
        long j = this.C;
        float f = (int) (j >> 32);
        sa0Var.a -= f;
        sa0Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        sa0Var.b -= f2;
        sa0Var.d -= f2;
        dg0 dg0Var = this.L;
        if (dg0Var != null) {
            ((gx) dg0Var).c(sa0Var, true);
            if (this.v && z) {
                long j2 = this.f;
                sa0Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long E0(nc0 nc0Var, long j) {
        if (nc0Var == this) {
            return j;
        }
        nc0 nc0Var2 = this.t;
        return (nc0Var2 == null || c10.i(nc0Var, nc0Var2)) ? L0(j) : L0(nc0Var2.E0(nc0Var, j));
    }

    public final long F0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - d0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - c0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final float G0(long j, long j2) {
        if (d0() >= Float.intBitsToFloat((int) (j2 >> 32)) && c0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jF0 = F0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - d0());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - c0())) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.d30
    public final boolean H() {
        return O0().q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [nc0] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4, types: [float] */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    public final void H0(dd ddVar, fx fxVar) {
        long j;
        char c;
        Canvas canvas;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        dg0 dg0Var = this.L;
        if (dg0Var == null) {
            long j2 = this.C;
            float f3 = (int) (j2 >> 32);
            float f4 = (int) (j2 & 4294967295L);
            ddVar.f(f3, f4);
            I0(ddVar, fxVar);
            ddVar.f(-f3, -f4);
            return;
        }
        gx gxVar = (gx) dg0Var;
        fd fdVar = gxVar.p;
        gxVar.g();
        gxVar.w = gxVar.d.a.l > 0.0f;
        e9 e9Var = fdVar.e;
        e9 e9Var2 = fdVar.e;
        e9Var.z(ddVar);
        e9Var.b = fxVar;
        fx fxVar2 = gxVar.d;
        dd ddVarO = e9Var2.o();
        fx fxVar3 = (fx) e9Var2.b;
        ix ixVar = fxVar2.a;
        if (fxVar2.s) {
            return;
        }
        fxVar2.a();
        RenderNode renderNode = ixVar.c;
        if (renderNode.hasDisplayList()) {
            this = 0;
            j = 4294967295L;
            c = ' ';
        } else {
            try {
                ix ixVar2 = fxVar2.a;
                xn xnVar = fxVar2.b;
                e30 e30Var = fxVar2.c;
                h hVar = fxVar2.e;
                fd fdVar2 = ixVar2.b;
                j = 4294967295L;
                try {
                    RenderNode renderNode2 = ixVar2.c;
                    RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording();
                    c = ' ';
                    try {
                        try {
                            r1 r1Var = ixVar2.a;
                            this = 0;
                            try {
                                t2 t2Var = (t2) r1Var.e;
                                Canvas canvas2 = t2Var.a;
                                t2Var.a = recordingCanvasBeginRecording;
                                e9 e9Var3 = fdVar2.e;
                                e9Var3.A(xnVar);
                                e9Var3.B(e30Var);
                                e9Var3.b = fxVar2;
                                e9Var3.C(ixVar2.d);
                                e9Var3.z(t2Var);
                                hVar.g(fdVar2);
                                ((t2) r1Var.e).a = canvas2;
                                renderNode2.endRecording();
                            } catch (Throwable th) {
                                th = th;
                                renderNode2.endRecording();
                                throw th;
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable unused2) {
                    this = 0;
                }
            } catch (Throwable unused3) {
            }
        }
        boolean z4 = ixVar.l > this;
        if (z4) {
            ddVarO.q();
        }
        Canvas canvasA = u2.a(ddVarO);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            canvas = canvasA;
        } else {
            long j3 = fxVar2.t;
            float f5 = (int) (j3 >> c);
            float f6 = (int) (j3 & j);
            long j4 = fxVar2.u;
            float f7 = f5 + ((int) (j4 >> c));
            float f8 = f6 + ((int) (j4 & j));
            float f9 = ixVar.h;
            int i = ixVar.i;
            if (f9 < 1.0f || i != 3 || ixVar.s == 1) {
                a6 a6VarD = fxVar2.p;
                if (a6VarD == null) {
                    a6VarD = c10.d();
                    fxVar2.p = a6VarD;
                }
                a6VarD.c(f9);
                a6VarD.d(i);
                a6VarD.f(null);
                canvasA.saveLayer(f5, f6, f7, f8, a6VarD.a);
                f = f5;
                f2 = f6;
            } else {
                canvasA.save();
                f2 = f6;
                f = f5;
            }
            canvas = canvasA;
            canvas.translate(f, f2);
            Matrix matrix = ixVar.f;
            if (matrix == null) {
                matrix = new Matrix();
                ixVar.f = matrix;
            }
            renderNode.getMatrix(matrix);
            canvas.concat(matrix);
        }
        boolean z5 = !zIsHardwareAccelerated && fxVar2.w;
        if (z5) {
            ddVarO.l();
            nf0 nf0VarD = fxVar2.d();
            if (nf0VarD instanceof lf0) {
                dd.k(ddVarO, ((lf0) nf0VarD).a);
            } else if (nf0VarD instanceof mf0) {
                i6 i6VarA = fxVar2.m;
                if (i6VarA != null) {
                    i6VarA.a.rewind();
                } else {
                    i6VarA = k6.a();
                    fxVar2.m = i6VarA;
                }
                i6.a(i6VarA, ((mf0) nf0VarD).a);
                ddVarO.r(i6VarA);
            } else {
                if (!(nf0VarD instanceof kf0)) {
                    throw new fg();
                }
                ddVarO.r(((kf0) nf0VarD).a);
            }
        }
        if (fxVar3 != null) {
            ce ceVar = fxVar3.r;
            if (!ceVar.a) {
                sz.a("Only add dependencies during a tracking");
            }
            ua0 ua0Var = (ua0) ceVar.d;
            if (ua0Var != null) {
                ua0Var.a(fxVar2);
            } else if (((fx) ceVar.b) != null) {
                int i2 = fq0.a;
                ua0 ua0Var2 = new ua0();
                fx fxVar4 = (fx) ceVar.b;
                c10.m(fxVar4);
                ua0Var2.a(fxVar4);
                ua0Var2.a(fxVar2);
                ceVar.d = ua0Var2;
                ceVar.b = null;
            } else {
                ceVar.b = fxVar2;
            }
            ua0 ua0Var3 = (ua0) ceVar.e;
            if (ua0Var3 != null) {
                z3 = !ua0Var3.k(fxVar2);
            } else if (((fx) ceVar.c) != fxVar2) {
                z3 = true;
            } else {
                ceVar.c = null;
                z3 = false;
            }
            if (z3) {
                fxVar2.q++;
            }
        }
        if (u2.a(ddVarO).isHardwareAccelerated()) {
            z = z4;
            z2 = zIsHardwareAccelerated;
            u2.a(ddVarO).drawRenderNode(renderNode);
        } else {
            fd fdVar3 = fxVar2.o;
            if (fdVar3 == null) {
                fdVar3 = new fd();
                fxVar2.o = fdVar3;
            }
            e9 e9Var4 = fdVar3.e;
            xn xnVar2 = fxVar2.b;
            e30 e30Var2 = fxVar2.c;
            long jF = d80.F(fxVar2.u);
            ed edVar = ((fd) e9Var4.c).d;
            xn xnVar3 = edVar.a;
            e30 e30Var3 = edVar.b;
            dd ddVarO2 = e9Var4.o();
            long jS = e9Var4.s();
            z = z4;
            z2 = zIsHardwareAccelerated;
            fx fxVar5 = (fx) e9Var4.b;
            e9Var4.A(xnVar2);
            e9Var4.B(e30Var2);
            e9Var4.z(ddVarO);
            e9Var4.C(jF);
            e9Var4.b = fxVar2;
            ddVarO.l();
            try {
                fxVar2.c(fdVar3);
            } finally {
                ddVarO.i();
                e9Var4.A(xnVar3);
                e9Var4.B(e30Var3);
                e9Var4.z(ddVarO2);
                e9Var4.C(jS);
                e9Var4.b = fxVar5;
            }
        }
        if (z5) {
            ddVarO.i();
        }
        if (z) {
            ddVarO.n();
        }
        if (z2) {
            return;
        }
        canvas.restore();
    }

    public final void I0(dd ddVar, fx fxVar) {
        nc0 nc0Var;
        dd ddVar2;
        fx fxVar2;
        d90 d90VarP0 = P0(4);
        if (d90VarP0 == null) {
            d1(ddVar, fxVar);
            return;
        }
        t30 t30Var = this.r;
        t30Var.getClass();
        v30 sharedDrawScope = ((p3) r31.U(t30Var)).getSharedDrawScope();
        long jF = d80.F(this.f);
        sharedDrawScope.getClass();
        eb0 eb0Var = null;
        while (d90VarP0 != null) {
            if (d90VarP0 instanceof qq) {
                nc0Var = this;
                ddVar2 = ddVar;
                fxVar2 = fxVar;
                sharedDrawScope.d(ddVar2, jF, nc0Var, (qq) d90VarP0, fxVar2);
            } else {
                nc0Var = this;
                ddVar2 = ddVar;
                fxVar2 = fxVar;
                if ((d90VarP0.f & 4) != 0 && (d90VarP0 instanceof mn)) {
                    int i = 0;
                    for (d90 d90Var = ((mn) d90VarP0).s; d90Var != null; d90Var = d90Var.i) {
                        if ((d90Var.f & 4) != 0) {
                            i++;
                            if (i == 1) {
                                d90VarP0 = d90Var;
                            } else {
                                if (eb0Var == null) {
                                    eb0Var = new eb0(new d90[16]);
                                }
                                if (d90VarP0 != null) {
                                    eb0Var.b(d90VarP0);
                                    d90VarP0 = null;
                                }
                                eb0Var.b(d90Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                ddVar = ddVar2;
                this = nc0Var;
                fxVar = fxVar2;
            }
            d90VarP0 = d80.i(eb0Var);
            ddVar = ddVar2;
            this = nc0Var;
            fxVar = fxVar2;
        }
    }

    @Override // defpackage.d30
    public final void J(float[] fArr) {
        eg0 eg0VarU = r31.U(this.r);
        nc0 nc0VarI1 = i1(l81.C(this));
        m1(nc0VarI1, fArr);
        if (eg0VarU instanceof f80) {
            ((p3) ((f80) eg0VarU)).p(fArr);
            return;
        }
        long jD = nc0VarI1.d(0L);
        if ((9223372034707292159L & jD) != 9205357640488583168L) {
            e80.f(fArr, Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)));
        }
    }

    public abstract void J0();

    @Override // defpackage.d30
    public final void K(d30 d30Var, float[] fArr) {
        nc0 nc0VarI1 = i1(d30Var);
        nc0VarI1.Y0();
        nc0 nc0VarK0 = K0(nc0VarI1);
        e80.d(fArr);
        nc0VarI1.m1(nc0VarK0, fArr);
        l1(nc0VarK0, fArr);
    }

    public final nc0 K0(nc0 nc0Var) {
        t30 t30VarT = nc0Var.r;
        t30 t30Var = this.r;
        if (t30VarT == t30Var) {
            d90 d90VarO0 = nc0Var.O0();
            d90 d90VarO02 = O0();
            if (!d90VarO02.d.q) {
                pz.b("visitLocalAncestors called on an unattached node");
            }
            for (d90 d90Var = d90VarO02.d.h; d90Var != null; d90Var = d90Var.h) {
                if ((d90Var.f & 2) != 0 && d90Var == d90VarO0) {
                    return nc0Var;
                }
            }
            return this;
        }
        while (t30VarT.q > t30Var.q) {
            t30VarT = t30VarT.t();
            c10.m(t30VarT);
        }
        t30 t30VarT2 = t30Var;
        while (t30VarT2.q > t30VarT.q) {
            t30VarT2 = t30VarT2.t();
            c10.m(t30VarT2);
        }
        while (t30VarT != t30VarT2) {
            t30VarT = t30VarT.t();
            t30VarT2 = t30VarT2.t();
            if (t30VarT == null || t30VarT2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (t30VarT2 != t30Var) {
            if (t30VarT != nc0Var.r) {
                return t30VarT.G.c;
            }
            return nc0Var;
        }
        return this;
    }

    public final long L0(long j) {
        long j2 = this.C;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        dg0 dg0Var = this.L;
        return dg0Var != null ? ((gx) dg0Var).d(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public abstract x60 M0();

    public final long N0() {
        return this.x.W(this.r.B.g());
    }

    public abstract d90 O0();

    @Override // defpackage.d30
    public final xl0 P(d30 d30Var, boolean z) {
        if (!O0().q) {
            pz.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!d30Var.H()) {
            pz.b("LayoutCoordinates " + d30Var + " is not attached!");
        }
        nc0 nc0VarI1 = i1(d30Var);
        nc0VarI1.Y0();
        nc0 nc0VarK0 = K0(nc0VarI1);
        sa0 sa0Var = this.E;
        if (sa0Var == null) {
            sa0Var = new sa0();
            this.E = sa0Var;
        }
        sa0Var.a = 0.0f;
        sa0Var.b = 0.0f;
        sa0Var.c = (int) (d30Var.Q() >> 32);
        sa0Var.d = (int) (d30Var.Q() & 4294967295L);
        while (nc0VarI1 != nc0VarK0) {
            nc0VarI1.f1(sa0Var, z, false);
            if (sa0Var.b()) {
                return xl0.e;
            }
            nc0VarI1 = nc0VarI1.t;
            c10.m(nc0VarI1);
        }
        D0(nc0VarK0, sa0Var, z);
        return new xl0(sa0Var.a, sa0Var.b, sa0Var.c, sa0Var.d);
    }

    public final d90 P0(int i) {
        boolean zG = oc0.g(i);
        d90 d90VarO0 = O0();
        if (!zG && (d90VarO0 = d90VarO0.h) == null) {
            return null;
        }
        for (d90 d90VarQ0 = Q0(zG); d90VarQ0 != null && (d90VarQ0.g & i) != 0; d90VarQ0 = d90VarQ0.i) {
            if ((d90VarQ0.f & i) != 0) {
                return d90VarQ0;
            }
            if (d90VarQ0 == d90VarO0) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.d30
    public final long Q() {
        return this.f;
    }

    public final d90 Q0(boolean z) {
        d90 d90VarO0;
        jc0 jc0Var = this.r.G;
        if (jc0Var.d == this) {
            return jc0Var.f;
        }
        if (!z) {
            nc0 nc0Var = this.t;
            if (nc0Var != null) {
                return nc0Var.O0();
            }
            return null;
        }
        nc0 nc0Var2 = this.t;
        if (nc0Var2 == null || (d90VarO0 = nc0Var2.O0()) == null) {
            return null;
        }
        return d90VarO0.i;
    }

    @Override // defpackage.d30
    public final long R(long j) {
        if (!O0().q) {
            pz.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Y0();
        while (this != null) {
            j = this.j1(j);
            this = this.t;
        }
        return j;
    }

    public final void R0(d90 d90Var, lc0 lc0Var, long j, gy gyVar, int i, boolean z) {
        if (d90Var == null) {
            U0(lc0Var, j, gyVar, i, z);
            return;
        }
        int i2 = gyVar.f;
        ma0 ma0Var = gyVar.d;
        gyVar.b(i2 + 1, ma0Var.b);
        gyVar.f++;
        ma0Var.a(d90Var);
        gyVar.e.a(m20.c(-1.0f, z, false));
        R0(l81.j(d90Var, lc0Var.c()), lc0Var, j, gyVar, i, z);
        gyVar.f = i2;
    }

    public final void S0(d90 d90Var, lc0 lc0Var, long j, gy gyVar, int i, boolean z, float f) throws Throwable {
        if (d90Var == null) {
            U0(lc0Var, j, gyVar, i, z);
            return;
        }
        int i2 = gyVar.f;
        ma0 ma0Var = gyVar.d;
        gyVar.b(i2 + 1, ma0Var.b);
        gyVar.f++;
        ma0Var.a(d90Var);
        gyVar.e.a(m20.c(f, z, false));
        c1(l81.j(d90Var, lc0Var.c()), lc0Var, j, gyVar, i, z, f, true);
        gyVar.f = i2;
    }

    public final void T0(lc0 lc0Var, long j, gy gyVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        d90 d90VarP0 = P0(lc0Var.c());
        if (!p1(j)) {
            if (i == 1) {
                float fG0 = G0(j, N0());
                if ((Float.floatToRawIntBits(fG0) & Integer.MAX_VALUE) < 2139095040) {
                    if (gyVar.f != ve.L(gyVar)) {
                        if (c4.l(gyVar.a(), m20.c(fG0, false, false)) <= 0) {
                            return;
                        }
                    }
                    S0(d90VarP0, lc0Var, j, gyVar, i, false, fG0);
                    return;
                }
                return;
            }
            return;
        }
        if (d90VarP0 == null) {
            U0(lc0Var, j, gyVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < d0() && fIntBitsToFloat2 < c0()) {
            R0(d90VarP0, lc0Var, j, gyVar, i, z);
            return;
        }
        float fG02 = i == 1 ? G0(j, N0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fG02) & Integer.MAX_VALUE) < 2139095040) {
            if (gyVar.f != ve.L(gyVar)) {
                z2 = z;
                if (c4.l(gyVar.a(), m20.c(fG02, z2, false)) > 0) {
                }
                c1(d90VarP0, lc0Var, j, gyVar, i, z2, fG02, z3);
            }
            z2 = z;
            z3 = true;
            c1(d90VarP0, lc0Var, j, gyVar, i, z2, fG02, z3);
        }
        z2 = z;
        z3 = false;
        c1(d90VarP0, lc0Var, j, gyVar, i, z2, fG02, z3);
    }

    public void U0(lc0 lc0Var, long j, gy gyVar, int i, boolean z) {
        nc0 nc0Var = this.s;
        if (nc0Var != null) {
            nc0Var.T0(lc0Var, nc0Var.L0(j), gyVar, i, z);
        }
    }

    public final void V0() {
        dg0 dg0Var = this.L;
        if (dg0Var != null) {
            dg0Var.invalidate();
            return;
        }
        nc0 nc0Var = this.t;
        if (nc0Var != null) {
            nc0Var.V0();
        }
    }

    public final boolean W0() {
        if (this.L != null && this.z <= 0.0f) {
            return true;
        }
        nc0 nc0Var = this.t;
        if (nc0Var != null) {
            return nc0Var.W0();
        }
        return false;
    }

    public final long X0(d30 d30Var, long j) {
        if (d30Var instanceof y60) {
            y60 y60Var = (y60) d30Var;
            y60Var.d.r.Y0();
            return y60Var.b(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        nc0 nc0VarI1 = i1(d30Var);
        nc0VarI1.Y0();
        nc0 nc0VarK0 = K0(nc0VarI1);
        while (nc0VarI1 != nc0VarK0) {
            j = nc0VarI1.j1(j);
            nc0VarI1 = nc0VarI1.t;
            c10.m(nc0VarI1);
        }
        return E0(nc0VarK0, j);
    }

    public final void Y0() {
        this.r.H.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [d90] */
    /* JADX WARN: Type inference failed for: r7v7, types: [d90] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [eb0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void Z0() {
        d90 d90VarO0;
        boolean zG = oc0.g(128);
        d90 d90VarQ0 = Q0(zG);
        if (d90VarQ0 == null || (d90VarQ0.d.g & 128) == 0) {
            return;
        }
        gv0 gv0VarG = h9.g();
        iw iwVarE = gv0VarG != null ? gv0VarG.e() : null;
        gv0 gv0VarJ = h9.j(gv0VarG);
        try {
            if (!zG) {
                d90VarO0 = O0().h;
                if (d90VarO0 == null) {
                }
            }
            d90VarO0 = O0();
            for (d90 d90VarQ02 = Q0(zG); d90VarQ02 != null; d90VarQ02 = d90VarQ02.i) {
                if ((d90VarQ02.g & 128) == 0) {
                    break;
                }
                if ((d90VarQ02.f & 128) != 0) {
                    mn mnVarI = d90VarQ02;
                    ?? eb0Var = 0;
                    while (mnVarI != 0) {
                        if (mnVarI instanceof b30) {
                            ((b30) mnVarI).r(this.f);
                        } else if ((mnVarI.f & 128) != 0 && (mnVarI instanceof mn)) {
                            d90 d90Var = mnVarI.s;
                            int i = 0;
                            mnVarI = mnVarI;
                            eb0Var = eb0Var;
                            while (d90Var != null) {
                                if ((d90Var.f & 128) != 0) {
                                    i++;
                                    eb0Var = eb0Var;
                                    if (i == 1) {
                                        mnVarI = d90Var;
                                    } else {
                                        if (eb0Var == 0) {
                                            eb0Var = new eb0(new d90[16]);
                                        }
                                        if (mnVarI != 0) {
                                            eb0Var.b(mnVarI);
                                            mnVarI = 0;
                                        }
                                        eb0Var.b(d90Var);
                                    }
                                }
                                d90Var = d90Var.i;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        mnVarI = d80.i(eb0Var);
                    }
                }
                if (d90VarQ02 == d90VarO0) {
                    break;
                }
            }
        } finally {
            h9.l(gv0VarG, gv0VarJ, iwVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d90] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void a1() {
        boolean zG = oc0.g(128);
        d90 d90VarO0 = O0();
        if (!zG && (d90VarO0 = d90VarO0.h) == null) {
            return;
        }
        for (d90 d90VarQ0 = Q0(zG); d90VarQ0 != null && (d90VarQ0.g & 128) != 0; d90VarQ0 = d90VarQ0.i) {
            if ((d90VarQ0.f & 128) != 0) {
                mn mnVarI = d90VarQ0;
                ?? eb0Var = 0;
                while (mnVarI != 0) {
                    if (mnVarI instanceof b30) {
                        ((b30) mnVarI).n(this);
                    } else if ((mnVarI.f & 128) != 0 && (mnVarI instanceof mn)) {
                        d90 d90Var = mnVarI.s;
                        int i = 0;
                        mnVarI = mnVarI;
                        eb0Var = eb0Var;
                        while (d90Var != null) {
                            if ((d90Var.f & 128) != 0) {
                                i++;
                                eb0Var = eb0Var;
                                if (i == 1) {
                                    mnVarI = d90Var;
                                } else {
                                    if (eb0Var == 0) {
                                        eb0Var = new eb0(new d90[16]);
                                    }
                                    if (mnVarI != 0) {
                                        eb0Var.b(mnVarI);
                                        mnVarI = 0;
                                    }
                                    eb0Var.b(d90Var);
                                }
                            }
                            d90Var = d90Var.i;
                            mnVarI = mnVarI;
                            eb0Var = eb0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    mnVarI = d80.i(eb0Var);
                }
            }
            if (d90VarQ0 == d90VarO0) {
                return;
            }
        }
    }

    @Override // defpackage.xn
    public final float b() {
        return this.r.z.b();
    }

    public final void b1() {
        this.u = true;
        this.J.a();
        g1();
        if (m00.a(this.C, 0L)) {
            return;
        }
        this.r.M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8 A[PHI: r4
  0x01b8: PHI (r4v6 eb0) = (r4v1 eb0), (r4v1 eb0), (r4v8 eb0) binds: [B:52:0x0183, B:54:0x0187, B:68:0x01b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(defpackage.d90 r21, defpackage.lc0 r22, long r23, defpackage.gy r25, int r26, boolean r27, float r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc0.c1(d90, lc0, long, gy, int, boolean, float, boolean):void");
    }

    @Override // defpackage.d30
    public final long d(long j) {
        if (!O0().q) {
            pz.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((p3) r31.U(this.r)).q(R(j));
    }

    public abstract void d1(dd ddVar, fx fxVar);

    public final void e1(long j, float f, iw iwVar) {
        n1(iwVar, false);
        boolean zA = m00.a(this.C, j);
        t30 t30Var = this.r;
        if (!zA) {
            ((p3) r31.U(t30Var)).H(-4.0f);
            this.C = j;
            t30Var.H.p.q0();
            dg0 dg0Var = this.L;
            if (dg0Var != null) {
                ((gx) dg0Var).e(j);
            } else {
                nc0 nc0Var = this.t;
                if (nc0Var != null) {
                    nc0Var.V0();
                }
            }
            t30Var.M();
            v60.A0(this);
            eg0 eg0Var = t30Var.p;
            if (eg0Var != null) {
                ((p3) eg0Var).u(t30Var);
            }
        }
        this.D = f;
        if (!this.n) {
            q0(w0());
        }
        if (this == t30Var.G.d) {
            ((p3) r31.U(t30Var)).getRectManager().g(t30Var, !t30Var.H.p.n);
        }
    }

    public final void f1(sa0 sa0Var, boolean z, boolean z2) {
        dg0 dg0Var = this.L;
        if (dg0Var != null) {
            if (this.v) {
                if (z2) {
                    long jN0 = N0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN0 & 4294967295L)) / 2.0f;
                    long j = this.f;
                    sa0Var.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.f;
                    sa0Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (sa0Var.b()) {
                    return;
                }
            }
            ((gx) dg0Var).c(sa0Var, false);
        }
        long j3 = this.C;
        float f = (int) (j3 >> 32);
        sa0Var.a += f;
        sa0Var.c += f;
        float f2 = (int) (j3 & 4294967295L);
        sa0Var.b += f2;
        sa0Var.d += f2;
    }

    public final void g1() {
        if (this.L != null) {
            n1(null, false);
            this.r.T(false);
        }
    }

    @Override // defpackage.x00
    public final e30 getLayoutDirection() {
        return this.r.A;
    }

    @Override // defpackage.d30
    public final long h(long j) {
        if (!O0().q) {
            pz.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d30 d30VarC = l81.C(this);
        p3 p3Var = (p3) r31.U(this.r);
        p3Var.y();
        return X0(d30VarC, ed0.f(e80.b(j, p3Var.U), d30VarC.R(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [d90] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [eb0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [eb0] */
    public final void h1(m80 m80Var) {
        nc0 nc0Var;
        m80 m80Var2 = this.A;
        if (m80Var != m80Var2) {
            this.A = m80Var;
            t30 t30Var = this.r;
            int i = 0;
            if (m80Var2 == null || m80Var.e() != m80Var2.e() || m80Var.c() != m80Var2.c()) {
                int iE = m80Var.e();
                int iC = m80Var.c();
                dg0 dg0Var = this.L;
                if (dg0Var != null) {
                    ((gx) dg0Var).f((iE << 32) | (iC & 4294967295L));
                } else if (t30Var.I() && (nc0Var = this.t) != null) {
                    nc0Var.V0();
                }
                h0((iC & 4294967295L) | (iE << 32));
                if (this.w != null) {
                    o1(false);
                }
                boolean zG = oc0.g(4);
                d90 d90VarO0 = O0();
                if (zG || (d90VarO0 = d90VarO0.h) != null) {
                    for (d90 d90VarQ0 = Q0(zG); d90VarQ0 != null && (d90VarQ0.g & 4) != 0; d90VarQ0 = d90VarQ0.i) {
                        if ((d90VarQ0.f & 4) != 0) {
                            mn mnVarI = d90VarQ0;
                            ?? eb0Var = 0;
                            while (mnVarI != 0) {
                                if (mnVarI instanceof qq) {
                                    ((qq) mnVarI).h0();
                                } else if ((mnVarI.f & 4) != 0 && (mnVarI instanceof mn)) {
                                    d90 d90Var = mnVarI.s;
                                    int i2 = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var != null) {
                                        if ((d90Var.f & 4) != 0) {
                                            i2++;
                                            eb0Var = eb0Var;
                                            if (i2 == 1) {
                                                mnVarI = d90Var;
                                            } else {
                                                if (eb0Var == 0) {
                                                    eb0Var = new eb0(new d90[16]);
                                                }
                                                if (mnVarI != 0) {
                                                    eb0Var.b(mnVarI);
                                                    mnVarI = 0;
                                                }
                                                eb0Var.b(d90Var);
                                            }
                                        }
                                        d90Var = d90Var.i;
                                        mnVarI = mnVarI;
                                        eb0Var = eb0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                mnVarI = d80.i(eb0Var);
                            }
                        }
                        if (d90VarQ0 == d90VarO0) {
                            break;
                        }
                    }
                }
                eg0 eg0Var = t30Var.p;
                if (eg0Var != null) {
                    ((p3) eg0Var).u(t30Var);
                }
            }
            la0 la0Var = this.B;
            if ((la0Var == null || la0Var.e == 0) && m80Var.a().isEmpty()) {
                return;
            }
            la0 la0Var2 = this.B;
            Map mapA = m80Var.a();
            if (la0Var2 != null && la0Var2.e == mapA.size()) {
                Object[] objArr = la0Var2.b;
                int[] iArr = la0Var2.c;
                long[] jArr = la0Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((iy) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            t30Var.H.p.z.f();
            la0 la0Var3 = this.B;
            if (la0Var3 == null) {
                la0 la0Var4 = zc0.a;
                la0Var3 = new la0();
                this.B = la0Var3;
            }
            la0Var3.a();
            for (Map.Entry entry : m80Var.a().entrySet()) {
                la0Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // defpackage.d30
    public final long i(long j) {
        long jR = R(j);
        p3 p3Var = (p3) r31.U(this.r);
        p3Var.y();
        return e80.b(jR, p3Var.T);
    }

    public final long j1(long j) {
        dg0 dg0Var = this.L;
        if (dg0Var != null) {
            j = ((gx) dg0Var).d(j, false);
        }
        long j2 = this.C;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // defpackage.xn
    public final float k() {
        return this.r.z.k();
    }

    public final xl0 k1() {
        if (O0().q) {
            d30 d30VarC = l81.C(this);
            sa0 sa0Var = this.E;
            if (sa0Var == null) {
                sa0Var = new sa0();
                this.E = sa0Var;
            }
            long jF0 = F0(N0());
            int i = (int) (jF0 >> 32);
            sa0Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jF0 & 4294967295L);
            sa0Var.b = -Float.intBitsToFloat(i2);
            sa0Var.c = Float.intBitsToFloat(i) + d0();
            sa0Var.d = Float.intBitsToFloat(i2) + c0();
            while (this != d30VarC) {
                this.f1(sa0Var, false, true);
                if (!sa0Var.b()) {
                    this = this.t;
                    c10.m(this);
                }
            }
            return new xl0(sa0Var.a, sa0Var.b, sa0Var.c, sa0Var.d);
        }
        return xl0.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.oi0, defpackage.g80
    public final Object l() {
        t30 t30Var = this.r;
        if (!t30Var.G.d(64)) {
            return null;
        }
        O0();
        Object objG0 = null;
        for (d90 d90Var = t30Var.G.e; d90Var != null; d90Var = d90Var.h) {
            if ((d90Var.f & 64) != 0) {
                mn mnVarI = d90Var;
                ?? eb0Var = 0;
                while (mnVarI != 0) {
                    if (mnVarI instanceof ah0) {
                        objG0 = ((ah0) mnVarI).g0(objG0);
                    } else if ((mnVarI.f & 64) != 0 && (mnVarI instanceof mn)) {
                        d90 d90Var2 = mnVarI.s;
                        int i = 0;
                        mnVarI = mnVarI;
                        eb0Var = eb0Var;
                        while (d90Var2 != null) {
                            if ((d90Var2.f & 64) != 0) {
                                i++;
                                eb0Var = eb0Var;
                                if (i == 1) {
                                    mnVarI = d90Var2;
                                } else {
                                    if (eb0Var == 0) {
                                        eb0Var = new eb0(new d90[16]);
                                    }
                                    if (mnVarI != 0) {
                                        eb0Var.b(mnVarI);
                                        mnVarI = 0;
                                    }
                                    eb0Var.b(d90Var2);
                                }
                            }
                            d90Var2 = d90Var2.i;
                            mnVarI = mnVarI;
                            eb0Var = eb0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    mnVarI = d80.i(eb0Var);
                }
            }
        }
        return objG0;
    }

    public final void l1(nc0 nc0Var, float[] fArr) {
        float[] fArrA;
        if (c10.i(nc0Var, this)) {
            return;
        }
        nc0 nc0Var2 = this.t;
        c10.m(nc0Var2);
        nc0Var2.l1(nc0Var, fArr);
        if (!m00.a(this.C, 0L)) {
            float[] fArr2 = O;
            e80.d(fArr2);
            long j = this.C;
            e80.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            e80.e(fArr, fArr2);
        }
        dg0 dg0Var = this.L;
        if (dg0Var == null || (fArrA = ((gx) dg0Var).a()) == null) {
            return;
        }
        e80.e(fArr, fArrA);
    }

    @Override // defpackage.d30
    public final d30 m() {
        if (!O0().q) {
            pz.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Y0();
        return this.r.G.d.t;
    }

    public final void m1(nc0 nc0Var, float[] fArr) {
        while (!this.equals(nc0Var)) {
            dg0 dg0Var = this.L;
            if (dg0Var != null) {
                e80.e(fArr, ((gx) dg0Var).b());
            }
            if (!m00.a(this.C, 0L)) {
                float[] fArr2 = O;
                e80.d(fArr2);
                e80.f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                e80.e(fArr, fArr2);
            }
            this = this.t;
            c10.m(this);
        }
    }

    public final void n1(iw iwVar, boolean z) {
        eg0 eg0Var;
        eb0 eb0Var;
        Reference referencePoll;
        h4 h4Var;
        eb0 eb0Var2;
        Reference referencePoll2;
        Object obj;
        t30 t30Var = this.r;
        boolean z2 = (!z && this.w == iwVar && c10.i(this.x, t30Var.z) && this.y == t30Var.A) ? false : true;
        this.x = t30Var.z;
        this.y = t30Var.A;
        boolean zH = t30Var.H();
        mc0 mc0Var = this.J;
        if (!zH || iwVar == null) {
            this.w = null;
            dg0 dg0Var = this.L;
            if (dg0Var != null) {
                gx gxVar = (gx) dg0Var;
                p3 p3Var = gxVar.f;
                if (!l81.L(gxVar.b())) {
                    t30Var.M();
                }
                gxVar.g = null;
                gxVar.h = null;
                gxVar.j = true;
                if (gxVar.m) {
                    gxVar.m = false;
                    p3Var.s(gxVar, false);
                }
                ex exVar = gxVar.e;
                if (exVar != null) {
                    exVar.a(gxVar.d);
                    xz xzVar = p3Var.v0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) xzVar.f;
                        eb0Var = (eb0) xzVar.e;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            eb0Var.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    eb0Var.b(new WeakReference(gxVar, (ReferenceQueue) xzVar.f));
                    p3Var.A.remove(gxVar);
                }
                t30Var.K = true;
                mc0Var.a();
                if (O0().q && t30Var.I() && (eg0Var = t30Var.p) != null) {
                    ((p3) eg0Var).u(t30Var);
                }
            }
            this.L = null;
            this.K = false;
            return;
        }
        this.w = iwVar;
        if (this.L != null) {
            if (z2 && o1(true)) {
                t30Var.M();
                ((p3) r31.U(t30Var)).getRectManager().f(t30Var);
                return;
            }
            return;
        }
        eg0 eg0VarU = r31.U(t30Var);
        h4 h4Var2 = this.I;
        if (h4Var2 == null) {
            h4 h4Var3 = new h4(11, this, new mc0(this, 0));
            this.I = h4Var3;
            h4Var = h4Var3;
        } else {
            h4Var = h4Var2;
        }
        p3 p3Var2 = (p3) eg0VarU;
        xz xzVar2 = p3Var2.v0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) xzVar2.f;
            eb0Var2 = (eb0) xzVar2.e;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                eb0Var2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i = eb0Var2.f;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eb0Var2.k(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        dg0 gxVar2 = (dg0) obj;
        if (gxVar2 != null) {
            gx gxVar3 = (gx) gxVar2;
            ex exVar2 = gxVar3.e;
            if (exVar2 == null) {
                throw b8.f("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!gxVar3.d.s) {
                pz.a("layer should have been released before reuse");
            }
            gxVar3.d = exVar2.b();
            gxVar3.j = false;
            gxVar3.g = h4Var;
            gxVar3.h = mc0Var;
            gxVar3.t = false;
            gxVar3.u = false;
            gxVar3.v = true;
            e80.d(gxVar3.k);
            float[] fArr = gxVar3.l;
            if (fArr != null) {
                e80.d(fArr);
            }
            gxVar3.r = x21.a;
            gxVar3.w = false;
            long j = Integer.MAX_VALUE;
            gxVar3.i = (j & 4294967295L) | (j << 32);
            gxVar3.s = null;
            gxVar3.q = 0;
        } else {
            gxVar2 = new gx(p3Var2.getGraphicsContext().b(), p3Var2.getGraphicsContext(), p3Var2, h4Var, mc0Var);
        }
        gx gxVar4 = (gx) gxVar2;
        gxVar4.f(this.f);
        gxVar4.e(this.C);
        this.L = gxVar2;
        o1(true);
        t30Var.K = true;
        mc0Var.a();
    }

    public final boolean o1(boolean z) {
        long j;
        char c;
        long j2;
        t30 t30Var;
        boolean z2;
        boolean z3;
        eg0 eg0Var;
        gw gwVar;
        gw gwVar2;
        dg0 dg0Var = this.L;
        if (dg0Var == null) {
            if (this.w == null) {
                return false;
            }
            pz.b("null layer with a non-null layerBlock");
            return false;
        }
        iw iwVar = this.w;
        if (iwVar == null) {
            throw b8.f("updateLayerParameters requires a non-null layerBlock");
        }
        an0 an0Var = M;
        if (an0Var.e != 1.0f) {
            an0Var.d |= 1;
            an0Var.e = 1.0f;
        }
        if (an0Var.f != 1.0f) {
            an0Var.d |= 2;
            an0Var.f = 1.0f;
        }
        an0Var.a(1.0f);
        an0Var.e(0.0f);
        long j3 = hx.a;
        an0Var.d(j3);
        an0Var.h(j3);
        if (an0Var.k != 8.0f) {
            an0Var.d |= 2048;
            an0Var.k = 8.0f;
        }
        long j4 = x21.a;
        if (an0Var.l != j4) {
            an0Var.d |= 4096;
            an0Var.l = j4;
        }
        an0Var.f(nm.h);
        if (an0Var.n) {
            an0Var.d |= 16384;
            an0Var.n = false;
        }
        if (an0Var.r != 3) {
            an0Var.d |= 524288;
            an0Var.r = 3;
        }
        an0Var.o = 9205357640488583168L;
        an0Var.s = null;
        an0Var.d = 0;
        t30 t30Var2 = this.r;
        an0Var.p = t30Var2.z;
        an0Var.q = t30Var2.A;
        an0Var.o = d80.F(this.f);
        ((p3) r31.U(t30Var2)).getSnapshotObserver().a(this, s40.k, new b(18, iwVar));
        a30 a30Var = this.F;
        if (a30Var == null) {
            a30Var = new a30();
            this.F = a30Var;
        }
        a30 a30Var2 = N;
        a30Var2.getClass();
        a30Var2.a = a30Var.a;
        a30Var2.b = a30Var.b;
        a30Var2.c = a30Var.c;
        a30Var2.d = a30Var.d;
        float f = an0Var.e;
        a30Var.a = f;
        a30Var.b = an0Var.f;
        a30Var.c = an0Var.k;
        long j5 = an0Var.l;
        a30Var.d = j5;
        gx gxVar = (gx) dg0Var;
        p3 p3Var = gxVar.f;
        int i = an0Var.d | gxVar.q;
        gxVar.o = an0Var.q;
        gxVar.n = an0Var.p;
        int i2 = i & 4096;
        if (i2 != 0) {
            gxVar.r = j5;
        }
        if ((i & 1) != 0) {
            ix ixVar = gxVar.d.a;
            if (ixVar.j != f) {
                ixVar.j = f;
                ixVar.c.setScaleX(f);
            }
        }
        if ((i & 2) != 0) {
            fx fxVar = gxVar.d;
            float f2 = an0Var.f;
            ix ixVar2 = fxVar.a;
            if (ixVar2.k != f2) {
                ixVar2.k = f2;
                ixVar2.c.setScaleY(f2);
            }
        }
        if ((i & 4) != 0) {
            fx fxVar2 = gxVar.d;
            float f3 = an0Var.g;
            ix ixVar3 = fxVar2.a;
            if (ixVar3.h != f3) {
                ixVar3.h = f3;
                ixVar3.c.setAlpha(f3);
            }
        }
        if ((i & 8) != 0) {
            ix ixVar4 = gxVar.d.a;
        }
        if ((i & 16) != 0) {
            ix ixVar5 = gxVar.d.a;
        }
        if ((i & 32) != 0) {
            fx fxVar3 = gxVar.d;
            float f4 = an0Var.h;
            ix ixVar6 = fxVar3.a;
            if (ixVar6.l != f4) {
                ixVar6.l = f4;
                ixVar6.c.setElevation(f4);
                fxVar3.g = true;
                fxVar3.a();
            }
            if (an0Var.h > 0.0f && !gxVar.w && (gwVar2 = gxVar.h) != null) {
                gwVar2.a();
            }
        }
        if ((i & 64) != 0) {
            fx fxVar4 = gxVar.d;
            long j6 = an0Var.i;
            ix ixVar7 = fxVar4.a;
            j = j4;
            if (!bf.c(j6, ixVar7.m)) {
                ixVar7.m = j6;
                ixVar7.c.setAmbientShadowColor(r31.Z(j6));
            }
        } else {
            j = j4;
        }
        if ((i & 128) != 0) {
            fx fxVar5 = gxVar.d;
            long j7 = an0Var.j;
            ix ixVar8 = fxVar5.a;
            if (!bf.c(j7, ixVar8.n)) {
                ixVar8.n = j7;
                ixVar8.c.setSpotShadowColor(r31.Z(j7));
            }
        }
        if ((i & 1024) != 0) {
            ix ixVar9 = gxVar.d.a;
        }
        if ((i & 256) != 0) {
            ix ixVar10 = gxVar.d.a;
        }
        if ((i & 512) != 0) {
            ix ixVar11 = gxVar.d.a;
        }
        if ((i & 2048) != 0) {
            fx fxVar6 = gxVar.d;
            float f5 = an0Var.k;
            ix ixVar12 = fxVar6.a;
            if (ixVar12.o != f5) {
                ixVar12.o = f5;
                ixVar12.c.setCameraDistance(f5);
            }
        }
        if (i2 != 0) {
            if (gxVar.r == j) {
                fx fxVar7 = gxVar.d;
                c = ' ';
                j2 = 4294967295L;
                if (!ed0.b(fxVar7.v, 9205357640488583168L)) {
                    fxVar7.v = 9205357640488583168L;
                    fxVar7.a.c.resetPivot();
                }
            } else {
                c = ' ';
                j2 = 4294967295L;
                fx fxVar8 = gxVar.d;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(x21.b(gxVar.r) * ((int) (gxVar.i & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(x21.a(r10) * ((int) (gxVar.i >> 32))) << 32);
                if (!ed0.b(fxVar8.v, jFloatToRawIntBits)) {
                    fxVar8.v = jFloatToRawIntBits;
                    RenderNode renderNode = fxVar8.a.c;
                    if ((9223372034707292159L & jFloatToRawIntBits) == 9205357640488583168L) {
                        renderNode.resetPivot();
                    } else {
                        renderNode.setPivotX(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                        renderNode.setPivotY(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                    }
                }
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
        }
        if ((i & 16384) != 0) {
            fx fxVar9 = gxVar.d;
            boolean z4 = an0Var.n;
            if (fxVar9.w != z4) {
                fxVar9.w = z4;
                fxVar9.g = true;
                fxVar9.a();
            }
        }
        if ((131072 & i) != 0) {
            ix ixVar13 = gxVar.d.a;
        }
        if ((262144 & i) != 0) {
            ix ixVar14 = gxVar.d.a;
        }
        if ((i & 524288) != 0) {
            fx fxVar10 = gxVar.d;
            int i3 = an0Var.r;
            ix ixVar15 = fxVar10.a;
            if (ixVar15.i != i3) {
                ixVar15.i = i3;
                Paint paint = ixVar15.e;
                if (paint == null) {
                    paint = new Paint();
                    ixVar15.e = paint;
                }
                paint.setBlendMode(nm.F(i3));
                ixVar15.d();
            }
        }
        if ((32768 & i) != 0) {
            ix ixVar16 = gxVar.d.a;
            if (ixVar16.s != 0) {
                ixVar16.s = 0;
                ixVar16.d();
            }
        }
        if ((i & 7963) != 0) {
            gxVar.t = true;
            gxVar.u = true;
        }
        if (c10.i(gxVar.s, an0Var.s)) {
            t30Var = t30Var2;
            z2 = true;
            z3 = false;
        } else {
            nf0 nf0Var = an0Var.s;
            gxVar.s = nf0Var;
            if (nf0Var == null) {
                t30Var = t30Var2;
                z2 = true;
            } else {
                fx fxVar11 = gxVar.d;
                if (nf0Var instanceof lf0) {
                    xl0 xl0Var = ((lf0) nf0Var).a;
                    float f6 = xl0Var.a;
                    float f7 = xl0Var.b;
                    fxVar11.e(0.0f, (Float.floatToRawIntBits(f6) << c) | (Float.floatToRawIntBits(f7) & j2), (Float.floatToRawIntBits(xl0Var.c - f6) << c) | (Float.floatToRawIntBits(xl0Var.d - f7) & j2));
                } else if (nf0Var instanceof kf0) {
                    i6 i6Var = ((kf0) nf0Var).a;
                    fxVar11.k = null;
                    fxVar11.i = 9205357640488583168L;
                    fxVar11.h = 0L;
                    fxVar11.j = 0.0f;
                    fxVar11.g = true;
                    fxVar11.n = false;
                    fxVar11.l = i6Var;
                    fxVar11.a();
                } else {
                    if (!(nf0Var instanceof mf0)) {
                        throw new fg();
                    }
                    mf0 mf0Var = (mf0) nf0Var;
                    i6 i6Var2 = mf0Var.b;
                    if (i6Var2 != null) {
                        fxVar11.k = null;
                        t30Var = t30Var2;
                        fxVar11.i = 9205357640488583168L;
                        fxVar11.h = 0L;
                        fxVar11.j = 0.0f;
                        z2 = true;
                        fxVar11.g = true;
                        fxVar11.n = false;
                        fxVar11.l = i6Var2;
                        fxVar11.a();
                    } else {
                        t30Var = t30Var2;
                        z2 = true;
                        fxVar11.e(Float.intBitsToFloat((int) (mf0Var.a.h >> c)), (Float.floatToRawIntBits(r9.a) << c) | (Float.floatToRawIntBits(r9.b) & j2), (Float.floatToRawIntBits(r9.b()) << c) | (Float.floatToRawIntBits(r9.a()) & j2));
                    }
                    if ((nf0Var instanceof kf0) && Build.VERSION.SDK_INT < 33 && (gwVar = gxVar.h) != null) {
                        gwVar.a();
                    }
                }
                t30Var = t30Var2;
                z2 = true;
                if (nf0Var instanceof kf0) {
                    gwVar.a();
                }
            }
            z3 = z2;
        }
        gxVar.q = an0Var.d;
        if (i != 0 || z3) {
            ViewParent parent = p3Var.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(p3Var, p3Var);
            }
            if (p3Var.i) {
                p3Var.H(0.0f);
            }
        }
        boolean z5 = this.v;
        boolean z6 = an0Var.n;
        this.v = z6;
        this.z = an0Var.g;
        boolean z7 = (a30Var2.a == a30Var.a && a30Var2.b == a30Var.b && a30Var2.c == a30Var.c && a30Var2.d == a30Var.d) ? z2 : false;
        boolean z8 = !z7;
        if (z && ((!z7 || z5 != z6) && (eg0Var = t30Var.p) != null)) {
            ((p3) eg0Var).u(t30Var);
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p1(long r24) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc0.p1(long):boolean");
    }

    @Override // defpackage.v60
    public final v60 s0() {
        return this.s;
    }

    @Override // defpackage.v60
    public final boolean u0() {
        return this.A != null;
    }

    @Override // defpackage.d30
    public final long v(d30 d30Var, long j) {
        return X0(d30Var, j);
    }

    @Override // defpackage.v60
    public final t30 v0() {
        return this.r;
    }

    @Override // defpackage.v60
    public final m80 w0() {
        m80 m80Var = this.A;
        if (m80Var != null) {
            return m80Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.v60
    public final v60 x0() {
        return this.t;
    }

    @Override // defpackage.v60
    public final long y0() {
        return this.C;
    }

    @Override // defpackage.v60
    public final d30 t0() {
        return this;
    }
}
