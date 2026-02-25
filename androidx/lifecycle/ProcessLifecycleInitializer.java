package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.b50;
import defpackage.c10;
import defpackage.c50;
import defpackage.e9;
import defpackage.ik0;
import defpackage.jk0;
import defpackage.ks;
import defpackage.oz;
import defpackage.y40;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements oz {
    @Override // defpackage.oz
    public final List a() {
        return ks.d;
    }

    @Override // defpackage.oz
    public final Object b(Context context) {
        c10.p(context, "context");
        e9 e9VarP = e9.p(context);
        c10.o(e9VarP, "getInstance(...)");
        if (!((HashSet) e9VarP.b).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!c50.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            c10.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new b50());
        }
        jk0 jk0Var = jk0.k;
        jk0Var.getClass();
        jk0Var.h = new Handler();
        jk0Var.i.e(y40.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        c10.n(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ik0(jk0Var));
        return jk0Var;
    }
}
