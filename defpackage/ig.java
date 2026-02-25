package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.taurus.dgmobilemx.MainActivity;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements gw {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ ig(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // defpackage.gw
    public final Object a() {
        switch (this.d) {
            case 0:
                this.e.reportFullyDrawn();
                return j41.a;
            case 1:
                MainActivity mainActivity = this.e;
                return new fw(mainActivity.j, new ig(mainActivity, 0));
            case 2:
                ro roVar = new ro();
                this.e.getNavigationEventDispatcher().a(roVar);
                return roVar;
            case 3:
                MainActivity mainActivity2 = this.e;
                return new pp0(mainActivity2.getApplication(), mainActivity2, mainActivity2.getIntent() != null ? mainActivity2.getIntent().getExtras() : null);
            case 4:
                MainActivity mainActivity3 = this.e;
                sd0 sd0Var = new sd0(new hg(mainActivity3, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (c10.i(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity3.getLifecycle().a(new jg(0, sd0Var, mainActivity3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new o4(1, mainActivity3, sd0Var));
                    }
                }
                return sd0Var;
            default:
                return c10.L(this.e);
        }
    }
}
