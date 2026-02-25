package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class np0 {
    public final Object a;
    public final g7 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final kc0 c = new kc0(21);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public np0(op0 op0Var, g7 g7Var) {
        this.a = op0Var;
        this.b = g7Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f50, java.lang.Object] */
    public final void a() {
        ?? r0 = this.a;
        if (((h50) r0.getLifecycle()).c != z40.e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.a();
        r0.getLifecycle().a(new q80(1, this));
        this.e = true;
    }
}
