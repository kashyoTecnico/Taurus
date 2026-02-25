package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oq extends b10 implements pq {
    public final /* synthetic */ int s = 1;
    public final k5 t;
    public final ar u;
    public Object v;

    public oq(k5 k5Var, ar arVar) {
        this.t = k5Var;
        this.u = arVar;
    }

    public static boolean n0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean o0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(ed0.d(j), ed0.e(j));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.pq
    public final void d(v30 v30Var) {
        float f;
        boolean zN0;
        float f2;
        float f3;
        float f4;
        switch (this.s) {
            case 0:
                jg0 jg0Var = ((ag0) this.v).b;
                fd fdVar = v30Var.d;
                long jC = fdVar.c();
                k5 k5Var = this.t;
                k5Var.l(jC);
                if (yu0.e(fdVar.c())) {
                    v30Var.a();
                    return;
                }
                v30Var.a();
                k5Var.f.getValue();
                Canvas canvasA = u2.a(fdVar.e.o());
                ar arVar = this.u;
                boolean zO0 = ar.f(arVar.f) ? o0(270.0f, nm.f(-yu0.b(fdVar.c()), v30Var.A(jg0Var.b(v30Var.getLayoutDirection()))), arVar.c(), canvasA) : false;
                if (ar.f(arVar.d)) {
                    zO0 = o0(0.0f, nm.f(0.0f, v30Var.A(jg0Var.b)), arVar.e(), canvasA) || zO0;
                }
                if (ar.f(arVar.g)) {
                    zO0 = o0(90.0f, nm.f(0.0f, v30Var.A(jg0Var.c(v30Var.getLayoutDirection())) + (-((float) d80.B(yu0.d(fdVar.c()))))), arVar.d(), canvasA) || zO0;
                }
                if (ar.f(arVar.e)) {
                    zO0 = o0(180.0f, nm.f(-yu0.d(fdVar.c()), (-yu0.b(fdVar.c())) + v30Var.A(jg0Var.d)), arVar.b(), canvasA) || zO0;
                }
                if (zO0) {
                    k5Var.c();
                    return;
                }
                return;
            default:
                fd fdVar2 = v30Var.d;
                long jC2 = fdVar2.c();
                k5 k5Var2 = this.t;
                k5Var2.l(jC2);
                if (yu0.e(fdVar2.c())) {
                    v30Var.a();
                    return;
                }
                k5Var2.f.getValue();
                float fA = v30Var.A(oe.a);
                Canvas canvasA2 = u2.a(fdVar2.e.o());
                ar arVar2 = this.u;
                boolean z = ar.f(arVar2.d) || ar.g(arVar2.h) || ar.f(arVar2.e) || ar.g(arVar2.i);
                boolean z2 = ar.f(arVar2.f) || ar.g(arVar2.j) || ar.f(arVar2.g) || ar.g(arVar2.k);
                if (z && z2) {
                    p0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z) {
                    p0().setPosition(0, 0, (d80.B(fA) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z2) {
                        v30Var.a();
                        return;
                    }
                    p0().setPosition(0, 0, canvasA2.getWidth(), (d80.B(fA) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = p0().beginRecording();
                if (ar.g(arVar2.j)) {
                    EdgeEffect edgeEffectA = arVar2.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = arVar2.a();
                        arVar2.j = edgeEffectA;
                    }
                    n0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                boolean zF = ar.f(arVar2.f);
                x8 x8Var = x8.a;
                if (zF) {
                    EdgeEffect edgeEffectC = arVar2.c();
                    zN0 = n0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (ar.g(arVar2.f)) {
                        float fE = ed0.e(k5Var2.b());
                        EdgeEffect edgeEffectA2 = arVar2.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = arVar2.a();
                            arVar2.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fB = i >= 31 ? x8Var.b(edgeEffectC) : 0.0f;
                        f = fA;
                        float f5 = 1 - fE;
                        if (i >= 31) {
                            x8Var.c(edgeEffectA2, fB, f5);
                        } else {
                            edgeEffectA2.onPull(fB, f5);
                        }
                    } else {
                        f = fA;
                    }
                } else {
                    f = fA;
                    zN0 = false;
                }
                if (ar.g(arVar2.h)) {
                    EdgeEffect edgeEffectA3 = arVar2.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = arVar2.a();
                        arVar2.h = edgeEffectA3;
                    }
                    n0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (ar.f(arVar2.d)) {
                    EdgeEffect edgeEffectE = arVar2.e();
                    boolean z3 = n0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zN0;
                    if (ar.g(arVar2.d)) {
                        float fD = ed0.d(k5Var2.b());
                        EdgeEffect edgeEffectA4 = arVar2.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = arVar2.a();
                            arVar2.h = edgeEffectA4;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fB2 = i2 >= 31 ? x8Var.b(edgeEffectE) : 0.0f;
                        if (i2 >= 31) {
                            x8Var.c(edgeEffectA4, fB2, fD);
                        } else {
                            edgeEffectA4.onPull(fB2, fD);
                        }
                    }
                    zN0 = z3;
                }
                if (ar.g(arVar2.k)) {
                    EdgeEffect edgeEffectA5 = arVar2.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = arVar2.a();
                        arVar2.k = edgeEffectA5;
                    }
                    n0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (ar.f(arVar2.g)) {
                    EdgeEffect edgeEffectD = arVar2.d();
                    boolean z4 = n0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zN0;
                    if (ar.g(arVar2.g)) {
                        float fE2 = ed0.e(k5Var2.b());
                        EdgeEffect edgeEffectA6 = arVar2.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = arVar2.a();
                            arVar2.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fB3 = i3 >= 31 ? x8Var.b(edgeEffectD) : 0.0f;
                        if (i3 >= 31) {
                            x8Var.c(edgeEffectA6, fB3, fE2);
                        } else {
                            edgeEffectA6.onPull(fB3, fE2);
                        }
                    }
                    zN0 = z4;
                }
                if (ar.g(arVar2.i)) {
                    EdgeEffect edgeEffectA7 = arVar2.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = arVar2.a();
                        arVar2.i = edgeEffectA7;
                    }
                    f2 = 0.0f;
                    n0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                } else {
                    f2 = 0.0f;
                }
                if (ar.f(arVar2.e)) {
                    EdgeEffect edgeEffectB = arVar2.b();
                    boolean z5 = n0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zN0;
                    if (ar.g(arVar2.e)) {
                        float fD2 = ed0.d(k5Var2.b());
                        EdgeEffect edgeEffectA8 = arVar2.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = arVar2.a();
                            arVar2.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fB4 = i4 >= 31 ? x8Var.b(edgeEffectB) : f2;
                        float f6 = 1 - fD2;
                        if (i4 >= 31) {
                            x8Var.c(edgeEffectA8, fB4, f6);
                        } else {
                            edgeEffectA8.onPull(fB4, f6);
                        }
                    }
                    zN0 = z5;
                }
                if (zN0) {
                    k5Var2.c();
                }
                float f7 = z2 ? f2 : f;
                if (!z) {
                    f2 = f;
                }
                e30 layoutDirection = v30Var.getLayoutDirection();
                t2 t2Var = new t2();
                t2Var.a = recordingCanvasBeginRecording;
                long jC3 = fdVar2.c();
                e9 e9Var = fdVar2.e;
                ed edVar = ((fd) e9Var.c).d;
                xn xnVar = edVar.a;
                e30 e30Var = edVar.b;
                dd ddVarO = e9Var.o();
                long jS = fdVar2.e.s();
                e9 e9Var2 = fdVar2.e;
                fx fxVar = (fx) e9Var2.b;
                e9Var2.A(v30Var);
                e9Var2.B(layoutDirection);
                e9Var2.z(t2Var);
                e9Var2.C(jC3);
                e9Var2.b = null;
                t2Var.l();
                try {
                    ((r1) fdVar2.e.a).s(f7, f2);
                    try {
                        v30Var.a();
                        t2Var.i();
                        e9 e9Var3 = fdVar2.e;
                        e9Var3.A(xnVar);
                        e9Var3.B(e30Var);
                        e9Var3.z(ddVarO);
                        e9Var3.C(jS);
                        e9Var3.b = fxVar;
                        p0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f3, f4);
                        canvasA2.drawRenderNode(p0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((r1) fdVar2.e.a).s(-f7, -f2);
                    }
                } catch (Throwable th) {
                    t2Var.i();
                    e9 e9Var4 = fdVar2.e;
                    e9Var4.A(xnVar);
                    e9Var4.B(e30Var);
                    e9Var4.z(ddVarO);
                    e9Var4.C(jS);
                    e9Var4.b = fxVar;
                    throw th;
                }
        }
    }

    public RenderNode p0() {
        RenderNode renderNode = (RenderNode) this.v;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.v = renderNode2;
        return renderNode2;
    }

    public oq(k5 k5Var, ar arVar, ag0 ag0Var) {
        this.t = k5Var;
        this.u = arVar;
        this.v = ag0Var;
    }
}
