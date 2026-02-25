package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vl0 implements lp0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public vl0(mp0 mp0Var) {
        mp0Var.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.lp0
    public final Bundle a() {
        Bundle bundleV = b10.v((ng0[]) Arrays.copyOf(new ng0[0], 0));
        List listD0 = ue.d0(this.a);
        bundleV.putStringArrayList("classes_to_restore", listD0 instanceof ArrayList ? (ArrayList) listD0 : new ArrayList<>(listD0));
        return bundleV;
    }
}
