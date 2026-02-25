package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ui0 extends CancellationException {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui0(String str, int i) {
        super(str);
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.d) {
            case 0:
                setStackTrace(c10.i);
                break;
            default:
                setStackTrace(m20.k);
                break;
        }
        return this;
    }
}
