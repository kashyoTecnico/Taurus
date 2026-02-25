package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ci ciVar = (ci) this.b;
                ciVar.A--;
                break;
            default:
                aw0 aw0Var = (aw0) this.b;
                aw0Var.j--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((ci) this.b).A++;
                break;
            default:
                ((aw0) this.b).j++;
                break;
        }
    }
}
