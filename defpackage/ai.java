package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ai extends hi {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final zg0 f = new zg0(vh0.g, g2.N);
    public final /* synthetic */ ci g;

    public ai(ci ciVar, long j, boolean z, boolean z2, r1 r1Var) {
        this.g = ciVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.hi
    public final void a(oi oiVar, kw kwVar) {
        this.g.b.a(oiVar, kwVar);
    }

    @Override // defpackage.hi
    public final void b() {
        ci ciVar = this.g;
        ciVar.A--;
    }

    @Override // defpackage.hi
    public final boolean c() {
        return this.g.b.c();
    }

    @Override // defpackage.hi
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.hi
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.hi
    public final long f() {
        return this.a;
    }

    @Override // defpackage.hi
    public final gi g() {
        return this.g.h;
    }

    @Override // defpackage.hi
    public final wh0 h() {
        return (wh0) this.f.getValue();
    }

    @Override // defpackage.hi
    public final ml i() {
        return this.g.b.i();
    }

    @Override // defpackage.hi
    public final void j(oi oiVar) {
        ci ciVar = this.g;
        ciVar.b.j(ciVar.h);
        ciVar.b.j(oiVar);
    }

    @Override // defpackage.hi
    public final q90 k(r90 r90Var) {
        return this.g.b.k(r90Var);
    }

    @Override // defpackage.hi
    public final void l(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.hi
    public final void m(ci ciVar) {
        this.e.add(ciVar);
    }

    @Override // defpackage.hi
    public final void n(oi oiVar) {
        this.g.b.n(oiVar);
    }

    @Override // defpackage.hi
    public final void o() {
        this.g.A++;
    }

    @Override // defpackage.hi
    public final void p(ci ciVar) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                c10.n(ciVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(ciVar.c);
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        if (!(linkedHashSet instanceof c20) || (linkedHashSet instanceof d20)) {
            linkedHashSet.remove(ciVar);
        } else {
            r31.Y(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // defpackage.hi
    public final void q(oi oiVar) {
        this.g.b.q(oiVar);
    }

    public final void r() {
        LinkedHashSet<ci> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (ci ciVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(ciVar.c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
