package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qa0 extends ra0 implements h20, iw {
    public qa0(String str, String str2) {
        super(1, nt0.class, tc.d, str, str2);
    }

    @Override // defpackage.uc
    public final a20 d() {
        em0.a.getClass();
        return this;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        i();
        throw null;
    }

    public final void i() {
        if (this.j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        a20 a20VarH = h();
        if (a20VarH == this) {
            throw new am("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((qa0) ((h20) a20VarH)).i();
    }
}
