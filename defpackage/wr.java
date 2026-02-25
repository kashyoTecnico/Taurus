package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wr extends c4 {
    public final /* synthetic */ c4 p;
    public final /* synthetic */ ThreadPoolExecutor q;

    public wr(c4 c4Var, ThreadPoolExecutor threadPoolExecutor) {
        this.p = c4Var;
        this.q = threadPoolExecutor;
    }

    @Override // defpackage.c4
    public final void B(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.B(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.c4
    public final void C(q2 q2Var) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.C(q2Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
