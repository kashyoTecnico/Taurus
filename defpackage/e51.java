package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface e51 {
    boolean a();

    long b(k8 k8Var, k8 k8Var2, k8 k8Var3);

    k8 l(long j, k8 k8Var, k8 k8Var2, k8 k8Var3);

    k8 o(long j, k8 k8Var, k8 k8Var2, k8 k8Var3);

    default k8 p(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        return l(b(k8Var, k8Var2, k8Var3), k8Var, k8Var2, k8Var3);
    }
}
