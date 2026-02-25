package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xg0 extends ex0 implements Parcelable, sv0, za0, ww0 {
    public static final Parcelable.Creator<xg0> CREATOR = new j1(4);
    public rv0 e;

    public xg0(long j) {
        gv0 gv0VarK = ov0.k();
        rv0 rv0Var = new rv0(gv0VarK.g(), j);
        if (!(gv0VarK instanceof bx)) {
            rv0Var.b = new rv0(1, j);
        }
        this.e = rv0Var;
    }

    @Override // defpackage.dx0
    public final fx0 a() {
        return this.e;
    }

    @Override // defpackage.dx0
    public final fx0 b(fx0 fx0Var, fx0 fx0Var2, fx0 fx0Var3) {
        if (((rv0) fx0Var2).c == ((rv0) fx0Var3).c) {
            return fx0Var2;
        }
        return null;
    }

    @Override // defpackage.dx0
    public final void c(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.e = (rv0) fx0Var;
    }

    @Override // defpackage.sv0
    public final uv0 d() {
        return g2.V;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j) {
        gv0 gv0VarK;
        rv0 rv0Var = (rv0) ov0.i(this.e);
        if (rv0Var.c != j) {
            rv0 rv0Var2 = this.e;
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                ((rv0) ov0.o(rv0Var2, this, gv0VarK, rv0Var)).c = j;
            }
            ov0.n(gv0VarK, this);
        }
    }

    @Override // defpackage.ww0
    public Object getValue() {
        return Long.valueOf(((rv0) ov0.t(this.e, this)).c);
    }

    @Override // defpackage.za0
    public void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((rv0) ov0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((rv0) ov0.t(this.e, this)).c);
    }
}
