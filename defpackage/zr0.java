package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zr0 implements id0, pw {
    public final /* synthetic */ gw a;

    public zr0(gw gwVar) {
        this.a = gwVar;
    }

    @Override // defpackage.id0
    public final /* synthetic */ long a() {
        return ((ed0) this.a.a()).a;
    }

    @Override // defpackage.pw
    public final ow b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof id0) || !(obj instanceof pw)) {
            return false;
        }
        return c10.i(this.a, ((pw) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
