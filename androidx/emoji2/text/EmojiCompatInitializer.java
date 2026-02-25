package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.a50;
import defpackage.e9;
import defpackage.f50;
import defpackage.oz;
import defpackage.r1;
import defpackage.tr;
import defpackage.tv;
import defpackage.ur;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements oz {
    @Override // defpackage.oz
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.oz
    public final Object b(Context context) {
        Object objL;
        tv tvVar = new tv(new r1(context));
        tvVar.b = 1;
        if (tr.k == null) {
            synchronized (tr.j) {
                try {
                    if (tr.k == null) {
                        tr.k = new tr(tvVar);
                    }
                } finally {
                }
            }
        }
        e9 e9VarP = e9.p(context);
        e9VarP.getClass();
        synchronized (e9.e) {
            try {
                objL = ((HashMap) e9VarP.a).get(ProcessLifecycleInitializer.class);
                if (objL == null) {
                    objL = e9VarP.l(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        a50 lifecycle = ((f50) objL).getLifecycle();
        lifecycle.a(new ur(this, lifecycle));
        return Boolean.TRUE;
    }
}
