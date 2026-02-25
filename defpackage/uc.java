package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class uc implements a20, Serializable {
    public transient a20 d;
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i;

    public uc(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    public abstract a20 d();

    public final de f() {
        boolean z = this.i;
        Class cls = this.f;
        if (!z) {
            return em0.a(cls);
        }
        em0.a.getClass();
        return new hg0(cls);
    }
}
