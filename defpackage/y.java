package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class y extends hl0 {
    @Override // defpackage.hl0
    public final int a(int i) {
        return (d().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.hl0
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
