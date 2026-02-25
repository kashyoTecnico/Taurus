package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pm {
    public Parcel a;

    public long a() {
        int i = bf.h;
        long j = this.a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public long b() {
        Parcel parcel = this.a;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return g21.a(j, 0L) ? f21.c : jp0.l(j, parcel.readFloat());
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long jB = f21.b(j);
        byte b = 0;
        if (!g21.a(jB, 0L)) {
            if (g21.a(jB, 4294967296L)) {
                b = 1;
            } else if (g21.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (g21.a(f21.b(j), 0L)) {
            return;
        }
        d(f21.c(j));
    }

    public void f(long j) {
        long j2 = 63 & j;
        if (Long.compareUnsigned(j2, 16L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        this.a.writeLong(j);
    }
}
