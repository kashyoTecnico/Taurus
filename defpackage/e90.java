package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface e90 {
    Object a(kw kwVar, Object obj);

    boolean b(iw iwVar);

    default e90 c(e90 e90Var) {
        return e90Var == b90.a ? this : new wf(this, e90Var);
    }
}
