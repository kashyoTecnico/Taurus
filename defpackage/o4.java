package defpackage;

import android.util.LongSparseArray;
import com.taurus.dgmobilemx.MainActivity;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o4(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                d80.p((q4) this.e, (LongSparseArray) this.f);
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.e;
                mainActivity.getLifecycle().a(new jg(0, (sd0) this.f, mainActivity));
                break;
        }
    }
}
