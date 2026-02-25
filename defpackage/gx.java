package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.view.ViewParent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gx implements dg0 {
    public fx d;
    public final ex e;
    public final p3 f;
    public kw g;
    public gw h;
    public long i;
    public boolean j;
    public float[] l;
    public boolean m;
    public int q;
    public nf0 s;
    public boolean t;
    public boolean u;
    public boolean w;
    public final float[] k = e80.a();
    public xn n = new yn(1.0f, 1.0f);
    public e30 o = e30.d;
    public final fd p = new fd();
    public long r = x21.a;
    public boolean v = true;
    public final h x = new h(17, this);

    public gx(fx fxVar, ex exVar, p3 p3Var, kw kwVar, gw gwVar) {
        this.d = fxVar;
        this.e = exVar;
        this.f = p3Var;
        this.g = kwVar;
        this.h = gwVar;
        long j = Integer.MAX_VALUE;
        this.i = (j & 4294967295L) | (j << 32);
    }

    public final float[] a() {
        float[] fArrA = this.l;
        if (fArrA == null) {
            fArrA = e80.a();
            this.l = fArrA;
        }
        if (this.u) {
            this.u = false;
            float[] fArrB = b();
            if (this.v) {
                return fArrB;
            }
            if (!l81.J(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.t;
        float[] fArr = this.k;
        if (z) {
            fx fxVar = this.d;
            long jG = fxVar.v;
            ix ixVar = fxVar.a;
            if ((9223372034707292159L & jG) == 9205357640488583168L) {
                jG = dq0.g(d80.F(this.i));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & 4294967295L));
            float f = ixVar.j;
            float f2 = ixVar.k;
            double d = 0.0f * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f3 = -fSin;
            float f4 = (0.0f * fCos) - (1.0f * fSin);
            float f5 = (1.0f * fCos) + (0.0f * fSin);
            float fSin2 = (float) Math.sin(d);
            float fCos2 = (float) Math.cos(d);
            float f6 = -fSin2;
            float f7 = fSin * fSin2;
            float f8 = fSin * fCos2;
            float f9 = fCos * fSin2;
            float f10 = fCos * fCos2;
            float f11 = (f5 * fSin2) + (0.0f * fCos2);
            float f12 = (f5 * fCos2) + ((-0.0f) * fSin2);
            float fSin3 = (float) Math.sin(d);
            float fCos3 = (float) Math.cos(d);
            float f13 = -fSin3;
            float f14 = (fCos3 * f7) + (f13 * fCos2);
            float f15 = ((f7 * fSin3) + (fCos2 * fCos3)) * f;
            float f16 = fSin3 * fCos * f;
            float f17 = ((fSin3 * f8) + (fCos3 * f6)) * f;
            float f18 = f14 * f2;
            float f19 = fCos * fCos3 * f2;
            float f20 = ((fCos3 * f8) + (f13 * f6)) * f2;
            float f21 = f9 * 1.0f;
            float f22 = f3 * 1.0f;
            float f23 = f10 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (f18 * fIntBitsToFloat2)) + f11 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (f19 * fIntBitsToFloat2)) + f4 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f12;
                fArr[15] = 1.0f;
            }
            this.t = false;
            this.v = l81.L(fArr);
        }
        return fArr;
    }

    public final void c(sa0 sa0Var, boolean z) {
        float[] fArrA = z ? a() : b();
        if (this.v) {
            return;
        }
        if (fArrA != null) {
            e80.c(fArrA, sa0Var);
            return;
        }
        sa0Var.a = 0.0f;
        sa0Var.b = 0.0f;
        sa0Var.c = 0.0f;
        sa0Var.d = 0.0f;
    }

    public final long d(long j, boolean z) {
        float[] fArrB;
        if (z) {
            fArrB = a();
            if (fArrB == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrB = b();
        }
        return this.v ? j : e80.b(j, fArrB);
    }

    public final void e(long j) {
        p3 p3Var = this.f;
        if (p3Var.i) {
            p3Var.H(-4.0f);
        }
        fx fxVar = this.d;
        if (!m00.a(fxVar.t, j)) {
            fxVar.t = j;
            long j2 = fxVar.u;
            ix ixVar = fxVar.a;
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            ixVar.c.setPosition(i, i2, ((int) (j2 >> 32)) + i, ((int) (4294967295L & j2)) + i2);
            ixVar.d = d80.F(j2);
        }
        ViewParent parent = p3Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(p3Var, p3Var);
        }
    }

    public final void f(long j) {
        if (t00.a(j, this.i)) {
            return;
        }
        p3 p3Var = this.f;
        if (p3Var.i) {
            p3Var.H(-4.0f);
        }
        this.i = j;
        if (this.m || this.j) {
            return;
        }
        p3Var.invalidate();
        if (true != this.m) {
            this.m = true;
            p3Var.s(this, true);
        }
    }

    public final void g() {
        if (this.m) {
            if (this.r != x21.a && !t00.a(this.d.u, this.i)) {
                fx fxVar = this.d;
                float fA = x21.a(this.r) * ((int) (this.i >> 32));
                float fB = x21.b(this.r) * ((int) (this.i & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32);
                if (!ed0.b(fxVar.v, jFloatToRawIntBits)) {
                    fxVar.v = jFloatToRawIntBits;
                    RenderNode renderNode = fxVar.a.c;
                    if ((9223372034707292159L & jFloatToRawIntBits) == 9205357640488583168L) {
                        renderNode.resetPivot();
                    } else {
                        renderNode.setPivotX(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                        renderNode.setPivotY(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                    }
                }
            }
            fx fxVar2 = this.d;
            xn xnVar = this.n;
            e30 e30Var = this.o;
            long j = this.i;
            long j2 = fxVar2.u;
            ix ixVar = fxVar2.a;
            if (!t00.a(j2, j)) {
                fxVar2.u = j;
                long j3 = fxVar2.t;
                int i = (int) (j3 >> 32);
                int i2 = (int) (j3 & 4294967295L);
                ixVar.c.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (j & 4294967295L)) + i2);
                ixVar.d = d80.F(j);
                if (fxVar2.i == 9205357640488583168L) {
                    fxVar2.g = true;
                    fxVar2.a();
                }
            }
            fxVar2.b = xnVar;
            fxVar2.c = e30Var;
            fxVar2.d = this.x;
            h hVar = fxVar2.e;
            fd fdVar = ixVar.b;
            RenderNode renderNode2 = ixVar.c;
            RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording();
            try {
                r1 r1Var = ixVar.a;
                t2 t2Var = (t2) r1Var.e;
                Canvas canvas = t2Var.a;
                t2Var.a = recordingCanvasBeginRecording;
                e9 e9Var = fdVar.e;
                e9Var.A(xnVar);
                e9Var.B(e30Var);
                e9Var.b = fxVar2;
                e9Var.C(ixVar.d);
                e9Var.z(t2Var);
                hVar.g(fdVar);
                ((t2) r1Var.e).a = canvas;
                renderNode2.endRecording();
                if (this.m) {
                    this.m = false;
                    this.f.s(this, false);
                }
            } catch (Throwable th) {
                renderNode2.endRecording();
                throw th;
            }
        }
    }

    @Override // defpackage.dg0
    public final void invalidate() {
        if (this.m || this.j) {
            return;
        }
        p3 p3Var = this.f;
        p3Var.invalidate();
        if (true != this.m) {
            this.m = true;
            p3Var.s(this, true);
        }
    }
}
