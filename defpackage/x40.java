package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[y40.values().length];
        try {
            iArr[y40.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y40.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y40.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y40.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[y40.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[y40.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[y40.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
