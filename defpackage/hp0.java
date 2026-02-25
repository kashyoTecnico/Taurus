package defpackage;

import android.os.Bundle;
import com.taurus.dgmobilemx.MainActivity;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hp0 implements lp0 {
    public final mp0 a;
    public boolean b;
    public Bundle c;
    public final qy0 d;

    public hp0(mp0 mp0Var, MainActivity mainActivity) {
        c10.p(mp0Var, "savedStateRegistry");
        this.a = mp0Var;
        this.d = m20.J(new ig(mainActivity, 5));
    }

    @Override // defpackage.lp0
    public final Bundle a() {
        Bundle bundleV = b10.v((ng0[]) Arrays.copyOf(new ng0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleV.putAll(bundle);
        }
        for (Map.Entry entry : ((ip0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((lg) ((ep0) entry.getValue()).a.e).a();
            if (!bundleA.isEmpty()) {
                c10.p(str, "key");
                bundleV.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleV;
    }
}
