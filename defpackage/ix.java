package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ix {
    public final r1 a;
    public final fd b;
    public final RenderNode c;
    public long d;
    public Paint e;
    public Matrix f;
    public boolean g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public long m;
    public long n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;

    public ix() {
        r1 r1Var = new r1(4);
        fd fdVar = new fd();
        this.a = r1Var;
        this.b = fdVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.c = renderNode;
        this.d = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        long j = bf.b;
        this.m = j;
        this.n = j;
        this.o = 8.0f;
        this.s = 0;
    }

    public final void a() {
        boolean z = this.p;
        boolean z2 = false;
        boolean z3 = z && !this.g;
        if (z && this.g) {
            z2 = true;
        }
        boolean z4 = this.q;
        RenderNode renderNode = this.c;
        if (z3 != z4) {
            this.q = z3;
            renderNode.setClipToBounds(z3);
        }
        if (z2 != this.r) {
            this.r = z2;
            renderNode.setClipToOutline(z2);
        }
    }

    public final void b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.e);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, this.e);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.e);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c(boolean z) {
        this.p = z;
        a();
    }

    public final void d() {
        int i = this.s;
        RenderNode renderNode = this.c;
        if (i != 1 && this.i == 3) {
            b(renderNode, i);
        } else {
            b(renderNode, 1);
        }
    }
}
