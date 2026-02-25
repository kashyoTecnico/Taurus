package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i10 implements n80, x00 {
    public final /* synthetic */ x00 d;
    public final e30 e;

    public i10(x00 x00Var, e30 e30Var) {
        this.d = x00Var;
        this.e = e30Var;
    }

    @Override // defpackage.xn
    public final float A(float f) {
        return this.d.A(f);
    }

    @Override // defpackage.xn
    public final float I(long j) {
        return this.d.I(j);
    }

    @Override // defpackage.n80
    public final m80 M(int i, int i2, Map map, iw iwVar, iw iwVar2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            pz.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new h10(i, i2, map, iwVar);
    }

    @Override // defpackage.xn
    public final int N(float f) {
        return this.d.N(f);
    }

    @Override // defpackage.xn
    public final long W(long j) {
        return this.d.W(j);
    }

    @Override // defpackage.xn
    public final float Z(long j) {
        return this.d.Z(j);
    }

    @Override // defpackage.xn
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.xn
    public final long f0(float f) {
        return this.d.f0(f);
    }

    @Override // defpackage.x00
    public final e30 getLayoutDirection() {
        return this.e;
    }

    @Override // defpackage.xn
    public final float j0(int i) {
        return this.d.j0(i);
    }

    @Override // defpackage.xn
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.xn
    public final float l0(float f) {
        return this.d.l0(f);
    }

    @Override // defpackage.x00
    public final boolean s() {
        return this.d.s();
    }

    @Override // defpackage.xn
    public final long x(float f) {
        return this.d.x(f);
    }

    @Override // defpackage.xn
    public final long y(long j) {
        return this.d.y(j);
    }
}
