package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yv0 implements Parcelable.ClassLoaderCreator {
    public static zv0 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = yv0.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new zv0();
        }
        ji0 ji0VarE = fv0.e.e();
        for (int i2 = 0; i2 < i; i2++) {
            ji0VarE.add(parcel.readValue(classLoader));
        }
        return new zv0(ji0VarE.c());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new zv0[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
