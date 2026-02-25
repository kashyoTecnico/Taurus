package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zg0 extends ex0 implements Parcelable, sv0 {
    public static final Parcelable.Creator<zg0> CREATOR = new yg0();
    public final uv0 e;
    public tv0 f;

    public zg0(Object obj, uv0 uv0Var) {
        this.e = uv0Var;
        gv0 gv0VarK = ov0.k();
        tv0 tv0Var = new tv0(gv0VarK.g(), obj);
        if (!(gv0VarK instanceof bx)) {
            tv0Var.b = new tv0(1, obj);
        }
        this.f = tv0Var;
    }

    @Override // defpackage.dx0
    public final fx0 a() {
        return this.f;
    }

    @Override // defpackage.dx0
    public final fx0 b(fx0 fx0Var, fx0 fx0Var2, fx0 fx0Var3) {
        if (this.e.a(((tv0) fx0Var2).c, ((tv0) fx0Var3).c)) {
            return fx0Var2;
        }
        return null;
    }

    @Override // defpackage.dx0
    public final void c(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f = (tv0) fx0Var;
    }

    @Override // defpackage.sv0
    public final uv0 d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ww0
    public final Object getValue() {
        return ((tv0) ov0.t(this.f, this)).c;
    }

    @Override // defpackage.za0
    public final void setValue(Object obj) {
        gv0 gv0VarK;
        tv0 tv0Var = (tv0) ov0.i(this.f);
        if (this.e.a(tv0Var.c, obj)) {
            return;
        }
        tv0 tv0Var2 = this.f;
        synchronized (ov0.c) {
            gv0VarK = ov0.k();
            ((tv0) ov0.o(tv0Var2, this, gv0VarK, tv0Var)).c = obj;
        }
        ov0.n(gv0VarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((tv0) ov0.i(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        g2 g2Var = g2.I;
        uv0 uv0Var = this.e;
        if (c10.i(uv0Var, g2Var)) {
            i2 = 0;
        } else if (c10.i(uv0Var, g2.V)) {
            i2 = 1;
        } else {
            if (!c10.i(uv0Var, g2.N)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
