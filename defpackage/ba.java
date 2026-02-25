package defpackage;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ba extends AutofillManager.AutofillCallback {
    public static final ba a = new ba();

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
        Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
