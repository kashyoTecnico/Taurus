package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u60 implements m80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ iw d;
    public final /* synthetic */ y20 e;
    public final /* synthetic */ v60 f;

    /* JADX WARN: Multi-variable type inference failed */
    public u60(int i, int i2, Map map, iw iwVar, iw iwVar2, v60 v60Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = iwVar;
        this.e = (y20) iwVar2;
        this.f = v60Var;
    }

    @Override // defpackage.m80
    public final Map a() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [iw, y20] */
    @Override // defpackage.m80
    public final void b() {
        this.e.g(this.f.o);
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
