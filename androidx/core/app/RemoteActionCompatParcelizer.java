package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.q51;
import defpackage.r51;
import defpackage.s51;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(q51 q51Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        s51 s51VarG = remoteActionCompat.a;
        boolean z = true;
        if (q51Var.e(1)) {
            s51VarG = q51Var.g();
        }
        remoteActionCompat.a = (IconCompat) s51VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (q51Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((r51) q51Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (q51Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((r51) q51Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) q51Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (q51Var.e(5)) {
            z2 = ((r51) q51Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!q51Var.e(6)) {
            z = z3;
        } else if (((r51) q51Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, q51 q51Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        q51Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        q51Var.h(1);
        q51Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        q51Var.h(2);
        Parcel parcel = ((r51) q51Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        q51Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        q51Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        q51Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        q51Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
