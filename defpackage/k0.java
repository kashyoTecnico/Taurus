package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k0 extends ClickableSpan {
    public final int d;
    public final z0 e;
    public final int f;

    public k0(int i, z0 z0Var, int i2) {
        this.d = i;
        this.e = z0Var;
        this.f = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.e.a.performAction(this.f, bundle);
    }
}
