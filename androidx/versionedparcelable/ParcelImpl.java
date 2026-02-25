package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j1;
import defpackage.r51;
import defpackage.s51;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new j1(1);
    public final s51 d;

    public ParcelImpl(Parcel parcel) {
        this.d = new r51(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new r51(parcel).i(this.d);
    }
}
