package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z30 implements m80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ iw d;
    public final /* synthetic */ a40 e;
    public final /* synthetic */ f40 f;
    public final /* synthetic */ y20 g;

    /* JADX WARN: Multi-variable type inference failed */
    public z30(int i, int i2, Map map, iw iwVar, a40 a40Var, f40 f40Var, iw iwVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = iwVar;
        this.e = a40Var;
        this.f = f40Var;
        this.g = (y20) iwVar2;
    }

    @Override // defpackage.m80
    public final Map a() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [iw, y20] */
    @Override // defpackage.m80
    public final void b() {
        uz uzVar;
        t30 t30Var = this.f.d;
        boolean zS = this.e.s();
        ?? r2 = this.g;
        if (!zS || (uzVar = t30Var.G.c.S) == null) {
            r2.g(t30Var.G.c.o);
        } else {
            r2.g(uzVar.o);
        }
    }

    @Override // defpackage.m80
    public final int c() {
        return this.b;
    }

    @Override // defpackage.m80
    public final iw d() {
        return this.d;
    }

    @Override // defpackage.m80
    public final int e() {
        return this.a;
    }
}
