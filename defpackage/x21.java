package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class x21 {
    public static final long a = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
    public static final /* synthetic */ int b = 0;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
