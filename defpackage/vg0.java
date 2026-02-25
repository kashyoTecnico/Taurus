package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vg0 extends ex0 implements Parcelable, sv0, za0, ww0 {
    public static final Parcelable.Creator<vg0> CREATOR = new j1(2);
    public pv0 e;

    public vg0(float f) {
        gv0 gv0VarK = ov0.k();
        pv0 pv0Var = new pv0(gv0VarK.g(), f);
        if (!(gv0VarK instanceof bx)) {
            pv0Var.b = new pv0(1, f);
        }
        this.e = pv0Var;
    }

    @Override // defpackage.dx0
    public final fx0 a() {
        return this.e;
    }

    @Override // defpackage.dx0
    public final fx0 b(fx0 fx0Var, fx0 fx0Var2, fx0 fx0Var3) {
        if (((pv0) fx0Var2).c == ((pv0) fx0Var3).c) {
            return fx0Var2;
        }
        return null;
    }

    @Override // defpackage.dx0
    public final void c(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.e = (pv0) fx0Var;
    }

    @Override // defpackage.sv0
    public final uv0 d() {
        return g2.V;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((pv0) ov0.t(this.e, this)).c;
    }

    @Override // defpackage.ww0
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        gv0 gv0VarK;
        pv0 pv0Var = (pv0) ov0.i(this.e);
        if (pv0Var.c == f) {
            return;
        }
        pv0 pv0Var2 = this.e;
        synchronized (ov0.c) {
            gv0VarK = ov0.k();
            ((pv0) ov0.o(pv0Var2, this, gv0VarK, pv0Var)).c = f;
        }
        ov0.n(gv0VarK, this);
    }

    @Override // defpackage.za0
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((pv0) ov0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
