package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oq0 implements fg0 {
    public final int d;
    public final List e;
    public Float f = null;
    public Float g = null;
    public jq0 h = null;
    public jq0 i = null;

    public oq0(int i, ArrayList arrayList) {
        this.d = i;
        this.e = arrayList;
    }

    @Override // defpackage.fg0
    public final boolean B() {
        return this.e.contains(this);
    }
}
