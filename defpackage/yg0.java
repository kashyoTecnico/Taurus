package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yg0 implements Parcelable.ClassLoaderCreator {
    public static zg0 a(Parcel parcel, ClassLoader classLoader) {
        g2 g2Var;
        if (classLoader == null) {
            classLoader = yg0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            g2Var = g2.I;
        } else if (i == 1) {
            g2Var = g2.V;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + i + " was restored");
            }
            g2Var = g2.N;
        }
        return new zg0(value, g2Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new zg0[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
