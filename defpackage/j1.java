package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j1(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                c10.p(parcel, "parcel");
                return new k1(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new vg0(parcel.readFloat());
            case 3:
                return new wg0(parcel.readInt());
            default:
                return new xg0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new k1[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new vg0[i];
            case 3:
                return new wg0[i];
            default:
                return new xg0[i];
        }
    }
}
