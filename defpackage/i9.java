package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i9 implements j9, m9 {
    public final /* synthetic */ int d;
    public final float e;

    public i9(int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = 0;
                break;
            case 2:
                this.e = 0;
                break;
            case 3:
                this.e = 0;
                break;
            default:
                this.e = 0;
                break;
        }
    }

    @Override // defpackage.j9, defpackage.m9
    public final float a() {
        switch (this.d) {
        }
        return this.e;
    }

    @Override // defpackage.m9
    public final void b(int i, n80 n80Var, int[] iArr, int[] iArr2) {
        switch (this.d) {
            case 0:
                o9.a(i, iArr, iArr2, false);
                break;
            case 1:
                o9.d(i, iArr, iArr2, false);
                break;
            case 2:
                o9.e(i, iArr, iArr2, false);
                break;
            default:
                o9.f(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.j9
    public final void d(xn xnVar, int i, int[] iArr, e30 e30Var, int[] iArr2) {
        switch (this.d) {
            case 0:
                if (e30Var != e30.d) {
                    o9.a(i, iArr, iArr2, true);
                    break;
                } else {
                    o9.a(i, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (e30Var != e30.d) {
                    o9.d(i, iArr, iArr2, true);
                    break;
                } else {
                    o9.d(i, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (e30Var != e30.d) {
                    o9.e(i, iArr, iArr2, true);
                    break;
                } else {
                    o9.e(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (e30Var != e30.d) {
                    o9.f(i, iArr, iArr2, true);
                    break;
                } else {
                    o9.f(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
