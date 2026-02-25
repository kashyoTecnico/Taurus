package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fs implements bz {
    public final boolean d;

    public fs(boolean z) {
        this.d = z;
    }

    @Override // defpackage.bz
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.bz
    public final pc0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
