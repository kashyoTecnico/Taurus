package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class s1 implements qw, Serializable {
    public final Object d;
    public final Class e;
    public final String f;
    public final String g;
    public final int i;
    public final boolean h = false;
    public final int j = 4;

    public s1(int i, Class cls, Object obj, String str, String str2) {
        this.d = obj;
        this.e = cls;
        this.f = str;
        this.g = str2;
        this.i = i;
    }

    @Override // defpackage.qw
    public final int b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.h == s1Var.h && this.i == s1Var.i && this.j == s1Var.j && this.d.equals(s1Var.d) && this.e.equals(s1Var.e) && this.f.equals(s1Var.f) && this.g.equals(s1Var.g);
    }

    public final int hashCode() {
        return ((((((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31) + this.i) * 31) + this.j;
    }

    public final String toString() {
        em0.a.getClass();
        return fm0.a(this);
    }
}
