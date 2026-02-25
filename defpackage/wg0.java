package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wg0 extends ex0 implements Parcelable, sv0, za0, ww0 {
    public static final Parcelable.Creator<wg0> CREATOR = new j1(3);
    public qv0 e;

    public wg0(int i) {
        gv0 gv0VarK = ov0.k();
        qv0 qv0Var = new qv0(gv0VarK.g(), i);
        if (!(gv0VarK instanceof bx)) {
            qv0Var.b = new qv0(1, i);
        }
        this.e = qv0Var;
    }

    @Override // defpackage.dx0
    public final fx0 a() {
        return this.e;
    }

    @Override // defpackage.dx0
    public final fx0 b(fx0 fx0Var, fx0 fx0Var2, fx0 fx0Var3) {
        if (((qv0) fx0Var2).c == ((qv0) fx0Var3).c) {
            return fx0Var2;
        }
        return null;
    }

    @Override // defpackage.dx0
    public final void c(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.e = (qv0) fx0Var;
    }

    @Override // defpackage.sv0
    public final uv0 d() {
        return g2.V;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((qv0) ov0.t(this.e, this)).c;
    }

    @Override // defpackage.ww0
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        gv0 gv0VarK;
        qv0 qv0Var = (qv0) ov0.i(this.e);
        if (qv0Var.c != i) {
            qv0 qv0Var2 = this.e;
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                ((qv0) ov0.o(qv0Var2, this, gv0VarK, qv0Var)).c = i;
            }
            ov0.n(gv0VarK, this);
        }
    }

    @Override // defpackage.za0
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((qv0) ov0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
