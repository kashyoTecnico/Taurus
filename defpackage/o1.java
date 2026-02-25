package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class o1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c;
    public final transient LinkedHashMap d;
    public final LinkedHashMap e;
    public final Bundle f;

    public o1() {
        new LinkedHashMap();
        this.c = new ArrayList();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new Bundle();
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        b8.o(this.d.get(str));
        this.e.remove(str);
        this.f.putParcelable(str, new k1(intent, i2));
        return true;
    }
}
