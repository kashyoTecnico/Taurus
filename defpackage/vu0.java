package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vu0 extends d90 implements l30, et0 {
    public long A;
    public int B;
    public h C;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public ju0 x;
    public boolean y;
    public long z;

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        oi0 oi0VarE = g80Var.e(j);
        return n80Var.a0(oi0VarE.d, oi0VarE.e, ls.d, new j4(24, oi0VarE, this));
    }

    @Override // defpackage.et0
    public final boolean h() {
        return false;
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.r);
        sb.append(", scaleY=");
        sb.append(this.s);
        sb.append(", alpha = ");
        sb.append(this.t);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.u);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.v);
        sb.append(", transformOrigin=");
        long j = this.w;
        int i = x21.b;
        sb.append((Object) ("TransformOrigin(packedValue=" + j + ')'));
        sb.append(", shape=");
        sb.append(this.x);
        sb.append(", clip=");
        sb.append(this.y);
        sb.append(", renderEffect=null, ambientShadowColor=");
        b8.l(this.z, sb, ", spotShadowColor=");
        b8.l(this.A, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) l81.e0(this.B));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
    }
}
