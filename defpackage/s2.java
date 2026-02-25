package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s2 extends ca {
    public final r1 a;
    public final jt0 b;
    public final p3 c;
    public final yl0 d;
    public final String e;
    public final AutofillId f;
    public final ea0 g;
    public boolean h;

    public s2(r1 r1Var, jt0 jt0Var, p3 p3Var, yl0 yl0Var, String str) {
        this.a = r1Var;
        this.b = jt0Var;
        this.c = p3Var;
        this.d = yl0Var;
        this.e = str;
        new Rect();
        p3Var.setImportantForAutofill(1);
        AutofillId autofillId = p3Var.getAutofillId();
        if (autofillId == null) {
            throw b8.f("Required value was null.");
        }
        this.f = autofillId;
        this.g = new ea0();
    }
}
