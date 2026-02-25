package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f8 implements ww0 {
    public final q31 d;
    public final zg0 e;
    public k8 f;
    public long g;
    public long h;
    public boolean i;

    public /* synthetic */ f8(q31 q31Var, Object obj, k8 k8Var, int i) {
        this(q31Var, obj, (i & 4) != 0 ? null : k8Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // defpackage.ww0
    public final Object getValue() {
        return this.e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.e.getValue() + ", velocity=" + this.d.b.g(this.f) + ", isRunning=" + this.i + ", lastFrameTimeNanos=" + this.g + ", finishedTimeNanos=" + this.h + ')';
    }

    public f8(q31 q31Var, Object obj, k8 k8Var, long j, long j2, boolean z) {
        k8 k8VarW;
        this.d = q31Var;
        this.e = qo0.n(obj);
        if (k8Var != null) {
            k8VarW = l81.w(k8Var);
        } else {
            k8VarW = (k8) q31Var.a.g(obj);
            k8VarW.d();
        }
        this.f = k8VarW;
        this.g = j;
        this.h = j2;
        this.i = z;
    }
}
