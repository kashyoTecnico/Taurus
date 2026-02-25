package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fj0 extends y {
    @Override // defpackage.hl0
    public final int c(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.y
    public final Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        c10.o(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
